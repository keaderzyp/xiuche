<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
        <base href="<%=basePath%>">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>上传行驶证</title>
		<link rel="stylesheet" type="text/css" href="css/FJL.css"/>
		<link rel="stylesheet" type="text/css" href="css/FJL.picker.css"/>
	<link href="css/upload-styles.css" rel="stylesheet"></head>
	<body>
		<div class="nav">
			<span class="back"> <a href="rest/user/gotoMainDeal"> <img
					src="img/arrow-left.png" /> 返回
			</a>
			</span>
			<span class="title">
				上传行驶证
			</span>
		</div>
	<form id="form1" action="rest/carInfo/scanCard" enctype="multipart/form-data" method="post" style="margin: 0; padding: 0px 50px">
		<ul class="choose-img">
			<li>
				<div style="display: none">
		 			<input id="drivingLicenseVicePageFile" type="file" name="drivingLicenseVicePageFile" onchange="changeDrivingLicenseVicePageFile()"/>
				</div>
				<c:choose>
			   		<c:when test="${first == 0}">  
						<img id="drivingLicenseVicePageImg" src="img/upload-main.png" onclick='openFile()' style="cursor:pointer;height: 94px;width: 168px;"/>
					</c:when>
					<c:otherwise>  
						<img id="drivingLicenseVicePageImg" src="${tomcatImagesPath}drivingLicense/${carInfo.drivingLicenseHomepage}" onclick='openFile()' style="cursor:pointer;height: 94px;width: 168px;"/>
			   		</c:otherwise>
			   	</c:choose>
				<div id="message" class="content">
					上传行驶证主页
				</div>
			</li>
		</ul>
		<div class="alert-content">
			<c:choose>
				<c:when test="${errorInfo != null}">
					<span style="color:red;font-size:16px;">${errorInfo}</span>
				</c:when>
				<c:otherwise>
					请提供清晰的照片，拍照时避免反光<br/>
					您上传的照片我们将严格保密
				</c:otherwise>
			</c:choose>
		</div>
	</form>
	<form id="form2" action="rest/carInfo/insertCarInfo"  method="post">
				<input type="hidden" name="drivingLicenseHomepage" value="${carInfo.drivingLicenseHomepage}"/>
				<input type="hidden" name="brandModel" value="${carInfo.brandModel}"/>
				<input type="hidden" name="owner" value="${carInfo.owner}"/>
				<input type="hidden" name="engineType" value="${carInfo.engineType}"/>
				<input type="hidden" id="plateNumber" name="plateNumber" value="${carInfo.plateNumber }"/>
				<input type="hidden" id="carVin" name="vin" value="${carInfo.vin }"/>
		
		<div class="car-license-info">
			<div class="title">
				车牌
			</div>
			<div class="content">
				<c:forEach var="item1" items="${plate_num}" varStatus="i">
					<label id="plate${i.index}">${item1}</label>
				</c:forEach> 		
			</div>
		</div>
		<div class="car-license-info pinpai">
			<div class="title">
				车辆识别代号
			</div>
				
			<div class="content-gray">
				<c:forEach var="item2" items="${vin}" varStatus="j">
					<label id="vin${j.index}">${item2}</label>
				</c:forEach> 		
			</div>
		</div>
		<div class="car-license-info group">
			<div class="title">
				注册日期
			</div>
			<div class="content">
				<input type="date" name="registerDate" value="<fmt:formatDate value='${carInfo.registerDate}' pattern='yyyy-MM-dd'/>"/> 
				<input type="hidden" name="certificateDate" value="<fmt:formatDate value='${carInfo.certificateDate}' pattern='yyyy-MM-dd'/>"/> 
			</div>
		</div>
		<button onclick="insertCarInfo()" type="button" class="save">保存</button>
		
		
		
	</form>
		<script src="js/FJL.min.js"></script>
		<script src="js/FJL.picker.min.js"></script>
		<script>
			
			(function($) {
				$.init();
				//解决输入问题
				var labels = document.getElementsByTagName("label");
				for(var i=0;i<labels.length;i++){
					labels[i].onclick=shuRu;
				}
				function shuRu(event){
						console.log(1);
						if(event.target=this){
							//原value
							var oldValue = this.innerHTML;
							console.log(oldValue);
							this.innerHTML="<input autofocus='autofocus'  class='ipt' />";
							this.children[0].value=""
							this.children[0].focus(); 
							this.children[0].onblur=function(){
								this.parentNode.onclick=shuRu;
								var val = this.value;
								console.log(val);
								console.log(oldValue);
								if(val=='' || val == ' '){
									this.parentNode.innerHTML = oldValue;
								}else{
									this.parentNode.innerHTML = val.trim();
								}
							}
							//判读输入
							var str = "";
							this.children[0].onkeydown=function(e){
								var keyCode = e.keyCode||e.which||e.charCode;
								if(keyCode!=8){
									if(this.value.length>=1){
										return false;
									}
								}
								
							}
							this.children[0].onkeyup=function(e){
								str = this.value;
								var keyCode = e.keyCode||e.which||e.charCode;
								if(str.length>1){
									str=str.substring(0,1);
								}
								this.value=str;
							}
							this.onclick=undefined;
						}
					}
				function yiChu(){
					var val = this.innerHTML;
					console.log(val+"====");
					/* if(this.innerHTML='' || this.innerHTML.replace(/^ +| +$/g,'')==''){
						this.innerHMTL = val;
					} */
				}
			})(mui);
		
			
			//保存提交
			function insertCarInfo() {	
				//获取车牌号
				var plateNum = "";
				for(var i=0;i<7;i++){
					plateNum += document.getElementById("plate"+i).innerHTML;
				}
				document.getElementById("plateNumber").value = plateNum;
				
				//获取vin				
				var vin = "";
				for(var j=0;j<17;j++){
					vin += document.getElementById("vin"+j).innerHTML;
				}
				document.getElementById("carVin").value = vin;

				var plateVal = document.getElementById("plateNumber").value;
				var vinVal = document.getElementById("carVin").value;
				if(plateVal == null || vinVal == null || plateVal.length !=7 || vinVal.length != 17){
					alert("您的车辆信息有错，请确保您没有改错或误删车辆信息！");
					return ;
				}

				if(confirm("请务必仔细核对车牌号和车辆识别码是否正确，确定现在提交吗？"))
				{
					document.getElementById("form2").submit();
				}
			}
			
			//打开file
			function openFile() {
				document.getElementById('drivingLicenseVicePageFile').click()
			}
			
			//选择后事件
			function changeDrivingLicenseVicePageFile() {
				var url = getFileUrl("drivingLicenseVicePageFile"); 
				document.getElementById('drivingLicenseVicePageImg').src = 'img/uploading.gif';
				document.getElementById('drivingLicenseVicePageImg').className = "message-load";
				document.getElementById('message').innerHTML = '信息获取中...';
				document.getElementById("form1").submit();
			} 
				
			function getFileUrl(sourceId) { 
				var url; 
				if (navigator.userAgent.indexOf("MSIE")>=1) { // IE 
				url = document.getElementById(sourceId).value; 
				} else if(navigator.userAgent.indexOf("Firefox")>0) { // Firefox 
				url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0)); 
				} else if(navigator.userAgent.indexOf("Chrome")>0) { // Chrome 
				url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0)); 
				} 
				return url; 
			}
		</script>

	</body>
</html>
