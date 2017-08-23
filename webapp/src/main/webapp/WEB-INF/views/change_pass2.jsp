<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>绑定手机</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<link rel="stylesheet" type="text/css"
	href="css/main_unlogin-styles.css" />
<link rel="stylesheet" type="text/css" href="css/phone.css" />
</head>
<body>
	<div class="main-body">
		<div class="nav">
			<span class="nav-city" onclick="redirectTo('moments.html')"> <a
				href="rest/userInfo/updatePassword"> <img
					src="img/arrow-left.png" /> 返回
			</a>
			</span> <span class="nav-city"> 绑定手机 </span>
		</div>
		<ul class="tel">
			<li>
				<div class="title">新密码</div>
				<div class="content">
					<input name="pass1" id="pass1" type="password" placeholder="请输入新密码" />
				</div>
			</li>
			<li>
				<div class="title">确认密码</div>
				<div class="content">
					<input name="pass2" id="pass2" type="password" placeholder="请再次确认新密码" />
				</div>
			</li>
		</ul>

		<div class="save">
				<button onclick="sub()">下一步</button>
		</div>
	</div>
	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png" />
				<div class="model-title">密码修改成功</div>
				<div class="model-content">密码已修改成功，您需要重新登录</div>
			</div>
			<form action="rest/userInfo/changePassword">
			<div class="model-foot">
				<input type="hidden" name="pass3" id="pass3" /> 
				<button style="background-color: white;color: #4089FF; border: none; font-size: 18px; padding-top: 15.5px;" onclick="hideModel()">重新登陆 </button>
			</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function sub(){
			var pass1 = document.getElementById("pass1").value;
			var pass2 = document.getElementById("pass2").value;
			if(pass1==pass2&&pass1!=""){
				showModel();
				document.getElementById("pass3").value=pass1;
			}else{
				alert("两次密码不一致");
			}
			
		}
		function showModel(){
			var model = document.getElementsByClassName("model")[0];
			document.getElementsByClassName('main-body')[0].style.filter="blur(3px)";
			model.style.display="block";
		}
	</script>
</body>
</html>
