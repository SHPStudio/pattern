package com.bridge.impl;

import com.bridge.inter.Product;

/**
 * Created by Shape on 2017/8/7.
 * 服装
 */
public class Cloth extends Product{

    @Override
    public void beProducted() {
        System.out.println("服装生产出来了。。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("服装大卖。。。");
    }
}
