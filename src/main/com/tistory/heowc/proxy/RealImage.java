package com.tistory.heowc.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadingImage();
    }

    private void loadingImage() {
        System.out.println("[" + fileName + "] Loading ...");
    }

    public void displayImage() {
        System.out.println("[" + fileName + "] Display !!!");
    }
}
