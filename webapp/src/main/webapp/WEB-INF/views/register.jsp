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
        <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>注册</title>
		<link href="css/register-styles.css" rel="stylesheet">
    </head>
	<body>
		<div class="register-close">
			<a href="rest/userAdd/mainIndex"> 
				<img src="img/close.png" />
			</a>
		</div>
		<div class="register-logo">
			<img src="img/logo.png"/>
		</div>
		<div class="register-form">
				<div class="form-group">
					<img src="img/phone.png" alt="" />
					<input  type="text" name="username1" id="username1" placeholder="请输入手机号码"  value="${phone}" />
				</div>
				<div class="form-group">
					<img src="img/yanzheng.png" alt="" />
					<input type="text" name="code1" id="code1" placeholder="验证码" />
					<button id="btnSendCode" name="btnSendCode" type="button"
				class="get-code" onclick="sendCode()" value="">获取验证码</button>
				</div>
				<div class="form-group">
					<img src="img/password.png" alt="" />
				<input  type="password"  id ="password1" name="password1" placeholder="请输入密码" />
					
				</div>
				<div class="form-group clear-padding" style="border: none;font-size: 15px;"><span style="margin: auto;text-align:center;color:red">${Syserror}</span></div>
				<div class="form-group clear-padding" style="border: none;font-size: 15px;"><span style="margin: auto;text-align:center;color:red">${error}</span></div>
				<div class="form-group clear-padding" style="border: none; font-size: 15px;"><input readonly style="margin:  auto;text-align:center; color: red" id="error" name="error" value=""></div>
				<div class="form-group-submit">
						<input type="hidden" name="checknum1" id="checknum1" />
						<button onclick="checkNull()" >注册</button>
				</div>
				<div class="form-group-check">
					<span>
						<a href="rest/page/toPassLogin">返回登陆</a>
					</span>
				</div>
			
		</div>
		<div class="register-readme">
			注册代表同意
			<a href="#">《互助修车用户服务协议》</a>
			<script src="js/FJL.min.js"></script>
			<script src="assets/plugins/jquery/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
			<script src="js/FJL.picker.min.js"></script>
			<script src="<%=basePath %>js/regcode.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			function checkNull(){
				var username = document.getElementById("username1").value;
				var password = document.getElementById("password1").value;
				var code = document.getElementById("code1").value;
				var checknum1 = document.getElementById("checknum1").value;
				var error = document.getElementById("error");
				if(username.replace(/^ +| +$/g,'')==''){
					error.value = "手机号码不能为空";
					return;
				}
				if( !(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(username))){
					error.value = "手机号码格式不正确";
					return;
				}
				if(username.length != 11 ||!(/[0-9]\d*/.test(username))){
					error.value = "手机号码有误";
					return;
				}
			  	if(code.replace(/^ +| +$/g,'')=='' || code!=checknum1){
					error.value = "验证码错误";
					return;
				}
				if(password.replace(/^ +| +$/g,'')==''){
					error.value = "密码不能为空";
					return;
				}else{
					window.location.href='rest/userAdd/register_done?username='+username+'&password='+password;
				}
			}
		</script>
	</body>
</html>