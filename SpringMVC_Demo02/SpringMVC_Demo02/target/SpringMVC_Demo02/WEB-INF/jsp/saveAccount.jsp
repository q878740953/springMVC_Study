<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/24
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/param/saveAccount">
        id:<input type="text" name="id"><br>
        uid:<input type="text" name="uid"><br>
        money:<input type="text" name="money"><br>
        <h3>使用set集合封装</h3>
        姓名:<input type="text" name="users[0].username"><br>
        年龄:<input type="text" name="users[0].age"><br>
        生日:<input type="text" name="users[0].birthday"><br>
        <h3>使用map集合封装</h3>
        姓名:<input type="text" name="userMap['one'].username"><br>
        年龄:<input type="text" name="userMap['one'].age"><br>
        生日:<input type="text" name="userMap['one'].birthday"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
