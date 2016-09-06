<%--
  Created by IntelliJ IDEA.
  User: 佳琦
  Date: 2016/4/10
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header.jsp"%>
<%

%>
<html>
<head>
    <style type="text/css">
        div#register {position: absolute;width:400px;height:200px;left:50%;top:50%;
            margin-left:-200px;margin-top:-100px;border:1px solid rgba(0, 0, 255, 0)
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#username").blur(function(){
                var regex = /^([a-z]|[A-Z]|[0-9]){0,7}$/;

                if(!regex.test($("#username").val())) {
                    $("p#p").show(100);
                }else{
                    $("p#p").hide(100);
                }
                $.post("<%=basePath%>user/check",{username:""+$("#username").val()+""},function(data){
                        if(data=="usersame"){
                            alert("该用户已被注册");
                        }
                });
            });
            $("input#repeat").blur(function(){
                var password = $("input#password").val();
                var repeat = $("input#repeat").val();
                if(password!=repeat){
                    $("p#re").show(100);
                }else{
                    $("p#re").hide(100);
                }
            });

        });
    </script>
    <title>register</title>
</head>
<body>
    <div id="register">
        <form name="" id="" action="<%=basePath%>/user" method="post">
            <table>
                <tr>
                    <td>用户名:&nbsp;
                        <input type="text" id="username"/>
                    </td>
                    <td><p id="p" style="display: none;font-size:small">用户名必须是字母或者数字</p></td>
                </tr>
                <tr>
                    <td>密码:&nbsp;&nbsp;<input type="password" id="password"/></td>
                </tr>
                <tr>
                    <td>确认密码:<input type="password" id="repeat"/></td>
                    <td><p id="re" style="display: none;font-size: small">密码不一致</p></td>
                </tr>
                <tr>
                    <td>邮箱:&nbsp;&nbsp;<input type="email"/></td>
                </tr>
                <tr>
                   <td>验证码:&nbsp;<input type="text"/><input type="image"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="注册"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
