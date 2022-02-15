package com.ls.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ajaxServlet")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、响应数据
        response.getWriter().write("hello ajax");


        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello 4087");
        System.out.println("push test");
        System.out.println("push test new");
        System.out.println("push test new new new");
        System.out.println("push 4087");

        System.out.println("安辰是狗!!");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
