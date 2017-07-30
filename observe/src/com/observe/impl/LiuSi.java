package com.observe.impl;

import com.observe.inter.Observer;

import java.io.OutputStream;

/**
 * Created by Shape on 2017/7/30.
 * 刘斯实例
 */
public class LiuSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("刘斯检测到韩非子有动静");
        this.laugh(context);
        System.out.println("刘斯笑死了");
    }
    public void laugh(String context)
    {
        System.out.println("刘斯看到韩非子"+context+"他笑了");
    }
}
