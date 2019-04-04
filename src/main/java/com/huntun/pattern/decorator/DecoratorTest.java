package com.huntun.pattern.decorator;

/**
 * Created by shenjiajun on 2019/04/03 15:39.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Cake cake = new BaseCake();

        cake = new SausageDecorator(cake);
        cake = new EggDecorator(cake);
        cake = new SausageDecorator(cake);
        System.out.println(cake.getMsg() + " 价格：" + cake.getPrice() + "元");
    }
}
