<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript">
		function browserRedirect() {
	        var sUserAgent = navigator.userAgent.toLowerCase();
	        var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
	        var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
	        var bIsMidp = sUserAgent.match(/midp/i) == "midp";
	        var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
	        var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
	        var bIsAndroid = sUserAgent.match(/android/i) == "android";
	        var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
	        var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
	        if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
	        	location.href="<%=basePath%>rest/page/code";
	        } else {
	            
	        }
	    }

	    browserRedirect();
		</script>
		<meta charset="utf-8" />
		<title>首页</title>
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
						<li class="active">
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
						<li>
							<a href="<%=basePath %>/rest/pc/problem">
								<span>常见问题</span>
							</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>
		<div class="banner">
			<img class="bg" src="<%=basePath %>/assets/pc/img/Group 32.png"/>
			<div class="container-parent">
				<div class="container">
					<div class="phone pull-right">
						<div class="title">
							<div class="up">
								小资金，分笔付
							</div>
							<div class="down">
								更省钱、更安全、更有趣
							</div>
						</div>
						<div class="info">
							扫一扫，共享养车新模式
						</div>
						<img class="code" src="<%=basePath %>/assets/pc/img/gongzhonghao.jpg"/>
						<div class="content">
							重要声明：互助修车计划不是保险，会员分摊互助金不是保险费用
							，贵州共享汽车网络科技有限公司和互助修车平台也不是商业保险公司。
							互助修车平台倡导我为人人，人人为我，共建和谐共享生态文化
						</div>
						
					</div>
				</div>
			</div>
		</div>
		<div class="for-what">
			<div class="container">
				<h3 class="text-center title">什么是互助修车计划？</h3>
				<ul class="nav nav-pills nav-justified text-center">
					<li><img src="<%=basePath %>/assets/pc/img/Group 21.png" alt="" />
						<p>
							由众多愿意安全出行的车<br/>
							友组成的一个大家庭
						</p>
					</li>
					<li><img src="<%=basePath %>/assets/pc/img/Group 20.png" alt="" />
						<p>
							当出现事故时<br/>
							由车友共同帮助车主<br/>
							分推维修费用
						</p>
					</li>
					<li><img src="<%=basePath %>/assets/pc/img/Group 19.png" alt="" />
						<p>
							车管家提供全程一对一的<br/>
							服务及专业的维修养护平台
						</p>
					</li>
					<li><img src="<%=basePath %>/assets/pc/img/Group 18.png" alt="" />
						<p>
							通过共享互助的全新模式<br/>
							解决车主高昂的养车费用
						</p>
					</li>
				</ul>
			</div>
		</div>
		<div class="mode">
			<div class="container">
				<h3 class="text-center title">风控模式</h3>
				<ul class="nav nav-pills nav-justified text-center">
					<li >
						<div class="item">
							<img src="<%=basePath %>/assets/pc/img/qukuailian.png" alt="" />
							<a href="">区块链</a>
							<span>
								分布式数据存储、点对点传输、共识机制、加密算法等计算机技术的 新型应用模式
							</span>
						</div>
					</li>
					<li>
						<div class="item">
							<img src="<%=basePath %>/assets/pc/img/icon_file.png" alt="" />
							<a href="">智能合约</a>
							<span>
								是一套以数字形式定义的承诺 ,合约参与方可以在上面执行这些承诺的协议.
							</span>
						</div>
					</li>
					<li>
						<div class="item">
							<img src="<%=basePath %>/assets/pc/img/test.png" alt="" />
							<a href="">严格审核</a>
							<span>
								通过大数据甄选优质客户，
								建立风控模型和风险数据库
							</span>
						</div>
					</li>
					<li>
						<div class="item">
							<img src="<%=basePath %>/assets/pc/img/icon_eye.png" alt="" />
							<a href="">公开透明</a>
							<span>
								分布式数据存储、点对点传输、共识机制、加密算法等计算机技术的 新型应用模式
							</span>
						</div>
					</li>
					<li>
						<div class="item">
							<img src="<%=basePath %>/assets/pc/img/icon_tool.png"/>
							<a href="">专业透明</a>
							<span>
								分布式数据存储、点对点传输、共识机制、加密算法等计算机技术的 新型应用模式
							</span>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="step">
			<div class="container">
				<h3 class="text-center title">互助流程</h3>
				<div class="body">
					<i class="sqrt"></i>
					<div class="main">
						<ul class="nav nav-pills nav-justified text-center">
							<li class="first">
								<img src="<%=basePath %>/assets/pc/img/Group 8.png" alt="" />
								<span>
									一键求助或拨打客服电话
								</span>
								<i class="num">1</i>
							</li>
							<li>
								<img src="<%=basePath %>/assets/pc/img/Group 9.png" alt="" />
								<span>
									车管家全程一对一服务
								</span>
								<i class="num">2</i>
							</li>
							<li>
								<img src="<%=basePath %>/assets/pc/img/Group 10.png" alt="" />
								<span>
									指定维修厂家
								</span>
								<i class="num">3</i>
							</li>
							<li>
								<img src="<%=basePath %>/assets/pc/img/Group 11.png" alt="" />
								<span>
									平台垫付费用
								</span>
								<i class="num">4</i>
							</li>
							<li>
								<img src="<%=basePath %>/assets/pc/img/Group 12.png" alt="" />
								<span>
									用户满意签收
								</span>
								<i class="num">5</i>
							</li>
							<li class="last">
								<img src="<%=basePath %>/assets/pc/img/Group 13.png" alt="" />
								<span>
									次周资金分摊
								</span>
								<i class="num">6</i>
							</li>
						</ul><div class="line"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="pattern">
			<div class="container">
				<ul class="list-unstyled">
					<li class="title">
							合作伙伴
					</li>
					<li>
						<a href="#">
							<img src="<%=basePath %>/assets/pc/img/Group 22.png"/>
						</a>
					</li>
					<li>
						<a href="#">
							<img src="<%=basePath %>/assets/pc/img/Group 24.png"/>
						</a>
						
					</li>
					<li>
						<a href="#">
							<img src="<%=basePath %>/assets/pc/img/Group 23.png"/>
						</a>
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
		<script src="<%=basePath %>/assets/pc/js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/assets/pc/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
