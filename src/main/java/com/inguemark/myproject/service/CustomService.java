package com.inguemark.myproject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

    @Value("${myproject.message.messageBienvenue}")
    private String messageBienvenue;

    @Value("${myproject.uuid}")
    private String uuid;

    public String afficherMessageBienvenue() {
        return messageBienvenue;
    }

    public String afficherUuid() {
        return uuid;
    }

}
