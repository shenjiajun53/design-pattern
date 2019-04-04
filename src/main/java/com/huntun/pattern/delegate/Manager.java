package com.huntun.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shenjiajun on 2019/04/03 11:33.
 */
public class Manager {
    private Map<String, IEmployee> employeeMap = new HashMap<String, IEmployee>();

    public Manager() {
        employeeMap.put("烧菜", new Cook());
        employeeMap.put("上菜", new Waiter());
    }

    public void doWork(String order) {
        employeeMap.get(order).doWork();
    }
}
