package com.huntun.proxy.aop.ht.lib;

import java.lang.annotation.*;

/**
 * Created by shenjiajun on 2019/04/03 10:52.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface HTBefore {
    String className();
    String methodName();
}
