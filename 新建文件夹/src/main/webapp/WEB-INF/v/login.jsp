<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-09
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="account" id="uname"/><br/>
    密码：<input type="password" name="pwd" id="upwd"/><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
