package com.simplilearn.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	String uname=request.getParameter("uname");
	String pass=request.getParameter("password");
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	if(pass.equals("admin123")) {
      out.print("Sucessfully LoggedIn...!!<br>");
      //lets create form using hidden field
      out.print("<form action='dashboard' method='post'>");
      out.print("<input type='hidden' name='name' value='"+uname+"'>");
      out.print("<input type='submit' value='Dashboard'>");
      out.print("</form>");
      out.print("hello world");
	}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
