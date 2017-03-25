package com.inguemark.myprojectconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.inguemark.myproject")
public class MyProjectConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyProjectConfiguration.class, args);
    }

}