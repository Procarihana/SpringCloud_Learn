package com.luwei.common.core.constant;

/**
 * redis 常量
 *
 * @author Pengjinhua
 * @date 2022/4/1
 */
public interface RedisConstants {

    /**
     * 短信验证码次数限制前缀
     */
    String SMS_CODE_KEY = "SMS_CODE_KEY:";

    /**
     * 单次短信验证码前缀
     */
    String SINGLE_SMS_CODE_KEY = "SINGLE_SMS_CODE_KEY:";

    /**
     * APP密码登录次数限制前缀
     */
    String APP_LOGIN_LIMIT_KEY = "APP_LOGIN_LIMIT_KEY:";

    /**
     * APP用户收藏数量计算
     */
    String POST_COLLECT_NUM = "POST_COLLECT_NUM";

    /**
     * 帖子收藏数更新锁
     */
    String POST_COLLECT_UPDATE_LOCK = "POST_COLLECT_UPDATE_LOCK";

    String APP_TOKEN_PRE = "app_";
}
