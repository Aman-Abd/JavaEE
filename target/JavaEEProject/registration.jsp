<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="link.jsp"/>
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
