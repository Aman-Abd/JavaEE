<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login</h1>
<a href="registration.jsp">Registration</a>
<br>
<a href="index.jsp">Index</a>
<form action="logIn" method="POST">
    <p>Name:</p>
    <input type="text" name="name">
    <p>Password:</p>
    <input type="text" name="password">

    <input type="submit" value="login">
</form>

</body>
</html>
