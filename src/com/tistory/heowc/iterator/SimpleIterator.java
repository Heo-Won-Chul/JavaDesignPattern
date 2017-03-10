package com.tistory.heowc.iterator;

import java.util.List;

public class SimpleIterator implements Iterator<String> {

    private List<String> list;
    private int position = -1;

    public SimpleIterator(List<String> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return !isLast();
    }

    public String next() {
        return list.get( ++position );
    }

    private boolean isLast() {
        return list.size() - 1 == position;
    }
}
