package com.inguemark.myprojectconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.inguemark.myproject")
public class MyProjectConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyProjectConfiguration.class, args);
    }

}