package com.demo.basics.service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.demo.api.BasicsTraceService;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class BasicsTraceServiceImpl implements BasicsTraceService {

    @Override
    public String getTrace(String name) {
        // 获取当前Web应用的ServletContext
        ServletContext sc = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // 从ServletContext中获取Spring Web应用上下文
        WebApplicationContext ctx =
                WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        // 从Spring容器中获取Dubbo应用配置Bean
        ApplicationConfig app = ctx.getBean(ApplicationConfig.class);
        // 返回调用链路信息，包含当前应用名称
        return name + " ---> " + app.getName();
    }
}
