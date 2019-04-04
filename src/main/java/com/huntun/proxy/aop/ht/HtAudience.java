package com.huntun.proxy.aop.ht;

import com.huntun.proxy.aop.ht.lib.HTAfter;
import com.huntun.proxy.aop.ht.lib.HTBefore;
import com.huntun.proxy.aop.ht.lib.HtAspect;
import com.huntun.proxy.aop.ht.lib.HtPointcut;

/**
 * Created by shenjiajun on 2019/04/04 14:51.
 */
@HtAspect
public class HtAudience {
    @HtPointcut(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "perform")
    public void performance() {

    }

    @HTBefore(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "perform")
    public void silencePhone() {
        System.out.println("观众 手机静音");
    }

    @HTBefore(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "perform")
    public void startVideo() {
        System.out.println("观众 偷偷拍照");
    }

    @HTAfter(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "perform")
    public void clapHands() {
        System.out.println("观众 鼓掌");
    }



    @HTBefore(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "finish")
    public void stopVideo() {
        System.out.println("观众 停止拍照");
    }

    @HTAfter(className = "com.huntun.proxy.aop.ht.HtPerformer", methodName = "finish")
    public void leave() {
        System.out.println("观众 离开");
    }
}
