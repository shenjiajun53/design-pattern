package com.huntun.pattern.factory.FactoryMethod;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;

/**
 * Created by shenjiajun on 2019/04/02 12:10.
 */
public interface ICourseFactory {
    ICourse createCourse();
}
