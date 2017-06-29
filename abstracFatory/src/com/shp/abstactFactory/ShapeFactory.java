package com.shp.abstactFactory;

/**
 * Created by shp2 on 2017/6/29.
 * 形状工厂
 */
public class ShapeFactory extends AbstractFactory {
    /**
     * 获取形状接口
     * @param shape
     * @return
     */
    @Override
    public MyShape getShape(String shape) {
        if(shape.equals("Circle"))
        {
            return new Circle();
        }else if(shape.equals("Rectangle"))
        {
            return new Rectangle();
        }else if(shape.equals("Squar"))
        {
            return new Squar();
        }
        return null;
    }

    @Override
    public MyColor getColor(String color) {
        return null;
    }
}
