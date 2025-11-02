package com.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.BasicsTraceService;
import com.demo.api.TraceService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class TraceServiceImpl implements TraceService {

    @Value("${dubbo.application.name}")
    private String appName;

    @Reference
    private BasicsTraceService basicsTraceService;
    @Override
    public String getTrace(String name) {
        return basicsTraceService.getTrace(name + " ---> " + appName);
    }
}
