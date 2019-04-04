package com.huntun.prototype;

/**
 * Created by shenjiajun on 2019/04/02 17:14.
 */
public class PrototypeTest {
    public static void main(String[] args) {
        JavaCourse origin = new JavaCourse();

        try {
            JavaCourse clone = (JavaCourse) origin.clone();
            System.out.println("深克隆： " + (origin.javaVideo == clone.javaVideo));
        } catch (Exception e) {
            e.printStackTrace();
        }


        JavaCourse source = new JavaCourse();
        JavaCourse target = source.shallowClone(source);
        System.out.println("浅克隆： " + (source.javaVideo == target.javaVideo));
    }
}
