package com.huntun.observer;

/**
 * Created by shenjiajun on 2019/04/03 17:05.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Gper gper = new Gper("馄饨");

        Teacher tom = new Teacher("Tom");
        Teacher james = new Teacher("James");
        gper.sendMessage(tom, "今天有课吗？");
        gper.sendMessage(james, "今天有课吗？");
    }
}
