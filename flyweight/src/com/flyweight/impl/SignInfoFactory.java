package com.flyweight.impl;

import java.util.HashMap;

/**
 * Created by Shape on 2017/8/5.
 * 池对象创建工厂
 */
public class SignInfoFactory {
    //对象池
    private static HashMap<String,SignInfo> pool=new HashMap<String,SignInfo>();

    //获取对象方法
    public static SignInfo getSignInfo(String key)
    {
        //检查map中是否有这个key
        if(pool.containsKey(key))
        {
            System.out.println(key+"从池中获取对象");
            //如果有就返回
            return pool.get(key);
        }else
        {
            System.out.println(key+"新创建的");
            //如果没有创建一个池对象
            SignInfoPool poolItem=new SignInfoPool(key);
            pool.put(key,poolItem);
            return poolItem;
        }
    }
}
