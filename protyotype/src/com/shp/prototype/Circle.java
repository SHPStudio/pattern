package com.shp.prototype;

/**
 * Created by Shape on 2017/7/1.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }
    @Override
    public void draw() {
        System.out.println("draw a Circle");
    }
}
