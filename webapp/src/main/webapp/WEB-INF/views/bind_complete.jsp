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
        <meta charset="UTF-8">
		<title>绑定手机</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="css/main_unlogin-styles.css"/>
		<link rel="stylesheet" type="text/css" href="css/phone.css"/>
		<style type="text/css">
			body{
				background-color: #FFFFFF;
			}
			.nav:after{display: none;}
		</style>
    </head>
	<body>
		<div class="nav">
			<span class="nav-city">
				<a href="rest/user/gotoMainDeal">
					<img src="img/arrow-left.png"/>
					返回
				</a>
			</span>
			<span class="nav-city">
				绑定手机
			</span>
			<span class="nav-city">
				<a href="rest/user/gotoMainDeal">
					确认
				</a>
			</span>
		</div>
		<div class="phone-info">
			<img src="img/phone1.png"/>
			<span>
				绑定的手机号：${user.telphone}
			</span>
		</div>
		<div class="save">
			<a href="rest/userInfo/toBindtel">
				<button>
					更换绑定手机
				</button>
			</a>
		</div>
	</body>
</html>