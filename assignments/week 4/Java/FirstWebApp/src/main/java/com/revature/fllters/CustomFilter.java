package com.revature.fllters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;


//@WebFilter("/*")
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("[LOG] - CustomFilter was Initialized");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("[LOG] - CustomFilter intercepts web request at " + LocalDateTime.now());
        req.setAttribute("was-filtered", true);
        // resp.setHeader("example-response-header", "some-example-value");
        chain.doFilter(req,resp);

    }

}
