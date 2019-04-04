package com.huntun.pattern.singleton.lazy;


/**
 * Created by shenjiajun on 2019/03/28 12:11.
 */
public class SingletonTest {
    public static void main(String[] args) {
        LazyThread lazyThread0 = new LazyThread();
        LazyThread lazyThread1 = new LazyThread();
        LazyThread lazyThread2 = new LazyThread();
        LazyThread lazyThread3 = new LazyThread();
        LazyThread lazyThread4 = new LazyThread();
        LazyThread lazyThread5 = new LazyThread();


        lazyThread0.start();
        lazyThread1.start();
        lazyThread2.start();
        lazyThread3.start();
        lazyThread4.start();
        lazyThread5.start();

        System.out.println("start SingletonTest");
    }
}
