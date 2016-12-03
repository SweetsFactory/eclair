package com.example.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import jp.example.util.Hello;

@WebServlet("/servlet")
public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	Hello hello = new Hello();
        response.getWriter().println(hello.echo() + "Hello Gradle War Plugin!!");
    }
}
