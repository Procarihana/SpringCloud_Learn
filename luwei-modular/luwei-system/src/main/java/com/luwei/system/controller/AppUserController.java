package com.luwei.system.controller;

import com.luwei.common.core.domain.Result;
import com.luwei.common.datasource.base.controller.BaseController;
import com.luwei.system.api.domain.AppUserDTO;
import com.luwei.system.api.model.LoginUser;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * APP用户信息表 前端控制器
 *
 * @author jinhuaPeng
 * @since 2022-03-28
 */
@Slf4j
@RestController
@RequestMapping("/helloRemove")
public class AppUserController extends BaseController {

    @ApiOperation(value = "根据用户Id获取用户信息", notes = "")
    @GetMapping
    public Result<AppUserDTO> get(Long userId) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String method = attributes.getRequest().getMethod();
        return Result.ok(AppUserDTO.builder().username("张三").sex("男").userId(userId).build());
    }

    @ApiOperation(value = "根据用户Id更改用户性别为女性", notes = "")
    @PostMapping
    public Result<AppUserDTO> change(Long userId) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String method = attributes.getRequest().getMethod();
        return Result.ok(AppUserDTO.builder().username("张三").sex("女").userId(userId).build());
    }

    @GetMapping("/introduce")
    public Result<String> introduce(@SpringQueryMap LoginUser loginUser){
        return Result.ok(loginUser.getUsername()+" Nice to meet you!");
    }

    @DeleteMapping
    public Result<String> deleted(@RequestBody LoginUser loginUser){
        return Result.ok(loginUser.getUsername()+" 已被删除！");
    }

    @PutMapping
    public Result<String> edit(@RequestBody LoginUser loginUser){
        return Result.ok("张三被改名为："+loginUser.getUsername());
    }

}