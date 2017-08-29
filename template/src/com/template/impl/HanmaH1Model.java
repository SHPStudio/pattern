package com.template.impl;

import com.template.abs.HanmaModel;

/**
 * Created by Shape on 2017/8/29.
 * 悍马H1
 */
public class HanmaH1Model extends HanmaModel {
    private boolean alarmFlag = true; //默认是要响喇叭
    @Override
    protected void start() {
        System.out.println("悍马H1正在启动。。。");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1正在停止。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1正在鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1发动机正在响。。。");
    }
    /**
     * H1部可以让用户决定是否可以鸣笛
     */
    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }
    public void setAlarmFlag(boolean flag)
    {
        this.alarmFlag = flag;
    }
}
