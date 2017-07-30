package com.nativeobserve;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Shape on 2017/7/30.
 * 李斯观察者
 */
public class LiSi  implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯检测到韩非子有异动");
        this.reportTo(arg.toString());
        System.out.println("报告完毕");
    }
    public void reportTo(String context)
    {
        System.out.println("报告老板韩非子有异动"+context);
    }
}
