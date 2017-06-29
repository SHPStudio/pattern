package com.shp.singleton;

import java.io.InputStream;

/**
 * Created by shp2 on 2017/6/29.
 * 懒汉式单例模式 线程安全
 */
public class SingleObjectLazySafety implements ShowMessage{
    private static SingleObjectLazySafety instance;
    public static synchronized SingleObjectLazySafety getInstance(){
        if(instance==null)
        {
            instance=new SingleObjectLazySafety();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton safety");
    }
}
