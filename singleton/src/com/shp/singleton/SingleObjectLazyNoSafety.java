package com.shp.singleton;

/**
 * Created by shp2 on 2017/6/29.
 * 懒汉式 线程不安全
 */
public class SingleObjectLazyNoSafety implements ShowMessage{
    private static SingleObjectLazyNoSafety instance;
    public static SingleObjectLazyNoSafety getInstance(){
        if(instance==null)
        {
            instance=new SingleObjectLazyNoSafety();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton not safety");
    }
}
