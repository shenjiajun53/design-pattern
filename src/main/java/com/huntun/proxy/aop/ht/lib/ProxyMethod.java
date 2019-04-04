package com.huntun.proxy.aop.ht.lib;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * Created by shenjiajun on 2019/04/04 16:24.
 */
@Data
public class ProxyMethod {
    public ProxyMethod(Object object, Method adviseMethod) {
        this.object = object;
//        this.pointcutMethod = pointcutMethod;
        this.adviseMethod = adviseMethod;
    }

    private Object object;
//    private Method pointcutMethod;
    private Method adviseMethod;
    private Object[] args;
}
