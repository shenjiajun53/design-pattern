package com.huntun.pattern.decorator;

/**
 * Created by shenjiajun on 2019/04/03 15:35.
 */
public class BaseCake implements Cake {
    public String getMsg() {
        return "1个饼皮";
    }

    public int getPrice() {
        return 3;
    }
}
