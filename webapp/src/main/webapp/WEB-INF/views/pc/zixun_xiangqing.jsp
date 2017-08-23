<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>资讯详情</title>
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
						<li class="active">
							<a href="<%=basePath %>/rest/pc/information">
								<span>资讯</span>
							</a>
						</li>
						<li >
							<a href="<%=basePath %>/rest/pc/about">
								<span>关于我们</span>
							</a>
						</li>
						<li>
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
		<div class="zixun-body">
			<div class="container">
				<div class="local">
					资讯>${type }>${news.title }
				</div>
				<div class="zixun-info">
					<img src="<%=basePath %>/img/${news.bynamicIco}"/>
					<h4>
						[<span>${type }</span>]${news.title }
						<div class="nice pull-right">
							<img class="zan" src="<%=basePath %>/assets/pc/img/mdpi/zan copy.png"/> 1
							<img class="ping" src="<%=basePath %>/assets/pc/img/mdpi/pinglun copy.png"/> 2
						</div>
					</h4>
					<div class="other">
						<img class="face" src="<%=basePath %>img/${news.userFid.userIco }"/> 
						<span class="name">${news.userFid.username }</span>
						<span class="date">
							<fmt:formatDate value="${news.issueTime }" pattern="yyyy-MM-dd"/>
						</span>
						[<span class="title">${type }</span>]
					</div>
					<article>
						${content }
					</article>
				</div>
				<div class="zixun-info">
					<form class="form-horizontal" action="">
						<div class="form-group">
							<div class="input-group">
								<input type="text" placeholder="写下你的评论" class="form-control" />
								<div class="input-group-btn">
									<button class="btn ">
										评论
									</button>
								</div>
							</div>
						</div>
					</form>
					<div class="pinglun">
						<div class="other">
							<img class="face" src="<%=basePath %>/assets/pc/img/t1.jpg"/> 
							<span class="name">厌世小孤影</span>
							<span class="date">2017-07-17  13:16</span>
						</div>
						<article>
							波兰位于中欧东北部，北濒波罗的海，西邻德国，南临捷克，地势北低南高，中部下凹。全境属于由海洋性向大陆性气候过渡的温带阔叶林气候。波兰具有迥异的东欧风情。每年的5~9月是波兰较美丽的时候，天气温暖而阳光明媚，9月被誉为“波兰金色秋天”的开始。
							最佳旅游季节：5-9月是波兰最美的时候
						</article>
					</div>
					<div class="pinglun">
						<div class="other">
							<img class="face" src="<%=basePath %>/assets/pc/img/t1.jpg"/> 
							<span class="name">厌世小孤影</span>
							<span class="date">2017-07-17  13:16</span>
						</div>
						<article>
							波兰位于中欧东北部，北濒波罗的海，西邻德国，南临捷克，地势北低南高，中部下凹。全境属于由海洋性向大陆性气候过渡的温带阔叶林气候。波兰具有迥异的东欧风情。每年的5~9月是波兰较美丽的时候，天气温暖而阳光明媚，9月被誉为“波兰金色秋天”的开始。
							最佳旅游季节：5-9月是波兰最美的时候
						</article>
					</div>
					<div class="pinglun">
						<div class="other">
							<img class="face" src="<%=basePath %>/assets/pc/img/t1.jpg"/> 
							<span class="name">厌世小孤影</span>
							<span class="date">2017-07-17  13:16</span>
						</div>
						<article>
							波兰位于中欧东北部，北濒波罗的海，西邻德国，南临捷克，地势北低南高，中部下凹。全境属于由海洋性向大陆性气候过渡的温带阔叶林气候。波兰具有迥异的东欧风情。每年的5~9月是波兰较美丽的时候，天气温暖而阳光明媚，9月被誉为“波兰金色秋天”的开始。
							最佳旅游季节：5-9月是波兰最美的时候
						</article>
					</div>
					<a href="#" >
						<button class="more">
							查看更多评论
						</button>
					</a>
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
		<script src="<%=basePath %>/assets/pc/js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/assets/pc/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
