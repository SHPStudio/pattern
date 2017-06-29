package com.shp.abstactFactory;

/**
 * Created by shp2 on 2017/6/29.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    MyShape getShape(String shape) {
        return null;
    }

    @Override
    MyColor getColor(String color) {
        if(color.equals("red"))
        {
            return new Red();
        }else if(color.equals("green"))
        {
            return new Green();
        }else if(color.equals("yellow"))
        {
            return new Yellow();
        }
        return null;
    }
}
