package com.recovery.boot_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.recovery.boot_practice")

public class BootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootPracticeApplication.class, args);
    }

}
