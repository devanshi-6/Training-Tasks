package com.company;

public class VlcPlayer implements AdvMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Wrong player");
    }
}
