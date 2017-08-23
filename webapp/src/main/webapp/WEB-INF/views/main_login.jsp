<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title></title>
<link href="css/main_unlogin-styles.css" rel="stylesheet">
<link href="css/swiper-3.3.1.min.css" rel="stylesheet">
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
		<c:choose>
			<c:when test="${user.state == 1}">
				<div class="car-title">
					<p class="t1">HI！欢迎主人回家！</p>
					<p class="t2">支付1元，体验超值会员服务~！ 还有更多精彩等你来发现！</p>
				</div>
			</c:when>
			<c:when test="${user.state == 2}">
				<div class="car-title">
					<p class="t1">已成功升级为高级会员！</p>
					<p class="t2">让我帮您照顾您的爱车吧！ 点击下方+添加您的爱车！</p>
				</div>
			</c:when>
			<c:when test="${user.state == 3}">
				<div class="car-title">
					<p class="t1">您的爱车已成功添加！</p>
					<p class="t2">
						让主人的爱车加入互助圈吧<br /> 以后可以节省很多银子哦~！
					</p>
				</div>
			</c:when>
			<c:otherwise>
				<div class="car-title-complete">
					<p class="t1">主人!您的爱车已成功加入互助圈~！</p>
					<table class="t2">
						<tr>
							<td rowspan = "2"><img src="weatherImg/${userWeather.weatImg}.png" /></td>
							<td>${userWeather.temp}℃    ${userWeather.weather },${userWeather.affect }~！</td>
						</tr>
					</table>
				</div>
			</c:otherwise>
		</c:choose>
	
	<c:choose>
		<c:when test="${user.state == 1}">
			<img onclick="window.location.href='rest/userAdd/gotoPayJoin'"
				class="goto-join" src="img/gotojoin.png" alt="" />
		</c:when>
		<c:when test="${user.state == 2}">
			<img onclick="window.location.href='rest/userAdd/gotoAddCar'"
				class="goto-join" src="img/add-car.png" alt="" />
		</c:when>
		<c:when test="${user.state == 3}">
			<img onclick="window.location.href='rest/userAdd/gotoUserDeal'"
				class="goto-join" src="img/deal.png" alt="" />
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>
	</div>

	<!-- 以下为添加爱车 -->
	<c:choose>
		<c:when test="${user.state == 1}">
			<div onclick="window.location.href='rest/userAdd/gotoPayJoin'"
				class="add-car">
				<img src="img/add-car-plus.png" />
				<div>添加爱车</div>
			</div>
		</c:when>
		<c:when test="${user.state == 2}">
			<div onclick="window.location.href='rest/userAdd/gotoAddCar'"
				class="add-car">
				<img src="img/add-car-plus.png" />
				<div>添加爱车</div>
			</div>
		</c:when>
		<c:otherwise>
			<div class="cars">
				<div class="swiper-container cars-roll">
					<div class="swiper-wrapper">
						<c:forEach items="${carInfo}" var="carInfo">
							<div class="swiper-slide slideBlock">							
								<c:if test="${carInfo.STATUS==1}">
									<div class="have-car-deal">
										<ul class="car-info">
											<li class="car-title">
												<div class="car-license">
													${carInfo.PLATE_NUMBER} <span></span>
												</div>
												<div class="car-model">
													<img src="img/car-model.png" />
													<ul class="car-btns">
														<li class="deal-soon"
															onclick="window.location.href='rest/carInfo/mainMakedeal?carId=${carInfo.ID}'">
															<img src="img/deal-soon.png" />
														</li>
													</ul>
												</div>
											</li>
										</ul>
										<div class="car-money">
											<div class="progresses"></div>
											<span></span>
										</div>
									</div>
								</c:if>
								<c:if test="${carInfo.STATUS==2}">
									<div class="have-car-deal">
										<ul class="car-info">
											<li class="car-title">
												<div class="car-license">
													${carInfo.PLATE_NUMBER} <span> ${carInfo.PARAM1}生效 </span>
												</div>
												<div class="car-model">
													<img src="img/car-model.png" />
													<ul class="car-btns">
														<li><img src="img/xiuchehuise.png" /> <img
															src="img/xiuchehuise-btn.png" /></li>
														<li><img src="img/qiuzhuhuise.png" /> <img
															src="img/qiuzhuhuise-btn.png" /></li>
													</ul>
												</div>
											</li>
										</ul>
										<div class="car-money">
											<div class="progress">节省￥0</div>
											<span> ￥0/${carInfo.PARTAKE_MAX} </span>
										</div>
									</div>
								</c:if>
								<c:if test="${carInfo.STATUS==3}">
									<div class="have-car-deal">
										<ul class="car-info">
											<li class="car-title">
												<div class="car-license">
													${carInfo.PLATE_NUMBER} <span>
														加入了${carInfo.day==null?0:carInfo.day} 天 </span>
												</div>
												<div class="car-model">
													<img src="img/car-model.png" />
													<ul class="car-btns">
														<li><img src="img/xiuche.png" /> <a
															href="rest/carInfo/help?carInfoId=${carInfo.ID}"><img
																src="img/xiuche-btn.png" /> </a></li>
														<li><img src="img/qiuzhu.png" /> <a
															href="rest/carInfo/myPay"><img src="img/qiuzhu-btn.png" />
														</a></li>
													</ul>
												</div>
											</li>
										</ul>
										<div class="car-money">
											<div class="progress">节省￥${carInfo.jiesheng==null?0:carInfo.jiesheng}</div>
											<span>
												￥${carInfo.money==null?0:carInfo.money}/${carInfo.PARTAKE_MAX}
											</span>
										</div>
									</div>
								</c:if>
							</div>
						</c:forEach>
						<div class="swiper-slide slideBlock">
							<div class="have-car-deal">
								<ul class="car-info">
									<li class="car-title">
										<div class="car-license">添加爱车</div>
										<div align="center">
											<a href="rest/userAdd/gotoAddCar"> <img
												src="img/add-car-plus@2x.png" style="margin-bottom: -85px;" />
											</a>
										</div>
									</li>
								</ul>
								<div class="car-money">
									<div class="progresses"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>

	<!-- 以下为互助币 -->
	<div class="shop">
		<div class="shop-head">
			<div class="title">我的互助币</div>
			<div class="my-score">
				<a href="rest/userInfo/toMoneyInfo"> 查看详情 <img
					src="img/arrow-right-gray.png" />
				</a>
			</div>
		</div>
		<c:choose>
			<c:when test="${user.param1.equals('0')}">
				<a href="rest/userInfo/toMoneyInfo">
					<ul class="my-money-info">充值后可自动支付账单
					</ul>
				</a>
			</c:when>
			<c:otherwise>
				<ul class="my-money-info-num">
					<img src="img/qianbi.png" /> ${user.param1 }
				</ul>
			</c:otherwise>
		</c:choose>
	</div>
	<!-- 以下为互助账单 状态为4显示 -->
	<c:choose>
		<c:when test="${user.state == 5}">
				<div class="shop">
					<div class="shop-head">
						<div class="title">我的账单</div>
						<div class="my-score">
							<a href="rest/carInfo/myPay"> 历史账单 <img
								src="img/arrow-right-gray.png" />
							</a>
						</div>
					</div>
					<c:if test="${helpBillOne.size()==0 }">
						<ul class="shop-zhangdan">
								<li class="zhangdan-img"><img src="img/muzhi.png" /></li>
								<li class="zhangdan-title">
									<div class="title">目前没有账单</div>
									<div class="date"></div>
								</li>
								<li class="zhangdan-jine"><span></span></li>
							</ul>
					</c:if>
					<c:if test="${helpBillOne.size()!=0 }">
					<c:forEach var="helpBillOne" items="${helpBillOne}">
					<c:choose>
						<c:when
							test="${helpBillOne.param1 == null || helpBillOne.param1 == 0}">
							<ul class="shop-zhangdan">
								<li class="zhangdan-img"><img src="img/muzhi.png" /></li>
								<li class="zhangdan-title">
									<div class="title">本期安全行使，无需分摊</div>
									<div class="date">${helpBillOne.timezone}</div>
								</li>

							</ul>
						</c:when>
						<c:when test="${PartakeMap[helpBillOne.titleid]['status']==2}">
							<ul class="shop-zhangdan">
								<li class="zhangdan-img"><img src="img/jine.png" /></li>
								<li class="zhangdan-title">
									<div class="title">本期互助分摊金额</div>
									<div class="date">${helpBillOne.timezone}</div>
								</li>
								<li class="zhangdan-jine"><span> ￥<fmt:formatNumber
											value="${PartakeMap[helpBillOne.titleid]['factPay']}"
											type="currency" pattern="0.00" /></span></li>
							</ul>
						</c:when>
						<c:when test="${PartakeMap[helpBillOne.titleid]['status']==1}">
							<ul class="shop-zhangdan">
								<li class="zhangdan-img"><img src="img/paydone.png" /></li>
								<li class="zhangdan-title">
									<div class="title">本期分摊账单已支付</div>
									<div class="date">${helpBillOne.timezone}</div>
								</li>
								<li class="zhangdan-jine"><span> ￥<fmt:formatNumber
											value="${PartakeMap[helpBillOne.titleid]['factPay']}"
											type="currency" pattern="0.00" /></span></li>
							</ul>
						</c:when>
					</c:choose>
					</c:forEach>
					</c:if>
				</div>
			
		</c:when>
	</c:choose>

	<!-- 以下为朋友圈   -->
	<c:choose>
		<c:when test="${user.state == 1}">
			<div class="moments">
				<a href="rest/userAdd/gotoPayJoin">
					<div class="moments-title">
						<div class="title">我的圈</div>
					</div>
				</a> <a href="rest/userAdd/gotoPayJoin"> 
					<img src="img/empty-icon.png" />
				</a> 
				<a href="rest/userAdd/gotoPayJoin">
					<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
				</a>
			</div>
		</c:when>
		<c:when test="${user.state == 2}">
			<div class="moments">
				<a href="rest/userAdd/gotoAddCar">
					<div class="moments-title">
						<div class="title">我的圈</div>
					</div> 
				</a>
				<a href="rest/userAdd/gotoAddCar">
					<img src="img/empty-icon.png" />
				</a>
				 <a href="rest/userAdd/gotoAddCar">
					<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
				</a>
			</div>

		</c:when>
		<c:when test="${user.state == 3}">
				<div class="moments">
					<a href="rest/userAdd/gotoUserDeal">
						<div class="moments-title">
							<div class="title">我的圈</div>
						</div>
					</a>
					<a href="rest/userAdd/gotoUserDeal">
						<img src="img/empty-icon.png" />
					</a>
					<a href="rest/userAdd/gotoUserDeal">
						<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
					</a>
				</div>
			
		</c:when>
		<c:when
			test="${(user.state == 4||user.state == 5) && user.hasCircle == 0}">
				<div class="moments">
					<a href="rest/page/add_friends">
						<div class="moments-title">
							<div class="title">我的圈</div>
						</div>
					</a>
					<a href="rest/page/add_friends">
						<img src="img/empty-icon.png" />
					</a>
					<a href="rest/page/add_friends">
						<div class="moments-alert">你还没有自己的圈子哦，快来邀请朋友加入吧！</div>
					</a>
				</div>
		</c:when>
		<c:when
			test="${(user.state == 4||user.state == 5) && user.hasCircle == 1}">
				<div class="shop">
					<a href="rest/Circle/index">
						<div class="shop-head">
							<div class="title">我的圈</div>
						</div>
					</a>
					<a href="rest/Circle/index">
						<ul class="friends">
							<c:forEach var="userOne" items="${userList}">
								<li><img src="${tomcatImagesPath}userIcon/${userOne.userIco}"
									style="width: 50; height: 50;" alt="" /></li>
							</c:forEach>
						</ul>
					</a>
				</div>
		</c:when>

	</c:choose>
	</div>

	<!-- 以下积分商城 -->
	<!-- 	<div class="shop">
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
	</div>  -->

	<div class="tab-bar">
		<div class="tab-bar-icon">
			<a href="rest/userAdd/mainIndex"> <i class="shouye"> </i> <span>
					首页 </span>
			</a>
		</div>
		<div class="tab-bar-icon">
			<a href="rest/moments/index"> <i class="dongtai"> </i> <span>
					动态 </span>
			</a>
		</div>
		<div class="tab-bar-icon active">
			<a href="rest/user/gotoMainDeal"> <i class="wode"> </i> <span>
					我的 </span>
			</a>
		</div>
	</div>
	<div class="model">
		<div class="model-slide">
			<div class="user-info">
				<img src="${tomcatImagesPath}userIcon/${user.userIco}" alt="" /> <span
					class="name">
					${user.petName==null?user.username:user.petName} </span> <i class="vip-5">
					5 </i>
			</div>
			<ul class="menu-list">
				<li><a href="rest/userInfo/toUserInfo"> <img
						src="img/jibenxinxi.png" /> 基本信息
				</a></li>
				<!-- 
					<li>
						<a href="address.html">
							<img src="img/shouhuodizhi.png"/>
							收货地址
						</a>
					</li>
					-->
				<li><a href="rest/userInfo/toBindtel"> <img
						src="img/bangdingshouji.png" /> 修改绑定手机
				</a></li>
				<li><a href="rest/userInfo/updatePassword"> <img
						src="img/xiugaimima.png" /> 修改密码
				</a></li>
			</ul>
			<div class="unlogin">
				<a href="rest/user/logout"> <img src="img/zhuxiao.png" /> 注销登陆
				</a>
			</div>
		</div>

	</div>
	<script src="<%=basePath %>js/jquery-2.2.4.min.js" type="text/javascript"></script>
	<script src="<%=basePath %>js/swiper-3.3.1.jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		
		(function(){
			$(function () {
				console.log(1)
				var mySwiper= new Swiper('.cars-roll',{
					slidesPerView:'auto'
				});
			})
			//解决侧边栏的js
			var menu = document.getElementsByClassName("nav-circle")[0];
			var model = document.getElementsByClassName("model")[0];
			var modelSlide = document.getElementsByClassName("model-slide")[0];
			menu.onclick = function() {
				model.style.display = "block";
				var rn = window.setTimeout(function() {
					modelSlide.style.marginLeft = "0px"
					document.body.style.position = "absolute";
					document.body.style.marginLeft = "260px";
					window.clearTimeout(rn);
				})
	
			}
			model.onclick = function(e) {
				if (e.target == this) {
					modelSlide.style.marginLeft = "-260px"
					document.body.style.position = "absolute";
					document.body.style.marginLeft = "0px";
					var rn = window
							.setTimeout(
									function() {
										document.getElementsByClassName("tab-bar")[0].style.position = "fixed";
										document.getElementsByClassName("tab-bar")[0].style.left = "0";
										document.getElementsByClassName("tab-bar")[0].style.bottom = "0";
										model.style.display = "none";
										window.clearTimeout(rn);
									}, 400);
				}
			}
		})()
	</script>
</body>
</html>