package com.yuan.peini.Utils;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;

import javax.annotation.Resource;

public class UserRedisCache implements UserCache {
    private static final String KEY = "User";

    @Resource(name = "RedisTemplate")
    private RedisTemplate<String,UserDetails> redisTemplate;

    @Override
    public UserDetails getUserFromCache(String username) {
        return null;
    }

    @Override
    public void putUserInCache(UserDetails user) {
    }

    @Override
    public void removeUserFromCache(String username) {

    }
}
