package com.cg.module3.ApplicationProduct.model.controller.service;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

public class ProductServlet extends HttpServlet {
    private final ProductService productService = new ProductServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                listProducts(request, response);
                break;
            case "add":
                addProduct(request, response);
                break;
            // Add more cases for other actions like update, delete, search
        }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.getAllProducts();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list-products.jsp");
        dispatcher.forward(request, response);
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve product information from request parameters
        // Create a new Product object and add it to the ProductService
        // Redirect or forward to appropriate page
    }

    // Add more methods for other actions like update, delete, search
}

