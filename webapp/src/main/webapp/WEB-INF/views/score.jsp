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
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>积分商城</title>
		<link href="css/score-styles.css" rel="stylesheet">    
	</head>
    <body>
		<div class="nav">
			<span class="nav-city">
				积分商城
			</span>
		</div>
		<div class="my-score">
			<span class="number">
				831
			</span>
			<span class="type">
				分
			</span>
			<div class="title">
				<img src="img/zuanshi.png" alt="" />
				<span>我的积分</span>
			</div>
		</div>
		<div class="help-btns">
			<div class="btn line">
				<a href="#">
					<img src="img/help.png" alt="" />
					如何兑换积分
				</a>
			</div>
			<div class="btn">
				<a href="#">
					<img src="img/duihuan.png" alt="" />
					兑换记录
				</a>
			</div>
		</div>
		<div class="shop">
			<div class="tab-bar good-list">
				<div class="tab-bar-icon ">
					<a href="#">
						<i class="zhuangshi">
						</i>
						<span >
							汽车装饰
						</span>
					</a>
				</div>
				<div class="tab-bar-icon  ">
					<a href="#">
						<i class="yanghu">
						</i>
						<span >
							汽车养护
						</span>
					</a>
				</div>
				<div class="tab-bar-icon">
					<a href="#">
						<i class="jingpin">
							
						</i>
						<span>
							优惠精品
						</span>
					</a>
				</div>
				<div class="tab-bar-icon active">
					<a href="#">
						<i class="shangpin">
							
						</i>
						<span >
							虚拟商品
						</span>
					</a>
				</div>
			</div>
			<ul class="goods">
				<li>
					<a href="rest/scoreShop/goodInfo">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
			</ul>
			<ul class="goods">
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
			</ul>
			<ul class="goods">
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
				<li>
					<a href="good_info.html">
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
					</a>
				</li>
			</ul>
		</div>
		<div class="tab-bar">
			<div class="tab-bar-icon ">
				<a href="main_deal.html">
					<i class="shouye">
					</i>
					<span >
						首页
					</span>
				</a>
			</div>
			<div class="tab-bar-icon  ">
				<a href="moments.html">
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
			<div class="tab-bar-icon active">
				<a href="score.html">
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