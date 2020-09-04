package com.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ls.mapper")
@EnableCaching
public class SpringbootCacheStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCacheStudyApplication.class, args);
    }

}
