package com.tistory.heowc.dependencyinjection.repository;

import com.tistory.heowc.dependencyinjection.User;

public class UserARepository implements UserRepository {

    @Override
    public User findById(int id) {
        if (id == 1) {
            return new User(id, "won chul");
        }

        return null;
    }

    @Override
    public User save(User user) {
        System.out.println(String.format("Create User [id = %d, name = %s]", user.getId(), user.getName()));
        return user;
    }
}
