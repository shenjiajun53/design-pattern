package com.huntun.pattern.singleton.threadlocal;

/**
 * Created by shenjiajun on 2019/03/29 15:43.
 */
public class SingletonTest {
    public static void main(String[] args) {
        ThreadLocalThread thread0 = new ThreadLocalThread();
        ThreadLocalThread thread1 = new ThreadLocalThread();
        ThreadLocalThread thread2 = new ThreadLocalThread();
        ThreadLocalThread thread3 = new ThreadLocalThread();
        ThreadLocalThread thread4 = new ThreadLocalThread();
        ThreadLocalThread thread5 = new ThreadLocalThread();


        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("start SingletonTest");
    }
}
