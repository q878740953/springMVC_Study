<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/24
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/param/paramTest01">
        请输入用户名：<input type="text" name="username">
        请输入密码：<input type="password" name="password"/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
