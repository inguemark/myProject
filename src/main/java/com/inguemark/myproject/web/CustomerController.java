package com.inguemark.myproject.web;

import com.inguemark.myproject.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomService customService;

    @RequestMapping("/")
    String home() {
        return customService.afficherMessageBienvenue();
    }

    @RequestMapping("/uuid")
    String uuid() {
        return customService.afficherUuid();
    }

}
