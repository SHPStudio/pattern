package com.mediator.custom;

import com.mediator.abs.AbstractColleadge;
import com.mediator.abs.AbstractMediator;

/**
 *  采购
 * Created by Shape on 2017/10/22.
 */
public class Purchase extends AbstractColleadge{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        super._mediator.execute("purchase.buy",number);
    }

    public void refusedBuyComputer() {
        System.out.println("销售能力不好不采购");
    }
}
