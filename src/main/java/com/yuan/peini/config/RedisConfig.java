package com.yuan.peini.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@Slf4j(topic = "RedisConfig")
public class RedisConfig {

    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setUsePool(true);
        return jedisConnectionFactory;
    }

    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        if (null == jedisConnectionFactory()) {
            log.error("Redis template service is not available");
            return null;
        };
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }


    @Bean(name = "cacheManager")
    public CacheManager cacheManager() {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate());
        cacheManager.setTransactionAware(true);
        cacheManager.setLoadRemoteCachesOnStartup(true);
        cacheManager.setUsePrefix(true);
        return cacheManager;
    }
}
