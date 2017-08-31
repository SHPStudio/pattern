package com.proxy.dymatic.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Shape on 2017/8/31.
 * 我的代理处理类
 */
public class MyInvocationHandler implements InvocationHandler{
    //被真实处理的对象
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
