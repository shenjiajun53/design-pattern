package com.huntun.factory.SimpleFactory.v1;

/**
 * Created by shenjiajun on 2019/04/02 11:29.
 */
public class CourseTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.createCourse("java");
        javaCourse.record();

        ICourse pythonCourse = courseFactory.createCourse("python");
        pythonCourse.record();
    }
}
