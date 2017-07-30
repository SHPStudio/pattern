package com.nativeobserve;

import com.observe.inter.IHanFeiZi;

import java.util.Observable;

/**
 * Created by Shape on 2017/7/30.
 * 利用Java自带的实现类构造被观察者
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void havaBreakfast() {
        System.out.println("韩非子：开始吃早饭");
        super.setChanged();
        super.notifyObservers("韩非子吃早饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了");
        super.setChanged();
        super.notifyObservers("韩非子开始娱乐了");
    }
}
