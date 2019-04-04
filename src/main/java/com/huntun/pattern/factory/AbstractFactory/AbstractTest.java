package com.huntun.pattern.factory.AbstractFactory;

/**
 * Created by shenjiajun on 2019/04/02 14:35.
 */
public class AbstractTest {
    public static void main(String[] args) {
        IFactory javaFactory = new JavaFactory();
        javaFactory.createCourse().record();
        javaFactory.createBook().read();


        IFactory pythonFactory = new PythonFactory();
        pythonFactory.createCourse().record();
        pythonFactory.createBook().read();
    }
}
