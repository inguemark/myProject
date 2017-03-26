package com.inguemark.myprojectconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = )
@SpringBootApplication(scanBasePackages = "com.inguemark.myproject")
public class MyProjectConfiguration {

    public static void main(String[] args) throws Exception {
//        System.setProperty("spring.profiles.active", "LOCAL");
//        SpringApplication.run(MyProjectConfiguration.class, args);

        SpringApplication springApplication = new SpringApplication(MyProjectConfiguration.class);
//        springApplication.setAdditionalProfiles("LOCAL");
        springApplication.run(args);
    }

}