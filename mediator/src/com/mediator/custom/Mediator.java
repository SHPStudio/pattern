package com.mediator.custom;

import com.mediator.abs.AbstractMediator;

/**
 * Created by Shape on 2017/10/22.
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String action, Object... args) {
        switch (action) {
            case "purchase.buy" : buyComputer((Integer)args[0]);break;
            case "sale.sale" : saleComputer((Integer)args[0]);break;
        }
    }
    /**
     *  采购电脑
     * @param number
     */
    public void buyComputer(int number) {
        // 如果销售情况不好就不采购了
        if (super._sale.getSaleStatus() < 80) {
            super._purchase.refusedBuyComputer();
            return;
        }
        super._stock.increaseStock(number);
    }

    /**
     *  大客户紧急采购
     * @param number
     */
    public void emergensyBuyComputer(int number) {
        System.out.println("遇到大客户 紧急采购" + number + "台");
        super._stock.increaseStock(number);
    }

    /**
     *  销售电脑
     * @param number
     */
    public void saleComputer(int number) {
        // 如果库存不够那么就去采购
        if(super._stock.getComputerStock() < number) {
            emergensyBuyComputer(number);
        }
        super._stock.decreaseStock(number);
    }
}
