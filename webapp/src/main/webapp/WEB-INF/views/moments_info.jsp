<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
		<title>动态详情</title>
		<link rel="stylesheet" type="text/css" href="css/moments_info-styles.css"/>
    </head>
    <body>
		<div class="nav">
			<span class="nav-city" onclick="redirectTo('rest/moments/index')">
				<img src="img/arrow-left.png"/>
				返回
			</span>
			<span class="nav-city">
				动态详情
			</span>
		</div>
		<img class="banner" src="<%=basePath%>img/${news.bynamicIco}"/>
		<div class="article">
			<div class="article-type">
				${type } |   <fmt:formatDate value="${news.issueTime}" pattern="yyyy-MM-dd"/>
				
			</div>
			<div class="article-title">
				${news.title}
			</div>
			<div class="article-user">
				<img src="img/t1.jpg"/>
				${news.userFid.username }
			</div>
			<div class="article-content">
				${content }
			</div>
		</div>
	</body>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
</html>