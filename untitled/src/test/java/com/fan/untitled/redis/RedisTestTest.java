package com.fan.untitled.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fby
 * @apiNote
 * @date 2024/10/12
 */
@SpringBootTest
class RedisTestTest {

    @Autowired
    private RedisTest redisTest;
    
    @Test
    public void test1(){
        redisTest.setValue("a", "b");
        System.out.println(redisTest.getValue("a"));
    }
    
    
}