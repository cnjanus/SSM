<%--
  Created by IntelliJ IDEA.
  User: JiadeChen
  Date: 2020/6/10
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>

<c:forEach items="${requestScope.accountList}" var="account">
    ${account}<br/>
</c:forEach>

</body>
</html>
