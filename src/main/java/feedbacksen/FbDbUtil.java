// It22103840
// Y.L.Jayasinghe
// 9.2

package feedbacksen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FbDbUtil {

	private static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/onlinetourguide";
        String user = "root";
        String pass = "123pp";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    public static void createFeedbackTable() {
        try {
            Connection con = getConnection();
            Statement statement = con.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS feedback ("
                    + "feedbackID INT AUTO_INCREMENT PRIMARY KEY, "
                    + "fename VARCHAR(255) NOT NULL, "
                    + "fback TEXT DEFAULT NULL, "
                    + "rate INT DEFAULT NULL, "
                    + "sutime DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ");";
            statement.execute(createTableSQL);
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<Feedback> post(String fename, String feback, int rate) {
        ArrayList<Feedback> fb = new ArrayList<>();
        try {
            Connection con = getConnection();
            con.setAutoCommit(true);
            String sql = "INSERT INTO feedback (fename, fback, rate) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, fename);
            pstmt.setString(2, feback);
            pstmt.setInt(3, rate);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Feedback posted successfully.");
            } else {
                System.out.println("Feedback posting failed.");
            }
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database error: " + e.getMessage());
        }
        return fb;
    }
    
    public static List<Feedback> getAllFeedback() {
        List<Feedback> feedbackList = new ArrayList<>();

        try {
        	 Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM feedback");

            while (resultSet.next()) {
                String fename = resultSet.getString("fename");
                String fback = resultSet.getString("fback");
                int rate = resultSet.getInt("rate");
                Date sutime = resultSet.getTimestamp("sutime");

                Feedback feedback = new Feedback(fename, fback, rate, sutime);
                feedbackList.add(feedback);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return feedbackList;
    }

    public static String getLastFename() {
        String lastFename = null;

        try {
        	Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT fename FROM feedback ORDER BY sutime DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                lastFename = resultSet.getString("fename");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return lastFename;
    }

    public static void deleteFeedback(String fename) {
        try {
        	Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM feedback WHERE fename = ?");
            preparedStatement.setString(1, fename);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

/*public class FbDbUtil {

		public static List<Feedback> post(String fename, String feback, int rate, String sutime) {
			
			ArrayList<Feedback> fb = new ArrayList<>();
			
			String url = "jdbc:mysql://localhost:3306/feedback";
			String user = "root";
			String pass = "ylj@2002";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				con.setAutoCommit(true);
				
				String sql2 = "select * from feedback where feedbackID = 45";
				ResultSet rs = stmt.executeQuery(sql2);
				
				String feedname = rs.getString("fename");
			    String feedback = rs.getString("fback");
			    int rating = rs.getInt("rate");
			    Date stime = rs.getTimestamp("sutime");

				
				Feedback f = new Feedback(feedname,feedback,rating,stime);
				fb.add(f);
			}
			
			catch(Exception e) {
				System.out.println("Error" + e);
			}
			
			return fb;
		}
}




/*String sql1 = "insert into feedback(fename,fback,rate,sutime) values (fename,fback,rate,sutime)";
stmt.executeQuery(sql1);*/
