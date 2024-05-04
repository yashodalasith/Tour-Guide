// IT22128386
// Hettiarachchi S.R 
// 9.2

package com.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateuserInfoServlet")
public class UpdateuserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1 = request.getParameter("id");
		String name1 = request.getParameter("name");
		String email1 = request.getParameter("email");
		String username1 = request.getParameter("username");
		String password1 = request.getParameter("password");
		String country1 = request.getParameter("country");
		
		boolean isTrue ;
		
		isTrue = MemberDBUtil.updatemember(id1, name1, email1, username1, password1, country1);
		
		if(isTrue == true)
		 {
			List<Member> memDetails = MemberDBUtil.getmemberDetails(id1);
			request.setAttribute("memDetails", memDetails);
			 RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
			 dis.forward(request, response);
		 }else
		 {
			 List<Member> memDetails = MemberDBUtil.getmemberDetails(id1);
				request.setAttribute("memDetails", memDetails);
			 RequestDispatcher dis2 = request.getRequestDispatcher("Login.jsp");
			 dis2.forward(request, response);
		 }
	}

}
