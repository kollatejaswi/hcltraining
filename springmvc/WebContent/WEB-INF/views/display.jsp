<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1><center>EMPLOYEE DETAILS</center></h1>
<center>
<table border="1">
<th>eno</th>
<th>name</th>
<th>action</th>
<c:forEach var="e" items="${emp}" >
<tr>
<td>${e.eno}</td>
<td>${e.name}</td>
<td><a href="#">edit</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="#">delete</a></td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>