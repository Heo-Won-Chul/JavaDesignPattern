package com.tistory.heowc.prototype;

public class Cookie implements Cloneable {

    public Cookie make() {
        return (Cookie) clone();
    }

    @Override
    protected Object clone() {
        try {
            return (Cookie)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
