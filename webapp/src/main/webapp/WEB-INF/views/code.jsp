<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript">
	function browserRedirect() {
        var sUserAgent = navigator.userAgent.toLowerCase();
        var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
        var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
        var bIsMidp = sUserAgent.match(/midp/i) == "midp";
        var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
        var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
        var bIsAndroid = sUserAgent.match(/android/i) == "android";
        var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
        var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
        if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
            
        } else {
            location.href="<%=basePath%>rest/pc/index";
        }
    }

    browserRedirect();
	</script>
<base href="<%=basePath%>">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>验证码登陆</title>
<link href="css/code-styles.css" rel="stylesheet">
</head>
<body>
	<div class="code-close">
		<a href="rest/userAdd/mainIndex"> <img src="img/close.png" />
		</a>
	</div>
	<div class="code-logo">
		<img src="img/logo.png" />
	</div>
	<div class="code-form">
		<div class="form-group">
			<img src="img/phone.png" alt="" /> <input type="text"
				name="username1" id="username1" placeholder="请输入手机号码" />
		</div>
		<div class="form-group">
			<img src="img/yanzheng.png" alt="" /> <input type="text"
				name="code1" id="code1" placeholder="验证码" />
			<!-- 		<button class="get-code" onclick="sendCode()">获取验证码</button> -->
			<button id="btnSendCode" name="btnSendCode" type="button"
				class="get-code" onclick="sendCode()" >获取验证码</button>
		</div>

		<div class="form-group clear-padding" style="border: none; font-size: 15px;">
			<span style="margin: auto;text-align:center; color: red">${error}</span>
		</div>
		<div class="form-group clear-padding" style="border: none; font-size: 15px;">
			<input readonly style="margin: auto; text-align:center;color: red" id="error" name="error"
				value="">
		</div>
		<form action="rest/user/codeLogin" name="codeForm" method="post">
			<div class="form-group-submit">
				<input type="hidden" name="username" id="username" />
				<input type="hidden" name="code" id="code" /> 
				<input type="hidden" name="code2" id="code2" />
				<button type="button" onclick="sub()">登录</button>
			</div>
		</form>
		<div class="form-group-check">
			<span> <a href="rest/page/toPassLogin">密码登陆</a>
			</span> <span> <a href="rest/page/toRegister">快速注册</a>
			</span>
		</div>
	</div>
	<script src="assets/plugins/jquery/jquery-1.11.1.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="<%=basePath %>js/verifycode.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
	
	function sub() {
		var username = document.getElementById("username").value = document.getElementById("username1").value;
		var codename = document.getElementById("code").value = document.getElementById("code1").value;
		var error = document.getElementById("error");
		
		if(username.replace(/^ +| +$/g,'')==''){
			error.value = "手机号码不能为空";
			return;
		}
		if(!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(username))){
			error.value = "手机号码格式不正确";
			return;
		}
		if(username.length != 11 || !(/[0-9]\d*/.test(username))){
			error.value = "手机号码有误";
			return;
		}
		if(codename.replace(/^ +| +$/g,'')==''){
			error.value = "验证码不能为空";
			return;
		}
		document.codeForm.submit();
	}
	</script>
</body>
</html>