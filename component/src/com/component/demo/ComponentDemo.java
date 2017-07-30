package com.component.demo;

import com.component.impl.Branch;
import com.component.impl.Leaf;
import com.component.inter.ICrop;
import javafx.scene.transform.Rotate;

import java.util.ArrayList;

/**
 * Created by Shape on 2017/7/29.
 * 接口方式场景类
 * 缺点
 * 1.使用了实现类违反了依赖倒置依赖接口的原则
 */
public class ComponentDemo {

    public static void main(String[] args){
        //创建树
        Branch ceo=compositeCorpTree();
        //获得ceo信息
        System.out.println(ceo.getInfo());
        //获得所有树信息
        System.out.println(getAllInfo(ceo,""));
    }
    //构建职位树
    public static Branch compositeCorpTree(){
        //先创建树根
        Branch root=new Branch("孙老板","总经理",100000);
        //下属经理
        Branch developDep=new Branch("张老四","研发经理",10000);
        Branch saleDep=new Branch("王老六","销售经理",20000);
        Branch financeDep=new Branch("吴老二","财务部经理",20000);
        //两个开发小组
        Branch firstDevGroup=new Branch("杨老大","第一小组开发组长",10000);
        Branch secondDevGroup=new Branch("杨老儿","第二小组开发组长",20000);
        //员工
        Leaf a=new Leaf("a","开发人员",2000);
        Leaf b=new Leaf("b","开发人员",2000);
        Leaf c=new Leaf("c","开发人员",2000);
        Leaf d=new Leaf("d","开发人员",2000);
        Leaf e=new Leaf("e","开发人员",2000);
        Leaf f=new Leaf("f","销售人员",2000);
        Leaf g=new Leaf("g","销售人员",2000);
        Leaf h=new Leaf("h","销售人员",2000);
        Leaf i=new Leaf("i","财务人员",2000);
        Leaf j=new Leaf("j","财务人员",2000);
        Leaf k=new Leaf("k","财务人员",2000);
        Leaf l=new Leaf("l","ceo秘书",2000);
        Leaf liu=new Leaf("孙老三","研发部副经理",20000);
        //开始组装
        //总经理有三个部门经理和秘书
        root.addSubordinate(developDep);
        root.addSubordinate(financeDep);
        root.addSubordinate(saleDep);
        root.addSubordinate(l);
        //研发经理下属有两个小组和一个副经理
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(liu);
        //小组人员
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        //销售人员
        saleDep.addSubordinate(f);
        saleDep.addSubordinate(g);
        saleDep.addSubordinate(h);
        //财务
        financeDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        financeDep.addSubordinate(k);
        return root;
    }
    //获得所有树信息
    public static String getAllInfo(Branch root,String temp)
    {

        ArrayList<ICrop> subordinateList=root.getSubordinate();
        String info="";
        temp+="\t";
        for(ICrop iCrop : subordinateList)
        {
            if(iCrop instanceof Leaf)
            {
                //是叶子节点
                info=info+temp+iCrop.getInfo()+"\n";
            }else
            {
                //是树枝
                info=info+temp+iCrop.getInfo()+"\n"+getAllInfo((Branch)iCrop,temp);

            }
        }
        return info;
    }

}
