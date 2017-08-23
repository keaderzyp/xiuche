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
<title>基本信息</title>
<link rel="stylesheet" type="text/css"
	href="css/main_unlogin-styles.css" />
<link rel="stylesheet" type="text/css" href="css/user_info.css" />
<link rel="stylesheet" type="text/css" href="css/phone.css" />
</head>
<body>
<c:if test="${circleInfo!=null}">
	<div class="main-body">
		<div class="nav">
			<span class="nav-city"> <a
				href="rest/user/gotoMainDeal"> <img src="img/arrow-left.png" />
					返回
			</a>

			</span> <span class="nav-city"> 修改我的圈子 </span>
		</div>
		<form action="rest/circleAdd/update_friends"
			enctype="multipart/form-data" method="post">
			<ul class="user">
				<li class="user-head">
					<div class="title">头像</div>
					<img
					class="head-img" src="${tomcatImagesPath}circleIcon/${circleInfo.circleIco}"
					id="drivingLicenseVicePageImg" onclick='openFile()' /> <input id="drivingLicenseVicePageFile"
					name="drivingLicenseVicePageFile" type="file"
					accept="image/*;capture=camera"
					onchange="changeDrivingLicenseVicePageFile()" /> 
				</li>
				<li class="user-nickname tel">
					<div class="title">圈名称</div>
					<div class="content">
						<input type="text" name="circleName" value="${circleInfo.circleName }" />
					</div>
				</li>
			</ul>
			<div class="friends-info">
				<textarea name="circleDesc"  rows=""
					cols="">${circleInfo.circleDesc }</textarea>
			</div>
	</div>

	<div class="model">
		<div class="camera-photo">
			<button class="camera">拍照</button>
			<button class="photo">相册</button>
			<button class="cancel">取消</button>
		</div>
	</div>
	<div class="save long">

		<button type="submit">修改我的圈</button>
	</div>
	
		<div class="form-group" style="border: none;font-size: 15px;"><span style="margin:10px 50px;color:red">${error}</span></div>
	
	</form>
	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png" />
				<div class="model-title">圈子修改成功</div>
				<div class="model-content">您已成功修改圈子</div>
			</div>
			<div class="model-foot">
				<a href="my_friends.html" onclick="hideModel()"> 管理我的圈子 </a>
			</div>
		</div>
	</div>
	</c:if>
	<c:if test="${circleInfo==null}">
	<div class="main-body">
		<div class="nav">
			<span class="nav-city"> <a
				href="rest/user/gotoMainDeal"> <img src="img/arrow-left.png" />
					返回
			</a>

			</span> <span class="nav-city"> 创建我的圈子 </span>
		</div>
		<form action="rest/circleAdd/add_friends"
			enctype="multipart/form-data" method="post">
			<ul class="user">
				<li class="user-head">
					<div class="title">头像</div> <input id="drivingLicenseVicePageFile"
					name="drivingLicenseVicePageFile" type="file"
					accept="image/*;capture=camera"
					onchange="changeDrivingLicenseVicePageFile()" /> <img
					class="head-img" src="${tomcatImagesPath}circleIcon/${circleInfo.circleIco}"
					id="drivingLicenseVicePageImg" onclick='openFile()' />
				</li>
				<li class="user-nickname tel">
					<div class="title">圈名称</div>
					<div class="content">
						<input type="text" name="circleName" placeholder="请输入圈名称" />
					</div>
				</li>
			</ul>
			<div class="friends-info">
				<textarea name="circleDesc" placeholder="请输入圈子的介绍，15-500字" rows=""
					cols=""></textarea>
			</div>
	</div>

	<div class="model">
		<div class="camera-photo">
			<button class="camera">拍照</button>
			<button class="photo">相册</button>
			<button class="cancel">取消</button>
		</div>
	</div>
	<div class="save long">

		<button type="submit">创建我的圈</button>
	</div>
	
		<div class="form-group" style="border: none;font-size: 15px;"><span style="margin:10px 50px;color:red">${error}</span></div>
	
	</form>
	<div class="model">
		<div class="model-body">
			<div class="model-head">
				<img src="img/deal-success.png" />
				<div class="model-title">圈子创建成功</div>
				<div class="model-content">您已成功创建圈子，快去管理你的圈子吧</div>
			</div>
			<div class="model-foot">
				<a href="my_friends.html" onclick="hideModel()"> 管理我的圈子 </a>
			</div>
		</div>
	</div>
	</c:if>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
</body>
<script>
	//打开file
	function openFile() {
		document.getElementById('drivingLicenseVicePageFile').click()
	}

	//选择后事件
	function changeDrivingLicenseVicePageFile() {
		
		var url = getFileUrl("drivingLicenseVicePageFile");
		console.log(url);
		document.getElementById('drivingLicenseVicePageImg').src = url;
	}

	function getFileUrl(sourceId) {
		var url;
		if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE 
			url = document.getElementById(sourceId).value;
		} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
			url = window.URL
					.createObjectURL(document.getElementById(sourceId).files
							.item(0));
		} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
			url = window.URL
					.createObjectURL(document.getElementById(sourceId).files
							.item(0));
		}
		return url;
	}
</script>
<!-- <script type="text/javascript">
		//弹出底部选择的菜单
//		var headImg = document.getElementsByClassName("head-img")[0];
//		var model = document.getElementsByClassName("model")[0];
//		var mainBody = document.getElementsByClassName("main-body")[0];
//		headImg.onclick=function(){
//			model.style.display="block";
//			mainBody.style.filter="blur(3px)";
//			var cameraPhoto = document.getElementsByClassName("camera-photo")[0];
//			cameraPhoto.style.transform="translate(0px,0px)";
//		}
//		model.onclick=function(e){
//			if(e.target==this){
//				mainBody.style.filter="blur(0px)";
//				this.style.display="none";
//			}
//		}
//		var cancel = document.getElementsByClassName("cancel")[0];
//		cancel.onclick=function(){
//			mainBody.style.filter="blur(0px)";
//			model.style.display="none";
//		}
	//</script> -->
</html>