<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="link.jsp"/>
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
