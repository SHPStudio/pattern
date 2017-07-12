package com.shp.adapter.entity;

import com.shp.adapter.inter.AdvancePlayer;

/**
 * Created by Shape on 2017/7/12.
 */
public class Mp4Player implements AdvancePlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player playing file Name is "+fileName);
    }
}
