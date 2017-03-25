package com.tistory.heowc.visit;

import com.tistory.heowc.composite.Node;

public class FilePart implements Node, NodePart {

    private String name;

    public FilePart(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
