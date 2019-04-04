package com.huntun.prototype;

import org.springframework.beans.BeanUtils;

import java.io.*;

/**
 * Created by shenjiajun on 2019/04/02 17:03.
 */
public class JavaCourse implements Cloneable, Serializable {
    public JavaVideo javaVideo;

    public JavaCourse() {
        this.javaVideo = new JavaVideo("原型模式课程", 60 * 60 * 1000L);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
//        return super.clone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            JavaCourse copy = (JavaCourse) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JavaCourse shallowClone(JavaCourse target) {
//        JavaCourse javaCourse = new JavaCourse();
//        javaCourse.javaVideo=target.javaVideo;

        JavaCourse javaCourse = new JavaCourse();
        BeanUtils.copyProperties(target, javaCourse);

//        JavaCourse javaCourse = new JavaCourse();
//        try {
//            PropertyUtils.copyProperties(javaCourse, target);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
        return javaCourse;
    }
}
