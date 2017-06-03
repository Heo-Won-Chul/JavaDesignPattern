package com.tistory.heowc.dependencyinjection.repository;

import com.tistory.heowc.dependencyinjection.User;

public interface UserRepository {

    public User findById(int id);
    public User save(User user);
}
