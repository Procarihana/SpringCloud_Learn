package com.luwei.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.luwei.common.security.annotation.EnableCustomConfig;
import com.luwei.common.security.annotation.EnableLuweiFeignClients;
import com.luwei.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 系统模块
 *
 * @author luwei
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableLuweiFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan({"com.luwei"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("后台模块启动成功!!!");
    }
}

