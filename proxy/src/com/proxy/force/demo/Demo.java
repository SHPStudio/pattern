package com.proxy.force.demo;

import com.proxy.force.impl.GamePlayerForce;
import com.proxy.force.impl.GamePlayerForceProxy;
import com.proxy.force.inter.IGamePlayerForce;


/**
 * Created by Shape on 2017/8/31.
 * 强制代理场景类
 */
public class Demo {
    public static void main(String[] args){
        //真正对象访问
        IGamePlayerForce gamePlayer =  new GamePlayerForce("孙海鹏");
        System.out.println("真实对象访问");
        gamePlayer.login("sunhaipeng","123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        //代理访问
        System.out.println("代理对象访问");
        IGamePlayerForce gameProxy = new GamePlayerForceProxy(gamePlayer);
        gameProxy.login("sunhaipeng","123456");
        gameProxy.killBoss();
        gameProxy.upgrade();
        //特定代理访问
        IGamePlayerForce specialProxy=gamePlayer.getProxy();
        System.out.println("特定代理对象访问");
        specialProxy.login("sunhaipeng","123456");
        specialProxy.killBoss();
        specialProxy.upgrade();
    }
}
