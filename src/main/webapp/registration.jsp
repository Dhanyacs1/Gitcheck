<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<Center>
	<title>Vizag Municipal Corporation</title>
</head>
<body>
	<h1>Vizag Municipal Corporation</h1>
	<img src="https://upload.wikimedia.org/wikipedia/en/6/6d/GVMC_Logo.png"
		alt="Infinite Computer Solutions Logo" width="200" height="200">
	<br>
	<br>
	<!-- <img src="https://www.hellovizag.in/storage/greater-visakhapatnam-municipal-corporation-1635508497.jpg" alt="Girl in a jacket" width="200" height="200"> -->
	<h3>This is Registration page!!!!</h3>
	<form method="post" action="registration">
		<label> Name:</label> <input type="text" name="Name " /><br>
		<br> <label>Emailid:</label><input type="text" name="Emailid " /><br>
		<br> <label>Password:</label><input type="password"
			name="Password" /><br>
		<br> <label>Confirm Password:</label><input type="password"
			name="Password" /><br>
		<br> <label> Date of Birth: </label><input type="date"
			class="form-control form-control-lg" id="Selectdate"
			placeholder="dd/MM/yyyy" /><br>
		<br> <input type="submit" /><input type="reset" /><br>
	</form>
	</Center>
</body>
</html>