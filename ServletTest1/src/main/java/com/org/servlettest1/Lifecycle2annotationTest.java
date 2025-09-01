package com.org.servlettest1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/annotation-lieftcycle",loadOnStartup = 1)
public class Lifecycle2annotationTest extends HelloServlet{
    private int initCount=1;
    private int serviceCount=1;
    private int httpserviceCount=1;
    private int destroyCount=1;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("annotation 방식 서블릿 init");
        System.out.println(initCount++);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("anntation 방식 서블릿 httpservice");
        System.out.println(httpserviceCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("annotation 방식 서블릿 service");
        System.out.println(serviceCount);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("annotation 방식 서블릿 destroy");
        System.out.println(destroyCount++);
    }
}
