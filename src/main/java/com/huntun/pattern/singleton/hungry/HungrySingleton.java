package com.huntun.pattern.singleton.hungry;

/**
 * Created by shenjiajun on 2019/03/28 11:44.
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
