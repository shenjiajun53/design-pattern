package com.huntun.singleton.lazy;

/**
 * Created by shenjiajun on 2019/03/28 11:49.
 */
//原理：内部类一定是要在方法调用之前初始化，巧妙地避免了线程安全问题。
//这种形式兼顾饿汉式的内存浪费， 也兼顾 synchronized 性能问题
//完美地屏蔽了这两个缺点
public class LazyInnerClassSingleton {
//    private static LazyInnerClassSingleton lazyDoubleLockSingleton = null;

    //默认使用 LazyInnerClassGeneral 的时候， 会先初始化内部类
    //如果没使用的话， 内部类是不加载的
    private LazyInnerClassSingleton() {
        if (null != SingletonHolder.LAZY) {
            throw new RuntimeException("非法");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //final保证这个方法不会被重写， 重载
    public static LazyInnerClassSingleton getInstance() {
        return SingletonHolder.LAZY;
    }

    //默认不加载
    private static class SingletonHolder {
        private static LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
