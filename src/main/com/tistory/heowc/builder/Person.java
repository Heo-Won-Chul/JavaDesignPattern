package com.tistory.heowc.builder;

public class Person {

    private String rrNumber;
    private String name;
    private String job;
    private String url;

    public Person(String rrNumber, String name, String job, String url) {
        this.rrNumber = rrNumber;
        this.name = name;
        this.job = job;
        this.url = url;
    }

    public String getRrNumber() {
        return rrNumber;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Person{" +
                "rrNumber='" + rrNumber + '\'' +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
