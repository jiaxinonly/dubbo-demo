package com.demo.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicsApplication {
    @Value("${dubbo.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return name + " is ok!";
    }

}