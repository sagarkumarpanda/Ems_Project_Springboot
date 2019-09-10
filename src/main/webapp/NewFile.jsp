<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<h1>Add Employee</h1>

<form action="employee" method="post">
Enter Name <input type="text" name="empName">
Enter Age<input type="text" name="age">
<input type="submit" value="submit">
</form>
<br>
<br>
<h1>Delete</h1>

<form action="deleteemployee" method="post">
Enter EmpId <input type="text" name="empId">
<input type="submit" value="submit">
</form>

<br>
<br>
<h1> Find Employee </h1>

<form action="getoneemployee" method="post">
Enter EmpId<input type="text" name="empId">
<input type="submit" value="submit">
</form>
<br>
<br>
<h1> Update Employee </h1>

<form action="update" method="post">
Enter EmpId<input type="text" name="empId">
Enter Name <input type="text" name="empName">
Enter Age<input type="text" name="age">
<input type="submit" value="submit">
</form>
<br>
<br>
<h1>Show All</h1>

<form action="getallemployee" method="post">
<input type="submit" value="submit">
</form>
<br>
<br>
<h1> Find Employee By Name </h1>

<form action="getoneemployeebyname" method="post">
Enter Employee name<input type="text" name="empName">
<input type="submit" value="submit">
</form>
</body>
</html>