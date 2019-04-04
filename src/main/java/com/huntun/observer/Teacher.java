package com.huntun.observer;

import com.google.common.eventbus.Subscribe;

/**
 * Created by shenjiajun on 2019/04/03 16:59.
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void getMessage(Message message) {
        System.out.println(name + "老师你好！ \n" + message.getName() + "提问:" + message.getContent());
    }
}
