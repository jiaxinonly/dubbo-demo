package com.demo.basics;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Dubbo服务提供者应用的Servlet入口类
 * 用于处理HTTP GET请求，验证服务提供者是否正常运行
 */
public class BasicsApplication extends HttpServlet {

    /**
     * 处理HTTP GET请求
     * @param req HTTP请求对象
     * @param resp HTTP响应对象
     * @throws ServletException Servlet异常
     * @throws IOException IO异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应内容类型为纯文本，字符编码为UTF-8
        resp.setContentType("text/plain;charset=UTF-8");
        // 向客户端输出服务提供者运行状态信息
        resp.getWriter().print("basics is ok!");
    }

}
