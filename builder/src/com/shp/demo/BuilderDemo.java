package com.shp.demo;

import com.shp.builder.Meal;
import com.shp.builder.MealBuilder;

/**
 * Created by Shape on 2017/6/30.
 */
public class BuilderDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder=new MealBuilder();
        Meal wrapperMeal=mealBuilder.prepareWrapperMeal();
        wrapperMeal.showItems();
        wrapperMeal.getCost();
        Meal bottleMeal=mealBuilder.prepareBottleMeal();
        bottleMeal.showItems();
        bottleMeal.getCost();
    }
}
