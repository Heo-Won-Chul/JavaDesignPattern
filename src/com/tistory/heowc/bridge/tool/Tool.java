package com.tistory.heowc.bridge.tool;

import com.tistory.heowc.bridge.color.Color;

public abstract class Tool {

    protected Color color;

    public Tool(Color color) {
        this.color = color;
    }

    public abstract String write();
}
