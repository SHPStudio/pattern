package com.proxy.normal.impl;

import com.proxy.normal.inter.IGamePlayer;

/**
 * Created by Shape on 2017/8/30.
 * 真正的游戏者
 */
public class GamePlayer implements IGamePlayer {
    //昵称
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
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
