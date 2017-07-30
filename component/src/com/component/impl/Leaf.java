package com.component.impl;

import com.component.inter.ILeaf;

/**
 * Created by Shape on 2017/7/29.
 * 树叶实现类
 */
public class Leaf implements ILeaf{
    //姓名
    private String name="";
    //职位
    private String position="";
    //薪水
    private int salary=0;
    public Leaf(String name,String position,int salary)
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
}
