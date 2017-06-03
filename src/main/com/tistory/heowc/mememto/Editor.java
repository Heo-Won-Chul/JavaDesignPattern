package com.tistory.heowc.mememto;

import com.tistory.heowc.mememto.content.Content;
import com.tistory.heowc.mememto.content.TextContent;

public class Editor {

    public Content writeToTextContent(String text) {
        return new TextContent(text);
    }

    public String readToTextContent(TextContent textContent) {
        return textContent.getContent();
    }
}
