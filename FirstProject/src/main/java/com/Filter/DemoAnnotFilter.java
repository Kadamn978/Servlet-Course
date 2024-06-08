package com.Filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/annot")
public class DemoAnnotFilter extends HttpFilter implements Filter {
    private static final long serialVersionUID = 1L;

    public DemoAnnotFilter() {
        super();
    }

    public void destroy() {
        // No-op
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.getWriter().println("Pre processing 1 ");
        chain.doFilter(request, response);
        res.getWriter().println("Post processing 1 ");
    }

    public void init(FilterConfig fConfig) throws ServletException {
        // No-op
    }
}
