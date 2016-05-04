<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="../../js/jquery-1.9.1.min.js"></script>
    <title>Insert title here</title>
    <script>
        $( document ).ready(function() {
            $("a").attr("href","http://www.qq.com");
        });
    </script>
</head>
<body>
<%--<form:form modelAttribute="accountmodel" method="post">--%>
    <%--用户名：<form:input path="username"/><br/>--%>
    <%--密 码：<form:password path="password"/><br/>--%>
    <%--<input type="button" id="submit" value="Submit" />--%>
<%--</form:form>--%>
<a href="http://www.baidu.com">百度</a>

</body>
</html>