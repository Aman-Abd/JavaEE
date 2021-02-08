<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  model.Account: model.Account
  Date: 08.02.2021
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
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
<form action="logIn" method="GET">
    <p>Name:</p>
    <input type="text" name="name">
    <p>Password:</p>
    <input type="text" name="password">

    <input type="submit" value="Submit">
</form>

</body>
</html>
