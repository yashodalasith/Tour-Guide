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


@WebServlet("/DeleteuseraccServlet")
public class DeleteuseraccServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1 = request.getParameter("id");
		boolean isTrue;
		
		isTrue = MemberDBUtil.deletemember(id1);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Member> memDetails = MemberDBUtil.getmemberDetails(id1);
			request.setAttribute("memDetails", memDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
