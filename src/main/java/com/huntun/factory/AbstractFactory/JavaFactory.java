package com.huntun.factory.AbstractFactory;


import com.huntun.factory.SimpleFactory.v1.ICourse;
import com.huntun.factory.SimpleFactory.v1.JavaCourse;

/**
 * Created by shenjiajun on 2019/04/02 14:34.
 */
public class JavaFactory implements IFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public IBook createBook() {
        return new JavaBook();
    }
}
