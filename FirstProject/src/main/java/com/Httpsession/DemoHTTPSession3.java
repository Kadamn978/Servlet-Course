package com.Httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DemoHTTPSession3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoHTTPSession3() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Http Session 3 Created </h2><br>");
		HttpSession ses = request.getSession();
		String uname = (String) ses.getAttribute("username");
		out.println("<h3> Welcome User : " + uname + " </h3><br>");
//		out.println("<a href='httpses4'>Second Sessin Page </a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
