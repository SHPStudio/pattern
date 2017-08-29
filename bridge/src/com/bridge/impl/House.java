package com.bridge.impl;

import com.bridge.inter.Product;

/**
 * Created by Shape on 2017/8/7.
 * 房子产品
 */
public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("房子生产出来是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("房子生产了卖出去了");
    }
}
