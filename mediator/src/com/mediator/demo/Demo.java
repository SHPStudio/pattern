package com.mediator.demo;

import com.mediator.abs.AbstractMediator;
import com.mediator.custom.Mediator;
import com.mediator.custom.Purchase;
import com.mediator.custom.Sale;
import com.mediator.custom.Stock;

/**
 * Created by Shape on 2017/10/22.
 */
public class Demo {
    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);
        Sale sale = new Sale(mediator);
        sale.saleComputer(299);
        Stock stock = new Stock(mediator);
        System.out.println("当前库存" + stock.getComputerStock());
    }
}
