package com.facade.impl;

import com.facade.inter.ILetterProcess;

/**
 * Created by Shape on 2017/7/30.
 * 信件实例
 */
public class LetterProcess implements ILetterProcess {
    @Override
    public void writeLetter(String context) {
        System.out.println("写信。。"+context);
    }

    @Override
    public void fillEnvelope(String address) {
         System.out.println("填写信封信息 收信人和地址"+address);
    }

    @Override
    public void letterIntoEnvelope() {
          System.out.println("把信装到信封里");
    }

    @Override
    public void sendLetter() {
         System.out.println("邮递信封");
    }
}
