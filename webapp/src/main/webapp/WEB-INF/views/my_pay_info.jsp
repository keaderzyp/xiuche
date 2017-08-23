<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
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
<meta charset="UTF-8">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>账单明细</title>
<link href="css/my_pay_info-styles.css" rel="stylesheet">
</head>
<body>
	<div class="nav">
		<span class="nav-city"> <a href="rest/carInfo/myPay"> <img
				src="img/arrow-left.png" /> 返回
		</a>

		</span> <span class="nav-city"> ${helpBill.billname} </span>
	</div>
	<div class="pay-info">
		<div class="pay-bar help-item-fentan">
			<div class="title">
				<span class="t1"> ${helpBill.billname} </span> <span class="t2">
					共计 </span> <span class="t3 orange"> ¥${helpPartake.factPay} </span>
			</div>
			<div class="pay-item">
				<div class="pay-item-info">
					<div class="title">
						<span class="date"> ${helpBill.timezone} </span>
					</div>
					<div class="content">
						共计${helpBill.param1}起分摊-${helpBill.param4}位车主参与分摊</div>
				</div>
				<form action="rest/carInfo/helpPay">
					<input type="hidden" id="money" name="money"
						value="${helpPartake.factPay}" />
					<c:if test="${status==2}">
						<div class="pay-item-type">
							<button>支付</button>
						</div>
					</c:if>
					<c:if test="${status==1}">
						<div class="pay-item-type">
						已支付
					</div>
					</c:if>
				</form>
			</div>
		</div>
	</div>
	<c:forEach var="helpInfoList" items="${helpInfoList}">
		<div class="help-item">
			<div class="title">
				<img src="img/shigushijian.png" alt="" /> <span class="t1">
					${helpInfoList.helpTime}" </span> <span class="t2"> 费用 </span> <span
					class="t3"> ￥${helpInfoList.factCost} </span>
			</div>
			<div class="title">
				<img src="img/shigudidian.png" alt="" /> <span class="t1">
					${helpInfoList.happenPosition} </span> <span class="t2"> </span> <span
					class="t3 orange"> </span>
			</div>
			<div class="imgs">
				<div class="title">${helpInfoList.remark}</div>
				<ul>
					<c:set value="${fn:split(helpInfoList.imgs,',')}" var="names" />
					<c:forEach items="${names}" var="name">
						<li><img src="${tomcatImagesPath}${name}" alt="" /></li>
					</c:forEach>
				</ul>
			</div>
			<div class="help-item-fentan">
				<div class="title">
					<span class="t1"> 分摊费用 </span>

					<c:set value="0" var="money" />
					<c:forEach var="carInfoList" items="${helpInfoList.carInfo}">
						<span class="t2"> <span>${carInfoList.plateNumber} </span></span>
						<span class="t3"> ￥${carInfoList.param10} </span>
						<c:set value="${money+carInfoList.param10}" var="money" />
					</c:forEach>
				</div>
			</div>
			<div class="title total">
				<span class="t1"> 合计 </span> <span class="t2"> </span> <span
					class="t3 orange"> ￥${money} </span>
			</div>
		</div>
	</c:forEach>
</body>
</html>