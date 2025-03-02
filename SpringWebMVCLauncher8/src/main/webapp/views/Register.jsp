<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration Form</title>
</head>
<body>
    <h2>Employee Registration Form</h2>
    
    <form:form action="submitEmployeeRegistration" method="post" modelAttribute="employee">
        <label for="eId">Employee ID:</label>
        <form:input path="eId"/>
        <br><br>

        <label for="eName">Employee Name:</label>
        <form:input path="eName"/>
        <br><br>

        <label for="eCity">Employee City:</label>
        <form:input path="eCity"/>
        <br><br>

        <input type="submit" value="Submit">
    </form:form>

</body>
</html>