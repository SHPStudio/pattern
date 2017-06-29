package com.pattern.factory;

import sun.security.provider.SHA;

/**
 * Created by shp2 on 2017/6/29.
 */
public class ShapeFactory {
    public Shape getShape(String type)
    {
        if(type.equals("CIRCLE"))
        {
            return new Circle();
        }else if(type.equals("RECTANGLE"))
        {
            return new Rectangle();
        }else if(type.equals("SQUAR"))
        {
            return new Squar();
        }else
        {
            return null;
        }
    }
}
