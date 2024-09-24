<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Passenger</title>
</head>
<body bgcolor="pink">
<h2>Update Passenger</h2>
<hr>

<form action="updatepassdata" method="post">
<pre>

            ID :<input type="text" name="id" value="${pass1.id}">

     First name:<input type="text" name="fname" value="${pass1.fname}"/>
                                        
      Last name:<input type="text" name="lname" value="${pass1.lname}"/>

       Email Id:<input type="email" name="email" value="${pass1.email}"/>

      Mobile no:<input type="text" name="mobile" value="${pass1.mobile}"/>

       Depature:<input type="text" name="depAirport" value="${pass1.depAirport}"/>

       Arraival:<input type="text" name="arrAirport" value="${pass1.arrAirport}"/>
                                          
                                          <input type="submit" value="Update Passenger"/>
                                          
</pre>
</form>
</body>
</html>