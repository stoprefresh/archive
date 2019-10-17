<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>States</title>
</head>
<body>
<h2>Here are your results!</h2>
<br>
  <c:choose>
    <c:when test="${! empty state}">
      <ul>
        <li><strong>Abbrev:</strong> ${state.abbreviation}</li>
        <li><strong>Name:</strong> ${state.name}</li>
        <li><strong>Capital:</strong> ${state.capital}</li>
        <li><strong>Population:</strong> ${state.population }</li>
        <li><strong>Google Maps: </strong><a href="http://maps.google.com/?q=${state.latitude},${state.longitude}">${state.capital}</a></li>  
      </ul>
    </c:when>
    <c:otherwise> 
      <p>No state found</p>
    </c:otherwise>
  </c:choose>
</body>
</html>