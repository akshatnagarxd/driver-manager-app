<%@page import="com.project.booking.entities.Driver"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	
    <title>Driver List</title>
</head>
<body>
    <h1>Driver List</h1>
    <form action="drivers" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        <label for="licenseNumber">License Number:</label>
        <input type="text" id="licenseNumber" name="licenseNumber"><br>
        <input type="submit" value="Add Driver">
    </form>

    <h2>Existing Drivers</h2>
    <!-- <ul>
        <c:forEach var="driver" items="${drivers}">
            <li>${driver.name} (License: ${driver.licenseNumber})</li>
        </c:forEach>
    </ul> -->
    <%
	List<Driver> drivers = (List<Driver>) request.getAttribute("drivers");
	if (drivers != null) {
		for (Driver driver : drivers) {
	%>
	<p>
		Driver Name:
		<%=driver.getName()%></p>
	<p>
		License Number:
		<%=driver.getLicenseNumber()%></p>
	<%
	}
	}
	%>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>


