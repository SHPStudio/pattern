package com.shp.adapter.demo;

import com.shp.adapter.entity.AudioPlayer;

/**
 * Created by Shape on 2017/7/12.
 */
public class AdapterDemo {
    public static void main(String[] args){
        AudioPlayer player=new AudioPlayer();
        player.play("mp3","backstreetboys.mp3");
        player.play("mp4","mymp4.mp4");
        player.play("vlc","myvlc.vlc");
        player.play("avi","xxx.avi");
    }
}
