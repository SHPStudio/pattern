package com.bridge.inter;

/**
 * Created by Shape on 2017/8/7.
 * 公司父类
 */
public abstract class Corp {
    //依赖的产品类
    private Product product;
    public Corp(Product product){
        this.product=product;
    }
    //公司赚钱
    public void makeMoney(){
        //生产产品
        this.product.beProducted();
        //销售产品
        this.product.beSelled();
    }


}
