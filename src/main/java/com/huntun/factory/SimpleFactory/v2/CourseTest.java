package com.huntun.factory.SimpleFactory.v2;


import com.huntun.factory.SimpleFactory.v1.ICourse;
import com.huntun.factory.SimpleFactory.v1.JavaCourse;
import com.huntun.factory.SimpleFactory.v1.PythonCourse;

/**
 * Created by shenjiajun on 2019/04/02 11:29.
 */
public class CourseTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.createCourse(JavaCourse.class);
        javaCourse.record();

        ICourse pythonCourse = courseFactory.createCourse(PythonCourse.class);
        pythonCourse.record();
    }
}
