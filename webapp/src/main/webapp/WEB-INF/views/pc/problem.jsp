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
		<title>常见问题</title>
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
						<li>
							<a href="<%=basePath %>/rest/pc/about">
								<span>关于我们</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/downLoads">
								<span>下载app</span>
							</a>
						</li>
						<li class="active">
							<a href="<%=basePath %>/rest/pc/problem">
								<span>常见问题</span>
							</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>
		<div class="problem-body">
			<div class="container ">
				<div class="content">
					<h1>
						常见问题
					</h1>
					<hr />
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#one"  data-toggle="collapse" data-parent="#accordion" >
										1.互助修车是什么?
										
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="one">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" \>
								<h4 class="panel-title">
									<a href="#two"  data-toggle="collapse" data-parent="#accordion" >
										2.什么是区块链?
									</a>
								</h4>
							</div>
							<div class="collapse in" id="two">
								<div class="panel-body">
									区块链是一种去中心化、由节点参与的分布式账本系统，在它上面存储的数据不可违早和篡改，公开透明，在区块链上可以找到每一个账号在历史上任何一点所记录的信息及拥有的价值。区块链协议的特点为智能合约运行提供必要基础，合约可以按照既定条件自动执行和信任，无需任何中心化机构的审核。
									在乎不信任的匿名网络中，利用区块链的不可篡改性与智能合约的可自动执行特性来解决以下问题：
									1.信息对称科教差验证；
									2.规则全部强制执行；
									3.资金合理使用受监督；
									最终实现群体利益最大化。
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#three"  data-toggle="collapse" data-parent="#accordion" >
										3.区块链解决了什么问题？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="three">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#four"  data-toggle="collapse" data-parent="#accordion" >
										4.区块链怎样与互助修车结合？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="four">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#five"  data-toggle="collapse" data-parent="#accordion" >
										5.如何一键求助？
										
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="five">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#six"  data-toggle="collapse" data-parent="#accordion" >
										6.加入互助修车，我能得到什么好处？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="six">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#seven"  data-toggle="collapse" data-parent="#accordion" >
										7.加入互助修车，我能得到什么好处？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="seven">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#eight"  data-toggle="collapse" data-parent="#accordion" >
										8.如何提高互助额度？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="eight">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" > 
								<h4 class="panel-title">
									<a href="#nine"  data-toggle="collapse" data-parent="#accordion" >
										9.如何绑定银行卡？
									</a>
								</h4>
							</div>
							<div class="collapse panel-collapse " id="nine">
								<div class="panel-body" >
							
								</div>
							</div>
						</div>
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
		<script src="<%=basePath %>/assets/pc/js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/assets/pc/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
