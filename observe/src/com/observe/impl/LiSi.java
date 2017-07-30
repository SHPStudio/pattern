package com.observe.impl;

import com.observe.inter.Observer;

/**
 * Created by Shape on 2017/7/30.
 * 李斯观察者
 */
public class LiSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("李斯检测到韩非子有活动 开始禀报");
        this.reportTo(context);
        System.out.println("李斯报告完毕");
    }
    public void reportTo(String context)
    {
        System.out.println("李斯报告大王 韩非子有动态了"+context);
    }
}
