package com.tistory.heowc.adapter;

public class SimpleBanner {

    private String content;

    public SimpleBanner(String content) {
        this.content = content;
    }

    public void showWithSquare() {
        System.out.println("■" + content + "■");
    }

    public void showWithStar() {
        System.out.println("★" + content + "★");
    }
}
