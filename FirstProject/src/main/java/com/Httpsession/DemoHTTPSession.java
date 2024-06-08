package com.Httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DemoHTTPSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("fname");
		String password = request.getParameter("password");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3> Welcome User : " + uname + " </h3><br>");
		out.println("<h2>Http Session Created </h2><br>");
		HttpSession ses = request.getSession();
		ses.setAttribute("username", uname);
		ses.setAttribute("password", password);
		out.println("<a href='httpses2'>Second Sessin Page </a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
