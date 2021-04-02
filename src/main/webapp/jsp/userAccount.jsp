<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Account</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-light bg-light mb-5">
  <div class="container-fluid">
    <a class="navbar-brand">User Account</a>
    <span class="d-flex"><%=request.getAttribute("user_username") %></span>
  </div>
</nav>
 <div class="container col-md-8 col-md-offset-3" style="overflow: auto;background-color:#F5F8FB;">
 <div class="row mb-3">
   <fieldset>
   	<legend>Employee Listings</legend>
   	<div class="container">
   		<div class="row mb-3">
	   		<div class="col">
	   			<a href="#" class="btn btn-primary">Upload Employee Details</a>
	   		</div>
	   		<div class="col">
	   			<a href="#" class="btn btn-primary">Download Employee Details</a>
	   		</div>
   		</div>
   		<div class="row mb-3">
	   		<table>
	   			<tr>
	   				<th>Employee Code</th>
	   				<th>Employee Name</th>
	   				<th>Location</th>
	   				<th>Email</th>
	   				<th>Date of Birth</th>
	   				<th>Action</th>
	   				
	   			</tr>
	   		</table>
   		</div>
   		<%=request.getAttribute("user_username") %>
   	</div>
   </fieldset>
</div>
 </div>
</body>
</html>