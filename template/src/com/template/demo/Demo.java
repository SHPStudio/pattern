package com.template.demo;

import com.template.abs.HanmaModel;
import com.template.impl.HanmaH1Model;
import com.template.impl.HanmaH2Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shape on 2017/8/29.
 * 场景类
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        HanmaH1Model hanmah1 = new HanmaH1Model();
        System.out.println("悍马H1发动");
        System.out.println("悍马H1是否能够鸣笛：0可以，1不可以");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        if(type.equalsIgnoreCase("0"))
        {
            hanmah1.setAlarmFlag(true);
        }else {
            hanmah1.setAlarmFlag(false);
        }
        hanmah1.run();
        HanmaH2Model hanmah2 = new HanmaH2Model();
        System.out.println("悍马H2发动");
        hanmah2.run();
    }
}
