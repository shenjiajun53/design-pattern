package com.huntun.pattern.decorator;

/**
 * Created by shenjiajun on 2019/04/03 15:38.
 */
public class SausageDecorator extends CakeDecorator {
    public SausageDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
