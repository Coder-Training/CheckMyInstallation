package com.coder.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample rest controller just to check if everything is working fine.
 */
@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String sayHello() {
        return "<h1>Congratulations! Your first Spring Boot app is running perfectly!</h1>";
    }
}
