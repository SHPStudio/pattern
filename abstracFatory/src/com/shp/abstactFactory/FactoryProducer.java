package com.shp.abstactFactory;

/**
 * Created by shp2 on 2017/6/29.
 * 具体工厂生成器
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory)
    {
        if(factory.equals("Shape"))
        {
            return new ShapeFactory();
        }else if(factory.equals("Color"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
