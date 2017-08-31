package com.proxy.simple.impl;

import com.proxy.simple.inter.IGamePlayerSimple;

/**
 * Created by Shape on 2017/8/30.
 * 普通玩家代练
 */
public class GamePlayerSimpleProxy implements IGamePlayerSimple{
    //真正玩家
    private IGamePlayerSimple gamePlayerSimple = null;

    public GamePlayerSimpleProxy(String name) throws Exception {
        try {
            gamePlayerSimple = new GamePlayerSimple(this,name);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayerSimple.login(name,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayerSimple.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayerSimple.upgrade();
    }
}
