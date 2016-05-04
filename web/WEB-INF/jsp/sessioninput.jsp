<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/4
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="sessionaccountmodel" method="post">
        用户名：<form:input path="username"/><br/>
        密码：<form:input path="password"/><br/>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
