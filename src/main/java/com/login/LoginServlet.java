// IT22128386
// Hettiarachchi S.R 
// 9.2

package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username1 =request.getParameter("username");
		String password1 =request.getParameter("password");
		boolean isTrue;
		
		isTrue = MemberDBUtil.memvalidate(username1, password1);
		
			if(isTrue == true) 
			{
		List<Member> memDetails = MemberDBUtil.validate(username1, password1);
		request.setAttribute("memDetails", memDetails);
		RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
		dis.forward(request, response);
			}
			else
			{
				out.println("<script type='text/javascript'>");
				out.println("alert('Your username or password is incorrect');");
				out.println("location='Login.jsp'");
				out.println("</script>");
			}
		} 
		
		
		
		
	
	}


