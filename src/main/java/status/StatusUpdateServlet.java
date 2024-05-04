// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStatusServlet
 */
@WebServlet("/UpdateStatusServlet")
public class StatusUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String statusid= request.getParameter("statusid");
			String tour= request.getParameter("tour");
			String accomodation = request.getParameter("accomodation");
			String transport = request.getParameter("transport");
			String itinerary = request.getParameter("itinerary");
			
			boolean isTrue;
			
			isTrue = StatusDBUtil.Update(statusid, tour, accomodation, transport, itinerary);
			
			if(isTrue == true) {
				out.println("<script type= 'text/javascript'>");
		    	out.println("alert('Successfully Updated');");
		    	out.println("location='home.jsp'");
		    	out.println("</script>");
		    }
		    else {
		    	out.println("<script type= 'text/javascript'>");
		    	out.println("alert('Error');");
		    	out.println("location='home.jsp'");
		    	out.println("</script>");
		    
		    }
		}

}

