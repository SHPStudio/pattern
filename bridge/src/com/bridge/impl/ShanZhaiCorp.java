package com.bridge.impl;

import com.bridge.inter.Corp;
import com.bridge.inter.Product;

/**
 * Created by Shape on 2017/8/7.
 */
public class ShanZhaiCorp extends Corp{
    public ShanZhaiCorp(Product product) {
        super(product);
    }
    public void makeMoney()
    {
        super.makeMoney();
        System.out.println("我赚钱了");
    }
}
