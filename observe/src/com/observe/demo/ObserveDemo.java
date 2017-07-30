package com.observe.demo;

import com.observe.impl.HanFeiZi;
import com.observe.impl.LiSi;
import com.observe.impl.LiuSi;
import com.observe.impl.WangSi;

/**
 * Created by Shape on 2017/7/30.
 * 观察者场景类
 */
public class ObserveDemo {
    public static void main(String[] args){
        //先创建被观察者
        HanFeiZi hanFeiZi=new HanFeiZi();
        //创建观察者
        LiSi liSi=new LiSi();
        WangSi wangSi=new WangSi();
        LiuSi liuSi=new LiuSi();
        //设置观察者与被观察者关系
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liSi);
        //被观察者动作
        hanFeiZi.havaBreakfast();
        hanFeiZi.haveFun();
    }
}
