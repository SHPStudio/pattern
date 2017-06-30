package com.shp.builder;

/**
 * Created by Shape on 2017/6/30.
 * 可乐
 */
public class Cola extends CoolDrink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 0.32f;
    }
}
