package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletContextDemo() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletContext();
		String cmail = ctx.getInitParameter("companymail");
		out.println("Company Mail: " + cmail);
		
		ServletConfig cfg=getServletConfig();
		String name = cfg.getInitParameter("Myname");
		out.println("Company Mail: " + name);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
