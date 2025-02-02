<%@page import="com.project.booking.entities.Driver"%>
<%@page import="com.project.booking.entities.Booking"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- Bootstrap CSS -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
	
	<title>Booking List</title>
	<script type="text/javascript">
		function validateDriverId() {
			// Get the entered Driver ID
			var enteredDriverId = document.getElementById("driver").value;
	
			// Get the list of valid Driver IDs from the hidden input
			var validDriverIds = document.getElementById("validDriverIds").value
					.split(",");
	
			// Check if the entered Driver ID is in the list of valid Driver IDs
			if (!validDriverIds.includes(enteredDriverId)) {
				alert("Invalid Driver ID. Please enter a valid Driver ID.");
				return false; // Prevent form submission
			}
			return true; // Allow form submission
		}
	</script>
</head>
<body>
	<h1>Booking List</h1>
	<form action="bookings" method="post"
		onsubmit="return validateDriverId()">
		<label for="driver">Driver ID:</label> <input type="text" id="driver"
			name="driver"><br> <label for="pickupLocation">Pickup
			Location:</label> <input type="text" id="pickupLocation"
			name="pickupLocation"><br> <label for="dropoffLocation">Dropoff
			Location:</label> <input type="text" id="dropoffLocation"
			name="dropoffLocation"><br> <label for="bookingTime">Booking
			Time:</label> <input type="text" id="bookingTime" name="bookingTime"><br>
		<input type="submit" value="Add Booking">
	</form>

	<h2>Please Enter Existing Driver's ID</h2>
	<%
	List<Driver> drivers = (List<Driver>) request.getAttribute("drivers");
	if (drivers != null) {
		StringBuilder driverIds = new StringBuilder();
		for (Driver driver : drivers) {
			driverIds.append(driver.getId()).append(",");
	%>
	<p>
		License Number:
		<%=driver.getId()%></p>
	<p>
		Driver Name:
		<%=driver.getName()%></p>
	<%
	}
	%>
	<input type="hidden" id="validDriverIds"
		value="<%=driverIds.toString()%>">
	<%
	}
	%>

	<h2>Existing Bookings</h2>
	<%
	List<Booking> bookings = (List<Booking>) request.getAttribute("bookings");
	if (bookings != null) {
		for (Booking booking : bookings) {
	%>
	<li>Driver ID: <%=booking.getDriver() != null ? booking.getDriver().getId() : "N/A"%>,
		Pickup: <%=booking.getPickupLocation()%>, Dropoff: <%=booking.getDropoffLocation()%>,
		Time: <%=booking.getBookingTime()%>
	</li>
	<%
	}
	}
	%>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
		
	</script>


</body>
</html>
