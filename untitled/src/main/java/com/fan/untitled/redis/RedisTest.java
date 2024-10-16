package com.fan.untitled.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author fby
 * @apiNote
 * @date 2024/10/12
 */
@Component
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }
    
}
