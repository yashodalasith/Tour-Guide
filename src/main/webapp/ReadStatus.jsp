<!-- 	IT22070876
		Mathota Arachchi S S 
		Group 7.1
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="ISO-8859-1">
<title>Sensation/Read</title>
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

    input[type="button"] {
        background-color: #4CAF50;
        color: #ffffff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-top: 10px;
    }

    input[type="button"]:hover {
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
	
    <div class="tabcontent" style="height: 870px;">
    <div id="readd">
		<form style="margin-top: 90px;">
			<c:forEach var="statusDetails" items="${statusDetails}">
				<p class="title"> Tour Details</p><br><br>
		       Status ID <input type="text" value=${statusDetails.statusid} readonly><br><br>
		       Tour ID <input type="text" value=${statusDetails.tour}  readonly><br><br>
		       Accomodation <input type="text"" value=${statusDetails.accomodation} readonly><br><br>
		       Transport <input type="text" value= ${statusDetails.transport} readonly><br><br>
		       Itinerary <input type="text" value= ${statusDetails.itinerary} readonly><br><br>
		       
				<c:set var="statusid" value="${statusDetails.statusid}"/>
				<c:set var="tour" value="${statusDetails.tour}"/>
				<c:set var="accomodation" value="${statusDetails.accomodation}"/>
				<c:set var="transport" value="${statusDetails.transport}"/>
				<c:set var="itinerary" value="${statusDetails.itinerary}"/>
			</c:forEach>
			  	
			<c:url value="UpdateStatus.jsp" var="updateStatus">
				<c:param name="statusid" value="${statusid}"/>
				<c:param name="tour" value="${tour}"/>
				<c:param name="accomodation" value="${accomodation}"/>
				<c:param name="transport" value="${transport}"/>
				<c:param name="itinerary" value="${itinerary}"/>
			</c:url>
			<br>
			<a href="${updateStatus}">   
			<input type="button" name="update" value="Update Data" style=" margin-left: 385px;">
			</a> 
			<br>
			<c:url value="DeleteStatus.jsp" var="deleteStatus">
				<c:param name="statusid" value="${statusid}"/>
				<c:param name="tour" value="${tour}"/>
				<c:param name="accomodation" value="${accomodation}"/>
				<c:param name="transport" value="${transport}"/>
				<c:param name="itinerary" value="${itinerary}"/>
			</c:url>
			<br>
			<a href="${deleteStatus}">   
			<input type="button" name="update" value="Delete Data" style=" margin-left: 385px;">
			</a> 
			</div>
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
</body>
</html>