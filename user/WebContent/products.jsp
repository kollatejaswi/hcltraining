<%@page import="java.util.ArrayList"%>
<%@page import="com.hcl.domain.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0px;
	box-sizing: border-box;
}

.navbar {
	width: 100%;
	background-color: #cccccc;
}

.nav-items {
	display: inline-block;
}

.nav-item {
	display: inline-block;
	width: 130px;
}

.nav-item a {
	text-decoration: none;
	color: black;
	font-family: cursive;
	font-weight: bold;
}

.loginmodal {
	position: fixed;
	width: 200px;
	top: 30%;
	left: 40%;
	display: none;
}

.signupmodal {
	position: fixed;
	width: 400px;
	top: 30%;
	left: 40%;
	display: none;
}

.visible {
	display: block;
}

.products {
	width: 100%;
	margin: 2rem 1rem;
}

.product {
	width: 20%;
	padding: 16px;
	text-align: center;
	box-shadow: 0 2px 8px #cccccc;
	display: inline-block
}

.title {
	color: #ffffff;
	background-color: black;
	display: inline;
}

button:focus {
	outline: none;
}

.btn__actions a {
	text-decoration: none;
	padding: 8px;
	display: inline-block;
	border-radius: 8px;
}

.btn__actions .add {
	border: 1px solid blue;
	background-color: red;
	color: black;
}

.btn__actions .edit, .btn__actions .delete {
	border: 1px solid blue;
	background-color: blue;
	color: white;
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<c:choose>
		<c:when test="${sessionScope.user!=null}">
			<div class="container">
				<h1 class="title">Products</h1>
				<section class="products">
					<%
						List<Product> products = (List<Product>) session.getAttribute("product");
					%>
					<%
						for (Product product : products) {
					%>
					<article class="product">
						<div class="product__img">
							<img width="100px" height="100px"
								alt="<%=product.getProductname()%>"
								src="<%=product.getImageurl()%>">
						</div>
						<h2 class="product__title"><%=product.getProductname()%></h2>
						<p class="prouct__description"><%=product.getDescription()%></p>
						<h3 class="product__price">
							$<%=product.getPrice()%></h3>
						<div class="btn__actions">
							<c:if test="${sessionScope.user.designation == 'customer'}"><a href="#" class="add">Add To Cart</a></c:if> 
							<c:if test="${sessionScope.user.designation == 'manager'}"><a href="add?id=<%=product.getProductid()%>&btnName=edit" class="edit">Edit</a></c:if>
							<c:if test="${sessionScope.user.designation == 'manager'}"><a href="add?id=<%=product.getProductid()%>&btnName=delete" class="delete">Delete</a></c:if>
						</div>
					</article>
					<%
						}
					%>
				</section>
			</div>
		</c:when>
		<c:otherwise>
			<jsp:forward page="index.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>
</body>
</html>