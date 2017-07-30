package com.facade.demo;

import com.facade.fac.ModernPostOffice;

/**
 * Created by Shape on 2017/7/30.
 * 外观模式场景类
 */
public class Demo {
    public static void main(String[] args){
         //创建外观门面角色
        ModernPostOffice modernPostOffice=new ModernPostOffice();
        modernPostOffice.sendLetter("侯鑫超 大庆市","我爱你！");
    }
}
