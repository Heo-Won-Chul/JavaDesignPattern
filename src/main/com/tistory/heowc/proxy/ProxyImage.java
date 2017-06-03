package com.tistory.heowc.proxy;

public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void displayImage() {
        if ( realImage == null ) {
            realImage = new RealImage(fileName);
        }

        realImage.displayImage();
    }
}
