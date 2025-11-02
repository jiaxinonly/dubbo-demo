package com.demo.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProviderApplication {
    @Value("${dubbo.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return name + " is ok!";
    }

}