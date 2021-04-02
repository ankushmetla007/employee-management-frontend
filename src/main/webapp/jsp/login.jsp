<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
 <div class="container col-md-8 col-md-offset-3" style="overflow: auto;background-color:#F5F8FB;">
 <div class="row mb-3" style="background-color:#EBF1F7">
  <h1 class="mt-5 mb-4" style="color:#0F428B;">Login</h1>
  </div>
    <div class="row mb-3">
  <span class="text-danger"><%= (request.getAttribute("message")==null)?" ":request.getAttribute("message") %></span>
  </div>
   <div class="row">
  <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post" style="background-color:#F5F8FB;">
   <div class="row mb-3">
    <form:label path="username" class="col-sm-2 col-form-label">User Name:</form:label>
    <div class="col-sm-8 offset-sm-1">
    	<form:input path="username" id="username" name="username"/>
   <!-- <form:errors path="username" cssStyle="color: #ff0000;"/>-->
    </div>
   </div>
   <div class="row mb-3">
    <form:label path="password" class="col-sm-2 col-form-label">Password:</form:label>
    <div class="col-sm-8 offset-sm-1">
    	<form:password id="password" path="password" name="password"/>
     <!-- 	<form:errors path="password" cssStyle="color: #ff0000;"/> -->
    </div>
   </div>
   <div class="row pt-3 pb-3" style="background-color:#EBF1F7">
	   <div class="col offset-sm-10">
	   		<form:button id="login" name="login" class="btn btn-primary">Submit</form:button>
	   </div>
   </div>
  </form:form>
  </div>
 </div>
</body>
</html>