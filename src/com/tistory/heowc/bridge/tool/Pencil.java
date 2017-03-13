package com.tistory.heowc.bridge.tool;

import com.tistory.heowc.bridge.color.Color;

public class Pencil extends Tool {

    public Pencil(Color color) {
        super(color);
    }

    @Override
    public String write() {
        return color.apply() + " 연필";
    }
}
