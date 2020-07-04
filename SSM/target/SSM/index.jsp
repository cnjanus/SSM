<%--
  Created by IntelliJ IDEA.
  User: JiadeChen
  Date: 2020/6/10
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<a href="account/findAllAccount">submit</a>

<form action="account/saveAccount" method="post">
    name:<input type="text" name="name"/><br/>
    money:<input type="text" name="money"/><br/>
    <button type="submit">submit</button>
</form>
</body>
</html>
