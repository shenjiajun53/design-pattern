package com.huntun.pattern.proxy.aop.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shenjiajun on 2019/04/04 14:13.
 */
@Controller
@RequestMapping("perform")
public class PerformController {

    @Autowired
    private Performer performer;

    @RequestMapping("start")
    public void startPerform() {
        performer.perform();
    }
}
