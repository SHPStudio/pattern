package com.shp.builder;

import com.shp.Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shape on 2017/6/30.
 * 菜单类 复杂构建类
 */
public class Meal {
    //菜单物品列表
    private List<Item> items= new ArrayList<Item>();
    //添加物品
    public void addItem(Item item)
    {
        items.add(item);
    }
    //获得商品价格
    public void getCost()
    {
        float total=0;
        for(Item item:items)
        {
            total+=item.price();
        }
        System.out.println("this meal's price:"+total);
    }
    //展示商品
    public void showItems(){
        for(Item item:items)
        {
            System.out.print("item name:"+item.name());
            System.out.print(",item packing:"+item.packing().packing());
            System.out.println(",item price:"+item.price());
        }

    }
}
