<%@page
	import="org.springframework.http.server.reactive.ContextPathCompositeHandler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Driver Booking Application</title>

<%
    	String contextPath = (String)request.getContextPath();
    %>

<!-- <link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/styles.css"> -->
</head>
<body>
	<h1>Welcome to the Driver Booking Application</h1>
	<p>Use this application to book drivers and manage your bookings
		easily.</p>

	<nav class="">
		<ul>
			<li><a href="drivers">View Drivers</a></li>
			<li><a href="bookings">Make a Booking</a></li>
		</ul>
	</nav>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>
