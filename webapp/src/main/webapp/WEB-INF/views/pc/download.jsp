<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>下载app</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/style.css"/>
	</head>
	<body>
		<nav class="nav">
			<div class="container" >
				<div class="nav navbar-header">
					<a href="<%=basePath %>/rest/pc/index" class="title">
						<img class="logo" src="<%=basePath %>/assets/pc/img/logo.png"/>
						<span>互助修车</span>
					</a>
					<button class="btn  navbar-toggle "  data-toggle="collapse" data-target="#nav">
						<span class="glyphicon glyphicon-menu-hamburger"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse " id="nav">
					<ul class="nav navbar-nav navbar-right">
						<li >
							<a href="<%=basePath %>/rest/pc/index" >
								<span>首页</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/blockPublicity">
								<span>区块公示</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/information">
								<span>资讯</span>
							</a>
						</li>
						<li >
							<a href="<%=basePath %>/rest/pc/about">
								<span>关于我们</span>
							</a>
						</li>
						<li class="active">
							<a href="<%=basePath %>/rest/pc/downLoads">
								<span>下载app</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/problem">
								<span>常见问题</span>
							</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>
		<div class="banner-app">
			<div class="container">
				<div class="col-md-6 text-center hidden-sm hidden-xs">
					<img src="<%=basePath %>/assets/pc/img/ytupian.png"/>
				</div>
				<div class="col-md-6">
					<div class="title text-center">
						<span class="line"></span>
						<span class="abc">APP下载</span>
						<span class="line"></span>
					</div>
					<ul class="list-unstyled app  clearfix">
						<li class="col-sm-6" >
							<a href="#">
								<img src="<%=basePath %>/assets/pc/img/ios.png" alt="" />
							</a>
							<a href="#">
								<img src="<%=basePath %>/assets/pc/img/android.png"/>
							</a>
						</li>
						<li class="col-sm-6">
							<div class="erweima">
								
							</div>
						</li>
					</ul>
					<footer class="text-center">
						互助 · 互联网 · 区块链
					</footer>
				</div>
			</div>
		</div>
		<div class="cloud"></div>
		<div class="bar-odd ">
			<div class="container">
				<div class="col-md-7 content">
					<h1 >
						<span class="orange">互助</span>无压力
						<span class="orange">帮助</span>无压力
					</h1>
					<p>
						立即下载<span class="orange">APP</span>
					</p>
					<p>
						加入互助大家庭
					</p>
				</div>
				<div class="col-md-5 img">
					<img src="<%=basePath %>/assets/pc/img/help@3x.png"/>
				</div>
			</div>
		</div>
		<div class="bar-even">
			<div class="container">
				<div class="col-md-7 img ">
					<img class="phone" src="<%=basePath %>/assets/pc/img/UI.png"/>
				</div>
				<div class="col-md-5 content">
					<h1 class="phone-text">
						互助<span class="orange">公示</span>系统
					</h1>
					<p>
						帮助“家人”，互助互惠
					</p>
					<p>
						公开、公平、公证
					</p>
				</div>
			</div>
		</div>
		<div class="bar-odd border-bottom lightgray">
			<div class="container">
				<div class="col-md-7 content">
					<h1 class="computer-text">
						底层实用<span class="orange">区块链</span>技术
					</h1>
					<p>
						互助计划数据在区块链上记录
					</p>
					<p>
						永远无法篡改，保证公正公平
					</p>
				</div>
				<div class="col-md-5 img">
					<img class="computer" src="<%=basePath %>/assets/pc/img/computer.png"/>
				</div>
			</div>
		</div>
		<footer class="footer">
			<div class="container">
				<dl >
					<dt class="title col-md-1 col-sm-1">
						<img src="<%=basePath %>/assets/pc/img/Group Copy.png"/>
					</dt>
					<dd class="title col-md-9 col-sm-9">
						<p>
							Copyright &copy;互助修车 黔ICP备17007794号  版权声明
						</p>
						<p>
							互助修车，为您提供省心便捷的修车服务
						</p>
					</dd>
					<dd class="title col-md-2 col-sm-2 text-right">
						<img src="<%=basePath %>/assets/pc/img/weixin.png"/>
						<img src="<%=basePath %>/assets/pc/img/weibo.png" alt="" />
					</dd>
				</dl>
			</div>
		</footer>
	</body>
	<script src="<%=basePath %>/assets/pc/js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=basePath %>/assets/pc/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
</html>
