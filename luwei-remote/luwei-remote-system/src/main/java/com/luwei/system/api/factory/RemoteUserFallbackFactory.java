package com.luwei.system.api.factory;

import com.luwei.common.core.domain.Result;
import com.luwei.system.api.RemoteUserService;
import com.luwei.system.api.domain.AppUserDTO;
import com.luwei.system.api.model.LoginUser;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务降级处理
 *
 * @author luwei
 */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteUserService create(Throwable throwable) {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService() {
            @Override
            public Result<AppUserDTO> getUserInfoByUserIdTest(Long userId) {
                return Result.fail("获取用户失败:" + throwable.getMessage());
            }

            @Override
            public Result<AppUserDTO> getUserInfoByUserId(Long userId) {
                return Result.fail("获取用户失败:" + throwable.getMessage());
            }

            @Override
            public Result<AppUserDTO> setUserSexByUserId(Long userId) {
                return Result.fail("更新用户失败:" + throwable.getMessage());
            }

            @Override
            public Result<String> introduce(LoginUser loginUser) {
                return Result.fail("对方拒绝了你:" + throwable.getMessage());
            }

            @Override
            public Result<String> deleted(LoginUser loginUser) {
                return Result.fail("对方拒绝了你删除:" + throwable.getMessage());
            }

            @Override
            public Result<String> edit(LoginUser loginUser) {
                return Result.fail("对方拒绝了你修改:" + throwable.getMessage());
            }
        };
    }
}
