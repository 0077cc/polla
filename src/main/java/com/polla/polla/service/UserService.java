package com.polla.polla.service;

import com.polla.polla.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User saveUser(User user);
}
