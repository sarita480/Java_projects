<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2>${errMsg}</h2>
<form method="post">
<input type="text" name="userId" placeholder="UserId" /><br>
<input type="text" name="password" placeholder="password" /><br><br>
<button> Submit</button>
</form>
</body>
</html>