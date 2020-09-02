<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/25
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/ano/testRequestBody">
        姓名:<input type="text" name="userMap['one'].username"><br>
        年龄:<input type="text" name="userMap['one'].age"><br>
        生日:<input type="text" name="userMap['one'].birthday"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
