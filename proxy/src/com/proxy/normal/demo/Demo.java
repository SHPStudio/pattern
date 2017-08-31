package com.proxy.normal.demo;

import com.proxy.normal.impl.GamePlayer;
import com.proxy.normal.impl.GamePlayerProxy;
import com.proxy.normal.inter.IGamePlayer;

/**
 * Created by Shape on 2017/8/30.
 * 场景类
 */
public class Demo {
    public static void main(String[] args){
        //创建玩家
        IGamePlayer gamePlayer = new GamePlayer("孙海鹏");
        //寻找代练
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        System.out.println("开启代练");
        gamePlayerProxy.login("shp","123456");
        //开始杀怪
        gamePlayerProxy.killBoss();
        //升级了
        gamePlayerProxy.upgrade();
        System.out.println("完成代练");

    }
}
