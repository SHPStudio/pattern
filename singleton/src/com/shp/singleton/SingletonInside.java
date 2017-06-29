package com.shp.singleton;

/**
 * Created by shp2 on 2017/6/29.
 * 登记式 静态内部类
 */
public class SingletonInside implements ShowMessage{
    private static class SingletonHolder{
        private static final SingletonInside INSTANCE=new SingletonInside();
    }
    public static final SingletonInside getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public void showMessage(){
        System.out.println("登记式/静态内部类用法单例模式");
    }
}
