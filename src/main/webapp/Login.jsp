<!-- 	IT22128386
		Hettiarachchi S.R 
 		9.2
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sensation</title>
<link rel ="stylesheet" href ="home1.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

</head>
<body class="body2">
 
<form action="Login" method="post" style="margin-top: 150px;" >
    <div class="login" style="height: 680px; padding-left: 25px;padding-right: 25px;">
	 <br><br>
	 <h1 style="text-align:center">Welcome</h1>
	  <center>
	 <img src="images/logo.png" alt="logo" style="border-radius:100%;width:60px;height:60px">
	  </center>
	     <br><br>
         <div class="user-box">
		    <label>Username</label><br> 
		    
		    <input type="text" name="username" required placeholder="Enter your username">
		    </div>
    <br>
   <div class="user-box">
		    <label>Password</label>
			<!--eye-->
			<span class="password-toggle-icon"><i class="fas fa-eye"></i></span>
			<br>
			 <input type="password" name="password" required placeholder="Enter your password">
 </div>
    <br>
    
    <center>
    <a href>
   <input type="submit" name="submit" value="Login" class="book1" style="margin-top: 15px;margin-bottom:15px;">
   </a>
	   <button  class="book1"><a href="register.jsp" style="margin-top: 15px;">Register new user</a></button>
	
</center>
</form>

</div>


</body>
</html>