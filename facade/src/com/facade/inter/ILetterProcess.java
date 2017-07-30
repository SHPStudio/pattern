package com.facade.inter;

/**
 * Created by Shape on 2017/7/30.
 * 信件处理接口
 */
public interface ILetterProcess {
    //写信
    void writeLetter(String context);
    //填写信封
    void fillEnvelope(String address);
    //把信装到信封里
    void letterIntoEnvelope();
    //发送信件
    void sendLetter();
}
