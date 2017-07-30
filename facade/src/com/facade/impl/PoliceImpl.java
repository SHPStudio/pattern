package com.facade.impl;

import com.facade.inter.ILetterProcess;
import com.facade.inter.Police;

/**
 * Created by Shape on 2017/7/30.
 * 警局实例
 */
public class PoliceImpl implements Police {
    @Override
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess+"已查验，没毛病！");
    }
}
