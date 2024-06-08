package com.HiddenFormFiled;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoHiddenURL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String password = request.getParameter("password");
//		String t1 = request.getParameter("t1"); //used in hidden filed

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		out.println("<html><body>");
		out.println("<h2> URL Demo 2 </h2><br>");
		out.println("<h3> Welcome User : " + uname + " </h3><br>");
		out.println();
//		out.println("<h2>Data From Text Box " + t1 + " </h2><br>");
//		out.println("<form action='hidden3' method='post' >"); //used in hidden filed
//		out.println("<input type='text' name='t1' /><br/>");
//		out.println("<input type='hidden' name='username' value='" + uname + "' /><br/>");
//		out.println("<input type=\"submit\" /><br/>");

//		out.println("<a href='hidden3' >Third Servlet </a><br>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
