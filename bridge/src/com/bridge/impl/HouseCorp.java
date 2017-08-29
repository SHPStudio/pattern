package com.bridge.impl;

import com.bridge.inter.Corp;
import com.bridge.inter.Product;

/**
 * Created by Shape on 2017/8/7.
 * 房子公司
 */
public class HouseCorp extends Corp{
    public HouseCorp(House house) {
        super(house);
    }
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房子大卖了 赚钱了");
    }
}
