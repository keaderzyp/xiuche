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
		<title>区块公示</title>
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
						<li class="active">
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
		<div class="banner-qukuai">
			<div class="container">
				<div class="col-md-8 map hidden-sm hidden-xs">
					<img  src="<%=basePath %>/assets/pc/img/map.png"/>
					<div class="info">
						<ul class="list-unstyled">
							<li>
								<img src="<%=basePath %>/assets/pc/img/123.png"/>
								新加入用户
							</li>
							<li>
								<img src="<%=basePath %>/assets/pc/img/3.png"/>
								第三方公示
							</li>
						</ul>
					</div>
				</div>
				<div class="col-md-4 col-sm-12">
					<div class="input-group">
						<input type="text" placeholder="输入用户编号查询区块链" class="form-control" />
						<div class="input-group-btn">
							<button class="btn btn-default">
								<!--<img src="img/search.png"/>-->
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</div>
					</div>
					<div class="join-people">
						<img src="<%=basePath %>/assets/pc/img/Base.png" alt="" />
						<span class="content">
							<h1>182</h1>
							<span>加入互助修车计划的用户</span>
						</span>
					</div>
					<div class="people-list">
						<ul class="list-group">
							<li class="list-group-item">
								<span>正在写入区块链...</span>
								<button  class="pull-right">如何查询</button>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
							<li class="list-group-item">
								<img src="<%=basePath %>/assets/pc/img/123.png"/>李＊＊
								<a href="#" class="pull-right">加入计划</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="mode">
			<div class="container">
				<h3 class="text-center title">关于区块链与互助修车</h3>
				<ul class="nav nav-pills nav-justified text-center">
					<li  >
						<div class="item radius">
							<h3>
								什么是区块链
							</h3>
							<p>
								区块链是一种去中心化、由节点参与的分布式账本系统，在它上面存储的数据不可违早和篡改，公开透明，在区块链上可以找到每一个账号在历史上任何一点所记录的信息及拥有的价值。区块链协议的特点为智能合约运行提供必要基础，合约可以按照既定条件自动执行和信任，无需任何中心化机构的审核。
							</p>
						</div>
					</li>
					<li>
						<div class="item radius">
							<h3>
								区块链解决了什么问题？
							</h3>
							<p>
								在乎不信任的匿名网络中，利用区块链的不可篡改性与智能合约的可自动执行特性来解决以下问题：<br/>
								1.信息对称科教差验证；<br/>
								2.规则全部强制执行；<br/>
								3.资金合理使用受监督；<br/>
								最终实现群体利益最大化。<br/>
							</p>
						</div>
					</li>
					<li>
						<div class="item radius">
							<h3>
								什么是区块链
							</h3>
							<p>
								互助修车能够利用互联网技术极大降低普通人之间的互助成本，是符合社会主义和平价值观的新模式，但她也有一些潜在的问题，比如信息的公开透明。利用区块链不可篡改行及去信任化的特性，把规则和执行流程用区块链智能合约的形式予以固定，一切都由程序执行，就可以排除认为因素，保证了每一个会员的权益。
							</p>
						</div>
					</li>
				</ul>
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
