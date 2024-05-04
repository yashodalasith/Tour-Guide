// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

import java.io.IOException;
import java.io.PrintWriter; // Import PrintWriter

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteStatusServlet")
public class DeleteStatusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter(); // Initialize PrintWriter

        String statusid = request.getParameter("statusid");
        String tour = request.getParameter("tour");
        String accomodation = request.getParameter("accomodation");
        String transport = request.getParameter("transport");
        String itinerary = request.getParameter("itinerary");

        boolean isTrue;

        isTrue = StatusDBUtil.Delete(statusid, tour, accomodation, transport, itinerary);

        if (isTrue) {
            out.println("<script type='text/javascript'>");
            out.println("alert('Successfully Deleted');");
            out.println("location='home.jsp'");
            out.println("</script>");
        } else {
            out.println("<script type='text/javascript'>");
            out.println("alert('Error');");
            out.println("location='home.jsp'");
            out.println("</script>");
        }
    }
}
