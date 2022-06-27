package com.luwei.auth.controller;

import com.luwei.auth.domain.AppPasswordLoginBodyDTO;
import com.luwei.common.core.domain.Result;
import com.luwei.system.api.RemoteUserService;
import com.luwei.system.api.domain.AppUserDTO;
import com.luwei.system.api.model.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "hello")
@RequestMapping("/helloLocal")
public class HelloController {

    @GetMapping("/swagger")

    public Result sayHelloTest(@SpringQueryMap AppPasswordLoginBodyDTO dto) {
        return Result.ok();
    }
//    @Autowired
//    private RemoteUserService remoteUserService;
//
//    @GetMapping("/sayHelloTest")
//    public AppUserDTO sayHelloTest(@RequestParam AppPasswordLoginBodyDTO useId) {
//        // 获取用户信息
//        return remoteUserService.getUserInfoByUserIdTest(useId).getData();
//    }
//
//    @GetMapping("/sayHello")
//    public AppUserDTO sayHello(@RequestParam Long userId) {
//        // 获取用户信息
//        return remoteUserService.getUserInfoByUserId(userId).getData();
//    }
//
//    @PostMapping("/sayHello")
//    public AppUserDTO change(@RequestBody Long userId) {
//        // 获取用户信息
//        return remoteUserService.setUserSexByUserId(userId).getData();
//    }
//
//    @GetMapping("/introduce")
//    public String introduce(@SpringQueryMap LoginUser loginUser){
//        return remoteUserService.introduce(loginUser).getData();
//    }
//
//    @DeleteMapping
//    public String deleted(@RequestBody LoginUser loginUser){
//        return remoteUserService.deleted(loginUser).getData();
//    }
//    @PutMapping
//    public String edit(@RequestBody LoginUser loginUser){
//        return remoteUserService.edit(loginUser).getData();
//    }
}
