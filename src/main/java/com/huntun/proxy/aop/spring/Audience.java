package com.huntun.proxy.aop.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by shenjiajun on 2019/04/04 10:56.
 */
@Aspect
@Component
public class Audience {

//    @Pointcut("execution(* com.huntun.proxy.aop.spring.Performer.*(*))")
//    public void performance(){
//
//    }

    @Pointcut("execution(* com.huntun.proxy.aop.spring.Performer.perform(..))")
    public void performance(){

    }

    @Before("execution(* com.huntun.proxy.aop.spring.Performer.perform(..))")
    public void silencePhone(){
        System.out.println("手机静音");
    }


    @After("performance()")
    public void clapHands(){
        System.out.println("鼓掌");
    }
}
