<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/27
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h2>使用传统方式上传</h2>
    <form action="${pageContext.request.contextPath}/upload01" method="post" enctype="multipart/form-data">
        请选择上传的文件：<input type="file" name="upload"><br>
        <input type="submit" value="上传">
    </form>
    <hr>
    <h2>使用springmvc方式上传</h2>
    <form action="${pageContext.request.contextPath}/upload02" method="post" enctype="multipart/form-data">
        请选择上传的文件：<input type="file" name="upload"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
