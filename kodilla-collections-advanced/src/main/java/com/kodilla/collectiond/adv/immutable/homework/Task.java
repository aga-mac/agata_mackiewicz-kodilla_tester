package com.kodilla.collectiond.adv.immutable.homework;

public class Task {
    private String title;
    private int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
