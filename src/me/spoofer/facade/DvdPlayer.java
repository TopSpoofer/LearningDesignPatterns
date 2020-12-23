package me.spoofer.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD 开机了");
    }

    public void play(String movie) {
        System.out.println("DVD 开始播放电影: " + movie);
    }

    public void off() {
        System.out.println("DVD 关机了");
    }
}
