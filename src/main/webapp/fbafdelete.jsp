<!-- 	It22103840
		Y.L.Jayasinghe
 		9.2
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sensation</title>
<link rel ="stylesheet" href ="home1.css">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="body2">
     <!--Name-->
    <h1>
	<img src="images/logo.png" alt="logo" style="border-radius:100%;width:40px;height:40px;float:left;">
	Sensa<font color="#f6877e">t</font><font color="#8D021F">i</font>on
	</h1>
	<!--bar-->
    <div class="nav">
	   <button class="list"><a href="Login.jsp">Log out</a></button><span class="fa fa-gear set"></span>
	</div>
	<br>
		
	<center><div id="Feedback" class="tabcontent">
		<center><p class="letter"><font size="+5">P</font>rovide the feedback</p></center>
		<center><p class="title">We value your feedback.Please share your thougts with us.</p></center><br><br>
		<form id="feedback" action="fb" method="post">
					<p class="title" style="color:red">Please enter your name<span style="color:red">*</span></p>
					<input type="text" id="feedname" name="feedname" size="60" required><br><br>
					
					<p class="title" style="color:red">Give us your feedback<span style="color:red">*</span></p>
					<textarea id="feedback" name="feedback" cols="90" rows="15" required></textarea><br><br>
					
					<p class="title" for="rating">Rating:
					<select id="rating" name="rating">
						<option value="5">Excellent</option>
						<option value="4">Very Good</option>
						<option value="3">Good</option>
						<option value="2">Fair</option>
						<option value="1">Poor</option>
					</select></p><br>
					
					<button type ="submit" id="feedsubmit" style="border-radius: 8px;border:none;background-color:red;color:White;padding: 12px 24px">Submit</button>
			</form>
			
	<p class="letter"><font size="+5">F</font>eedbacks</p>
	
	<table>
    	<tr>
        	<th>Name</th>
        	<th>Feedback</th>
        	<th>Rating</th>
        	<th>Submission Time</th>
    	</tr>
    	<c:forEach var="fee" items="${feeddelete}">
        <tr>
           <td>${fee.feedname}</td>
           <td>${fee.feedback}</td>
           <td>${fee.rating}</td>
           <td>${fee.stime}</td>
        </tr>
    	</c:forEach>
	</table><br><br>
	
	<br><br><button class="list"><a href="home.jsp">Exit</a></button>
	</div></center>
      <div class="nav">
	  <center>
	        <a href="https://www.instagram.com/" class="fa fa-instagram grad"></a>
            <a href="https://web.facebook.com/" class="fa fa-facebook grad"></a>
            <a href="https://twitter.com/" class="fa fa-twitter grad"></a>
	  </center>
	  </div>
</body>
</html>