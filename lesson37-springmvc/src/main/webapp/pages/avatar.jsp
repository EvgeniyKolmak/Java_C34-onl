<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<sp:message code="login.avatar"/>
<form action="/avatar" method="post" enctype="multipart/form-data">

  <input type="file" name="logo"><br>

  <input type="submit" value="Upload">

</form>

</body>
</html>
