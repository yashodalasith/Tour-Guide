// IT22128386
// Hettiarachchi S.R 
// 9.2

package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 String country = request.getParameter("country");
	
		 
		 boolean isTrue;
		 isTrue = MemberDBUtil.insertmember(name,email, username, password, country);
		 
		 if(isTrue == true)
		 {
			 RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			 dis.forward(request, response);
		 }else
		 {
			 RequestDispatcher dis2 = request.getRequestDispatcher("Home.jsp");
			 dis2.forward(request, response);
		 }
		 }

}
