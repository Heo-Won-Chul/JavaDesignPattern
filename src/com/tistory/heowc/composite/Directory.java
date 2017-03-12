package com.tistory.heowc.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Node {

    private String name;
    private List<Node> nodeList;

    public Directory(String name) {
        this.name = name;
        nodeList = new ArrayList<Node>();
    }

    public String getName() {
        return name;
    }

    public void add(Node node) {
        nodeList.add(node);
    }

    @Override
    public String toString() {
        return String.format("Directory Name : %s, Files Name : %s", name, nodeList.toString());
    }
}
