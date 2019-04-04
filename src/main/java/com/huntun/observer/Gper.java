package com.huntun.observer;

import com.google.common.eventbus.EventBus;

/**
 * Created by shenjiajun on 2019/04/03 16:59.
 */
public class Gper {
    public String name;

    public Gper(String name) {
        this.name = name;
    }

    public void sendMessage(Teacher teacher,String msg) {
        Message message = new Message();
        message.setName(name);
        message.setContent(msg);

        EventBus eventBus = new EventBus();

        eventBus.register(teacher);
        eventBus.post(message);
    }
}
