<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
   <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/login.css"/>"/> 
    <sb:head/>
<body>
	<div class="container login-container">
	<form action="index" class="login-form">
	<div class="input-group">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
			    <input id="email" type="text" class="form-control" name="email" placeholder="Email" required="required">
			  </div>
			  <div class="input-group pass-box">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
			    <input id="password" type="password" class="form-control" name="password" placeholder="Password" required="required">
			  </div>
			  <button type="submit" class="login-btn">Sing in</button>
			</form>
			<div class="big-text-box">
			<div class="fisrt-box">
			Struts &
			</div>
			<div class="secon-box">
			Hibernate
			</div>
			</div>
	</div>
</body>
</html>