package com.huntun.proxy.aop.ht.lib;

import java.lang.annotation.*;

/**
 * Created by shenjiajun on 2019/04/04 14:42.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface HTAfter {
    String className();
    String methodName();
}
