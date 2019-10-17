<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock List</title>
</head>
<body>
	<div class="container">
		<%-- Iterate through the Stocks and print all data in a table row. --%>
		<table>

			<c:choose>
				<c:when test="${not empty stocks }">
					<c:forEach var="s" items="${stocks }">
						<tr>
							<td>${s.symbol }</td>
							<td>${s.name }</td>
							<td><fmt:formatNumber type="currency" value="${s.price }" /></td>
						</tr>
					</c:forEach>
				</c:when>

				<c:when test="${not empty searched }">
					<p>
						You searched for:
					<p>
						<br>
						<c:forEach var="smb" items="${searched }">
							<tr>
								<td>${smb.symbol }</td>
								<td>${smb.name }</td>
								<td><fmt:formatNumber type="currency" value="${smb.price }" /></td>
							</tr>
						</c:forEach>
				</c:when>

				<c:otherwise>
					<p>No results found!</p>
				</c:otherwise>
				
			</c:choose>
		</table>


		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back
				to Home</a>
		</p>
	</div>
</body>
</html>