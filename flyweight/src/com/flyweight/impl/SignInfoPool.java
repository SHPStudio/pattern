package com.flyweight.impl;

/**
 * Created by Shape on 2017/8/5.
 * 考试信息池对象
 */
public class SignInfoPool extends SignInfo{
    //添加一个key值默认为考场地点+考试科目
    private String key;
    public SignInfoPool(String key)
    {
        this.key=key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString() +
                "key='" + key + '\'' +
                '}';
    }
}
