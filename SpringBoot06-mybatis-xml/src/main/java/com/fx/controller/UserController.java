package com.fx.controller;

import com.fx.domain.User;
import com.fx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/8 19:05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void add(){
        userService.save(new User("ltt"));
    }
    @RequestMapping("/list")
    public List<User> list(){
       return  userService.loadAll();
    }
}
