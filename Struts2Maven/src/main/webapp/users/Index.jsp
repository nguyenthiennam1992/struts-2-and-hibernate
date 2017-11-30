<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
   <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/login.css"/>"/> 
    <sb:head/>
    <title>Demo</title>
<body>
<div class="container" style="padding-top:20%;">
	<form action="saveOrUpdateUser">
	<s:push value="user">
	<div class="col-xs-4" style="margin-right: 10%;">
	<div class="form-group">
	<input type="text" class="form-control" placeholder="Name" name="name">
	</div>
	<div class="form-group">
	<input type="email" class="form-control" placeholder="email" name="email">
	</div>
	<div class="form-group">
	<input type="password" class="form-control" placeholder="password" name="password">
	</div>
	</div>
	<s:submit/>
	</s:push>
	</form>
	
	
	<table class="table" cellpadding="5px" style="color: #003366;">
	<thead>
		<tr class="even">
		<th>id</th>
		<th>name</th>
		<th>user name</th>
		<th>password</th>
		<th>email</th>
		</tr>
		</thead>
		<tbody>
		<s:iterator value="userList" status="userStatus">
		<tr
		class="<s:if test="#userStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
		<td><s:property value="id" /></td>
		<td><s:property value="name" /></td>
		<td><s:property value="username" /></td>
		<td><s:property value="password" /></td>
		<td><s:property value="email" /></td>
		
		</tr>
		</s:iterator>
		</tbody>
		</table>
		</div>
</body>
</html>