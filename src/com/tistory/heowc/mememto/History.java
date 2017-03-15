package com.tistory.heowc.mememto;

import com.tistory.heowc.mememto.content.Content;

import java.util.Stack;

public class History {

    private Stack<Content> contentStack;

    public History() {
        contentStack = new Stack<>();
    }

    public void apply(Content content) {
        System.out.println("[insert] " + content.write());
        contentStack.push(content);
    }

    public void undo() {
        if( contentStack.empty() ) {
            System.out.println("[delete] empty content");
            return;
        }
        Content content = contentStack.pop();
        System.out.println("[delete] " + content.write());
    }
}
