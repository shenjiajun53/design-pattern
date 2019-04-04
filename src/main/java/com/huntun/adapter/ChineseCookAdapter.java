package com.huntun.adapter;

import lombok.Data;

/**
 * Created by shenjiajun on 2019/04/03 14:48.
 */
@Data
public class ChineseCookAdapter {
    private Cook cook;

    public ChineseCookAdapter(Cook cook) {
        this.cook = cook;
    }

    public void makeFood() {
        cook.wash();
        cook.slice();
        steam();
    }

    public void steam() {
        System.out.println("蒸菜");
    }
}
