package com.huntun.factory.FactoryMethod;


import com.huntun.factory.SimpleFactory.v1.ICourse;
import com.huntun.factory.SimpleFactory.v1.PythonCourse;

/**
 * Created by shenjiajun on 2019/04/02 12:11.
 */
public class PythonFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
