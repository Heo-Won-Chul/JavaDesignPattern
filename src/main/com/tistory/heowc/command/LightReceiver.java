package com.tistory.heowc.command;

public class LightReceiver {
    private String name;

    public LightReceiver(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " light is on");
    }

    public void turnOff() {
        System.out.println(name + " light is off");
    }
}
