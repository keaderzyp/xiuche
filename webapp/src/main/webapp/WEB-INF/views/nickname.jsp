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
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>修改昵称</title>
		<link rel="stylesheet" type="text/css" href="css/main_unlogin-styles.css"/>
		<link rel="stylesheet" type="text/css" href="css/nickname.css"/>
        <title></title>
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
				修改昵称
			</span>
		</div>
		<div class="nickname">
		<form action="rest/userInfo/savePetName" method="post">
			<input type="text" name="petName" id="petName" />
			<span class="alert">
				${error==null?"支持英文字母及汉字，限3-16位字符":error}
			</span>
			<button type="submit">
				保存
			</button>
		</form>	
		</div>
	</body>
	
</html>