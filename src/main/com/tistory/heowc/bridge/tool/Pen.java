package com.tistory.heowc.bridge.tool;

import com.tistory.heowc.bridge.color.Color;

public class Pen extends Tool {

    public Pen(Color color) {
        super(color);
    }

    @Override
    public String write() {
        return color.apply() + " 볼펜";
    }
}
