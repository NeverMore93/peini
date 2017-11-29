package com.yuan.peini.controller;

import com.yuan.peini.entity.User;
import com.yuan.peini.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AccountController {

    @Resource(name = "userService")
    private UserService userService;

    @PostMapping("/getAll")
    public List<User> findAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }
}
