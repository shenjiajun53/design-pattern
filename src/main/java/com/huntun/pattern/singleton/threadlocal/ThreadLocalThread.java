package com.huntun.pattern.singleton.threadlocal;

/**
 * Created by shenjiajun on 2019/03/29 15:42.
 */
public class ThreadLocalThread extends Thread{
    @Override
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println("Thread:" + getName() + " singleton:" + singleton.toString());
    }
}
