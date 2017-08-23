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
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>我的账单</title>
<link href="css/my_pay-styles.css" rel="stylesheet">
</head>
<link rel="stylesheet" type="text/css" href="css/my-friends.css" />

<body>
	<div class="nav">
		<span class="nav-city"> <a href="rest/user/gotoMainDeal"> <img
				src="img/arrow-left.png" /> 返回
		</a>
		</span> <span class="nav-city"> 我的圈子 </span> <span class="nav-city dian">
			<a href="rest/circleAdd/toUpdate_friends"> ··· </a>
		</span>
	</div>


	<div class="pay-info">
		<div class="pay-info-circle">
			<img src="${tomcatImagesPath}circleIcon//${circleInfo.circleIco}" alt="" />

		</div>
		<div class="pay-info-total">
			<div class="info">${circleInfo.circleName}</div>
			<div class="number">
				<span> 成员${userNum}/${circleInfo.maxNumber} </span>
			</div>
		</div>
		<div class="help-info">
			<div class="title">分摊上限</div>
			<div class="number">
				<span>${circleCarInfo.partakeMax}</span>元
			</div>
		</div>
	</div>
	<div class="shop">
		<div class="shop-head">
			<div class="title">圈友安全行驶第${safeDays}天</div>
		</div>
		<div class="friends">
			<ul>
				<c:forEach var="userOne" items="${userList}">
					<li><img src="${tomcatImagesPath}userIcon/${userOne.userIco}"
						style="width: 50; height: 50;" alt="" /></li>
				</c:forEach>
				<c:choose>
					<c:when test="${is_creater == 1}">
						<li><a href=""> <img src="img/add-friends.png" alt="" />
						</a></li>
					</c:when>
				</c:choose>

			</ul>
			<div class="add">
				<a href=""> ${userNum}名成员 <img src="img/arrow-right-gray.png"
					alt="" />
				</a>
			</div>
		</div>
	</div>
	<div class="shop chart">
		<div class="shop-head">
			<div class="title">圈子报告</div>

		</div>
		<ul class="goods">
			<li>
				<p class="green">
					${circleCarInfo.help_count}<span>/${circleCarInfo.all_count}</span>
				</p>
				<p class="good-title">互助生效车辆</p>
			</li>
			<li>
				<c:if test="${circleCarInfo.avg_price!=null}">
					<p class="blue">
						${priceZhengShu}<span>.${priceXiaoShu }</span>
					</p>
				</c:if> <c:if test="${circleCarInfo.avg_price==null}">
					<p class="blue">0</p>
				</c:if>
				<p class="good-title">车辆均价(万元)</p>
			</li>
			<li>
				<c:if test="${circleCarInfo.driver_year!=null}">
					<p class="blue">
						${yearZhengShu}<span>.${yearXiaoShu }</span>
					</p>
				</c:if> <c:if test="${circleCarInfo.driver_year==null}">
					<p class="blue">0</p>
				</c:if>
				<p class="good-title">平均车龄(年)</p>
			</li>
		</ul>
	</div>
	<div class="shop chart">
		<div class="shop-head">
			<div class="title">圈子介绍</div>
		</div>
		<div class="quanzi-content">${circleInfo.circleDesc}</div>
	</div>
</body>
</html>