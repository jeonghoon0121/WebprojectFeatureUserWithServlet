package com.org.servlettest1;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Lifecycle1xmlTest extends HttpServlet {
    private int initCount=1;
    private int serviceCount=1;
    private int httpserviceCount=1;
    private int destroyCount=1;

    public Lifecycle1xmlTest(){}

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("xml init");
        System.out.println(initCount++);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("xml httpservice");
        System.out.println(httpserviceCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("xml service");
        System.out.println(serviceCount);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("xml destroy");
        System.out.println(destroyCount++);
    }
}
