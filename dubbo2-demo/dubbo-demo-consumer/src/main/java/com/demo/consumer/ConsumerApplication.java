package com.demo.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.demo.api.TraceService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Dubbo消费者应用的主入口Servlet
 * 负责初始化Spring容器中的Bean并处理HTTP请求
 */
public class ConsumerApplication extends HttpServlet {

    // 远程服务接口引用
    private TraceService traceService;
    // 应用名称
    private String name;

    /**
     * Servlet初始化方法
     * 在Servlet启动时执行，用于初始化Spring容器中的Bean
     */
    @Override
    public void init() {
        // 获取Spring Web应用上下文
        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        // 从Spring容器中获取TraceService Bean
        traceService = ctx.getBean("traceService", TraceService.class);
        // 从Spring容器中获取Dubbo应用配置Bean
        ApplicationConfig app = ctx.getBean(ApplicationConfig.class);
        // 获取应用名称
        name = app.getName();
    }

    /**
     * 处理HTTP GET请求
     * 调用远程服务并返回调用链路信息
     * @param req HTTP请求对象
     * @param resp HTTP响应对象
     * @throws IOException IO异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 调用远程服务，传递当前应用名称
        String result = traceService.getTrace(name);
        // 设置响应内容类型为纯文本，字符编码为UTF-8
        resp.setContentType("text/plain;charset=UTF-8");
        // 将结果写入响应输出流
        resp.getWriter().print(result);
    }
}
