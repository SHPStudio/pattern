package com.shp.adapter.entity;

import com.shp.adapter.inter.MediaPlayer;

/**
 * Created by Shape on 2017/7/12.
 * 经过适配的音频播放器
 */
public class AudioPlayer implements MediaPlayer{
    //适配类
    MediaAdapter adapter;
    @Override
    public void play(String audioType, String fileName) {
          if(audioType.equalsIgnoreCase("mp3"))
          {
              System.out.println("Mp3 is playing file name "+fileName);
          }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc"))
          {
              adapter=new MediaAdapter(audioType);
              adapter.play(audioType,fileName);
          }else
          {
              System.out.println("sorry the wrong file is to play");
          }
    }
}
