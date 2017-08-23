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
	<div class="nav">
		<span class="nav-city" onclick="redirectTo('moments.html')"> <a
			href="rest/user/gotoMainDeal"> <img src="img/arrow-left.png" />
				返回
		</a>
		</span> <span class="nav-city"> 绑定手机 </span>
	</div>
	<ul class="tel">
		<li>
			<div class="title">手机号</div>
			<div class="content">
				<c:set var="str" value="${user.username}"></c:set>
			  <!-- 将手机号截取，中间四位用****代替 -->
				<input type="text"
					value="${fn:substring(str, 0, 3)}****${fn:substring(str, 7, 11)}" />
				<!-- <button class="yanzhengma " onclick="sendCode()">获取验证码</button> -->
					<input id="btnSendCode" name="btnSendCode" type="button"
				class="yanzhengma" onclick="sendCode()" value="获取验证码">
			</div>
		</li>
		<li>
			<div class="title">验证码</div>
			<div class="content">
				<input type="text" name="code1" id="code1"/>
				
			</div>
		</li>
		<li>
		<div class="content" style="border: none; font-size: 15px;">
			<input style="margin: 10px 50px; color: red" id="error" name="error"
				value="">
		</div>
		</li>
	</ul>
	
	<div class="save">
			<input type="hidden" name="username1" id="username1" value="${user.username}"/> 
			<input type="hidden" name="code2" id="code2" />
			<button onclick="sub()">下一步</button>
	</div>
	
</body>
<script src="assets/plugins/jquery/jquery-1.11.1.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="<%=basePath %>js/code.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
function sub() {
	var code1 =document.getElementById("code1").value;
	var code2 =document.getElementById("code2").value;
	if(code1==code2&&code1!=""){
		window.location.href='rest/userInfo/updatePassword2';
	}else{
		document.getElementById("error").value="验证码错误";
	}
}
</script>
</html>
