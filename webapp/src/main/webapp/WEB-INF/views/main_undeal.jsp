<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<meta name="viewport"
		content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<title></title>
	<link href="css/main_unlogin-styles.css" rel="stylesheet">
</head>
<body>
	<div class="nav">
		<div class="nav-circle">
			<div class="point"></div>
		</div>
		<div class="nav-city">
			贵阳 <img src="img/arrow-down-white.png" alt="" />
		</div>
		<div class="nav-group">
			<img src="img/Group.png" />
		</div>
	</div>
	<div class="nav-login">
		<img class="jixiang" src="img/jixiang.png" alt="" />
		<div class="car-title">
			<p class="t1">您的爱车已成功添加！</p>
			<p class="t2">
				让主人的爱车加入互助圈吧<br /> 以后可以节省很多银子哦~！
			</p>
		</div>
		<img onclick="window.location.href='main_makedeal.html'"
			class="goto-deal" src="img/deal.png" alt="" />
	</div>
	<div class="cars">
		<div class="have-car">
			<div class="car-license">贵AG332J</div>
			<ul class="car-imgs">
				<li class="car-model"><img src="img/car-model.png" /></li>
				<li class="deal-soon"
					onclick="window.location.href='main_makedeal.html'"><img
					src="img/deal-soon.png" /></li>
			</ul>
		</div>
		<div class="have-car"></div>
	</div>

	<div class="moments">
		<div class="moments-title">我的圈</div>
		<img src="img/empty-icon.png" />
		<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
	</div>
	<div class="shop">
		<div class="shop-head">
			<div class="title">积分商城</div>
			<div class="my-score">
				我的积分: <span>800</span> <img src="img/arrow-right-gray.png" />
			</div>

		</div>
		<ul class="goods">
			<li><img src="img/jixiang.png" />
				<p class="good-title">壳牌全合成机油</p>
				<p class="good-score">￥100积分</p>
				<p class="good-oldscore">￥200积分</p></li>
			<li><img src="img/jixiang.png" />
				<p class="good-title">壳牌全合成机油</p>
				<p class="good-score">￥100积分</p>
				<p class="good-oldscore">￥200积分</p></li>
			<li><img src="img/jixiang.png" />
				<p class="good-title">壳牌全合成机油</p>
				<p class="good-score">￥100积分</p>
				<p class="good-oldscore">￥200积分</p></li>
		</ul>
	</div>
	<div class="tab-bar">
		<div class="tab-bar-icon active">
			<a href="main_deal"> <i class="shouye"> </i> <span>
					首页 </span>
			</a>
		</div>
		<div class="tab-bar-icon  ">
			<a href="moments.html"> <i class="dongtai"> </i> <span>
					动态 </span>
			</a>
		</div>
		<div class="tab-bar-icon">
			<a href="#"> <i class="hudong"> </i> <span> 互动项目 </span>
			</a>
		</div>
		<div class="tab-bar-icon ">
			<a href="score.html"> <i class="jifen"> </i> <span> 积分商城
			</span>
			</a>
		</div>
	</div>
	<div class="model">
		<div class="model-slide">
			<div class="user-info">
				<img src="img/t1.jpg" /> <span class="name"> 王大锤 </span> <i
					class="vip-5"> 5 </i>
			</div>
			<ul class="menu-list">
				<li><a href="rest/userInfo/toUserInfo"> <img src="img/jibenxinxi.png" />
						基本信息
				</a></li>
				<li><a href="address.html"> <img src="img/shouhuodizhi.png" /> 收货地址
				</a></li>
				<li><a href="rest/userInfo/toBindtel"> <img src="img/bangdingshouji.png" />
						修改绑定手机
				</a></li>
				<li><a href="change_pass.html"> <img src="img/xiugaimima.png" />
						修改密码
				</a></li>
			</ul>
			<div class="unlogin">
				<a href="rest/user/logout"> <img src="img/zhuxiao.png" /> 注销登陆
				</a>
			</div>
		</div>

	</div>
</body>
<script type="text/javascript">
		//解决侧边栏的js
		var menu = document.getElementsByClassName("nav-circle")[0];
		var model = document.getElementsByClassName("model")[0];
		var modelSlide = document.getElementsByClassName("model-slide")[0];
		menu.onclick=function(){
			 model.style.display="block";
			 var rn = window.setTimeout(function(){
			 	 modelSlide.style.marginLeft="0px"
				 document.body.style.position="absolute";
				 document.body.style.marginLeft="260px";
				 window.clearTimeout(rn);
			 })
			
		}
		model.onclick=function(e){
			if(e.target==this){
				 modelSlide.style.marginLeft="-260px"
				 document.body.style.position="absolute";
			 	 document.body.style.marginLeft="0px";
				 var rn = window.setTimeout(function(){
				 	document.getElementsByClassName("tab-bar")[0].style.position="fixed";
				 	document.getElementsByClassName("tab-bar")[0].style.left="0";
				 	document.getElementsByClassName("tab-bar")[0].style.bottom="0";
				 	 model.style.display="none";
				 	 window.clearTimeout(rn);
				 },400);
			}
		}
	</script>
</html>
