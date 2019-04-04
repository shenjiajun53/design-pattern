package com.huntun.proxy.DynamicProxy.CGLib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by shenjiajun on 2019/04/03 10:39.
 */
public class CGAgency implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        System.out.println("o.name:" + o.getClass().getName() + "   method.name:" + method.getName());
        System.out.println("-------------------------------------");
        System.out.println("CG提供服务");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("CG收费");
        System.out.println("-------------------------------------");
        return obj;
    }
}
