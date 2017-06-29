package com.shp.singleton;

/**
 * Created by shp2 on 2017/6/29.
 * 双捡锁
 */
public class SingleObjectDCL implements ShowMessage{
    private volatile static SingleObjectDCL instance;
    public static SingleObjectDCL getInstance(){
        if(instance==null)
        {
            synchronized (SingleObjectDCL.class){
                if(instance==null)
                {
                    instance=new SingleObjectDCL();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("双检锁单例模式");
    }
}
