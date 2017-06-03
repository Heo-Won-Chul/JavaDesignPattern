package com.tistory.heowc.observer;

public interface Broadcast {
    public void addViewer(Viewer viewer);
    public void removeViewer(Viewer viewer);
    public void send(final String message);
}
