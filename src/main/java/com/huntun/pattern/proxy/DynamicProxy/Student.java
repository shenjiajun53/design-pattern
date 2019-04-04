package com.huntun.pattern.proxy.DynamicProxy;

/**
 * Created by shenjiajun on 2019/04/02 18:45.
 */
public class Student implements Renter {
    public void rentHouse() {
        System.out.println("只租得起便宜的房子");
    }
}
