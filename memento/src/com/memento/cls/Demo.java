package com.memento.cls;

/**
 * Created by Shape on 2017/7/31.
 * 场景类
 */
public class Demo {
    public static void main(String[] args){
        //定义发起人
        Originator originator=new Originator();
        originator.setState1("中国");
        originator.setState2("繁荣");
        originator.setState3("富强");
        System.out.println("初始化状态"+originator.toString());
        //创建一个备忘录
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(originator.createMemento());
        //修改状态
        originator.setState1("软件");
        originator.setState2("架构");
        originator.setState3("优秀");
        System.out.println("修改后"+originator.toString());
        //恢复
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态"+originator.toString());
    }
}
