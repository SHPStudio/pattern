package com.flyweight.demo;

import com.flyweight.impl.SignInfo;
import com.flyweight.impl.SignInfoFactory;

/**
 * Created by Shape on 2017/8/5.
 * 场景类
 */
public class Demo {
    public static void main(String[] args){
        for(int i=1;i<5;i++)
        {
            String subject="科目"+i;
            for(int j=1;j<5;j++)
            {
                String key=subject+"考场"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo info=SignInfoFactory.getSignInfo("科目1考场1");
        System.out.println(info);
    }
}
