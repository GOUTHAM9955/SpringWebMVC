<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
</head>
<body>
    <h2>Employee Registration Form</h2>
    <form action="submitEmployeeRegistration" method="post">
        <label for="eId">Employee ID:</label>
        <input type="text" id="eId" name="eId" required>
        <br><br>

        <label for="eName">Employee Name:</label>
        <input type="text" id="eName" name="eName" required>
        <br><br>

        <label for="eCity">Employee City:</label>
        <input type="text" id="eCity" name="eCity" required>
        <br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>