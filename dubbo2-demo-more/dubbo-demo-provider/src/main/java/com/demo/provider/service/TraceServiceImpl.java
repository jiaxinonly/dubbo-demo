package com.demo.provider.service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.demo.api.BasicsTraceService;
import com.demo.api.TraceService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import org.springframework.web.context.ContextLoader;

public class TraceServiceImpl implements TraceService {

    private BasicsTraceService basicsTraceService;

    @Override
    public String getTrace(String name) {
        // 获取当前Web应用的ServletContext
        ServletContext sc = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // 从ServletContext中获取Spring Web应用上下文
        WebApplicationContext ctx =
                WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        // 从Spring容器中获取Dubbo应用配置Bean
        ApplicationConfig app = ctx.getBean(ApplicationConfig.class);

        // 从Spring容器中获取名为"basicsTraceService"的BasicsTraceService类型的Bean实例
        basicsTraceService = ctx.getBean("basicsTraceService", BasicsTraceService.class);

        // 拼接当前链路信息并调用basicsTraceService往下传递链路
        return basicsTraceService.getTrace(name + " ---> " + app.getName());

    }
}
