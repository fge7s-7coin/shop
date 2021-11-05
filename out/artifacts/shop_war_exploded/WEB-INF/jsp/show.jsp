<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>商城后台管理</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/login.css">
</head>

<body>
<!-- <div id="aa" style="margin-left:300px;margin-top: 300px;">
        用户名：<input type="text" id="userName" name="userName" ></br>
        密&nbsp;&nbsp;&nbsp;码：<input type="text" id="password" name="password" ></br>
        <button id="dlan" type="button" onclick="dl()">登录</button>

</div> -->

<div id="wrapper" class="login-page">
    <div id="login_form" class="form">
        <!-- <form class="login-form" method="post" id="loginForm"> -->
        <form action="http://localhost:8080/user/login" method="get">
            <h2>登录</h2>
            <input type="text" placeholder="用户名" name="userName" id="user_name" />
            <input type="password" placeholder="密码" name="password" id="password" />
            <!-- <button id="login" onclick="login();">登 录</button> -->
            <button type="submit">登 录</button>
        </form>
    </div>
</body>

<script src="<%=basePath%>static/js/jquery.min.js"></script>
<script type="text/javascript">
    function dl() {
        var userName = document.getElementById("userName").value;
        var password = document.getElementById("password").value;
        $.ajax({
            url:"/user/login",
            type:"GET",
            data:{
                userName:userName,
                password:password
            },
            success:function (result) {
                console.info(result);
                if(result == "fail"){
                    window.location.href="<%=basePath%>webapp/WEB-INF/jsp/show.jsp";
                }else if(result == "success"){
                    window.location.href="/jsp/head";
                }
            }

        });
    }
</script>








<%--   <script src="<%=basePath%>static/js/jquery.min.js"></script> --%>
<!--  <script type="text/javascript">
         function check_login() {
           var inputName = $("#user_name").val();
           var inputPassword = $("#password").val();
           if(inputName == '' || inputName == null) {
                  alert("请输入用户名！");
                  $("#login_form").removeClass('shake_effect');
               setTimeout(function() {
                   $("#login_form").addClass('shake_effect')
               }, 1);
               return false;
           }
           if(inputPassword == '' || inputPassword == null) {
               alert("请输入密码！");
               $("#login_form").removeClass('shake_effect');
               setTimeout(function() {
                   $("#login_form").addClass('shake_effect')
               }, 1);
               return false;
           }
           $.ajax({
               url:"/Maven_project/user/login",
               type:"POST",
               data:$("#loginForm").serialize(),
               success:function (result) {
                   /* if(result.code == 100){
                       alert("登录成功！");
                       $("#user_name").val("");
                       $("#password").val("");
                       window.location.href="/graduate/goods/index";
                   }else {
                       alert(result.extendInfo.login_error);
                       $("#login_form").removeClass('shake_effect');
                       setTimeout(function() {
                           $("#login_form").addClass('shake_effect')
                       }, 1);
                   } */
               }

           });
       }

       $(function() {
           $("#create").click(function() {
               check_register();
               return false;
           })
           $("#login").click(function() {
               check_login();
               return false;
           })
           $('.message a').click(function() {
               $('form').animate({
                   height : 'toggle',
                   opacity : 'toggle'
               }, 'slow');
           });
       })
 </script> -->
</html>
