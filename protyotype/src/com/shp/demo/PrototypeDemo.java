package com.shp.demo;

import com.shp.prototype.Shape;
import com.shp.prototype.ShapeCache;

/**
 * Created by Shape on 2017/7/1.
 */
public class PrototypeDemo {
    public static void main(String [] args){
        ShapeCache.loadCache();
        Shape cloneShape=ShapeCache.getShape("1");
        System.out.println("Shape:"+cloneShape.getType());
        Shape cloneShape2=ShapeCache.getShape("2");
        System.out.println("Shape"+cloneShape2.getType());
        Shape cloneShape3=ShapeCache.getShape("3");
        System.out.println("Shape"+cloneShape3.getType());
    }
}
