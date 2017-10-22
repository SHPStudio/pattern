package com.mediator.abs;

/**
 *  同事类基类
 * Created by Shape on 2017/10/22.
 */
public class AbstractColleadge {
    // 同事类持有中介类实例
    protected AbstractMediator _mediator;
    public AbstractColleadge(AbstractMediator mediator) {
        _mediator = mediator;
    }
}
