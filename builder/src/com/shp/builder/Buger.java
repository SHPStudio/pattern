package com.shp.builder;

import com.shp.Interface.Item;
import com.shp.Interface.Packing;

/**
 * Created by Shape on 2017/6/30.
 * 汉堡基类
 */
public class Buger implements Item {
    @Override
    public String name() {
        return null;
    }
    //汉堡用袋子包装
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 0;
    }
}
