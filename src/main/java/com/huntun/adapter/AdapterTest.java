package com.huntun.adapter;

/**
 * Created by shenjiajun on 2019/04/03 14:50.
 */
public class AdapterTest {
    public static void main(String[] args) {
        ChineseCookAdapter chineseCookAdapter = new ChineseCookAdapter(new Cook());
        chineseCookAdapter.makeFood();
    }
}
