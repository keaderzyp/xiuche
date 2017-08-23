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
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>注册成功</title>
		<link rel="stylesheet" type="text/css" href="css/register-styles.css"/>
    </head>
	<body>
		<div class="main-body-register">
			<a href="rest/userAdd/mainIndex"> 
				<img class="close" src="img/close.png" />
			</a>
			<div class="success-img">
				<img src="img/huzhuxieyiqiandingchenggongduihao.png" alt="" />
				<span>注册成功</span>
			</div>
			<div class="car-chart">
				<div class="title">
					1元！即可加入互助计划
				</div>
				<div class="info">
					至少降低50%的养车成本哦
				</div>
				<img src="img/tubiao.png"/>
			</div>
			<div class="save">
				<button onclick="window.location.href='rest/page/quick_learn-1?isGo=2'">快速了解互助修车计划</button>
			</div>
			<div class="role">
				享受权限
				
			</div>
			<div class="sanjiao">
				<div >
					
				</div>
			</div>
			<div class="role-img">
				<img src="img/xiangshou.png"/>
				
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/huzhuliucheng.png" alt="" />
					<div class="main">
						互助流程
					</div>
					<img class="foot" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content collapse">
					1.能过APP一键求助或拨打客服电话<br/>
					2.车管车全程一对一服务<br/>
					3.指定维修车家<br/>
					4.平台垫付费用<br/>
					5.用户满意签收<br/>
					6.次周资金分摊<br/>
				</div>
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/shiyongcheliang.png" alt="" />
					<div class="main">
						适用车辆
					</div>
					<img class="foot" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content collapse">
					1.车龄范围0-10年<br/>
					2. 非营运车辆<br/>
					3. 七座（含 ）以下<br/>
					4.平台开通城市 ：贵阳<br/>
				</div>
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/zhidingfanwei.png" alt="" />
					<div class="main">
						互助范围
					</div>
					<img class="foot up" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content ">
					意外产生的损失（互助期间内，因意外事故或自然灾害造成会员车辆直接损失。<br/>
					如由于：碰撞损坏、车身划伤、发动机被水淹、玻璃破碎等导致的损失）
				</div>
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/edu.png" alt="" />
					<div class="main">
						互助额度
					</div>
					<img class="foot" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content collapse">
					以实际维修价互助（会员单次损失的修复费用以及救援费用合计不超过事故发生时该车的市场价值
				</div>
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/weixiu.png" alt="" />
					<div class="main">
						车辆维修
					</div>
					<img class="foot" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content collapse">
					指定修车厂间进行专业维修
					4S店：100家<br/>
					A级车厂：300家<br/>
					B级车厂：200家<br/>
				</div>
			</div>
			<div class="collapse-btn">
				<div class="title">
					<img class="head" src="img/bangzhu.png" alt="" />
					<div class="main">
						常见问题
					</div>
					<img class="foot" src="img/fanzhuanjiantou.png"/>
				</div>
				<div class="content collapse">
					意外产生的损失（互助期间内，因意外事故或自然灾害造成会员车辆直接损失。如由于：碰撞损坏、车身划伤、发动机被水淹、玻璃破碎登导致的损失）
				</div>
			</div>
			
		</div>
		
		<button class="sub-btn" onclick="window.location.href='rest/userAdd/add_car'">1元加入计划</button>
		
		
	</body>
	<script type="text/javascript">
		var collapseBtn = document.getElementsByClassName("collapse-btn")
		for(var i=0;i<collapseBtn.length;i++){
			collapseBtn[i].onclick=function(){
				//console.log(this.children[0].children[2]);
				var arrow = this.children[0].children[2];
				var content = this.children[1];
				for(var j=0;j<collapseBtn.length;j++){
					var arrowOther = collapseBtn[j].children[0].children[2];
					var contentOther =  collapseBtn[j].children[1];
					if(arrowOther.className.indexOf("up")!=-1){
						arrowOther.className = arrowOther.className.replace("up","");
						contentOther.className+=" collapse";
					}
				}
				if(arrow.className.indexOf("up")!=-1){
					arrow.className = arrow.className.replace("up","");
					content.className+=" collapse";
				}else{
					arrow.className += " up";
					content.className = content.className.replace("collapse","");
				}
			}
		}
		
	</script>
</html>