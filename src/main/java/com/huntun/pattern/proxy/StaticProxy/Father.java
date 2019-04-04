package com.huntun.pattern.proxy.StaticProxy;

/**
 * Created by shenjiajun on 2019/04/02 18:25.
 */
public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("要求孝顺");
        son.findLove();
        System.out.println("下聘礼");
    }
}
