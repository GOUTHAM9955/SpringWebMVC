<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration Success</title>
</head>
<body>
    <center>
        <h1 style="color: green;">Employee Registered Successfully!</h1>
        <table border="1" cellpadding="10">
            <tr>
                <th>Employee ID</th>
                <td>${employee.eId}</td>
            </tr>
            <tr>
                <th>Employee Name</th>
                <td>${employee.eName}</td>
            </tr>
            <tr>
                <th>Employee City</th>
                <td>${employee.eCity}</td>
            </tr>
        </table>
        <br>
        <a href="register.jsp">Go Back to Registration</a>
    </center>
</body>
</html>