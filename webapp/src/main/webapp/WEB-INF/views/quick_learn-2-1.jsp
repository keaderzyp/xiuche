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
<title>快速了解2-1</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<link href="css/login-styles.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/quick_learn.css" />
<link rel="stylesheet" type="text/css" href="css/swiper-3.3.1.min.css" />
</head>
<body>
	<c:if test="${isGo==2}">
		<div class="login-close">
			<a href="rest/userAdd/gotoRegister_done"> <img
				src="img/close.png" />
			</a>
		</div>
	</c:if>
	<c:if test="${isGo==1}">
		<div class="login-close">
			<a href="rest/userAdd/mainIndex"> <img src="img/close.png" />
			</a>
		</div>
	</c:if>
	<div class="swiper-container">
		<div class="swiper-wrapper">
			<div class="swiper-slide">
				<img src="img/quick_learn-1.png" /> <a
					href="rest/page/quick_learn-2-1?isGo=${isGo}">
					<button class="btn btn-info">老司机！只购买交强险+第三者责任险！</button>
				</a> <a href="rest/page/quick_learn-2-2?isGo=${isGo}">
					<button class="btn btn-success">保险意识强！全险那是必须的</button>
				</a>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-2-1.png" />
				<h4 class="title orange">人有失足，马有失蹄</h4>
				<p class="info">老司机也有翻车的时候</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-3.png" />
				<h4 class="title orange">是否在纠结</h4>
				<p class="info">
					上了全险用不上<br /> 不上全险一年修车支出也不少
				</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-4.png" />
				<p class="info">其实你还有另一种选择</p>
				<h4 class="title orange">加入互助修车计划</h4>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-5.png" />
				<h4 class="title">
					共享·互助<br /> 我为人人·人人为我
				</h4>
				<p class="info">每年至少节省50%的养车费用</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-6.png" />
				<h4 class="title">平台风控机制</h4>
				<p class="info">
					区块链——去信任化<br /> 大数据——甄选优质车主
				</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-7.png" />
				<h4 class="title">专业化服务</h4>
				<p class="info">
					平台车管家一对一专属服务<br /> 专业·安全·省心
				</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-8.png" />
				<h4 class="title">分摊方式</h4>
				<p class="info">
					不同价值车型分摊比例不同<br /> 少出事故少分摊，多出事故多分摊
				</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-9.png" />
				<h4 class="title">优质合作伙伴</h4>
				<p class="info">
					与一流的4s店及优秀修理厂<br /> 签订战略合作协议
				</p>
			</div>
			<div class="swiper-slide">
				<img src="img/quick_learn-10.png" />
				<h4 class="title">增值服务</h4>
				<p class="info">代保养、代验车、求援、违章代办、 车友会、更多增值服务陆续上线！</p>
				<a href="<%=basePath%>rest/userAdd/mainIndex">
					<button class="btn btn-info" >
						加入互助计划
					</button>
				</a>
			</div>
		</div>
		<div class="swiper-pagination"></div>
	</div>
	<script src="js/jquery-2.2.4.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/swiper-3.3.1.jquery.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script type="text/javascript">
		var s1 = new Swiper('.swiper-container', {
			pagination : '.swiper-pagination',
			initialSlide : 1,
		});
	</script>
</body>
</html>
