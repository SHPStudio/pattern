package com.proxy.force.impl;

import com.proxy.force.inter.IGamePlayerForce;

/**
 * Created by Shape on 2017/8/31.
 * 强制代理代理类
 */
public class GamePlayerForceProxy implements IGamePlayerForce{
    //真实对象
    private IGamePlayerForce gamePlayer = null;

    public GamePlayerForceProxy(IGamePlayerForce gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayerForce getProxy() {
        return this;
    }
}
