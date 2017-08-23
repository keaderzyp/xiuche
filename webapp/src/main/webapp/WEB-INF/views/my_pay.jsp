<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>我的账单</title>
<link href="css/my_pay-styles.css" rel="stylesheet">
</head>
<body>
	<div class="nav">
		<span class="nav-city"> <a href="rest/user/gotoMainDeal"> <img
				src="img/arrow-left.png" /> 返回
		</a>
		</span> <span class="nav-city"> 我的账单 </span>
	</div>
	<div class="pay-info">
		<div class="pay-info-circle">
			<div class="number">
				<span>￥</span> <span class="main"></span> <span></span>
			</div>
			<div class="title">已节省</div>
			<input id="aa" type="hidden" value="${jiesheng}" name="aa" /> <input
				id="bb" type="hidden" value="${totalPaxtakeMax}" name="bb" />

			<canvas id="circle" width="101" height="101"></canvas>
		</div>
		<div class="pay-info-total">
			<div class="info">
				<img src="img/car.png" />共计 ${count} 辆车
			</div>
			<div class="number">￥${totalFactPay}/${totalPaxtakeMax}</div>
		</div>
	</div>
	<div class="help-btns">
	<c:forEach var="list" items="${list}">
		<!-- <div class="btn line active tab-bar-icon">
			<a class="my-help"> <img src="img/duihuan.png" alt="" /> 我的求助
			</a>
		</div> -->
		<div class="btn  tab-bar-icon  " id="${list.id}">
			<a class="${list.title }"> <img src="img/duihuan.png" alt="" /> ${list.name }
			</a>
		</div>
		</c:forEach>
	</div>
	<!--我的求助页面-->
	<div class="my-help-page show">
		<c:forEach var="helpInfoList" items="${helpInfoList}">
			<div class="help-item">
				<div class="title">
					<img src="img/shigushijian.png" alt="" /> <span class="t1">
						${helpInfoList.helpTime}
					</span> <span class="t2"> 费用 </span> <span class="t3"> ¥<fmt:formatNumber value="${helpInfoList.factCost}" type="currency"
						pattern="0.00" />
					</span>
				</div>
				<div class="title">
					<img src="img/shigudidian.png" alt="" /> <span class="t1">
						<c:out value="${helpInfoList.happenPosition}"></c:out>
					</span> <span class="t2"> 实际支付 </span> <span class="t3 orange"> ¥<fmt:formatNumber value="${helpInfoList.ownerPay}" type="currency"
						pattern="0.00" />
					</span>
				</div>
				<div class="imgs">
					<div class="title">
						<c:out value="${helpInfoList.remark}"></c:out>
					</div>
					<ul>
					<c:set value="${fn:split(helpInfoList.imgs,',')}" var="names" />
						<c:forEach items="${names}" var="name">
							<li><img src="${tomcatImagesPath}${name}"	alt="" /></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</c:forEach>
	</div>

	<!--账单页面-->
	
	<div class="my-pay-page" id="scroller">
				<div class="my-pay-page show">
					<div class="gonggao-page" data-pageNo="1"></div>
				</div>
				<div id="pullUp">
					<span class="pullUpIcon"></span><span class="pullUpLabel"></span>
				</div>
			</div>
	<%-- <div class="my-pay-page">
		<c:forEach var="helpBillList" items="${helpBillList}">
			<div class="pay-item">
				<div class="pay-item-info"
					onclick="redirectTo('rest/carInfo/myPayInfo?titleId=${helpBillList.titleid}')">
					<div class="title">
						<span class="main"> ${helpBillList.billname} </span> 
						<span class="date"> ${helpBillList.timezone} </span>
					</div>
					<c:choose>
						<c:when test="${helpBillList.param1 == null || helpBillList.param1 == 0}">
							<div class="content">安全出行，无需分摊</div>
						</c:when>
						<c:otherwise>
							<div class="content">共计${helpBillList.param1}起分摊-${helpBillList.param4}位车主参与分摊</div>
						</c:otherwise>
					</c:choose>
				</div>
				<c:choose>
						<c:when test="${helpBillList.param1 == null || helpBillList.param1 == 0}">
							<div class="pay-item-number"></div>
						</c:when>
						<c:otherwise>
							<div class="pay-item-number">￥<fmt:formatNumber value="${PartakeMap[helpBillList.titleid]['factPay']}" type="currency"
						pattern="0.00" /></div>
						</c:otherwise>
					</c:choose>
				<c:if test="${helpBillList.param1 == null || helpBillList.param1 == 0}">
					<div class="pay-item-type">
						无需分摊
					</div>
				</c:if>
				<c:if test="${PartakeMap[helpBillList.titleid]['status']==2}">
					<div class="pay-item-type">
						<button>支付</button>
					</div>
				</c:if>
				<c:if test="${PartakeMap[helpBillList.titleid]['status']==1}">
					<div class="pay-item-type">
						已支付
					</div>
				</c:if>
			</div>
		</c:forEach>
	</div> --%>
</body>
<script src="assets/plugins/jquery/jquery-1.11.1.js"
		type="text/javascript" charset="utf-8"></script>
<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
var fenzi=document.getElementById("aa").value;
var fenmu=document.getElementById("bb").value;
		//实现canvas动画的闭包 参数1为节省多少钱 参数2为原价
		(function(jieSheng,yuanJia){
			"use strict";
			//获取canvas与绘图对象
			var c = document.getElementById("circle");
			var ctx = c.getContext("2d");
			//画圆背景
			function drawBG(){
				ctx.beginPath();
				ctx.strokeStyle='#85B2F6';
				ctx.lineWidth=8;
				ctx.lineCap='round';
				ctx.arc(c.width/2,c.height/2,46,0,Math.PI*2,false);
				ctx.stroke();
			}
			//根据节省多少钱的比例计算出来画圆弧
			function drawCircle(i){
				ctx.beginPath();
				ctx.strokeStyle='#FFFFFF';
				ctx.lineWidth=8;
				ctx.lineCap='round';
				ctx.arc(c.width/2,c.height/2,46,Math.PI,Math.PI*(1+i),false);
				ctx.stroke();
			}
			//节省多少钱的变量
			var jieSheng=jieSheng;
			//总共多少钱的变量
			var yuanJia=yuanJia;
			//根据钱数计算圆弧比例
			var bili = jieSheng/yuanJia*2;
			//圆弧动画计数器
			var count = 0;
			//数字变化计数器
			var countJieSheng=0;
			//圆弧动画定时器
			var rn = window.setInterval(function(){
				ctx.clearRect(0,0,c.width,c.height);
				drawBG();
				drawCircle(count);
				if(count<bili){
					count+=0.005;
				}else{
					window.clearInterval(rn);
				}
			},17);
			//数字动画定时器
			var rn1 = window.setInterval(function(){
				var num = document.getElementsByClassName('number')[0];
				if(countJieSheng<jieSheng){
					countJieSheng+=6.09;
					writeNumber(countJieSheng,num);
				}else{
					writeNumber(jieSheng,num);
					window.clearInterval(rn1);
				}
			},17);
			//转换数字结果进入标签
			function writeNumber(data,tag){
				var str = data.toString();
				var strs = str.split('.')
				var zhengShu = strs[0];
				var xiaoShu = strs[1].substring(0,2);
				if(zhengShu==0&&xiaoShu==0){
					tag.children[1].innerHTML='0';
					tag.children[2].innerHTML='.00';
				}else{
					tag.children[1].innerHTML=zhengShu;
					tag.children[2].innerHTML='.'+xiaoShu;
				}
				
			}
		})(fenzi,fenmu);
		//切换页面使用的闭包
		(function(){
			var tabs = document.getElementsByClassName('tab-bar-icon');
			for(var i=0;i<2;i++){
				tabs[i].addEventListener('click',changeTab);
			}
			function changeTab(){
				//console.log(this);
				for(var i=0;i<2;i++){
					removeClass(tabs[i],'active');
					var name = tabs[i].children[0].className;
					console.log(name)
					var tabPage = document.getElementsByClassName(name+'-page')[0];
					console.log(tabPage)
					removeClass(tabPage,'show');
				}
				var name = this.children[0].className;
				var tabPage = document.getElementsByClassName(name+'-page')[0];
				addClass(this,'active')
				addClass(tabPage,'show')
			}
			function addClass(tag,name){
				tag.className+=" "+name;
			}
			function removeClass(tag,name){
				tag.className = tag.className.replace(name,'');
			}
		})();
		
		//第一次打开时加载公告
	    $(function(){
	    	var url="rest/carInfo/showMyPay";
	    	var data = {pageNo:1};
	    	$.post(url,data,function(res){
	    		initInsetPage(res[0].list,'.gonggao-page');
	    		$('.gonggao-page')[0].dataset.pagetotal=res[0].pageTotal;
	    		$('.gonggao-page .load').remove();
	    	},'json');
	    });
		//加载内部页面的通用方法
	    function initInsetPage(list,pageName){
			console.log(list);
	    	for(var i=0;i<list.length;i++){
	    		var content;
	    		var number;
	    		var type;
	    		if(list[i].param1 == null || list[i].param1 == 0){
	    			content = '<div class="content"> 安全出行,无需分摊 </div>';
	    			number = '<div class="pay-item-number"></div>';
	    			type = '<div class="pay-item-type">无需分摊</div>';
	    		}else{
	    			content = '<div class="content"> 共计 ' + list[i].param1 +' 起分摊 -' +list[i].param4+ '位车主参与分摊 </div>';
	    			number = '<div class="pay-item-number">￥'+list[i].param9+'</div>';
	    		}
	    		if (list[i].param10==2) {
					type = '<div class="pay-item-type"><button>支付</button></div>';
				}
	    		if (list[i].param10==1) {
					type = '<div class="pay-item-type">已支付</div>';
				}
	    		$(pageName).append('<div class="pay-item" > '+
	    	'<div class="pay-item-info" onclick="redirectTo(\'rest/carInfo/myPayInfo?titleId='+list[i].titleid+'\')"> ' +
			'	<div class="title"> ' +
			'		<span class="main"> '+ list[i].billname + '</span>'+ 
			'		<span class="date"> '+ list[i].timezone + '</span>'+ 
			'	</div> '+
			content +
			'	</div> '+
			number+
			type+
		'</div>');
	    	}
	    }
		(function(){
			//当滑动到最底部时检测如果没有加载到最后一页就继续加载
			document.addEventListener('scroll',function(){
				if($("body").scrollTop()+window.innerHeight>=$("body").height()){
					if($('.gonggao-page').children('.load').length==0&&$('.gonggao-page')[0].dataset.pageno<$('.gonggao-page')[0].dataset.pagetotal){
						$(".gonggao-page").append('<div class="load">'+
								'<img src="img/loading.gif"/>'+
								'	上拉加载更多...'+
								'	加载中...'+
								'</div>');
						var url="rest/carInfo/showMyPay";
						var pageNo = parseInt($('.gonggao-page')[0].dataset.pageno)+1;
				    	var data = {pageNo:pageNo};
				    	$.post(url,data,function(res){
				    		//更新总页数信息
				    		$('.gonggao-page')[0].dataset.pagetotal = res[0].pageTotal;
				    		//如果有页数就更新
				    		if(res.length>0){
				    			initInsetPage(res[0].list,'.gonggao-page');
					    		$('.gonggao-page')[0].dataset.pageno = pageNo;
				    		}
				    		$('.gonggao-page .load').remove();
				    	},'json');  
					}
				}
			})
		})();
	</script>
</html>
