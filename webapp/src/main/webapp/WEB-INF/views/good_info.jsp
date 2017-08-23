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
		<title>商品详情</title>
		<link rel="stylesheet" type="text/css" href="css/swiper-3.3.1.min.css"/>
	<link href="css/good_info-styles.css" rel="stylesheet">
    </head>
    <body>
		<div class="nav">
			<span class="nav-city">
				<a href="score.html">
					<img src="img/arrow-left.png"/>
					返回
				</a>
				
			</span>
			<span class="nav-city">
				商品详情
			</span>
		</div>
		<div class="lunbo">
			<div class="swiper-container" id="lunbo">
				<div class="swiper-wrapper">
					<div class="swiper-slide">
						<img src="img/jixiang.png"/>
					</div>
					<div class="swiper-slide">
						<img src="img/jixiang.png"/>
					</div>
					<div class="swiper-slide">
						<img src="img/jixiang.png"/>
					</div>
				</div>
				<div class="swiper-pagination">
				</div>
			</div>
		</div>
		<div class="good-info">
			<span class="good-name">
				${gd_name}
			</span>
			<div class="good-numbers">
				<span class="good-score">
					100积分
				</span>
				<span class="good-oldscore">
					200积分
				</span>
			</div>
			
		</div>
		<div class="address-info">
			<span class="address-title">
				<img src="img/sanjiao.png" alt="" />
				配送制
			</span>
			<span class="address-alert">
				您尚未填写收货信息，马上填写。
			</span>
			<span class="go-to">
				<a href="#">
					<img src="img/arrow-right-gray.png"/>
				</a>
			</span>
		</div>
		<div class="good-info-text">
			<div class="good-info-title">
				<img src="img/sanjiao.png"/>
				商品描述
			</div>
			<div class="good-info-content">
				<div class="title">
					商品名称
				</div>
				<div class="info">
					后视镜行车记录仪倒车影像套装
				</div>
			</div>
			<div class="good-info-content">
				<div class="title">
					商品尺寸
				</div>
				<div class="info">
					22x15x6.5cm
				</div>
			</div>
			<div class="good-info-content">
				<div class="title">
					兑换流程
				</div>
				<div class="info">
					1.用户确认符合兑换条件后，点击【我要兑换】，并 
					  填写配送信息。<br/>
					2.确认信息无误后提交兑换。<br/>
					3.等待商品配送<br/>
				</div>
			</div>
		</div>
		<div class="tab-btn">
			<button>我要兑换</button>
		</div>
		<script src="js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/swiper-3.3.1.jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			var s1 = new Swiper('#lunbo',{
				autoplay:3000,
				pagination:'.swiper-pagination',
				paginationClickable:true,
				loop:true
			});
		</script>
    </body>
</html>