package com.shp.prototype;

/**
 * Created by Shape on 2017/7/1.
 * 形状基类 实现可以克隆接口
 */
public abstract class Shape implements Cloneable {
    //标记形状id
    private String id;
    //标记形状类型
    protected String type;
    //绘图方法
    public abstract void draw();
    //克隆方法


    @Override
    public Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
