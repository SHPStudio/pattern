package com.shp.builder;

import com.shp.Interface.Item;
import com.shp.Interface.Packing;

/**
 * Created by Shape on 2017/6/30.
 * 冷饮基类
 */
public class CoolDrink implements Item {
    @Override
    public String name() {
        return null;
    }
    //冷饮用瓶子包装
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
