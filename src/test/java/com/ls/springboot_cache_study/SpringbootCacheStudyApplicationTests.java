package com.ls.springboot_cache_study;

import com.ls.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootCacheStudyApplicationTests {


    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testRedis(){
//        stringRedisTemplate.opsForValue().append("ls","hello");
//        String ls = stringRedisTemplate.opsForValue().get("ls");
//        System.out.println(ls);
    }
}
