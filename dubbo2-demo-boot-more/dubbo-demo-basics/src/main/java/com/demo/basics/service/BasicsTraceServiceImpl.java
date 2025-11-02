package com.demo.basics.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.BasicsTraceService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class BasicsTraceServiceImpl implements BasicsTraceService {

    @Value("${dubbo.application.name}")
    private String appName;
    @Override
    public String getTrace(String name) {
        return name + " ---> " + appName;
    }
}
