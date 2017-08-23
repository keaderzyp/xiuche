<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
		<title>添加车辆引导页</title>
	<link href="css/add_car-styles.css" rel="stylesheet"></head>
	<body>
		<div class="title">
			你已成功升级为高级会员
		</div>
		<img class="logo" src="img/yindao.png"/>
		<ul class="info">
			<li class="t1">
				关联车辆
			</li>
			<li class="t2">
				即可尊享以上服务
			</li>
			<li class="btn">
			<a href="rest/Circle/updateState">
				<button >
					添加车辆
				</button>
			</a>
			</li>
			<li class="link">
				<a href="rest/user/gotoMainDeal">
					我知道了，稍后添加
				</a>
					<div class="form-group" style="border: none;font-size: 15px;"><span style="margin:10px 50px;color:red">${error}</span></div>
			</li>
		</ul>
	</body>
</html>
