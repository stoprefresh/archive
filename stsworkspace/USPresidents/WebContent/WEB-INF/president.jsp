<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>President</title>
</head>
<body>


	<p>Name: ${president.firstName } ${president.middleName }
		${president.lastName }</p>
	<ul>
		<li>Party: ${president.party }</li>
		<li>Inaugrated: ${president.inaugurationDate }</li>
		<li>Left Office: ${president.dateLeftOffice }</li>
		<li>Because: ${president.reasonLeftOffice }</li>
		<li>Elections won: ${president.electionsWon }</li>
	</ul>
</body>
</html>