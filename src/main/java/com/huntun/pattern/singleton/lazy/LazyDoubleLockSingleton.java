package com.huntun.pattern.singleton.lazy;

/**
 * Created by shenjiajun on 2019/03/28 11:47.
 */
public class LazyDoubleLockSingleton {
    private static LazyDoubleLockSingleton lazyDoubleLockSingleton = null;

    private LazyDoubleLockSingleton() {
    }

    public static LazyDoubleLockSingleton getInstance() {
        if (null == lazyDoubleLockSingleton) {
            synchronized (LazyDoubleLockSingleton.class) {
                if (null == lazyDoubleLockSingleton) {
                    lazyDoubleLockSingleton = new LazyDoubleLockSingleton();
                }
            }
        }
        return lazyDoubleLockSingleton;
    }
}
