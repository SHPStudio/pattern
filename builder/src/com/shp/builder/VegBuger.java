package com.shp.builder;

/**
 * Created by Shape on 2017/6/30.
 * 蔬菜汉堡
 */
public class VegBuger extends Buger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 0.8f;
    }
}
