<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
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
		<div class="car-title-complete">
			<c:choose>
				<c:when test="${user.state == 1}">
					<p class="t1">HI！欢迎主人回家！</p>
					<p class="t2">支付1元，体验超值会员服务~！ 还有更多精彩等你来发现！</p>
				</c:when>
				<c:when test="${user.state == 2}">
					<p class="t1">您的爱车已成功添加！</p>
					<p class="t2">
						让主人的爱车加入互助圈吧<br /> 以后可以节省很多银子哦~！
					</p>
				</c:when>
				<c:when test="${user.state == 3}">
					<p class="t1">您的爱车已成功添加！</p>
					<p class="t2">
						让主人的爱车加入互助圈吧<br /> 以后可以节省很多银子哦~！
					</p>
				</c:when>
				<c:otherwise>
					<p class="t1">主人!您的爱车已成功加入互助圈~！</p>
					<p class="t2">
						<img src="img/weather.png" /> 26℃,多云,适合洗车哦~！
					</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	<div class="cars">
	
	
		<c:forEach items="${carInfo}" var="carInfo">
			<div class="have-car-deal">
				<ul class="car-info">
					<li class="car-title">
						<div class="car-license">
							${carInfo.PLATE_NUMBER} <span> 加入了${carInfo.day} 天 </span>
						</div>
						<div class="car-model">
							<img src="img/car-model.png" />
							<ul class="car-btns">
								<li><a
									href="rest/carInfo/help?carInfoId=${carInfo.ID}"> <img
										src="img/xiuche.png" /> <img src="img/xiuche-btn.png" />
								</a></li>
								<li><a href="rest/carInfo/myPay"> <img src="img/qiuzhu.png" /> <img
										src="img/qiuzhu-btn.png" />
								</a></li>
							</ul>
						</div>
					</li>
				</ul>
				<div class="car-money">
					<div class="progress">节省￥${carInfo.jiesheng}</div>
					<span> ￥${carInfo.money}/${carInfo.PARTAKE_MAX} </span>
				</div>
			</div>
		</c:forEach>

		<div class="have-car-deal"></div>
	</div>
	<div class="shop">
		<div class="shop-head">
			<div class="title">我的账单</div>
			<div class="my-score">
				<a href="rest/carInfo/myPay"> 历史账单 <img
					src="img/arrow-right-gray.png" />
				</a>
			</div>
		</div>
		<ul class="shop-zhangdan">
			<li class="zhangdan-img"><img src="img/jine.png" /></li>
			<li class="zhangdan-title">
				<div class="title">本期互助分摊金额</div>
				<div class="date">6月5日-6月9日</div>
			</li>
			<li class="zhangdan-jine"><span> ￥10.34 </span></li>
		</ul>
	</div>
	<div class="shop">
		<div class="shop-head">
			<a href="rest/Circle/index">
				<div class="title">我的圈</div>
			</a>
		</div>
		<c:choose>
			<c:when test="${user.hasCircle == 0}">
				<a href="rest/page/add_friends"> <img src="img/empty-icon.png" />
					<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
				</a>
			</c:when>
			<c:otherwise>
				<ul class="friends">
					<c:forEach var="userOne" items="${userList}">
						<li> <img
								src="${tomcatImagesPath}${userOne.userIco}"
								style="width: 50; height: 50;" alt="" />
						</li>
					</c:forEach>
				</ul>
			</c:otherwise>
		</c:choose>
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
			<a href="rest/carInfo/mainDeal.html"> <i class="shouye active">
			</i> <span> 首页 </span>
			</a>
		</div>
		<div class="tab-bar-icon  ">
			<a href="rest/moments/index"> <i class="dongtai"> </i> <span>
					动态 </span>
			</a>
		</div>
		<div class="tab-bar-icon">
			 <i class="hudong"> </i> <span> 互动项目 </span>
			
		</div>
		<div class="tab-bar-icon ">
			<a href="rest/scoreShop/index"> <i class="jifen"> </i> <span>
					积分商城 </span>
			</a>
		</div>
	</div>
</body>
<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
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
