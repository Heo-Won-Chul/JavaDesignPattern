package com.tistory.heowc.flyweight;

import java.util.Hashtable;
import java.util.Random;

public class Process {

    private Hashtable<Integer, IThread> threadPool = new Hashtable<>();

    public void start() {
        Integer id = getRandomId();
        IThread thread = getIThreadById(id);

        if (thread == null) {
            System.out.println("IThread [" + id + "] create");
            threadPool.put(id, new IThreadImpl(id));
        }

        threadPool.get(id).start();
    }

    private Integer getRandomId() {
        return new Random().nextInt(10) + 1;
    }

    private IThread getIThreadById(Integer id) {
        return threadPool.get(id);
    }
}
