package com.tistory.heowc.mememto.content;

public class TextContent implements Content {

    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    @Override
    public String write() {
        return text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
