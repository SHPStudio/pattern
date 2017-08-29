package com.bridge.demo;

import com.bridge.impl.*;

/**
 * Created by Shape on 2017/8/7.
 */
public class Demo {
    public static void main(String[] args){
        System.out.println("----------房地产----------");
        HouseCorp houseCorp=new HouseCorp(new House());
        houseCorp.makeMoney();
        System.out.println("-------Ipod厂子--------");
        ShanZhaiCorp shanZhaiCorp=new ShanZhaiCorp(new Ipod());
        shanZhaiCorp.makeMoney();
        System.out.println("-------老板痛心疾首改邪归正---------");
        ShanZhaiCorp corp=new ShanZhaiCorp(new Cloth());
        corp.makeMoney();
    }
}
