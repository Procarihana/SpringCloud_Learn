package com.luwei.system.api;

import com.luwei.common.core.constant.ServiceNameConstants;

import com.luwei.common.core.domain.Result;
import com.luwei.system.api.domain.AppUserDTO;
import com.luwei.system.api.factory.RemoteUserFallbackFactory;
import com.luwei.system.api.model.LoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;


/**
 * 用户服务
 *
 * @author luwei
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId
     * @return 结果
     */
    @GetMapping(value = "/helloRemove")
    Result<AppUserDTO> getUserInfoByUserIdTest(Long userId);

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId
     * @return 结果
     */
    @GetMapping(value = "/helloRemove")
    Result<AppUserDTO> getUserInfoByUserId(@RequestParam("userId") Long userId);


    /**
     * 根据用户Id更改用户性别为女性
     *
     * @param userId
     * @return
     */
    @PostMapping(value = "/helloRemove")
    Result<AppUserDTO> setUserSexByUserId( Long userId);

    /**
     * 自我介绍
     *
     * @param loginUser
     * @return
     */
    @GetMapping(value = "/helloRemove/introduce")
    Result<String> introduce(@SpringQueryMap LoginUser loginUser);

    @DeleteMapping(value = "/helloRemove")
    Result<String> deleted(LoginUser loginUser);

    @PutMapping(value = "/helloRemove")
    Result<String> edit(LoginUser loginUser);


}
