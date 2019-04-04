package com.huntun.delegate;

/**
 * Created by shenjiajun on 2019/04/03 11:38.
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("烧菜");
        boss.command("上菜");
    }
}
