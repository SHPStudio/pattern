package com.proxy.normal.inter;

/**
 * Created by Shape on 2017/8/30.
 * 游戏接口
 */
public interface IGamePlayer {
    /**
     * 登陆游戏
     * @param name
     * @param password
     */
    public void login(String name,String password);

    /**
     * 杀Boss
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();
}
