package com.proxy.dymatic.demo;

import com.proxy.dymatic.impl.DymaticProxy;
import com.proxy.dymatic.impl.MyInvocationHandler;
import com.proxy.dymatic.impl.RealSubject;
import com.proxy.dymatic.inter.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Shape on 2017/8/31.
 * 动态代理场景类
 */
public class Demo {
    public static void main(String[] args){
        //定义一个要被代理的对象
        Subject subject=new RealSubject();
        //自定义一个handle
        InvocationHandler invocationHandler=new MyInvocationHandler(subject);
        //返回代理主题
        Subject proxy= DymaticProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
        proxy.doSomeThing();
    }
}
