<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Translated</title>
</head>
<body>
 <c:choose>
   <c:when test="${! empty translation}">
     <c:out value="${translation }"/>
   </c:when>
   <c:otherwise>
     <p>Unable to translate</p>
   </c:otherwise>
 </c:choose>
</body>
</html>