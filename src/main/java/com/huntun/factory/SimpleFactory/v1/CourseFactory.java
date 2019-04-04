package com.huntun.factory.SimpleFactory.v1;

/**
 * Created by shenjiajun on 2019/04/02 11:29.
 */
public class CourseFactory {
    public ICourse createCourse(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }

        return null;
    }
}
