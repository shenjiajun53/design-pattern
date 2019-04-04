package com.huntun.pattern.factory.SimpleFactory.v2;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;

/**
 * 通过反射生成
 * Created by shenjiajun on 2019/04/02 11:34.
 */
public class CourseFactory {

    public ICourse createCourse(Class<? extends ICourse> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
