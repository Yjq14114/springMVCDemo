<%--
  Created by IntelliJ IDEA.
  User: 佳琦
  Date: 2016/4/10
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <link href="<%=basePath%>/css/jquery-ui.css" rel="stylesheet">
    <script src="<%=basePath%>/script/jquery.js"></script>
    <script src="<%=basePath%>/script/jquery-ui.js"></script>
    <title>header</title>
</head>
<body>
</body>
</html>
