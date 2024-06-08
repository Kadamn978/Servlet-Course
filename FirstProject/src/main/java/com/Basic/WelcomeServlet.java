package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("fname");
		ArrayList<String> al1 = (ArrayList<String>) request.getAttribute("StudentList");
		out.println("Student List : <br>");
		for (String s : al1) {
			out.println(s + "<br>");
		}

		out.println("Login Sucessful!...</br>");
		out.println("Welcome to Admin Pannel : </br>"); 
		out.println("Hi " + uname + " </br>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
