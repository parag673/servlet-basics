package com.simplilearn.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//user redirected here sp lets try to get cokies here.
		Cookie ck[]= request.getCookies();
		Cookie myCookie=null;
		boolean found=false;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				myCookie=ck[i];
				if(myCookie.getName().contentEquals("logindetails") && myCookie.getValue()!=null) {
					myCookie.setMaxAge(-1);
					out.print("Cookie found and value is "+myCookie.getValue());
					out.print("<br><a href='profile'>Profile Page</a>");
					found=true;
				}
			}
			
		}
		if(found==false) {
			out.print("User is invalid kindly login first");
			
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
