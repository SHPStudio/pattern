package com.nativeobserve;



/**
 * Created by Shape on 2017/7/30.
 * Java原生观察者模式
 */
public class Demo {
    public static void main(String[] args){
        HanFeiZi hanFeiZi=new HanFeiZi();
        LiSi liSi=new LiSi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.havaBreakfast();
        hanFeiZi.haveFun();
    }
}
