package com.Httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DemoHTTPSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoHTTPSession2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Http Session 2 Created </h2><br>");
		HttpSession ses = request.getSession();
		String uname = (String) ses.getAttribute("username");
		out.println("<h3> Welcome User : " + uname + " </h3><br>");
		out.println("<a href='httpses3'>Third Sessin Page </a>");
		out.println("</body></html>");
//		ses.invalidate();//kill a session way1
//		ses.setMaxInactiveInterval(10);// kill a session way2 if +ve time in sec, if -ve (never Terminated)unless
										// brower closed
		// kill a session way3 in web.xml by setting in
		// <session-config> <session-timeout> times in min </session-timeout> </session-config>

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
