<!-- 	IT22128386
		Hettiarachchi S.R 
 		9.2
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" href ="home1.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="ISO-8859-1">

<title>Profile page</title>
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
<center>
        
            <h1 class="title">Your Profile page</h1>
           
             
              </center>
	<table style="border: 5px solid black; margin: 0 auto;" >
	<c:forEach var="mem" items="${memDetails}">
	
	<c:set var="id" value="${mem.id}"/>
	<c:set var="name" value="${mem.name}"/>
	<c:set var="email" value="${mem.email}"/>
	<c:set var="username" value="${mem.username}"/>
	<c:set var="password" value="${mem.password}"/>
	<c:set var="country" value="${mem.country}"/>
	
	<tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member ID =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.id}</td>
	</tr>
	<tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member Name =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.name}</td>
	</tr>
	<tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member Email =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.email}</td>
	</tr>
	
	<tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member User Name =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.username}</td>
	</tr>
	<tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member password =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.password}</td>
	</tr>
    
    <tr style="border: 5px solid black;">
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">Member country =</td>
		<td><p style="font-family: Copperplate; font-size: 22px;text-align: center;">${mem.country}</td>
	</tr>
	</c:forEach>
	</table>

	<c:url value="UpdateuserInfo.jsp" var="memupdate">
	    <c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
		<c:param name="country" value="${country}"/>
		</c:url>
	<center>	
		
	<a href="${memupdate}">
	<input type="button" name="update" value="Update My Info" class="book1" style="margin-top: 20px;">
	</a>
	<br>
	</center>
	
	<c:url value="deletemem.jsp" var="memdelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="username" value="${username}" />
		<c:param name="password" value="${password}" />
		<c:param name="country" value="${country}" />
	</c:url>
	<center>
	<a href="${memdelete}">
	<input type="button" name="delete" value="Delete my acc" class="book1" style=" margin-top: 0px; margin-bottom: 20px;">
	</a>
	</center>
	<center>
	<a href="home.jsp">
	<input type="button" name="gohome" value="Go to home page" class="book1">
	</a>
	</center>
</body>
</html>