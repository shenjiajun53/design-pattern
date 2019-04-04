package com.huntun.decorator;

/**
 * Created by shenjiajun on 2019/04/03 15:37.
 */
public class EggDecorator extends CakeDecorator {
    public EggDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
