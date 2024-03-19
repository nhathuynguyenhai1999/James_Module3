package com.cg.module3;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
@WebServlet(name = "ServerTimeServlet", value = "/index")
public class ServerTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("");
        Date today = new Date();
        writer.println("<h1>" + today + "</h1>");
        writer.println("");
    }
}