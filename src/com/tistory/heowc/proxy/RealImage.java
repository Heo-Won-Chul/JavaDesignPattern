package com.tistory.heowc.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadongImage();
    }

    private void loadongImage() {
        System.out.println("[" + fileName + "] Loading ...");
    }

    public void displayImage() {
        System.out.println("[" + fileName + "] Display !!!");
    }
}
