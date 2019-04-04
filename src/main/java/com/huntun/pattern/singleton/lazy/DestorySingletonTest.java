package com.huntun.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 尝试破坏单例
 * Created by shenjiajun on 2019/04/02 15:27.
 */
public class DestorySingletonTest {
    public static void main(String[] args) {
        try {
            //很无聊的情况下， 进行破坏
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问， 强吻， 不愿意也要吻
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
