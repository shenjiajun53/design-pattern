package com.huntun.pattern.delegate;

/**
 * Created by shenjiajun on 2019/04/03 11:32.
 */
public class Waiter implements IEmployee {
    public void doWork() {
        System.out.println("开始上菜");
    }
}
