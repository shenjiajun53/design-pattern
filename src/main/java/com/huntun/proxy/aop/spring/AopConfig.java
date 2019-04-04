package com.huntun.proxy.aop.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by shenjiajun on 2019/04/04 11:20.
 */
@Configuration
@EnableAspectJAutoProxy()
@ComponentScan("com.huntun.pattern.aop")
public class AopConfig {
//    @Bean
//    public Audience audience() {
//        return new Audience();
//    }
}
