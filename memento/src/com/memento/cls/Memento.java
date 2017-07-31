package com.memento.cls;

import java.util.HashMap;
import java.util.Observer;

/**
 * Created by Shape on 2017/7/31.
 * 备忘录对象
 */
public class Memento {
    //存储状态信息
    private HashMap<String,Object> stateMap;
    //可以通过构造函数
    public Memento(HashMap<String,Object> stateMap)
    {
        this.stateMap=stateMap;
    }
    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
