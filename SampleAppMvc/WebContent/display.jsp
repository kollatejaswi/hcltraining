<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import=" com.hcl.domain.Emp" %>
    <%@page import="  java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<% List <Emp> emp =(List<Emp>)request.getAttribute("employee");
for(Emp e:emp)
{
%>
<tr>
<td><%=e.getEno() %></td><td><%=e.getName() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>