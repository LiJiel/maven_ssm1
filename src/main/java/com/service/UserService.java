package com.service;

import com.entity.User;

import java.util.List;


public interface UserService {
    void save(User user);
    void delete(String id);
    void update(User user);
    User queryById(String id);
    List<User> queryAll();
}
