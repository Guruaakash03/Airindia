<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking</title>
</head>
<body bgcolor="pink">
<h2>Flight Booking</h2>
<hr>

<form action="savepass" method="post">
<pre>

     First name:<input type="text" name="fname"/>
                                        
      Last name:<input type="text" name="lname"/>

       Email Id:<input type="email" name="email"/>

      Mobile no:<input type="text" name="mobile"/>

       Depature:<input type="text" name="depAirport"/>

       Arraival:<input type="text" name="arrAirport"/>
                                          
                                          <input type="submit" value="Book ticket"/>
                                          
</pre>
</form>
</body>
</html>