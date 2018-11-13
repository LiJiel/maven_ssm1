package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request){
        List<User> users = userService.queryAll();
        request.setAttribute("user",users);
        System.out.println(users);
        return "index";

    }
}
