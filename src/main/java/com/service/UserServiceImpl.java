package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User queryById(String id) {
        User user = userDao.queryById(id);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> queryAll() {
        List<User> users = userDao.queryAll();
        return users;
    }
}
