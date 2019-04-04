package com.huntun.pattern.factory.AbstractFactory;


import com.huntun.pattern.factory.SimpleFactory.v1.ICourse;

/**
 * Created by shenjiajun on 2019/04/02 14:33.
 */
public interface IFactory {

    ICourse createCourse();

    IBook createBook();
}
