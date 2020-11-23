<%--
  Created by IntelliJ IDEA.
  User: Tanoty
  Date: 2020/11/22
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<link id="index_link" rel="stylesheet" type="text/css" href="css/register.css">
<body>
<div class="div_1">
    <form action="http://localhost:8080/LoginWeb_war_exploded/RegisterServlet" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td><span style="letter-spacing: 16px">密</span>码:</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
        <button type="submit" class="button_1">提交</button>
    </form>
</div>
</body>
</html>
