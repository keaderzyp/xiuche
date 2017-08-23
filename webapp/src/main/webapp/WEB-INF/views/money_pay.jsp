<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>互助币充值</title>
<link rel="stylesheet" type="text/css"
	href="css/moments_info-styles.css" />
<link rel="stylesheet" type="text/css" href="css/money.css" />
</head>
<body>
	<div class="nav">
		<a href="rest/user/gotoMainDeal"> <span class="nav-city">
				<img src="img/arrow-left.png" /> 返回
		</span>
		</a> <span class="nav-city"> 互助币充值 </span>
	</div>
	<div class="money-num-bar">
		<div class="title">
			<img src="img/jinbi.png" /> 互助币余额
		</div>
		<div class="num">	<fmt:formatNumber value="${user.param1}" type="currency" pattern="0.00"/> </div>
		 <a
				href="rest/userInfo/toMoneyInfo">
				<div class="btn">

				
           
<button class="btn-pay" onclick="showvalue();">
						支付详情
						</button>

				</div>
			</a>
	</div>
	
	<div class="alert">
		<img src="img/alert.png" />活动通知：
		<c:forEach var="money" items="${moneyDiscount}" varStatus="i">
				充￥${money.baseMoney}送￥${money.giveMoney}
				<c:if test="${!i.last}">,
				</c:if>
		</c:forEach>
		<br>
		<div class="alert">
		<img src="img/alert.png" />首充优惠：
		<c:forEach var="secmoney" items="${secmoneyDiscount}" varStatus="i">
				充￥${secmoney.baseMoney}送￥${secmoney.giveMoney}
				<c:if test="${!i.last}">,
				</c:if>
		</c:forEach>
		</br>
		
	</div>

	
	<div class="choose-pay">
		<div class="tr">
			<div class="td">50元</div>
			<div class="td">100元</div>
			<div class="td">200元</div>
		</div>
		<div class="tr">
			<div class="td">500元</div>

			<div class="td lg">
				<input type="text" value="请输入其他金额" name="" id="" value="" />
			</div>
			<div class="form-group" style="border: none; font-size: 15px;">
				<span style="margin: 10px 50px; color: red">${error}</span>
			</div>

		</div>
		<div class="bottom">
			到账互助币 <span id="total-num"></span>
		</div>
	</div>
		<div class="pay-type-title">支付方式</div>
		<div class="pay-type">
			<div class="pay-item" onclick="showvalue()">
				<img class="pay-img" src="img/weixin.png" />
				<div class="pay-title">微信支付</div>
				<div class="choose">&gt;</div>
			</div>
			<div class="pay-item" onclick="showvalue()">
				<img class="pay-img" src="img/zhifubao.png" />
				<div class="pay-title">支付宝</div>
				<div class="choose">&gt;</div>
			</div>
		</div>
	<div class="loading-body">
		<img src="img/loading.gif" />
	</div>
	
</body>
<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
<script src="js/loading.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
		(function(){
			var tds = document.getElementsByClassName("td");
			for(var i=0;i<tds.length;i++){
				tds[i].addEventListener("click",pick);
			}
			tds[tds.length-1].addEventListener('click',function(){
				console.log(this.children);
				this.children[0].focus();
				this.children[0].style.background=' #58A5FF';
				this.children[0].style.color="#FFFFFF";
				this.children[0].type='number';
				document.getElementById('total-num').innerHTML=0;
			});
			tds[tds.length-1].addEventListener('keyup',function(){
				document.getElementById('total-num').innerHTML=this.children[0].value;
			})
//			tds[tds.length-1].addEventListener('touchend',function(){
//				
//			})
			function pick(){
				clearStyle(tds,'active');
				addClass(this,'active');
				document.getElementById('total-num').innerHTML=parseInt(this.innerHTML);
			}
			function clearStyle(tags,name){
				tds[tds.length-1].children[0].style.background='#FFFFFF';
				tds[tds.length-1].children[0].style.color="#58A5FF";
				tds[tds.length-1].children[0].type='text';
				tds[tds.length-1].children[0].value="点击输入其他金额"
				for(var i=0;i<tds.length;i++){
					removeClass(tds[i],'active');
				}
			}
			function addClass(tag,name){
				tag.className+=" "+name;
			}
			function removeClass(tag,name){
				tag.className = tag.className.replace(name,'');
			}
		})();
		
		function showvalue(){
			window.location.href='rest/userInfo/AddMoney?pay='+document.getElementById('total-num').innerHTML;
		}
	</script>
</html>