package com.memento.cls;

/**
 * Created by Shape on 2017/7/31.
 * 备忘录管理着
 */
public class Caretaker {
    //备忘录
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
