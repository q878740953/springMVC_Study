<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/26
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/test/ajax", {"username": "哈哈", "age": "12"}, function (data) {

                })
            })
        })
    </script>
</head>
<body>
    <button id="btn">我是按钮</button>
</body>
</html>
