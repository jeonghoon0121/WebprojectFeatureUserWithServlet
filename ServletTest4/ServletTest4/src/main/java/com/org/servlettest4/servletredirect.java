package com.org.servlettest4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class servletredirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        StringBuilder redirectText = new StringBuilder();
        redirectText.append("<head>\n")
                .append("</head>")
                .append("<body>")
                .append("<h1>redirect 성공</h1>")
                .append("</body>")
                .append("(/html)");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.print(redirectText);
        out.close();
    }
}
