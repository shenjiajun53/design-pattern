package com.huntun.proxy.aop.ht.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shenjiajun on 2019/04/04 14:52.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface HtPointcut {
    String className();
    String methodName();

    String argNames() default "";
}
