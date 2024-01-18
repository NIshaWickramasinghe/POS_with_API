package com.example.pos2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "customer" , value = "/customer" ,
        initParams = {
                @WebInitParam(name = "user", value = "root"),
                @WebInitParam(name = "pw", value = "1234"),
                @WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/pos"),
                @WebInitParam(name = "class", value = "com.mysql.cj.jdbc.Driver")
        },
        loadOnStartup = 3
)
public class Customer extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("customer servlet");
        }
}
