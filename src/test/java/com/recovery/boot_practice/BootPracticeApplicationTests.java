package com.recovery.boot_practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.*;

@SpringBootTest
class BootPracticeApplicationTests {


    @Test
    void contextLoads() {
        System.out.println("test");
    }


}
