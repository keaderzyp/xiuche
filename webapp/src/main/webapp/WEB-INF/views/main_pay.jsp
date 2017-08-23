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
        <base href="<%=basePath%>"><meta charset="UTF-8">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title></title>
	<link href="css/main_unlogin-styles.css" rel="stylesheet"></head>
	<body>
		<div class="nav">
			<div class="nav-circle">
				<div class="point">
				</div>
			</div>
			<div class="nav-city">
				贵阳
				<img src="img/arrow-down-white.png" alt="" />
			</div>
			<div class="nav-group">
				<img src="img/Group.png"/>
			</div>
		</div>
		<div class="nav-login">
			<img class="jixiang" src="img/jixiang.png" alt="" />
			<div class="car-title-complete">
				<p class="t1">
					主人!您的爱车已成功加入互助圈~！
				</p>
				<p class="t2">
					<img src="img/weather.png"/>
					26℃,多云,适合洗车哦~！
				</p>
			</div>
		</div>
		<div class="cars">
			<div class="have-car-deal">
				<ul class="car-info">
					<li class="car-title">
						<div class="car-license">
							贵AG332J
							<span>
								加入了58天
							</span>
						</div>
						<div class="car-model">
							<img src="img/car-model.png"/>
						</div>
					</li>
					<li class="car-btns">
						<ul>
							<li>
								<a href="#">
									<img src="img/xiuche.png"/>
									<img src="img/xiuche-btn.png"/>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="img/jiben.png"/>
									<img src="img/jiben-btn.png"/>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="img/qiuzhu.png"/>
									<img src="img/qiuzhu-btn.png"/>
								</a>
							</li>
						</ul>
					</li>
				</ul>
				<div class="car-money">
					<div class="progress">
						节省￥448.41
					</div>
					<span>
						￥22.9/2966
					</span>
				</div>
			</div>
			<div class="have-car-deal">
				
			</div>
		</div>
		<div class="shop">
			<div class="shop-head">
				<div class="title">
					我的账单
				</div>
				<div class="my-score">
					<a href="rest/carInfo/myPay.html">
						历史账单
						<img src="img/arrow-right-gray.png"/>
					</a>
				</div>
			</div>
			<ul class="shop-zhangdan">
				<li class="zhangdan-img">
					<img src="img/paydone.png"/>
				</li>
				<li class="zhangdan-title">
					<div class="title">
						本期账单已支付
					</div>
					<div class="date">
						6月5日-6月9日
					</div>
				</li>
			</ul>
		</div>
		<div class="shop">
			<div class="shop-head">
				<div class="title">
					我的圈
				</div>
			</div>
			<ul class="friends">
				<li>
					<a href="#">
						<img src="img/t1.jpg" alt="" />
					</a>
				</li>
				<li>
					<a href="#">
						<img src="img/t2.jpg" alt="" />
					</a>
				</li>
				<li>
					<a href="#">
						<img src="img/t3.jpeg" alt="" />
					</a>
				</li>
				<li>
					<a href="#">
						<img src="img/t4.jpg" alt="" />
					</a>
				</li>
				<li>
					<a href="#">
						<img src="img/add-friends.png" alt="" />
					</a>
				</li>
			</ul>
		</div>
		<div class="shop">
			<div class="shop-head">
				<div class="title">
					积分商城
				</div>
				<div class="my-score">
					我的积分:
					<span>800</span>
					<img src="img/arrow-right-gray.png"/>
				</div>
				
			</div>
			<ul class="goods">
				<li>
					<img src="img/jixiang.png"/>
					<p class="good-title">
						壳牌全合成机油
					</p>
					<p class="good-score">
						￥100积分
					</p>
					<p class="good-oldscore">
						￥200积分
					</p>
				</li>
				<li>
					<img src="img/jixiang.png"/>
					<p class="good-title">
						壳牌全合成机油
					</p>
					<p class="good-score">
						￥100积分
					</p>
					<p class="good-oldscore">
						￥200积分
					</p>
				</li>
				<li>
					<img src="img/jixiang.png"/>
					<p class="good-title">
						壳牌全合成机油
					</p>
					<p class="good-score">
						￥100积分
					</p>
					<p class="good-oldscore">
						￥200积分
					</p>
				</li>
			</ul>
		</div>
		<div class="tab-bar">
			<div class="tab-bar-icon active">
				<a href="rest/carInfo/mainDeal.html">
					<i class="shouye">
					</i>
					<span >
						首页
					</span>
				</a>
			</div>
			<div class="tab-bar-icon  ">
				<a href="rest/moments/index">
					<i class="dongtai">
					</i>
					<span >
						动态
					</span>
				</a>
			</div>
			<div class="tab-bar-icon">
				<a href="#">
					<i class="hudong">
						
					</i>
					<span >
						互动项目
					</span>
				</a>
			</div>
			<div class="tab-bar-icon ">
				<a href="rest/scoreShop/index">
					<i class="jifen">
						
					</i>
					<span >
						积分商城
					</span>
				</a>
			</div>
		</div>
	</body>
</html>
