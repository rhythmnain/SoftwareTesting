package com.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hardcoded email and password for demonstration purposes
        if ("demo@example.com".equals(email) && "password123".equals(password)) {
            response.sendRedirect("thankyou");
        } else {
            response.getWriter().println("Invalid credentials");
        }
    }
}



