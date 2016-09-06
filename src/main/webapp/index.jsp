<%--
  Created by IntelliJ IDEA.
  User: 佳琦
  Date: 2016/4/2
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header.jsp"%>
<html>
  <head>
      <script type="text/javascript">
        $(function(){
            $("#b01").click(function(){
                <%--$.post("<%=basePath%>user/getPerson",{name:"Michael"},function(data){--%>
                    <%--var json = eval('('+data+')');--%>
                    <%--alert(json.msg);--%>
                <%--});--%>
                window.location.href("<%=basePath%>user/jsonPage");
            });
        });
      </script>
      <style type="text/css">
          div#container {position: absolute;width:400px;height:200px;left:50%;top:50%;
              margin-left:-200px;margin-top:-100px;border:1px solid rgba(0, 0, 255, 0)
          }
          div#header {background-color:#99bbbb;}
          div#menu {background-color:#ffff99; height:200px; width:100px; float:left;}
          div#content {background-color:#EEEEEE; height:200px; width:400px; float:left;}
          div#footer {background-color:#99bbbb; clear:both; text-align:center;}
          h1 {margin-bottom:0;}
          h2 {margin-bottom:0; font-size:14px;}
          ul {margin:0;}
          li {list-style:none;}
      </style>
    <title></title>
  </head>
  <body>
        <div id="container">

            <div id="header">
                <h1>Main Title of Web Page</h1>
            </div>

            <div id="menu">
                <h2>Menu</h2>
                <ul>
                    <li>HTML</li>
                    <li>CSS</li>
                    <li>JavaScript</li>
                </ul>
            </div>

            <div id="content">Content goes here</div>

            <div id="footer">Copyright W3School.com.cn</div>
            <input type="submit" id="b01" value="提交"/>
        </div>
        <div align="right"><a href="#">登录</a>&nbsp;&nbsp;<a href="jsp/register.jsp">注册</a></div>
  </body>
</html>
