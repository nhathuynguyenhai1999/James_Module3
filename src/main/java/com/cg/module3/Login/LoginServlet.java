package com.cg.module3.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin".equals(password)) {
            // Tạo một đối tượng RequestDispatcher để chuyển hướng yêu cầu sang trang index1.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index1.jsp");
            dispatcher.forward(request, response);
        } else {
            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<h1>Login Error</h1>");
            writer.println("</html>");
        }
    }
}


