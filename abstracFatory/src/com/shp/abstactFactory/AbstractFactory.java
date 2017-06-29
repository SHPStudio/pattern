package com.shp.abstactFactory;

/**
 * Created by shp2 on 2017/6/29.
 * 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 获取形状继承接口
     * @param shape
     * @return
     */
    abstract MyShape getShape(String shape);

    /**
     * 获取颜色继承接口
     * @param color
     * @return
     */
    abstract MyColor getColor(String color);
}
