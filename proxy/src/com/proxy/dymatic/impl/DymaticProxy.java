package com.proxy.dymatic.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Shape on 2017/8/31.
 * 动态代理类
 */
public class DymaticProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler)
    {
        //找相应的JoinPoint切入点
        if(true)
        {
            (new BeforeAdvice()).exec();
        }
        //执行目标
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
