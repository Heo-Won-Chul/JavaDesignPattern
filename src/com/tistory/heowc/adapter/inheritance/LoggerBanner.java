package com.tistory.heowc.adapter.inheritance;

import com.tistory.heowc.adapter.BannerAdapter;
import com.tistory.heowc.adapter.SimpleBanner;

public class LoggerBanner extends SimpleBanner implements BannerAdapter {

    public LoggerBanner(String content) {
        super(content);
    }

    @Override
    public void printInfo() {
        showWithStar();
    }

    @Override
    public void printDebug() {
        showWithSquare();
    }
}
