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
		<title>关于我们</title>
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
						<li class="active">
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
		<div class="banner-about"></div>
		<div class="about-pages">
			<div class="container">
				<ul class="nav-about list-inline list-unstyled nav-justified text-center">
					<li class="active"><a href="#gsjj" data-toggle="tab">公司介绍</a></li>
					<li><a href="#tdjs"  data-toggle="tab">团队介绍</a></li>
					<li><a href="#gywm"  data-toggle="tab">关于我们</a></li>
					<li><a href="#zbmm"  data-toggle="tab">招兵买马</a></li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane fade in active" id="gsjj">
							公司简介<br/>
     					&nbsp;&nbsp;&nbsp;&nbsp;贵州共享汽车网络科技有限公司是由尼伯特汽车服务（苏州）有限公司和贵州天鼎元投资有限公司共同发起设立，基于“互助修车”项目及汽车相关资源产业链的有机型整合，是运用区块链及大数据技术为客户提供全方位、一体化服务的共享型汽车网络综合服务平台提供商。
						平台加入了区块链技术，去中心化、去信任化，建立共识机制，智能合约的引入实现了自动化合约的执行，加入互助计划生成智能合约，出现事故触发智能合约，交警认定书或第三方鉴定书执行智能合约生成分摊账单。基于大数据筛选出大量汽车用户后，我们会对4S店和合规修车厂，提供区块链的上链服务，同时我们会根据大数据分析出事故和保养常用备件，设立共享仓库，减少汽车行业多节点环节，改善汽车行业后市场的混乱局面，降低养车成本。
					
					</div>
					<div class="tab-pane fade " id="tdjs">
						团队介绍
					</div>
					<div class="tab-pane fade " id="gywm">
						关于我们
					</div>
					<div class="tab-pane fade " id="zbmm">
						招兵买马
					</div>
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
