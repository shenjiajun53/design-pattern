package com.huntun.decorator;

/**
 * Created by shenjiajun on 2019/04/03 15:36.
 */
public class CakeDecorator implements Cake {
    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    public String getMsg() {
        return cake.getMsg();
    }

    public int getPrice() {
        return cake.getPrice();
    }
}
