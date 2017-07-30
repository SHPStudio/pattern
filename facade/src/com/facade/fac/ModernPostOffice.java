package com.facade.fac;

import com.facade.impl.LetterProcess;
import com.facade.impl.PoliceImpl;
import com.facade.inter.ILetterProcess;
import com.facade.inter.Police;

/**
 * Created by Shape on 2017/7/30.
 * 现代邮局 外观门面角色 向外部提供接口
 */
public class ModernPostOffice {
    //委托信处理
    private ILetterProcess letterProcess=new LetterProcess();
    //警局检查信件
    private Police police=new PoliceImpl();
    //暴露发送信件接口
    public void sendLetter(String address,String context)
    {
        letterProcess.writeLetter(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        police.checkLetter(letterProcess);
        letterProcess.sendLetter();
    }
}
