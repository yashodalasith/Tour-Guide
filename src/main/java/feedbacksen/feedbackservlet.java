// It22103840
// Y.L.Jayasinghe
// 9.2

package feedbacksen;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedbackservlet")
public class feedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
	    super.init();
	    FbDbUtil.createFeedbackTable();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String feedname = request.getParameter("feedname");
		String feedback = request.getParameter("feedback");
		int rating = Integer.parseInt(request.getParameter("rating"));
		
		try{
			List<Feedback> fbDetails = FbDbUtil.post(feedname,feedback,rating);
			request.setAttribute("fbDetails", fbDetails);
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		List<Feedback> fbDetails = FbDbUtil.getAllFeedback();
        request.setAttribute("fbDetails", fbDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("fbDelete.jsp");
		dis.forward(request, response);

	}

}
