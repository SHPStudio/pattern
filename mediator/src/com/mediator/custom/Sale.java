package com.mediator.custom;

import com.mediator.abs.AbstractColleadge;
import com.mediator.abs.AbstractMediator;

import java.util.Random;

/**
 *  销售
 * Created by Shape on 2017/10/22.
 */
public class Sale extends AbstractColleadge{
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void saleComputer(int number) {
        super._mediator.execute("sale.sale",number);
    }

    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int status = random.nextInt(100);
        System.out.println("销售目前状况: "+ status);
        return status;
    }

    public void offSale(){
        System.out.println("开始甩卖");
    }
}
