package com.proxy.dymatic.impl;

import com.proxy.dymatic.inter.IAdvice;

/**
 * Created by Shape on 2017/8/31.
 * 前置通知
 */
public class BeforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("我是前置通知");
    }
}
