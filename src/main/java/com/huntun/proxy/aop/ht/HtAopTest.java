package com.huntun.proxy.aop.ht;

import com.huntun.proxy.aop.ht.lib.HtAop;
import com.huntun.proxy.aop.ht.lib.HtProxy;

/**
 * Created by shenjiajun on 2019/04/04 15:00.
 */
public class HtAopTest {
    public static void main(String[] args) {
        HtAop htAop = new HtAop();
        try {
            HtPerformer htPerformer = (HtPerformer) htAop.getInstance(HtPerformer.class);
            htPerformer.perform();
            htPerformer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        HtPerformer htPerformer = new HtPerformer();
//        htPerformer.perform();
    }
}
