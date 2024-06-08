package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("fname");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		ArrayList<String> al = new ArrayList<>();
		al.add("Aditya");
		al.add("Raj");
		al.add("Manoj");
		al.add("Ziya");

		if (uname.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
//			Setting Attribute
			request.setAttribute("StudentList", al);

//			Request Forward
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
//			response.sendRedirect("welcome");

		} else {
			out.println("Unsuccessful Login");
			out.println("Try Again!");

//			Request Include
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
