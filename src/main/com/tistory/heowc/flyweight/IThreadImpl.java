package com.tistory.heowc.flyweight;

public class IThreadImpl implements IThread {

    private Integer id;

    public IThreadImpl(Integer id) {
        this.id = id;
    }

    private void run() {
        System.out.println("IThread [" + id + "] start");
    }

    @Override
    public void start() {
        run();
    }
}
