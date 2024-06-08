package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Third implements Servlet {
    private ServletConfig config;

    public Third() {
    }

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    public void destroy() {
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        PrintWriter out = res.getWriter();
        out.println("Welcome");
        out.println("Hi " + req.getParameter("fname"));
    }
}
