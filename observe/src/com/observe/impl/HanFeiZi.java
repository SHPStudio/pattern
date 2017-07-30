package com.observe.impl;

import com.observe.inter.IHanFeiZi;
import com.observe.inter.Observable;
import com.observe.inter.Observer;

import java.util.ArrayList;

/**
 * Created by Shape on 2017/7/30.
 * 韩非子实例
 */
public class HanFeiZi implements Observable,IHanFeiZi {
    //所有的观察者列表
    private ArrayList<Observer> observerList=new ArrayList<Observer>();
    //添加观察者
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }
    //删除观察者
    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }
    //通知所有的观察者
    @Override
    public void notifyObserver(String context) {
        for(Observer observer:observerList)
        {
            observer.update(context);
        }
    }

    @Override
    public void havaBreakfast() {
        System.out.println("韩非子正在吃早饭");
        this.notifyObserver("韩非子吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子正在玩乐");
        this.notifyObserver("韩非子玩呢");
    }
}
