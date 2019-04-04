package com.huntun.pattern.singleton.register;

/**
 * 《Effective Java》书中推荐的一种单例实现写法
 * Created by shenjiajun on 2019/04/02 15:46.
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
