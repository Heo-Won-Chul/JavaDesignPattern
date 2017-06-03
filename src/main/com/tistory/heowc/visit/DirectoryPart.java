package com.tistory.heowc.visit;

import com.tistory.heowc.composite.Node;

import java.util.ArrayList;
import java.util.List;

public class DirectoryPart implements Node, NodePart {

    private String name;
    private List<NodePart> nodePartList = new ArrayList<>();

    public DirectoryPart(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(NodePart nodePart) {
        nodePartList.add(nodePart);
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);

        nodePartList.forEach(nodePart -> nodePart.accept(nodeVisitor));
    }
}
