package com.shp.prototype;

/**
 * Created by Shape on 2017/7/1.
 */
public class Squar extends Shape{
    public Squar(){
        type="Squar";
    }
    @Override
    public void draw() {
        System.out.println("draw a Squar");
    }
}
