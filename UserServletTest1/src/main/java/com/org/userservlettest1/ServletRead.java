package com.org.userservlettest1;

import com.org.DAO.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/read")
public class ServletRead extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setCharacterEncoding("UTF-8");
        System.out.println("read 실행");

        String userId=req.getParameter("userId");
        String password=req.getParameter("password");
        System.out.println(userId);
        System.out.println(password);

        UserDAO userdao=new UserDAO();
        userdao.login(userId,password);

    }
}
