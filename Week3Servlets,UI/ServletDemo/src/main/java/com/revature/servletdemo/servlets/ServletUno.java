package com.revature.servletdemo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletUno extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("In the get method of the Servlet Uno class");
       resp.setContentType("text/html");
        resp.getWriter().write(
                "<html>" +
                "<body>" +
                "<p>" +
                "Welcome to the get place " +
                 req.getParameter("Name")       +
                "</p>" +
                "</body>" +
                "</html>"
        );
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("In the delete method of servlet uno");
    }
}
