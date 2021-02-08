<%--
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
<h1>Registration</h1>
<a href="logIn.jsp">Log In</a>
<br>
<a href="index.jsp">Index</a>

<form action="registration" method="GET">
    <p>Name:</p>
    <input type="text" name="name">
    <p>Last Name:</p>
    <input type="text" name="lastName">
    <p>Password:</p>
    <input type="text" name="password">

    <input type="submit" value="Submit">
</form>
</body>
</html>
