<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/home?lang=ru">RU</a><br><a href="/home?lang=en">EN</a>
<br><a href="/home?lang=fr">FR</a>

<sp:message code="login.title"/>

<sf:form method="post" action="/home/profile" modelAttribute="userprofile">
    <sp:message code="param.login"/>: <sf:input path="login" type="text"/> <sf:errors path="login"/> <br>
    <sp:message code="param.password"/>: <sf:input path="password" type = "password"/> <sf:errors path="password"/> <br>
    <sp:message code="param.age"/>: <sf:input path="age" type="number"/> <sf:errors path="age"/> <br>
    <input type="submit" value="<sp:message code="param.submit"/>">
</sf:form>

<%--<form method="post" action="/home/profile">--%>
<%--    Login: <input type="text" name="login" value="${login}"> ${loginError}<br>--%>
<%--    Password: <input type="password" name="password" value="${password}"> ${passwordError}<br>--%>
<%--    Age: <input type="number" name="age" value="${age}"> ${ageError}<br>--%>
<%--    <input type="submit" value="Register">--%>

<%--</form>--%>


</body>
</html>
