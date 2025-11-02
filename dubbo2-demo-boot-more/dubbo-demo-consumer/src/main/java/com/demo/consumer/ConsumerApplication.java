package com.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.TraceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsumerApplication {
    @Value("${dubbo.application.name}")
    private String appName;

    @Reference
    private TraceService traceService;
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    @RequestMapping("/")
    public String index(){
        return traceService.getTrace(appName);
    }

}