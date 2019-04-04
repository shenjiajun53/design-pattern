package com.huntun.pattern.strategy;

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

    public IEmployee getEmployee(String order) {
        return employeeMap.get(order);
    }
}
