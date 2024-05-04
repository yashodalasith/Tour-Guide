<!-- 	IT22070876
		Mathota Arachchi S S 
		Group 7.1
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sensation/insert</title>
<link rel ="stylesheet" href ="home1.css">
<!-- Add icon library -->
<!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
 .searchd {
    	max-width: 227px;
    	position: absolute;
    	left: 720px;
    	
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
	
    <div class="tabcontent">
		<div class="searchd">
			  <form class="ex" action="searchdata" method="post" style="margin-top: 50px; width:255px">
			 	 <input type="text" placeholder="Search Tour ID xxxx" name="tour" style="max-width:80%;float:left">
		 	 	 <button type="submit" name="Submit" value="Search" style="float: left;left: -30px;position: relative;top: 6px; height:35px;"><i class="fa fa-search"></i></button>
		</form>
		</div>	
		<div class="form11111">
			<form action="insertData" method="post" style="margin-top: 90px;margin-bottom: 90px;max-width: 500px;margin-left:120px;padding: 20px;">
		        <p class="letter" ><font size="+5">T</font>o enhance your tour.</p><br>
		        <p class="title"> Insert Details</p><br><br>
		        Tour ID <input type="text" name="tour" required><br><br><br>
		        Accommodation <input type="text" name="accomodation" required><br><br><br>
		        Transport <input type="text" name="transport" required><br><br><br>
		        Itinerary <input type="text" name="itinerary" required><br><br><br>
		        
		        <input type="submit" name="submit" value="Save" style=" margin-left: 430px;">
		    </form>
		</div>    
		<br>
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
	  </body>
</html>


    
    
    
    