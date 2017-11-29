package com.yuan.peini.service;

import com.yuan.peini.entity.User;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.List;

public interface UserService{
    User save(User user);
    User getUserByEmail(String email);
    User getUserByUserName(String userName);
    List<User> getAllUsers();
}
