package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // System.out.println(resp.getCharacterEncoding());

        // 设置服务器字符集为 UTF-8
        //resp.setCharacterEncoding("UTF-8");
        // 通过响应头，设置浏览器也使用 UTF-8 字符集
       // resp.setHeader("Content-Type", "text/html; charset=UTF-8");
        // 要求: 往客户端回传字符串数据。

        // 它会同时设置服务器和客户端都使用 UTF-8 字符集，还设置了响应头
        // 此方法一定要在获取流对象之前调用才有效
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("通过响应");
    }
}
