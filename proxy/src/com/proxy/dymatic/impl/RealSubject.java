package com.proxy.dymatic.impl;

import com.proxy.dymatic.inter.Subject;

/**
 * Created by Shape on 2017/8/31.
 * 真实类
 */
public class RealSubject implements Subject{
    @Override
    public void doSomeThing() {
        System.out.println("do what i want to do");
    }
}
