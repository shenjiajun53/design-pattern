package com.huntun.proxy.aop.spring;

import org.springframework.stereotype.Service;

/**
 * Created by shenjiajun on 2019/04/04 10:56.
 */
@Service
public class Performer {

    public void perform() {
        System.out.println("表演节目");
    }
}
