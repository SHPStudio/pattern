package com.shp.demo;

import com.shp.singleton.*;

/**
 * Created by shp2 on 2017/6/29.
 */
public class SingletonDemo {
    public static void main(String [] args)
    {
        //打印消息接口
        ShowMessage show;
        //正常模式
        show=SingleObjectNormal.getInstance();
        show.showMessage();
        //懒汉模式线程不安全
        show=SingleObjectLazyNoSafety.getInstance();
        show.showMessage();
        //懒汉线程安全
        show=SingleObjectLazySafety.getInstance();
        show.showMessage();
        //双检锁
        show=SingleObjectDCL.getInstance();
        show.showMessage();
        //静态内部类
        show=SingletonInside.getInstance();
        show.showMessage();
        //枚举
        show=SingletonEnum.INSTANCE;
        show.showMessage();
    }
}
