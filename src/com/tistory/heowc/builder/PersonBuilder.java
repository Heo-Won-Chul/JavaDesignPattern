package com.tistory.heowc.builder;

public class PersonBuilder {

    private String rrNumber;
    private String name;
    private String job;
    private String url;

    public PersonBuilder setRrNumber(String rrNumber) {
        this.rrNumber = rrNumber;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setJob(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public Person build() {
        return new Person(rrNumber, name, job, url);
    }
}
