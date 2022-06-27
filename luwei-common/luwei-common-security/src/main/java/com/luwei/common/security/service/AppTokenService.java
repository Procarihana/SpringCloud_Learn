package com.luwei.common.security.service;

import com.luwei.common.core.constant.CacheConstants;
import com.luwei.common.core.constant.Constants;
import com.luwei.common.core.utils.IdUtils;
import com.luwei.common.core.utils.SecurityUtils;
import com.luwei.common.core.utils.ServletUtils;
import com.luwei.common.core.utils.StringUtils;
import com.luwei.common.core.utils.ip.IpUtils;
import com.luwei.common.redis.service.RedisService;
import com.luwei.system.api.domain.AppUserDTO;
import com.luwei.system.api.model.AppUserLoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.luwei.common.core.constant.RedisConstants.APP_TOKEN_PRE;

/**
 * token验证处理
 *
 * @author luwei
 */
@Component
public class AppTokenService {
    @Autowired
    private RedisService redisService;

    private final static long EXPIRE_TIME = Constants.TOKEN_EXPIRE * 60;

    private final static String ACCESS_TOKEN = CacheConstants.LOGIN_TOKEN_KEY;

    protected static final long MILLIS_SECOND = 1000;

    /**
     * 创建APP用户令牌
     */
    public Map<String, Object> createToken(AppUserLoginUser appUserLoginUser) {
        // 生成token
        String token = APP_TOKEN_PRE +appUserLoginUser.getOpenId();
        appUserLoginUser.setToken(token);
        appUserLoginUser.setLoginIp(IpUtils.getIpAddr(ServletUtils.getRequest()));
        refreshAppToken(appUserLoginUser);

        // 保存或更新用户token
        Map<String, Object> map = new HashMap<>();
        map.put("access_token", token);
        map.put("expires_in", EXPIRE_TIME);
        map.put("user_id",appUserLoginUser.getUserId());
        map.put("username",appUserLoginUser.getUsername());
        map.put("userMiniDTO",appUserLoginUser);
        redisService.setCacheObject(ACCESS_TOKEN + token, map, EXPIRE_TIME, TimeUnit.SECONDS);
        return map;
    }

    /**
     * 刷新APP令牌
     *
     * @param appUserLoginUser
     */
    public void refreshAppToken(AppUserLoginUser appUserLoginUser) {
        appUserLoginUser.setLoginTime(System.currentTimeMillis());
        appUserLoginUser.setExpireTime(appUserLoginUser.getLoginTime() + EXPIRE_TIME * MILLIS_SECOND);
        // 根据uuid将appUser缓存
        String userKey = getTokenKey(appUserLoginUser.getToken());
        redisService.setCacheObject(userKey, appUserLoginUser, EXPIRE_TIME, TimeUnit.SECONDS);
    }

    private String getTokenKey(String token) {
        return ACCESS_TOKEN + token;
    }

    /**
     * 获取App用户身份信息
     *
     * @return 用户信息
     */
    public AppUserLoginUser getAppUserLoginUser(HttpServletRequest request) {
        // 获取请求携带的令牌
        String token = SecurityUtils.getToken(request);
        if (StringUtils.isNotEmpty(token)) {
            String userKey = getTokenKey(token);
            AppUserLoginUser appUserLoginUser = redisService.getCacheObject(userKey);
            return appUserLoginUser;
        }
        return null;
    }

    public AppUserLoginUser getAppUserLoginUser() {
        return getAppUserLoginUser(ServletUtils.getRequest());
    }

    /**
     * 设置APP用户身份信息
     */
    public void setAppLoginUser(AppUserLoginUser appUserLoginUser) {
        if (StringUtils.isNotNull(appUserLoginUser) && StringUtils.isNotEmpty(appUserLoginUser.getToken())) {
            refreshAppToken(appUserLoginUser);
        }
    }
}