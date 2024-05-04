// It22103840
// Y.L.Jayasinghe
// 9.2

package feedbacksen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Feedback {
	private String feedname;
	private String feedback;
	private int rating;
	DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private Date stime = new Date();
	
	public Feedback(String feedname, String feedback, int rating, Date stime) {
		this.feedname = feedname;
		this.feedback = feedback;
		this.rating = rating;
		this.stime = stime;
	}
	
	public String getFeedname() {
		return feedname;
	}

	public String getFeedback() {
		return feedback;
	}

	public int getRating() {
		return rating;
	}

	public Date getStime() {
		return stime;
	}
	
}
