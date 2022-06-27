package com.luwei.common.sms.service;

import cn.hutool.core.util.StrUtil;
import com.luwei.common.core.constant.RedisConstants;
import com.luwei.common.core.exception.BaseException;
import com.luwei.common.sms.util.AliSmsUtil;
import com.luwei.common.redis.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;;

/**
 * 手机短信模块
 */
@Slf4j
@Component
public class AliSmsService {

    private static final int CODE_LENGTH = 4;

    @Autowired
    private AliSmsUtil aliSmsUtil;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisService redisService;
    @Value("${ali.sms.limit}")
    private Long keyLimit;
    @Value("${ali.sms.limit-time}")
    private Long keyLimitTime;
    @Value("${ali.sms.single-limit-time}")
    private Long singleKeyLimitTime;


    /**
     * 发送验证码
     *
     * @param phone
     */
    public void sendVerificationCode(String phone) throws Exception {
        // 验证码限制短时间内次数
        String vCode = generateCode();
        String limitTelKey = RedisConstants.SMS_CODE_KEY + phone;
        String singleLimitTelKey = RedisConstants.SINGLE_SMS_CODE_KEY + phone;
        // 验证码限制单次时间
        Long sendSmsTime = redisService.incr(limitTelKey, keyLimitTime, TimeUnit.MINUTES,Boolean.TRUE,null);
        if (sendSmsTime.compareTo(keyLimit) >= 0) {
            throw new BaseException("验证次数超过" + keyLimit + "次", "请等待" + keyLimitTime + "分钟后重新尝试");
        }
        // 单次发送验证码时间
        if (StrUtil.isNotEmpty(redisService.getCacheObject(singleLimitTelKey))) {
            log.warn("手机号频繁请求: {}", phone);
            throw new BaseException("手机请求次数过于频繁，请等待后再次发送。");
        }
        log.info("发送短信验证码: telNumber: {} , vCode: {}", phone, vCode);
        // 发送验证码
        // TODO: 2022/3/30 提交需开放注解！
//        aliSmsUtil.sendVerifyCode(phone, vCode);
        // 缓存验证码
        redisService.setCacheObject(singleLimitTelKey, vCode, singleKeyLimitTime, TimeUnit.MINUTES);
        log.info("验证码发送完毕");
    }

    /**
     * 验证验证码
     *
     * @param phone
     * @param vCode
     * @return
     */
    public boolean VerifyCode(String phone, String vCode) {
        String codeKey = RedisConstants.SINGLE_SMS_CODE_KEY + phone;
        String oldCode = redisService.getCacheObject(codeKey);
        return oldCode != null && oldCode.equals(vCode);
    }

    /**
     * 移除手机对应的验证码
     *
     * @param phone
     */
    public void removeCode(String phone) {
        String codeKey = RedisConstants.SMS_CODE_KEY + phone;
        String singleCodeKey = RedisConstants.SINGLE_SMS_CODE_KEY+phone;
        stringRedisTemplate.delete(codeKey);
        stringRedisTemplate.delete(singleCodeKey);
    }

    public String generateCode() {
        String vcode = "";
        for (int i = 0; i < CODE_LENGTH; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }
}
