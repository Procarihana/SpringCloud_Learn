package com.luwei.common.datasource.config;

import com.luwei.common.datasource.base.extend.ExtendSqlInjector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: dengzt
 * @Date: 15:52 2022-03-12
 * @Version:
 * @Description:
 */
@Configuration
public class MybatisConfiguration {

    /**
     * 注入sql
     */
    @ConditionalOnMissingBean
    @Bean
    public ExtendSqlInjector customerSqlInjector() {
        return new ExtendSqlInjector();
    }
}
