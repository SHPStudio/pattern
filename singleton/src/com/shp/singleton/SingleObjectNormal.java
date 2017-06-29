package com.shp.singleton;

/**
 * Created by shp2 on 2017/6/29.
 * 饿汉式单例模式
 */
public class SingleObjectNormal implements ShowMessage{
    //创建静态本类变量
    private static SingleObjectNormal instance=new SingleObjectNormal();
    //获取变量
    public static SingleObjectNormal getInstance()
    {
        return instance;
    }
    //执行方法
    public void showMessage(){
        System.out.println("Hello World");
    }
}
