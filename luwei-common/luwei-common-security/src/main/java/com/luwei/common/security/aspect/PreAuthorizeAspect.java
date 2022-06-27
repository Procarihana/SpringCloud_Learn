package com.luwei.common.security.aspect;

import cn.hutool.core.util.ObjectUtil;
import com.luwei.common.core.exception.PreAuthorizeException;
import com.luwei.common.security.annotation.PreAuthorize;
import com.luwei.common.security.service.AppTokenService;
import com.luwei.system.api.model.AppUserLoginUser;
import com.luwei.system.api.model.LoginUser;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.PatternMatchUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * 自定义权限实现
 *
 * @author luwei
 */
@Aspect
@Component
public class PreAuthorizeAspect {

}
