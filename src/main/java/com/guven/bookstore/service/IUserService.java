package com.guven.bookstore.service;

import com.guven.bookstore.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
