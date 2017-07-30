package com.observe.inter;

/**
 * Created by Shape on 2017/7/30.
 * 观察者接口
 */
public interface Observer {
    /**
     * 相应接口
     * @param context
     */
    void update(String context);
}
