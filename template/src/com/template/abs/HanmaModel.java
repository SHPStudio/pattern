package com.template.abs;

/**
 * Created by Shape on 2017/8/29.
 * 悍马父类
 */
public abstract class HanmaModel {
    /**
     * 能够启动
     */
    protected abstract void start();

    /**
     * 能够停止
     */
    protected abstract void stop();

    /**
     * 可以鸣笛
     */
    protected abstract void alarm();

    /**
     * 引擎可以发动
     */
    protected abstract void engineBoom();

    /**
     * 可以完美的运行
     */
    public void run()
    {
        /**
         * 1.首先启动汽车
         * 2.发动机启动哄哄的响
         * 3.然后开启鸣笛
         * 4.最后停车
         */
        this.start();
        this.engineBoom();
        if(this.isAlarm())
        {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法是否可以鸣笛
     * @return
     */
    protected boolean isAlarm(){
        return true;
    }
}
