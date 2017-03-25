package com.inguemark.myproject.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
