package com.HiddenFormFiled;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoHiddenURL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("fname");
//		String password = request.getParameter("password");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3> Welcome User : " + uname + " </h3><br>");
		out.println("<h2> URL Rewriting Demo </h2><br>");
		out.println("<a href='hidden2?username=" + uname + "'> URL Rewriting </a><br>");
//		out.println();
		/*
		 * out.println("<form action='hidden2' method='post' >");
		 * out.println("<input type='text' name='t1' /><br/>");
		 * out.println("<input type='hidden' name='username' value='" + uname +
		 * "'/><br/>"); out.println("<input type='submit' /><br/>");
		 */
//		out.println("<a href='hidden2' >Second Servlet </a><br>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
