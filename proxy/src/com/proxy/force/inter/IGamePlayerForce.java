package com.proxy.force.inter;

/**
 * Created by Shape on 2017/8/31.
 * 强制代理接口 每个真实对象的访问必须通过特定代理类
 */
public interface IGamePlayerForce {
    /**
     * 登录
     * @param user
     * @param password
     */
    public void login(String user,String password);

    /**
     * 杀怪
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();

    /**
     * 获得代理类
     * @return
     */
    public IGamePlayerForce getProxy();

}
