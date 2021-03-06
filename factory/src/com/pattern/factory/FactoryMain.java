package com.pattern.factory;

/**
 * Created by shp2 on 2017/6/21.
 */
public class FactoryMain {
    public static void main(String[] args)
    {
        System.out.println("设计模式之工厂模式");
        ShapeFactory factory=new ShapeFactory();
        CommonShape shape1=factory.getShape("CIRCLE");
        shape1.draw();
        CommonShape shape2=factory.getShape("RECTANGLE");
        shape2.draw();
        CommonShape shape3=factory.getShape("SQUAR");
        shape3.draw();
    }
}
