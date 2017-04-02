package com.tistory.heowc.facade;

public class Application {

    private Activity activity;
    private Service service;

    public Application(Activity activity, Service service) {
        this.activity = activity;
        this.service = service;
    }

    public void start() {
        activity.onCreate();

        service.onCreate();

        activity.onStart();

        service.onBind();

        activity.onStop();

        service.onDestroy();

        activity.onDestroy();
    }
}
