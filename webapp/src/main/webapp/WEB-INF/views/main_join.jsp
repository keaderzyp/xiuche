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
			<div class="car-title">
				<p class="t1">已成功升级为高级会员！</p>
				<p class="t2">
					让我帮您照顾您的爱车吧！
					点击下方+添加您的爱车！
				</p>
			</div>
			<img onclick="window.location.href='rest/carInfo/addCar.html'"  class="goto-join" src="img/add-car.png" alt="" />
		</div>
		<div class="add-car" onclick="window.location.href='rest/carInfo/addCar.html'">
			<img src="img/add-car-plus.png"/>
			<div >添加爱车</div>
		</div>
		<div class="moments" >
			<div class="moments-title">
				我的圈
			</div>
			<img src="img/empty-icon.png"/>
			<div class="moments-alert">
				你还没有自己的圈子哦，快来邀请朋友加入吧！
			</div>
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
				
					<i class="hudong">
						
					</i>
					<span >
						互动项目
					</span>
				
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
