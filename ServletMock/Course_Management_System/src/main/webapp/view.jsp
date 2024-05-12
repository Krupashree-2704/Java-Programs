<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="./Course_Management_System/src/main/webapp/style.css">

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
          <a class="nav-link active" aria-current="page" href="add.jsp">Add Course</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="view.jsp">View Course</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<h4>Course Management</h4>
<div class="container">
<table class="table">
  <thead style="color: white;">
    <tr bgcolor="#120671">
      <th scope="col">Sr No |</th>
      <th scope="col">Name|</th>
      <th scope="col">Category |</th>
      <th scope="col">Duration |</th>
      <th scope="col">Fee |</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <div class="red"></div>
  <tbody>
      <tr bgcolor="#bffef4">
      <td scope="col">1         |</td>
      <td scope="col">Java   |</td>
      <td scope="col">Computer   |</td>
      <td scope="col">5 Month   |</td>
      <td scope="col">|   20000</td>
      <td scope="col">
        <a href="#">Delete</a>
        <a href="#">View</a>
        <a href="#">Edit</a>
      </td>
    </tr>
</body>
</html>