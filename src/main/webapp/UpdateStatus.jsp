<!-- 	IT22070876
		Mathota Arachchi S S 
		Group 7.1
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sensation/update</title>
<link rel ="stylesheet" href ="home1.css">
<!-- Add icon library -->
<!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
        form {
        max-width: 500px;
        margin: 0 auto;
        padding: 20px;
    }

    input[type="text"]
     {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        margin-top: 5px;
    }

    textarea {
        height: 100px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: #ffffff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background-color: #365f94;
    }

</style>
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
	
    <div class="tabcontent" style="height: 813px;">
	    <%
			String statusid = request.getParameter("statusid");
			String tour = request.getParameter("tour");
			String accomodation = request.getParameter("accomodation");
			String transport = request.getParameter("transport");
			String itinerary = request.getParameter("itinerary");
			
		%>
		<form action="updateData" method="post" style="margin-top: 90px;">
			<p class="title"> Update Details</p><br><br>
			Status ID <input type="text" name="statusid" value="<%= statusid %>" readonly><br><br>
	        Tour ID <input type="text" name="tour" value="<%= tour %>"><br><br>
	        Accomodation <input type="text" name="accomodation" value="<%= accomodation %>"><br><br>
	        Transport <input type="text" name="transport" value="<%= transport %>"><br><br>
	        Itinerary <input type="text" name="itinerary" value="<%= itinerary %>"><br><br>
	
	        <input type="submit" name="submit" value="Update" style="margin-left: 430px;"><br>
	    </form>
		<br><br>
		<button class="list"><a href="home.jsp">Exit</a></button>
	</div>
      <div class="nav">
	  <!-- Add font awesome icons -->
	  <center>
	        <a href="https://www.instagram.com/" class="fa fa-instagram grad"></a>
            <a href="https://web.facebook.com/" class="fa fa-facebook grad"></a>
            <a href="https://twitter.com/" class="fa fa-twitter grad"></a>
	  </center>
	  </div>




















