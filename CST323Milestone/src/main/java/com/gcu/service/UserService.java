package com.gcu.service;

import com.gcu.data.entity.UserEntity;
import com.gcu.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserRepository repo;

    public Iterable<UserEntity> getAll() {
        return repo.findAll();
    }

    public UserEntity createUser(UserEntity user) {

        return repo.save(user);
    }

    public static class UserController {
    }
}
