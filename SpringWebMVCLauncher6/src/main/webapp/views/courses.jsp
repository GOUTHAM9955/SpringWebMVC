<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Here are the courses GK!</title>
</head>
<body>
<center>
<h1 style='color:Blue; text-align:center'>Please find the course details here</h1>


<c:forEach var="course" items="${courses}">
    ${course}
</c:forEach>
</center>
</body>
</html>