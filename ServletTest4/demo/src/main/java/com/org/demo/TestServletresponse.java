package com.org.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class TestServletresponse extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        PrintWriter out=resp.getWriter();
        StringBuilder respBuilder=new StringBuilder();
        respBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("<body>\n")
                .append("<h1>response</h1>\n")
                .append("</body>\n")
                .append("</html>\n");
        resp.setContentType("text/html");
        out.print(respBuilder);
        out.flush();

    }
}
