package com.template.impl;

import com.template.abs.HanmaModel;

/**
 * Created by Shape on 2017/8/29.
 * 悍马H2
 */
public class HanmaH2Model extends HanmaModel {
    @Override
    protected void start() {
        System.out.println("悍马h2启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马h2停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马h2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马h2引擎发动作响");
    }
    /**
     * h2不能鸣笛
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
