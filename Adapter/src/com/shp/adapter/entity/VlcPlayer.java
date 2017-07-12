package com.shp.adapter.entity;

import com.shp.adapter.inter.AdvancePlayer;

/**
 * Created by Shape on 2017/7/12.
 * 播放Vlc播放器
 */
public class VlcPlayer implements AdvancePlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer is playing file name "+fileName);
    }
    @Override
    public void playMp4(String fileName) {

    }
}
