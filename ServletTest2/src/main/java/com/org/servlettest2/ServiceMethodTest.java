package com.org.servlettest2;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-servlet")
public class ServiceMethodTest extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        HttpServletRequest httpServletRequest=(HttpServletRequest) req;
        HttpServletResponse httpServletResponse=(HttpServletResponse) res;

        String httpMethod=httpServletRequest.getMethod();

        System.out.println("httpServletMethod="+httpMethod);
        if(("GET").equals(httpMethod)){
            doGet(httpServletRequest,httpServletResponse);
        } else if (("POST").equals(httpMethod)) {
            doPost(httpServletRequest,httpServletResponse);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("GET요청을 처리하는 메소드");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("POST요청을 처리하는 메소드 ");
    }
}
