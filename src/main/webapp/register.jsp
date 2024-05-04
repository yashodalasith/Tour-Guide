<!-- 	IT22128386
		Hettiarachchi S.R 
 		9.2
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" href ="home1.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta charset="ISO-8859-1">
<title>Register page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    form {
        width: 300px;
        margin: 0 auto;
        margin-top: 100px;
        background: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        background-color: #f9f9f9; /* Set the background color here */
    }

    h2 {
        text-align: center;
    }

    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="text"]:focus {
        border-color: #4caf50; /* Change border color when input is focused */
    }

    input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
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
	
<form action="register" method="post" style="width: 312px; padding-right: 50px;">
    <h2>Register</h2>
    <label for="name">Enter Name:</label>
    <input type="text" name="name" id="name" required>

    <label for="username">Enter User Name:</label>
    <input type="text" name="username" id="username" required>

    <label for="email">Enter email:</label>
    <input type="text" name="email" id="email" required>
<br>
<br>
    <label for="password">Enter Password:</label>
    <input type="password" name="password" id="password" required> <!-- Use type="password" for password fields -->
<br>
<br>
    <label for="country">Enter Country:</label>
    <input type="text" name="country" id="country" required>

    <input type="submit" name="submit" value="Register">
</form>
</body>
</html>
