package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/my")
public class MyServlet implements Servlet{

	private ServletConfig config;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet initialized");
		this.config=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Request Recived");
		PrintWriter out=res.getWriter();
		out.print("Welcome" +res.getContentType());
		out.print(req.getContentLength());
		
	}

}
