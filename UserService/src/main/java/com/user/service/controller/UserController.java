package com.user.service.controller;

import com.user.service.entity.User;

import java.util.List;

public interface UserController {
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(int id);
}
