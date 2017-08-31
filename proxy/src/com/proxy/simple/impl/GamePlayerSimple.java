package com.proxy.simple.impl;

import com.proxy.simple.inter.IGamePlayerSimple;

/**
 * Created by Shape on 2017/8/30.
 * 普通代理游戏玩家
 */
public class GamePlayerSimple implements IGamePlayerSimple{
    //玩家昵称
    private String name;

    /**
     * 只能允许代理类创建玩家
     * @param gamePlayer
     * @param name
     */
    public GamePlayerSimple(IGamePlayerSimple gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实对象");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" +user+ "的玩家：" +this.name+ "已登陆游戏");
    }

    @Override
    public void killBoss() {
        System.out.println("玩家" +this.name+ "击杀了Boss");
    }

    @Override
    public void upgrade() {
        System.out.println("玩家" + this.name + "升级了");
    }
}
