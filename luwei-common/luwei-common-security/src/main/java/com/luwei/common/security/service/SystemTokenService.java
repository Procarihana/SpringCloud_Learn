package com.luwei.common.security.service;

import com.luwei.common.core.constant.CacheConstants;
import com.luwei.common.core.constant.Constants;
import com.luwei.common.core.utils.IdUtils;
import com.luwei.common.core.utils.SecurityUtils;
import com.luwei.common.core.utils.ServletUtils;
import com.luwei.common.core.utils.StringUtils;
import com.luwei.common.core.utils.ip.IpUtils;
import com.luwei.common.redis.service.RedisService;
import com.luwei.system.api.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * token验证处理
 *
 * @author luwei
 */
@Component
public class SystemTokenService {

}