package com.huntun.pattern.factory.FactoryMethod;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;
import com.huntun.pattern.factory.SimpleFactory.v1.PythonCourse;

/**
 * Created by shenjiajun on 2019/04/02 12:11.
 */
public class PythonFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
