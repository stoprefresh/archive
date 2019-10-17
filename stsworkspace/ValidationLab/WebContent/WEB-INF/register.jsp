<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Add a form to register.jsp using the @taglib directive's form tags. (Don't forget to add the @taglib directive to the JSP page.) 
The form will POST to register.do. Use errors tags to highlight incorrect input.

Remember, when displaying a Spring form, there must be an object in the model for the form to use. -->

<!-- TODO: Add the @taglib for form -->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<!-- TODO: Add registration form -->
	<form:form action="register.do" method="POST" modelAttribute="user"/>
</body>
</html>