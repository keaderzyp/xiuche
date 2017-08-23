
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<base href="<%=basePath%>">
		<title>登陆</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="assets/plugins/select2/select2_metro.css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/pages/login-soft.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
	<link href="css/login-styles.css" rel="stylesheet"></head>
	<body>
		<div class="login-close">
			<a href="rest/userAdd/mainIndex"> 
				<img src="img/close.png" />
			</a>
		</div>
		<div class="login-logo">
			<img src="img/logo.png"/>
		</div>
		<div>
		

		
		<form class="login-form" action="rest/user/login" method="post">
<!-- 		<div class="alert alert-danger display-hide">
			<button class="close" data-close="alert"></button>
			<span>
				 输入您的用户名和密码
			</span>
		</div> -->
				<div class="form-group">
					<div class="input-icon">
						<img src="img/phone.png" alt="" />
	
						<input name="username" id="username" type="text" value="michael" placeholder="请输入手机号码" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon">
						<img src="img/password.png" alt="" />
						<input  name="password" id="password" type="password"  value="" placeholder="请输入密码" />
					</div>
				</div>
				<div class="form-group" style="border: none;font-size: 15px;"><span style="margin:10px 50px;color:red">${error}</span></div>
				<div class="form-group-submit">
					<button type="submit">登陆</button>
				</div>
				<div class="form-group-check">
					<span>
						<a href="rest/user/code">验证码登陆</a>
					</span>
					<span>
						<a href="rest/page/toRegister">快速注册</a>
					</span>
				</div>
			</form>
		</div>
		
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="assets/plugins/jquery-validation/jquery.validate.min.js" type="text/javascript"></script>
<script src="assets/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="assets/scripts/app.js" type="text/javascript"></script>
<script src="assets/scripts/login-soft.js" type="text/javascript"></script>

<script src="app/lib/security/sha256.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
		jQuery(document).ready(function() {     
		  App.init();
		  Login.init();
		});
	</script>
<!-- END JAVASCRIPTS -->
		
		</body>
</html>
