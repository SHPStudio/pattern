package com.shp.builder;

/**
 * Created by Shape on 2017/6/30.
 * 菜单建造者
 */
public class MealBuilder {
    //构建袋子包装方式的菜单
    public Meal prepareWrapperMeal(){
        Meal wapperMeal=new Meal();
        VegBuger vegBuger=new VegBuger();
        ChickenBuger chickenBuger=new ChickenBuger();
        wapperMeal.addItem(vegBuger);
        wapperMeal.addItem(chickenBuger);
        return wapperMeal;
    }
    //构建瓶子包装方式的菜单
    public Meal prepareBottleMeal(){
        Meal bottleMeal=new Meal();
        Orange orange=new Orange();
        Cola cola=new Cola();
        bottleMeal.addItem(orange);
        bottleMeal.addItem(cola);
        return bottleMeal;
    }
}
