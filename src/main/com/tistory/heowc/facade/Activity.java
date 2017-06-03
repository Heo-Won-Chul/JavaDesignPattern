package com.tistory.heowc.facade;

public class Activity {

    public void onCreate(){
        System.out.println("Activity : [onCreate]");
    }

    public void onStart(){
        System.out.println("Activity : [onStart]");
    }

    public void onStop(){
        System.out.println("Activity : [onStop]");
    }

    public void onDestroy(){
        System.out.println("Activity : [onDestroy]");
    }
}
