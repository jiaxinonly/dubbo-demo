package com.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.TraceService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class TraceServiceImpl implements TraceService {

    @Value("${dubbo.application.name}")
    private String appName;
    @Override
    public String getTrace(String name) {
       return name + " ---> " + appName;
    }
}
