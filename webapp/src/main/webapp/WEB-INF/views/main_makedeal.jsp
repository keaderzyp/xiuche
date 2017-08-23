<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<link rel="stylesheet" type="text/css" href="css/FJL.css" />
<link rel="stylesheet" type="text/css" href="css/FJL.picker.css" />
<link href="css/upload-styles.css" rel="stylesheet">
</head>
<body>
	<div class="main-body">
		<div class="nav">
			<span class="back"> <a href="javascript:history.go(-1);">
					<img src="img/arrow-left.png" /> 返回
			</a>
			</span> <span class="title"> 签订互助协议 </span>
		</div>
		<div class="add-complete">
			<img src="img/success-white.png" alt="" /><br />
			${carInfo.plateNumber}&nbsp;添加成功 <span class="join">现在加入到互助圈吧</span>
			<span class="money">车辆事故未加入互助圈需要花费￥${countChargeMax}</span>
		</div>
		<div class="deal-content">
			<div class="blue-gray">
				<div class="left">加入后年分推上限￥<fmt:formatNumber type="number" value="${partakeMax}" pattern="0.00" maxFractionDigits="2"></fmt:formatNumber>元</div>
				<div class="right">可以节省￥<fmt:formatNumber type="number" value="${jiesheng}" pattern="0.00" maxFractionDigits="2"></fmt:formatNumber>元</div>
			</div>
			<img src="img/dealstep.png" />
			<div class="agree">
				<input type="checkbox" checked id="agree" /> 
				<label for="agree">本人同意签订 <a href="#"> 《互助协议》 </a></label>
			</div>
		</div>			
		<div class="date-btn">
			<div class="title">
				生效日期
			</div>
			<input class="date"  type="date" name="time1" id="time1" value="<fmt:formatDate  value="${defaultTime}" type="both" pattern="yyyy-MM-dd"/>"/>
			<button class="btn" onclick="sub1()">
				确认加入
			</button>
		</div>
	</div>
	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png" />
				<div class="model-title">互助协议签订成功！</div>
				<div class="model-content">欢迎加入互助互爱的大家庭！</div>
			</div>
			<form action="rest/userAdd/toUserShow" method="post">
			<div class="model-foot">
			<input type="hidden" name="time" id="time" />
			<input type="hidden" value="${carInfo.id}" name="carId" />
				<button style="color: #4089FF; border: none; font-size: 18px; padding-top: 15.5px;" onclick="hideModel()">开启新的旅程 </button>
			</div>
			</form>
		</div>
	</div>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/FJL.min.js"></script>
	<script src="js/FJL.picker.min.js"></script>
	<script>
	//互相签订协议模态框提交事件
	function sub1(){
		//验证是否选择签订协议,填写注册时间
		var agree = document.getElementById("agree");
		var registerDate = document.getElementsByClassName("date")[0].value;
		if(agree != undefined && agree != null){
			if(agree.checked == false){
				alert("请勾选同意签订《互助协议》");
				return;
			}
			if(registerDate == ""){
				alert("请选择生效日期");
				return;
			}
		}
		//提交事件可以在这里使用ajax发送请求
		document.getElementsByClassName('model')[0].removeEventListener('touchstart',removeModel);
		showModel();
		//document.getElementByName("time").value=document.getElementByName("time1").value;
		document.getElementById("time").value=document.getElementById("time1").value;
	}
	//互相签订协议显示模态框提交事件
	function showModel(){
		var model = document.getElementsByClassName("model")[0];
		document.getElementsByClassName('main-body')[0].style.filter="blur(3px)";
		model.style.display="block";
	}
	
		(function($) {

			$.init();
			//var result = $('#demo2')[0];
			var btns = $('.date-picker');
			btns.each(function(i, btn) {
				btn.addEventListener('tap',
						function() {
							var optionsJson = this.getAttribute('data-options')
									|| '{}';
							var options = JSON.parse(optionsJson);
							var id = this.getAttribute('id');
							/*
							 * 首次显示时实例化组件
							 * 示例为了简洁，将 options 放在了按钮的 dom 上
							 * 也可以直接通过代码声明 optinos 用于实例化 DtPicker
							 */
							var that = this;
							var picker = new $.DtPicker(options);
							console.log(picker.setSelectedValue);
							picker.show(function(rs) {
								console.log(rs);
								var d = new Date(rs.value);
								console.log(new Date(d.getTime() + 86400000));
								/*
								 * rs.value 拼合后的 value
								 * rs.text 拼合后的 text
								 * rs.y 年，可以通过 rs.y.vaue 和 rs.y.text 获取值和文本
								 * rs.m 月，用法同年
								 * rs.d 日，用法同年
								 * rs.h 时，用法同年
								 * rs.i 分（minutes 的第二个字母），用法同年
								 */
								that.innerHTML = rs.text;
								/* 
								 * 返回 false 可以阻止选择框的关闭
								 * return false;
								 */
								/*
								 * 释放组件资源，释放后将将不能再操作组件
								 * 通常情况下，不需要示放组件，new DtPicker(options) 后，可以一直使用。
								 * 当前示例，因为内容较多，如不进行资原释放，在某些设备上会较慢。
								 * 所以每次用完便立即调用 dispose 进行释放，下次用时再创建新实例。
								 */
								picker.dispose();
							});
						}, false);
			});

			var ups = $('.arrow-date-picker .up');
			ups.each(function(i, up) {
				up.addEventListener('touchstart', function() {
					var now = this.parentNode.parentNode.children[0].innerHTML;
					console.log(now.trim())
					var nows = now.trim().split('-');
					var d = new Date();
					d.setFullYear(nows[0], nows[1], nows[2]);
					d.setDate(d.getDate() + 1)
					var resDate = d.getFullYear() + '-' + (d.getMonth()) + '-'
							+ d.getDate();
					this.parentNode.parentNode.children[0].innerHTML = resDate;
				}, false);
			});
			var downs = $('.arrow-date-picker .down');
			downs.each(function(i, down) {
				down.addEventListener('touchstart', function() {
					var now = this.parentNode.parentNode.children[0].innerHTML;
					console.log(now.trim())
					var nows = now.trim().split('-');
					var d = new Date();
					d.setFullYear(nows[0], nows[1], nows[2]);
					d.setDate(d.getDate() - 1)
					var resDate = d.getFullYear() + '-' + (d.getMonth()) + '-'
							+ d.getDate();
					this.parentNode.parentNode.children[0].innerHTML = resDate;
				}, false);
			});
		})(mui);
	</script>

</body>
</html>
