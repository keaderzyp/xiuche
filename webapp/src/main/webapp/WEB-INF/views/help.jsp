<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>求助页面</title>

<link href="css/help-styles.css" rel="stylesheet">
</head>
<body>
	<div class="main-body">
		<div class="nav">
			<span class="nav-city"> <a href="rest/user/gotoMainDeal">
					<img src="img/arrow-left.png" /> 返回
			</a>
			</span> <span class="nav-city"> 求助 </span>
		</div>

		<img class="help-img" src="img/qiuzhuliucheng.png" alt="" />

		<div class="help-btn">
			<button class="send-help" onclick="sub()">发送求助请求</button>
			<button class="back" onclick="window.location.href='rest/user/gotoMainDeal'">
				我就是看看，回到主页面</button>

		</div>
		<div class="form-group" style="border: none; font-size: 15px;">
			<span style="margin: 10px 50px; color: red">${error}</span>
		</div>

	</div>



	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png" />
				<div class="model-title">求助申请已发送！</div>
				<div class="model-content">请保持手机畅通，客服会马上与你联系， 确认事故地点</div>
			</div>
			<div class="model-foot">
				 <a
					href="rest/carInfo/insertHelpInfo?carInfoId=${carInfoId }" onclick="hideModel()"> 我知道了
				</a>
			</div>
		</div>
	</div>
</body>
<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery-2.2.4.min.js" type="text/javascript"
	charset="utf-8"></script>
</html>