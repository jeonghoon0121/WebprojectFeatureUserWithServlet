package com.org.servlettest3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/querystring")
public class QueryStringTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        java.sql.Date birthday=java.sql.Date.valueOf(req.getParameter("birthday"));
        String gender=req.getParameter("gender");
        String national=req.getParameter("national");
        String[] hobbies= req.getParameterValues("hobbies");
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("birthday="+birthday);
        System.out.println("gender="+gender);
        System.out.println("national="+national);
        for(String hobby : hobbies){
            System.out.println(hobby);
        }
    }
}
