package com.huntun.proxy.DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by shenjiajun on 2019/04/02 18:37.
 */
public class Agency implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------------------------------------");
        System.out.println("提供服务");
        Object object = method.invoke(target, args);
        System.out.println("收费");
        System.out.println("-------------------------------------");
        return object;
    }
}
