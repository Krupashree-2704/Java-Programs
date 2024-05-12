<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">AccessWay-Computer Education</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Add Course</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">View Course</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
	<div style="    width: 50%;
    align-items: center!important;
    border: 2px solid black;
    margin: auto;
    margin-top: 9%;
    background: #e8f4ff">
		<h1 style="text-align: center; color:blue; padding-bottom: 18px;">Course Management System</h1>
		<label for="cname">Course Name:</label>
		<input type="text" name="cname" id="cname"><br>
		<label for="ctime">Course Duration:</label>
		<input type="text" name="ctime" id="ctime"><br>
		<label for="ctype">Category:</label>
		<select name="ctype" id="ctype"> 
        <option value="none" selected disabled hidden>Select an Option</option> 
        <option value="free">Free</option> 
        <option value="starter">Starter </option> 
        <option value="professional">Professional</option> 
        <option value="corporate">Corporate</option> 
   	    </select> <br>
		<label for="cfees">Course Fees:</label>
		<input type="text" name="cfees" id="cfees"><br>
		<input type="submit" value="Add Course" style="    align-items: center;
    margin: 10px 10px 10px 260px;
    background: aquamarine;
    border-radius: 15px;
    padding: 7px;">
	</div>
</body>
</html>