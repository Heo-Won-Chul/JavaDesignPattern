package com.tistory.heowc.adapter.commission;

import com.tistory.heowc.adapter.BannerAdapter;
import com.tistory.heowc.adapter.SimpleBanner;

public class Logger2Banner implements BannerAdapter {

    private SimpleBanner simpleBanner;

    public Logger2Banner(String content) {
        simpleBanner = new SimpleBanner(content);
    }

    @Override
    public void printInfo() {
        simpleBanner.showWithStar();
    }

    @Override
    public void printDebug() {
        simpleBanner.showWithSquare();
    }
}
