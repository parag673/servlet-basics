package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter2
 */
@WebFilter("/welcome")
public class MyFilter2 extends HttpFilter implements Filter {
       
	private FilterConfig fconfig;
	
  
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter destroyed");
		fconfig=null;
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<p>Pre filteration of second filter</p>");
		String name=request.getParameter("name");
		
	          
		if(name.equals("parag")) {
		chain.doFilter(request, response);
		}else {
			out.print("error");
		}
		out.print("<p>post filteration of second filter</p>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.fconfig=fconfig;
	}

}
