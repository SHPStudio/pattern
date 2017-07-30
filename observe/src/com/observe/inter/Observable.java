package com.observe.inter;

/**
 * Created by Shape on 2017/7/30.
 * 被观察者接口
 */
public interface Observable {
    //添加观察者
    void addObserver(Observer observer);
    //删除观察者
    void deleteObserver(Observer observer);
    //通知观察者
    void notifyObserver(String context);
}
