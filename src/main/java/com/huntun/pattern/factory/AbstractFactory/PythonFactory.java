package com.huntun.pattern.factory.AbstractFactory;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;
import com.huntun.pattern.factory.SimpleFactory.v1.PythonCourse;

/**
 * Created by shenjiajun on 2019/04/02 14:34.
 */
public class PythonFactory implements IFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }

    public IBook createBook() {
        return new PythonBook();
    }
}
