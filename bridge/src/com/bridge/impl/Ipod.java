package com.bridge.impl;

import com.bridge.inter.Product;

/**
 * Created by Shape on 2017/8/7.
 * 山寨Ipod
 */
public class Ipod extends Product{

    @Override
    public void beProducted() {
        System.out.println("山寨Ipod生产出来是这样的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("山寨Ipod开始卖了。。。");
    }
}
