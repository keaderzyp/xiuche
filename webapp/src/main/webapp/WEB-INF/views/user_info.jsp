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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>基本信息</title>
<link rel="stylesheet" type="text/css"
	href="css/main_unlogin-styles.css" />
<link rel="stylesheet" type="text/css" href="css/user_info.css" />
<link rel="stylesheet" type="text/css" href="css/phone.css" />

</head>
<body>
	<div class="main-body">
		<div class="nav">
			<span class="nav-city" onclick="redirectTo('moments.html')"> <a
				href="rest/user/gotoMainDeal"> <img src="img/arrow-left.png" />
					返回
			</a>

			</span> <span class="nav-city"> 基本信息 </span>
		</div>
		<form id="form1" action="rest/userInfo/uploadUserIco"
			enctype="multipart/form-data" method="post">
			<ul class="user">
				<li class="user-head">
					<div class="title">头像</div> <input id="drivingLicenseVicePageFile"
					name="drivingLicenseVicePageFile" type="file"
					accept="image/*;capture=camera"
					onchange="changeDrivingLicenseVicePageFile()" /> <img
					class="head-img" src="${tomcatImagesPath}userIcon/${user.userIco}"
					id="drivingLicenseVicePageImg" onclick='openFile()' />
				</li>
				<li class="user-nickname">
					<div class="title">昵称</div>
					<div class="nickname">
						<a href="rest/userInfo/toNickname">
							${user.petName==null?user.username:user.petName} </a>
					</div>
				</li>
			</ul>
			<div class="save long">
				<button type="submit" class="save">保存</button>
			</div>
		</form>
	</div>

	<div class="model">
		<div class="camera-photo">
			<button class="camera">拍照</button>
			<button class="photo">相册</button>
			<button class="cancel">取消</button>
		</div>
	</div>

</body>
<script>
	//打开file
	function openFile() {
		document.getElementById('drivingLicenseVicePageFile').click()
	}

	//选择后事件
	function changeDrivingLicenseVicePageFile() {
		var url = getFileUrl("drivingLicenseVicePageFile");
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
</html>