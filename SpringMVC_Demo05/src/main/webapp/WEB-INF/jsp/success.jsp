<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/30
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>执行成功</h1>
    <c:forEach items="${accounts}" var="account">
        ${account}<br>
    </c:forEach>

</body>
</html>
