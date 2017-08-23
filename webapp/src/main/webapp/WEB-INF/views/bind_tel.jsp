<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <base href="<%=basePath%>">
		<title>绑定手机</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="css/main_unlogin-styles.css"/>
		<link rel="stylesheet" type="text/css" href="css/phone.css"/>
    </head>
	<body>
		<div class="nav">
			<span class="nav-city" onclick="redirectTo('moments.html')">
				<a href="rest/userInfo/toUserInfo">
					<img src="img/arrow-left.png"/>
					返回
				</a>
			</span>
			<span class="nav-city">
				绑定手机
			</span>
		</div>
		
		<ul class="tel">
			<li>
				<div class="title">
					手机号
				</div>
				<div class="content">
					<input type="text" name="username1" id="username1"/>
						<input id="btnSendCode" name="btnSendCode" type="button"
				class="yanzhengma" onclick="sendCode()" value="获取验证码">
				</div>
			</li>
			<li>
				<div class="title">
					验证码
				</div>
				<div class="content">
					<input type="text" name="checknum" id="checknum"/>
				</div>
			</li>
			<li>
		<div class="content" style="border: none; font-size: 15px;">
			<input style="margin: 10px 50px; color: red" id="error" name="error"
				value="">
		</div>
		</ul>
		<div class="save">
		<input type="hidden" name="checknum1" id="checknum1" />
			<button  onclick="sub()">
				绑定手机
			</button>
		</div>
	</body>
	<script src="assets/plugins/jquery/jquery-1.11.1.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.js"
		type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>js/regcode.js" type="text/javascript" charset="utf-8"></script>
	
	<script type="text/javascript">
	function sub() {
		var phone = document.getElementById("username1").value;
		var code1 =document.getElementById("checknum1").value;
		var code2 =document.getElementById("checknum").value;
		if(code1==code2&&code1!=""){
			window.location.href='rest/userInfo/saveTelphone?telphone='+phone;
		}else{
			document.getElementById("error").value ="验证码错误";
		}
	}
	</script>
</html>