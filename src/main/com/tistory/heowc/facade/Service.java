package com.tistory.heowc.facade;

public class Service {

    public void onCreate() {
        System.out.println("Service : [onCreate]");
    }

    public void onBind() {
        System.out.println("Service : [onBind]");
    }

    public void onDestroy() {
        System.out.println("Service : [onDestroy]");
    }
}
