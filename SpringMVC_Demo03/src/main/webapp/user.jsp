<%--
  Created by IntelliJ IDEA.
  User: 87874
  Date: 2020/8/26
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="application/javascript" src="js/jquery-3.5.1.min.js"></script>
<script>
    $(function () {
        $("#btn").click(function () {
            $.post("${pageContext.request.contextPath}/test/t01",function (data) {
                var html = "";
                for (var i =0; i < data.length; i++){
                    html += "<tr>" +
                        "<td>" + data[i].username +"</td>" +
                        "<td>" + data[i].age +"</td>" +
                        "<td>" + data[i].birthday +"</td>" +
                        "</tr>"
                }
                $("#context").html(html);
            })
        })
    })
</script>
<body>
    <button id="btn">点我呀</button>
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>生日</td>
        </tr>
        <tbody id="context">

        </tbody>
    </table>
</body>
</html>
