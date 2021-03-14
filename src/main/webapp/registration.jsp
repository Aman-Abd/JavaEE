<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">

</head>
<body>
<%--(Hidden Form Field, URL Rewriting, HttpSession)--%>
<ul>
    <li><a href="index.jsp">Index</a></li>
    <li><a href="profile">Profile</a></li>
    <li><a href="login.jsp">Login</a></li>
    <li><a href="logout">Logout</a></li>
    <li><a href="registration.jsp">Registration</a></li>
</ul>

<div class="container">
    <form action="registration" method="GET">
        <p>Name:</p>
        <input type="text" name="name">
        <p>Last Name:</p>
        <input type="text" name="lastName">
        <p>Password:</p>
        <input type="text" name="password">
        <p>Money:</p>
        <input type="number" name="money">
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
