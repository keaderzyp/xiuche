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
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>快速了解1</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<link href="css/login-styles.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/quick_learn.css" />
</head>
<div class="login-close">
	<a href="javascript:history.back();"> <img src="img/close.png" />
	</a>
</div>
<div class="main-logo">
	<img class="logo-1" src="img/quick_learn-1.png" alt="" /> <span>请选择为您的爱车买保险的方式</span>
</div>

<a href="rest/page/quick_learn-2-1?isGo=${isGo}">
	<button class="btn btn-info">老司机！只购买交强险+第三者责任险！</button>
</a>
<a href="rest/page/quick_learn-2-2?isGo=${isGo}">
	<button class="btn btn-success">保险意识强！全险那是必须的</button>
</a>
</body>
</html>