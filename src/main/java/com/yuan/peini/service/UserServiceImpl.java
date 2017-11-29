package com.yuan.peini.service;

import com.yuan.peini.dao.UserDao;
import com.yuan.peini.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource(name = "userDao")
    private UserDao userDao;


    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
