package com.shp.builder;

/**
 * Created by Shape on 2017/6/30.
 * 橙汁
 */
public class Orange extends CoolDrink {
    @Override
    public String name() {
        return "橙汁";
    }

    @Override
    public float price() {
        return 0.56f;
    }
}
