package com.huntun.proxy.aop.ht.lib;

import lombok.Data;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by shenjiajun on 2019/04/04 14:53.
 */
@Data
public class HtProxy implements MethodInterceptor {

    private HashMap<String, ProxyMethod> beforeMethodMap = new HashMap<>();
    private HashMap<String, ProxyMethod> afterMethodMap = new HashMap<>();

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
//        System.out.println("-------------------------------------");
//        System.out.println("CG提供服务");

        before(method);
        Object obj = methodProxy.invokeSuper(o, objects);
        after(method);
//        System.out.println("CG收费");
//        System.out.println("-------------------------------------");
        return obj;
    }

    public void before(Method method) {
        try {
            if (null != beforeMethodMap.get(method.getName())) {
                ProxyMethod beforeMethod = beforeMethodMap.get(method.getName());
                beforeMethod.getAdviseMethod().invoke(beforeMethod.getObject(), beforeMethod.getArgs());
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void after(Method method) {
        try {
            if (null != afterMethodMap.get(method.getName())) {
                ProxyMethod afterMethod = afterMethodMap.get(method.getName());
                afterMethod.getAdviseMethod().invoke(afterMethod.getObject(), afterMethod.getArgs());
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
