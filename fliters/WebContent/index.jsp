<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="hello" method="post">
<label> username: </label>     
<input type="text" name="name" id="uname"/> <br> <br>  
<label> password: </label>         
<input type="password" name="pass" id="pass"/> <br> <br>  
<input type="submit" id="signup" value="Login"> <br> <br>  
<input type="button" value="cancle"/> 
</form>
<h1>${requestScope.msg}</h1>
</body>
</html>