package com.shp.adapter.entity;

import com.shp.adapter.inter.AdvancePlayer;
import com.shp.adapter.inter.MediaPlayer;

/**
 * Created by Shape on 2017/7/12.
 * 高级播放器接口适配器类
 */
public class MediaAdapter implements MediaPlayer {
    //高级适配器接口
    AdvancePlayer advancePlayer;
    public MediaAdapter(String audioType)
    {
        //根据类型初始化相应的播放器接口
        if(audioType.equalsIgnoreCase("mp4"))
        {
            advancePlayer=new Mp4Player();
        }else if(audioType.equalsIgnoreCase("vlc"))
        {
            advancePlayer=new VlcPlayer();
        }
    }

    /**
     * 根据类型播放文件
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
         if(audioType.equalsIgnoreCase("mp4"))
         {
             this.advancePlayer.playMp4(fileName);
         }else if(audioType.equalsIgnoreCase("vlc"))
         {
             this.advancePlayer.playVlc(fileName);
         }
    }
}
