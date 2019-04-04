package com.huntun.proxy.StaticProxy;

/**
 * Created by shenjiajun on 2019/04/02 18:27.
 */
public class StaticTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
