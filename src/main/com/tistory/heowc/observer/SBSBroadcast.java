package com.tistory.heowc.observer;


import java.util.ArrayList;
import java.util.List;

public class SBSBroadcast implements Broadcast {

    private List<Viewer> viewerList;

    public SBSBroadcast() {
        viewerList = new ArrayList<>();
    }

    @Override
    public void addViewer(Viewer viewer) {
        viewerList.add(viewer);
    }

    @Override
    public void removeViewer(Viewer viewer) {
        viewerList.remove(viewer);
    }

    @Override
    public void send(final String message) {
        viewerList.forEach(viewer -> viewer.watch(message));
    }
}
