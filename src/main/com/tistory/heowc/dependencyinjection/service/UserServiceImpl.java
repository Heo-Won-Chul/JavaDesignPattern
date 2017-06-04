package com.tistory.heowc.dependencyinjection.service;

import com.tistory.heowc.dependencyinjection.User;
import com.tistory.heowc.dependencyinjection.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insert(User user) {
        if ( userRepository.findById(user.getId()) == null ) {
            return userRepository.save(user);
        }

        throw new IllegalArgumentException("Duplicate User");
    }
}
