package com.org.servlettest3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/formdata")
public class FormDataTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String name = req.getParameter("name");
        System.out.println("name=" + name);
        String age = req.getParameter("age");
        System.out.println("age=" + age);
        String birthday = req.getParameter("birthday");
        System.out.println("birthday=" + birthday);
        String gender = req.getParameter("gender");
        System.out.println("gender=" + gender);
        String national = req.getParameter("national");
        System.out.println("national" + national);
        String[] hobbies = req.getParameterValues("hobbies");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                System.out.println("hobby:" + hobby);
            }
        } else {
            System.out.println("no hobby");
        }
        Map<String,String[]>requestMap=req.getParameterMap();
        Set<String> keySet =requestMap.keySet();
        Iterator<String> keyIter=keySet.iterator();
        while(keyIter.hasNext()){
            String key= keyIter.next();
            String[] value=requestMap.get(key);
            System.out.println("key="+key);
            for(int i=0; i<value.length;i++){
                System.out.println("value["+i+"]="+value[i]);
            }
            Enumeration<String> names=req.getParameterNames();
            while(names.hasMoreElements()){
                System.out.println(names.nextElement());
            }
        }


    }
}
