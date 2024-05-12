<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<h1>User Registration System</h1>
		<label for="name">Name :</label>
		<input type="text"id="name" name="name"><br>
		<label for="email">Email :</label>
		<input type="email" id="email" name="email"><br>
		<label for="gen">Gender :</label>
			<input type="radio" name="gen" value="male" id="male">
			<label for="male">Male</label>
			<input type="radio" name="gen" value="female" id="female">
			<label for="female">Female</label> <br>
		<label for="loc">Location :</label>
		<input type="text" id="loc" name="loc"><br>
		<label for="stream">Stream :</label>
		<select name="stream">
			<option value="Science">Science</option>
			<option value="Commerce">Commerce</option>
			<option value="Arts">Arts</option>
		</select><br>
		<label for="contact">Contact Number :</label>
		<input type="number"id="contact" name="contact"><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>