package com.huntun.pattern.delegate;

/**
 * Created by shenjiajun on 2019/04/03 11:34.
 */
public class Boss {

    private Manager manager = new Manager();

    public void command(String order) {
        manager.doWork(order);
    }
}
