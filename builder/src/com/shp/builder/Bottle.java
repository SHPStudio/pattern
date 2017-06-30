package com.shp.builder;

import com.shp.Interface.Packing;

/**
 * Created by Shape on 2017/6/30.
 * 以瓶子包装
 */
public class Bottle implements Packing {
    @Override
    public String packing() {
        return "packing by bottle";
    }
}
