<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/31
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/save">
        用户uid:<input type="text" name="uid"><br>
        用户金额:<input type="text" name="money"><br>
        <input type="submit" src="提交">
    </form>
</body>
</html>
