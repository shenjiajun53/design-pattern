package com.huntun.pattern.factory.FactoryMethod;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;
import com.huntun.pattern.factory.SimpleFactory.v1.JavaCourse;

/**
 * Created by shenjiajun on 2019/04/02 12:10.
 */
public class JavaFactory implements ICourseFactory {
    public ICourse createCourse() {

        return new JavaCourse();
    }
}
