package com.shp.abstactFactory;

/**
 * Created by shp2 on 2017/6/29.
 */
public class FactoryMain {
    public static void main(String[] args)
    {
        AbstractFactory shapeFactory=FactoryProducer.getFactory("Shape");
        MyShape shape1=shapeFactory.getShape("Circle");
        shape1.draw();
        MyShape shape2=shapeFactory.getShape("Rectangle");
        shape2.draw();
        MyShape shape3=shapeFactory.getShape("Squar");
        shape3.draw();
        AbstractFactory colorFactory=FactoryProducer.getFactory("Color");
        MyColor red=colorFactory.getColor("red");
        red.fill();
        MyColor green=colorFactory.getColor("green");
        green.fill();
        MyColor yellow=colorFactory.getColor("yellow");
        yellow.fill();
    }
}
