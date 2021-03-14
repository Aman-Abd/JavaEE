<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">

</head>
<body>
<ul>
    <li><a href="index.jsp">Index</a></li>
    <li><a href="profile">Profile</a></li>
    <li><a href="login.jsp">Login</a></li>
    <li><a href="logout">Logout</a></li>
    <li><a href="registration.jsp">Registration</a></li>
</ul>

<div class="container">
    <form action="logIn" method="POST">
        <p>Name:</p>
        <input type="text" name="name">
        <p>Password:</p>
        <input type="text" name="password">

        <input type="submit" value="login">
    </form>
</div>

</body>
</html>
