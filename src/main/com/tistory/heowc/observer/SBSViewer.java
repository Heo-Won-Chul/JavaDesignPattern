package com.tistory.heowc.observer;

public class SBSViewer implements Viewer {

    private final String name;

    public SBSViewer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj instanceof SBSViewer && name.equals(((SBSViewer) obj).name);
    }

    @Override
    public void watch(String message) {
        System.out.println("[" + name + "] : " + message);
    }
}
