package com.shp.Interface;

/**
 * Created by Shape on 2017/6/30.
 * 商品接口
 */
public interface Item {
    //商品名字
    public String name();
    //商品的打包方式
    public Packing packing();
    //商品的价格
    public float price();
}
