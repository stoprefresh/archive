<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Text Conversion</title>
</head>
<body>
  <h3>Translate Text</h3>
  <form action="translate.do" method="GET">
 	Phrase:
 	<input type="text" name="phrase"/>
 	<input type="submit" value="Convert Text" />
 </form>
</body>
</html>