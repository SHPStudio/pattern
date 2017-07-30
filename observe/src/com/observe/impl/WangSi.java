package com.observe.impl;

import com.observe.inter.Observer;

/**
 * Created by Shape on 2017/7/30.
 * 王斯观察者
 */
public class WangSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("王斯检测到韩非子有动静");
        this.cry(context);
        System.out.println("王斯哭死了");
    }
    public void cry(String context)
    {
        System.out.println("王斯知道韩非子在"+context+"他悲伤的想哭");
    }
}
