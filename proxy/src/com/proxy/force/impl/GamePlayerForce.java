package com.proxy.force.impl;

import com.proxy.force.inter.IGamePlayerForce;

/**
 * Created by Shape on 2017/8/31.
 * 强制代理真实类
 * 1.不能直接使用真实类只能用代理类
 * 2.也不能直接用代理类
 */
public class GamePlayerForce implements IGamePlayerForce{
    //用户名
    private String name = "";
    //代理类
    private IGamePlayerForce gamePlayerPoxy = null;

    public GamePlayerForce(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(isProxy())
        {
            System.out.println("用户名为"+ user +"的"+ this.name +"玩家已登录");
        }else
        {
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy())
        {
            System.out.println("玩家"+ this.name +"击杀了Boss");
        }else
        {
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(isProxy())
        {
            System.out.println("玩家"+ this.name +"升级了");
        }else
        {
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public IGamePlayerForce getProxy() {
        this.gamePlayerPoxy = new GamePlayerForceProxy(this);
        return this.gamePlayerPoxy;
    }

    /**
     * 判断是代理
     * @return
     */
    public boolean isProxy(){
        if(this.gamePlayerPoxy != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
