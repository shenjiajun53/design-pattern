package com.huntun.pattern.strategy;

/**
 * Created by shenjiajun on 2019/04/03 11:38.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Manager manager = new Manager();

        IEmployee waiter = manager.getEmployee("上菜");
        waiter.doWork();

        IEmployee cook = manager.getEmployee("烧菜");
        cook.doWork();
    }
}
