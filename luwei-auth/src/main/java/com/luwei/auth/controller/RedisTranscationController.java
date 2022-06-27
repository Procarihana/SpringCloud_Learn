package com.luwei.auth.controller;

import com.luwei.auth.domain.Result;
import com.luwei.auth.serivce.RedisTranscationService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.luwei.auth.serivce.RedisTranscationService.REDIS_TEST_KEY_V1;
import static com.luwei.auth.serivce.RedisTranscationService.REDIS_TEST_KEY_V2;


@RestController
@ApiModel("redis事务Test")
@RequestMapping("/redis")
public class RedisTranscationController {
    @Autowired
    private RedisTranscationService redisTranscationService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/v1.0")
    public Result v1(){
        redisTranscationService.v1();
        redisTemplate.opsForList().range(REDIS_TEST_KEY_V1, 0, -1);
        return Result.ok();
    }

    @GetMapping("/v2.0")
    public Result v2() throws Exception {
        redisTranscationService.v2();
        return Result.ok(redisTemplate.opsForList().range(REDIS_TEST_KEY_V2, 0, -1));
    }

    @GetMapping("/v3.0")
    public Result v3() {
        // 获取用户信息
        return Result.ok();
    }
}
