package com.shp.prototype;

/**
 * Created by Shape on 2017/7/1.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}
