<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock</title>
</head>
<body>
	<div class="container">

		<c:choose>
			<c:when test="${stock.price > 75 }">
				<strong>${stock.name }</strong>
			</c:when>
			<c:when test="${stock.price < 35 }">
				<em>${stock.name }</em>
			</c:when>
			<c:otherwise>
			${stock.name }
		    </c:otherwise>
		</c:choose>
		
		
		
		

		${stock.name}
		<ul>
			<li>${stock.symbol }</li>
			<li>${stock.price }</li>
		</ul>

		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back to Home</a>
		</p>
	</div>
</body>
</html>