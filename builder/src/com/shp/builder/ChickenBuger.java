package com.shp.builder;

/**
 * Created by Shape on 2017/6/30.
 * 鸡肉汉堡
 */
public class ChickenBuger extends Buger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 1.3f;
    }
}
