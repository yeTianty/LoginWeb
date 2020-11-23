<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanoty
  Date: 2020/11/22
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<link id="index_link" rel="stylesheet" type="text/css" href="css/index.css">
<body>
<div class="div_1">
    <p><a href="login.jsp">登录账号</a></p>
    <p><a href="register.jsp">注册账号</a></p>
    <a>${name}</a>
</div>
</body>
</html>
