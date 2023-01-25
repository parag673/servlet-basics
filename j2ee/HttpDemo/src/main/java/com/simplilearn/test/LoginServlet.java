package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="s2",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the request parameter enter by user.
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		if(pass.equals("admin123")) 
			out.print("<h1>welcome "+email+"</h1>");
			else
			out.print("<h1>Wrong user name or password</h1>");
		
	}
}
