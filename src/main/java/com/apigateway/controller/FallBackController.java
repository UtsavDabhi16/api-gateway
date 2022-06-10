package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userservicefallback")
    public String userServiceFallBack(){
        return "User Service is currently Down !!!";
    }

    @GetMapping("/contactservicefallback")
    public String contactServiceFallBack(){
        return "Contact Service is currently Down !!!";
    }

}
