package com.component.impl;

import com.component.inter.IBranch;
import com.component.inter.ICrop;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Shape on 2017/7/29.
 * 树枝实现类
 */
public class Branch implements IBranch{
    //姓名
    private String name="";
    //职位
    private String position="";
    //薪水
    private int salary=0;
    private ArrayList<ICrop> subordinate=new ArrayList<ICrop>();
    public Branch(String name,String position,int salary)
    {
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    @Override
    public String getInfo() {
        String info="";
        info="姓名: "+this.name;
        info+="\t职位: "+this.position;
        info+="\t薪水: "+this.salary;
        return info;
    }

    @Override
    public void addSubordinate(ICrop iCrop) {
        this.subordinate.add(iCrop);
    }

    @Override
    public ArrayList<ICrop> getSubordinate() {
        return this.subordinate;
    }
}
