package com.proxy.normal.impl;

import com.proxy.normal.inter.IGamePlayer;

/**
 * Created by Shape on 2017/8/30.
 * 玩家代练-代理类
 */
public class GamePlayerProxy implements IGamePlayer {

    //要给谁代练
    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String name, String password) {
        this.iGamePlayer.login(name,password);
    }

    @Override
    public void killBoss() {
        this.before();
        this.iGamePlayer.killBoss();
        this.after();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }

    /**
     * 代理自己的处理
     */
    private void before(){
        System.out.println("代练打boss之前开大号");
    }

    private void after(){
        System.out.println("代练打完之后分赃");
    }
}
