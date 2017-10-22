package com.mediator.custom;

import com.mediator.abs.AbstractColleadge;
import com.mediator.abs.AbstractMediator;

/**
 *  库存
 * Created by Shape on 2017/10/22.
 */
public class Stock extends AbstractColleadge{
    // 库存
    private static int COMPUTERSTOCK = 100 ;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increaseStock(int number) {
        COMPUTERSTOCK += number;
    }

    public void decreaseStock(int number) {
        COMPUTERSTOCK -= number;
    }

    public int getComputerStock() {
        return COMPUTERSTOCK;
    }

    public void clearStock() {
        System.out.println("清仓处理");
    }
}
