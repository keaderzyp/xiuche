<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>我的互助币</title>
<link rel="stylesheet" type="text/css"
	href="css/moments_info-styles.css" />
<link rel="stylesheet" type="text/css" href="css/money.css" />
</head>
<body>
	<div data-role="content">
		<div id="wrapper">
			<div class="nav">
				<a href="rest/user/gotoMainDeal"> <span class="nav-city">
						<img src="img/arrow-left.png" /> 返回
				</span>
				</a> <span class="nav-city"> 我的互助币 </span>
			</div>
			<div class="money-num-bar">
				<div class="title">
					<img src="img/jinbi.png" /> 互助币余额
				</div>
				<div class="num">
					<fmt:formatNumber value="${user.param1}" type="currency"
						pattern="0.00" />
				</div>
				<div class="btn">
					<a href="rest/userInfo/toMoneyPay">
						<button class="btn-pay">充值</button>
					</a>
				</div>
			</div>

			<div class="alert">
				<img src="img/alert.png" />活动通知：
				<c:forEach var="money" items="${moneyDiscount}" varStatus="i">
				充￥${money.baseMoney}送￥${money.giveMoney}
				<c:if test="${!i.last}">,
				</c:if>
				</c:forEach>
			</div>
			<div class="alert">
				<img src="img/alert.png" />首充优惠：
				<c:forEach var="secmoney" items="${secmoneyDiscount}" varStatus="i">
				充￥${secmoney.baseMoney}送￥${secmoney.giveMoney}
				<c:if test="${!i.last}">,
				</c:if>
				</c:forEach>
			</div>
			<div id="scroller">
				<div class="my-pay-page">
					<div class="gonggao-page" data-pageNo="1"></div>
				</div>
				<div id="pullUp">
					<span class="pullUpIcon"></span><span class="pullUpLabel">上拉加载更多...</span>
				</div>
			</div>
		</div>
	</div>
</body>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		//第一次打开时加载公告
	    $(function(){
	    	var url="rest/userInfo/showUserMoney";
	    	var data = {pageNo:1};
	    	$.post(url,data,function(res){
	    		initInsetPage(res[0].list,'.gonggao-page');
	    		$('.gonggao-page')[0].dataset.pagetotal=res[0].pageTotal;
	    		$('.gonggao-page .load').remove();
	    		//当页面内容高度小于窗口高度的90%时,隐藏加载更多
				if($("body").height()<(window.innerHeight*0.9) ){
					$("#pullUp").hide();
				}	
	    	},'json');
	    });
		//加载内部页面的通用方法
	    function initInsetPage(list,pageName){
	    	for(var i=0;i<list.length;i++){
	    		var d = new Date(list[i].payTime.time);
	    		var pay;
	    		if(list[i].payReason == 4){
	    			pay = '<div class="pay-item-number"> -' + list[i].pay + '</div>';
	    		}else{
	    			pay = '<div class="pay-item-number lime"> +' + list[i].pay + '</div>';
	    		}
	    		$(pageName).append('<div class="pay-item" > '+
	    	'<div class="pay-item-info" > ' +
			'	<div class="title"> ' +
			'		<span class="main"> '+ list[i].param1 + '</span>'+ 
			'	</div> '+
			'	<div class="content"> ' +
			d.getFullYear()+'-'+(d.getMonth()+1)+'-'+d.getDate()+' '+d.getHours()+':'+d.getMinutes()+':'+d.getSeconds()+
			'	</div> '+
			'</div> '+
			pay +
			'</div>' +
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
								'	加载中...'+
								'</div>');
						var url="rest/userInfo/showUserMoney";
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
		window.onload=function(){
			
		}
	
	</script>
</html>