//package com.example.webcalculator;
//
//import java.io.*;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/calculate")
//public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Calculator";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        int a = Integer.parseInt(request.getParameter("a"));
//        int b = Integer.parseInt(request.getParameter("b"));
//
//        int sum = (a + b);
//
//        request.setAttribute("a", a);
//        request.setAttribute("b", b);
//        request.setAttribute("sum", sum);
//
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//    }
//
//    public void destroy() {
//    }
//}