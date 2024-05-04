// It22103840
// Y.L.Jayasinghe
// 9.2

package feedbacksen;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FbDelete")
public class FbDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lastFename = FbDbUtil.getLastFename();
        FbDbUtil.deleteFeedback(lastFename);
        
        List<Feedback> feeddelete = FbDbUtil.getAllFeedback();
        request.setAttribute("feeddelete", feeddelete);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("fbafdelete.jsp");
        dispatcher.forward(request, response);
      }
}
