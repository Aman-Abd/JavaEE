<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Registration</h1>
<a href="login.jsp">Log In</a>
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
