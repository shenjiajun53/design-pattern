package com.huntun.pattern.singleton.lazy;

/**
 * Created by shenjiajun on 2019/03/28 12:08.
 */
public class LazyThread extends Thread {
    @Override
    public void run() {
        LazyDoubleLockSingleton singleton = LazyDoubleLockSingleton.getInstance();
//        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println("Thread:" + getName() + " singleton:" + singleton.toString());
    }
}
