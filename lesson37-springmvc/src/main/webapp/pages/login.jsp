<%--
  Created by IntelliJ IDEA.
  User: sergey
  Date: 2.07.25
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/home/profile">
    Login: <input type="text" name="login" value="${login}"> ${loginError}<br>
    Password: <input type="password" name="password" value="${password}"> ${passwordError}<br>
    Age: <input type="number" name="age" value="${age}"> ${ageError}<br>
    <input type="submit" value="Register">

</form>


</body>
</html>
