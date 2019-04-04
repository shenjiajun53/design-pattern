package com.huntun.proxy.aop.ht.lib;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by shenjiajun on 2019/04/04 15:34.
 */
public class HtAop {
    public Object getInstance(Class<?> oriClass) throws Exception {
        String packageName = this.getClass().getPackage().getName();
        System.out.println("包名" + packageName);

        List<Class<?>> classes = PackageUtil.getClasssFromPackage(packageName.replace(".lib", ""));
        for (Class<?> clazz : classes) {
            if (clazz.isAnnotationPresent(HtAspect.class)) {
                System.out.println(clazz.getName());
                Method[] methods = clazz.getDeclaredMethods();
                HtProxy htProxy = new HtProxy();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(HTBefore.class)) {
                        HTBefore htBefore = method.getAnnotation(HTBefore.class);
//                    this.methodMap.put(apiMapper.value(), method);
                        String className = htBefore.className();
                        String methodName = htBefore.methodName();
                        if (className.equals(oriClass.getName())) {
                            try {
                                Method orginMethod = oriClass.getMethod(methodName);
                                ProxyMethod proxyMethod = new ProxyMethod(clazz.getConstructor().newInstance(), method);
                                htProxy.getBeforeMethodMap().put(methodName, proxyMethod);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (method.isAnnotationPresent(HTAfter.class)) {
                        HTAfter htAfter = method.getAnnotation(HTAfter.class);
//                    this.methodMap.put(apiMapper.value(), method);
                        String className = htAfter.className();
                        String methodName = htAfter.methodName();
                        if (className.equals(oriClass.getName())) {
                            try {
                                Method orginMethod = oriClass.getMethod(methodName);
                                ProxyMethod proxyMethod = new ProxyMethod(clazz.getConstructor().newInstance(), method);
                                htProxy.getAfterMethodMap().put(methodName, proxyMethod);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                return htProxy.getInstance(oriClass);
            }
        }

        return oriClass.getConstructor().newInstance();
    }
}
