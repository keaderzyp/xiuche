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
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>新首页</title>
<link href="css/main_unlogin-styles.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/index_new.css" />
<link rel="stylesheet" type="text/css" href="css/swiper-3.3.1.min.css" />

</head>
<body>
	<div class="main-body">
		<div class="loading-body">
				<img src="img/loading.gif"/>
			</div>
		<div class="swiper-container banner-swiper">
			<div class="swiper-wrapper">
				<div class="swiper-slide">
					<img src="img/fengjing.jpeg"/>
				</div>
				<div class="swiper-slide">
					<img src="img/fengjing1.jpeg"/>
				</div>
				<div class="swiper-slide">
					<img src="img/fengjing2.jpeg"/>
				</div>
			</div>
			<div class="swiper-pagination">
				
			</div>
		</div>
		<a href="<%=basePath %>rest/page/quick_learn-1">
			<button class="quick-learn">
				快速了解互助修车
			</button>
		</a>
		<div class="help-btns">
			<div class="btn line  tab-bar-icon">
				<a class="my-help" href="<%=basePath %>rest/page/quick_learn-2-1">
					<img src="img/geren.png" alt="" />
					个人加入互助计划
				</a>
			</div>
			<div class="btn  tab-bar-icon  ">
				<a class="my-pay" href="<%=basePath %>rest/page/quick_learn-2-2">
					<img src="img/qiye.png" alt="" />
					企业加入互助计划
				</a>
			</div>
		</div>
		<div class="btn-list">
			<div class="btn-tr line" >
				<div class="btn-td line">
					<a href="javascript:sub()">
						<img src="img/qukuailian.png"/>
						<div class="content">
							<h4 class="title">区块链</h4>
							<span class="info">去中心，去信任</span>
						</div>
					</a>
				</div>
				<div class="btn-td">
					<a href="javascript:sub()">
						<img src="img/yangeshenhe.png"/>
						<div class="content">
							<h4 class="title">严格审核</h4>
							<span class="info">权威大数据筛选</span>
						</div>
					</a>
				</div>
			</div>
			<div class="btn-tr">
				<div class="btn-td line">
					<a href="javascript:sub()">
						<img src="img/zhinengheyue.png"/>
						<div class="content">
							<h4 class="title">智能合约</h4>
							<span class="info">不可篡改、抵赖</span>
						</div>
					</a>
				</div>
				<div class="btn-td">
					<a href="javascript:sub()">
						<img src="img/gongkaitouming.png"/>
						<div class="content">
							<h4 class="title">公开透明</h4>
							<span class="info">事故公示，分摊明细</span>
						</div>
					</a>
				</div>
			</div>
		</div>
		<div class="people-say">
			<div class="title">
				看看大咖怎么说
			</div>
			<div class="people-say-item">
				<div class="head">
					<img src="img/t1.jpg" alt="" />
					<div class="content">
						<h4 class="name">马云</h4>
						<span class="job">阿里巴巴董事长</span>
					</div>
				</div>
				<div class="body">
					Thinking about overseas adventure travel? Have you put any thought into the best places to go when it comes to overseas adventure travel? 
				</div>
			</div>
			<div class="people-say-item">
				<div class="head">
					<img src="img/t2.jpg" alt="" />
					<div class="content">
						<h4 class="name">王健林</h4>
						<span class="job">万达集团董事长</span>
					</div>
				</div>
				<div class="body">
					Thinking about overseas adventure travel? Have you put any thought into the best places to go when it comes to overseas adventure travel? 
				</div>
			</div>
		</div>
		<div class="tab-bar">
			<div class="tab-bar-icon active">
				<a href="<%=basePath%>rest/page/mainIndex">
					<i class="shouye">
					</i>
					<span >
						首页
					</span>
				</a>
			</div>
			<div class="tab-bar-icon  ">
				<a href="<%=basePath%>rest/moments/index">
					<i class="dongtai">
					</i>
					<span >
						动态
					</span>
				</a>
			</div>
			<div class="tab-bar-icon ">
				<a href="<%=basePath%>rest/user/gotoMainDeal">
					<i class="wode">
						
					</i>
					<span>
						我的
					</span>
				</a>
			</div>
		</div>
	</div>
	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png"/>
				<div class="model-title">
					该功能正在开发中
				</div>
				<div class="model-content">
					敬请期待
				</div>
			</div>
			<div class="model-foot">
				<a  onclick="hideModel()" >
					我知道了
				</a>
			</div>
		</div>
	</div>
	<script src="js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/swiper-3.3.1.jquery.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		var s1 = new Swiper('.banner-swiper',{
			autoplay:2000,
			pagination:'.swiper-pagination',
			paginationClickable:true,
			autoplayDisableOnInteraction:false,
			loop:true,
		});
	</script>
	<script src="js/loading.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>