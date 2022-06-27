package com.luwei.auth;

import com.luwei.common.security.annotation.EnableLuweiFeignClients;
import com.luwei.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 测试中心
 *
 * @author luwei
 */
@EnableCustomSwagger2
@EnableLuweiFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"com.luwei"})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("测试中心启动成功!!!");
    }
}
