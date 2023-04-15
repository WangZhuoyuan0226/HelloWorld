package com.recovery.boot_practice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootRedis {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redisSet")
    public void redisSet(){
        System.out.println("Redis Set");
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("boot1", "localhost1");
    }

    @RequestMapping("/redisGet")
    public String redisGet(){
        System.out.println("Redis Get");
        ValueOperations ops = redisTemplate.opsForValue();
        Object obj = ops.get("boot");
        System.out.println(obj);
        return obj.toString();
    }
}
