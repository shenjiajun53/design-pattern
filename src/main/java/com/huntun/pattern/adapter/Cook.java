package com.huntun.pattern.adapter;

/**
 * Created by shenjiajun on 2019/04/03 14:44.
 */
public class Cook {
    public void slice() {
        System.out.println("切菜");
    }

    public void fry() {
        System.out.println("炒菜");
    }

    public void wash() {
        System.out.println("洗菜");
    }


    public void makeFood() {
        wash();
        slice();
        fry();
    }
}
