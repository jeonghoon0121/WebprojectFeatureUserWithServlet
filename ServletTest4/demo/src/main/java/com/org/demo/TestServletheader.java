package com.org.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

@WebServlet("/headers")
public class TestServletheader extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Enumeration<String> headerNames=req.getHeaderNames();
        List<String> contentKeys = new ArrayList<>();
        List<String> contentValues = new ArrayList<>();

        while(headerNames.hasMoreElements()){
            String headerName=headerNames.nextElement();
            String headerValue=req.getHeader(headerName);
            System.out.println(headerName);
            System.out.println(headerValue);
            contentKeys.add(headerName);
            contentValues.add(headerValue);
        }
        System.out.println(contentKeys);
        System.out.println(contentValues);
    }
}
