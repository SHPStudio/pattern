package com.shp.builder;

import com.shp.Interface.Packing;

/**
 * Created by Shape on 2017/6/30.
 * 纸袋方式包装
 */
public class Wrapper implements Packing {
    @Override
    public String packing() {
        return "packing by wrapper";
    }
}
