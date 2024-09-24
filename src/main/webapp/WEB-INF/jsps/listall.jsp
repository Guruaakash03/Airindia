<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all passengers</title>
</head>
<body>
<h2>List all passengers</h2>

<table border="2">
<tr>
<td>First name</td>
<td>Last name</td>
<td>Email</td>
<td>Mobile</td>
<td>Depature</td>
<td>Arrival</td>
<td>Delete</td>
<td>Update</td>
</tr>
<c:forEach var="passengerdata" items="${passengerdata}">
<tr>
<td>${passengerdata.fname}</td>
<td>${passengerdata.lname}</td>
<td>${passengerdata.email}</td>
<td>${passengerdata.mobile}</td>
<td>${passengerdata.depAirport}</td>
<td>${passengerdata.arrAirport}</td>
<td><a href="deletepass?id=${passengerdata.id}">delete</a></td>
<td><a href="updatepass?id=${passengerdata.id}">update</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>