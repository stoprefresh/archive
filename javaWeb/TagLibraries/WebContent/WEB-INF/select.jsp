<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock</title>
</head>
<body>
	<div class="container">
		
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