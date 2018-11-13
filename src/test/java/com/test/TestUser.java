package com.test;

import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestUser extends BasicTest{
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        List<User> users = userService.queryAll();
        for (User user:users) {
            System.out.println(user);
        }
    }

}
