package com.shp.singleton;

/**
 * Created by shp2 on 2017/6/29.
 * 枚举
 */
public enum SingletonEnum implements ShowMessage{
    INSTANCE;
    public void showMessage(){
        System.out.println("枚举单例模式");
    }
}
