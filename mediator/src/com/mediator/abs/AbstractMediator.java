package com.mediator.abs;

import com.mediator.custom.Purchase;
import com.mediator.custom.Sale;
import com.mediator.custom.Stock;

/**
 *  中介者基类
 * Created by Shape on 2017/10/22.
 */
public abstract class AbstractMediator {
    protected Purchase _purchase;
    protected Sale _sale;
    protected Stock _stock;

    public AbstractMediator(){
        _purchase = new Purchase(this);
        _sale = new Sale(this);
        _stock = new Stock(this);
    }

    public abstract void execute(String action,Object... args);

}
