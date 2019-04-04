package com.huntun.pattern.factory.FactoryMethod;


/**
 * Created by shenjiajun on 2019/04/02 11:29.
 */
public class CourseTest {
    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaFactory();
        javaFactory.createCourse().record();

        ICourseFactory pythonFactory = new PythonFactory();
        pythonFactory.createCourse().record();
    }
}
