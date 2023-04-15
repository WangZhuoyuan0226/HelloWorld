package com.recovery.boot_practice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/hi")
    public int helloWorld(){
        System.out.println("111");
        return 255;
    }
}
