// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStatusServlet
 */
@WebServlet("/SearchStatusServlet")
public class SearchStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String tour = request.getParameter("tour");
		boolean isTrue;
		
		isTrue = StatusDBUtil.validate(tour);
		
		if(isTrue == true) {
			List<Status> statusDetails = StatusDBUtil.getStatus(tour);
			request.setAttribute("statusDetails", statusDetails);
			
	    	RequestDispatcher dis1 = request.getRequestDispatcher("ReadStatus.jsp");
	    	dis1.forward(request,response);
	    }
	    else {
	    	out.println("<script type= 'text/javascript'>");
	    	out.println("alert('Invalide Booking ID');");
	    	out.println("location='TM.jsp'");
	    	out.println("</script>");
	    	
	    }
	}
}
