<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>商品预约购买平台</title>
<link rel="stylesheet" type="text/css" href="/static/css/login.css">
</head>
<body>
	<div id="wrapper" class="login-page">
		<div id="login_form" class="form">
			<form class="register-form" method="post" id="registerForm">
				<h2>注册</h2>
				<input type="text" placeholder="用户名" name="name" id="r_user_name" />
				<input type="password" placeholder="密码" name="password" id="r_password" />
				<input type="password" placeholder="确认密码" id="r_newpassword" />
				<input type="text" name="phone" placeholder="电话号码">
				<input type="text" name="address" placeholder="地址">
				<button id="create" onclick="login();">创建账户</button>
				<p class="message">
					已经有了一个账户? <a href="#">立刻登录</a>
				</p>
			</form>
			<form class="login-form" method="post" id="loginForm">
				<h2>登录</h2>
				<input type="text" placeholder="用户名" name="username" id="user_name" />
				<input type="password" placeholder="密码" name="password" id="password" />
				<button id="login" onclick="login();">登 录</button>
				<p class="message">
					还没有账户? <a href="#">立刻创建</a> /
					<a href="/graduate/goods/index">游客登录</a>
				</p>
			</form>
		</div>
	</div>

	<script src="/static/js/jquery.min.js"></script>
	<script type="text/javascript">
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
	            url:"/graduate/dologin",
	            type:"POST",
	            data:$("#loginForm").serialize(),
	            success:function (result) {
	                if(result.code == 100){
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
	                }
	            }

	        });
		}
		function check_register() {
			var inputName = $("#r_user_name").val();
			var inputPassword = $("#r_password").val();
			var inputNewPassword = $("#r_newpassword").val();
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
			if(inputPassword != inputNewPassword) {
			    alert("输入的两次密码不同，请重新输入！");
			    $("#login_form").removeClass('shake_effect');
				setTimeout(function() {
					$("#login_form").addClass('shake_effect')
				}, 1);
			    return false;
			}
			$.ajax({
			    url:"/graduate/doRegister",
			    type:"POST",
			    data:$("#registerForm").serialize(),
			    success:function (result) {
			    	if(result.code == 100){
			    		alert("注册成功");
			    		window.location.href="/graduate/goods/index";
			        }else {
			            alert(result.extendInfo.register_error);
			        }
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
	</script>
</body>
</html>