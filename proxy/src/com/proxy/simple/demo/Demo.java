package com.proxy.simple.demo;

import com.proxy.simple.impl.GamePlayerSimpleProxy;
import com.proxy.simple.inter.IGamePlayerSimple;

import java.util.Date;

/**
 * Created by Shape on 2017/8/30.
 * 普通代理场景类
 */
public class Demo {
    public static void main(String[] args){
        try {
            IGamePlayerSimple gamePlayerSimpleProxy = new GamePlayerSimpleProxy("张三");
            System.out.println("代练开始时间" + new Date() + "");
            gamePlayerSimpleProxy.login("zhangsan","123456");
            gamePlayerSimpleProxy.killBoss();
            gamePlayerSimpleProxy.upgrade();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
