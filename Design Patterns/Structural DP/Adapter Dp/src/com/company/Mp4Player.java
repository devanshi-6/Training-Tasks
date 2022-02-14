package com.company;

public class Mp4Player implements AdvMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Wrong player");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
