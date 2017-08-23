<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="form1" action="rest/fileUpload" enctype="multipart/form-data"
	method="post" style="margin: 0; padding: 0px 50px">
	<label for="foodPictures" class="label-top">行程餐图片上传:</label> <input
		type="file" name="uploadFile" /> <input type="submit">提交</input>
</form>

<form id="form1" action="rest/fileUploads" enctype="multipart/form-data"
	method="post" style="margin: 0; padding: 0px 50px">
	<label for="foodPictures" class="label-top">行程餐图片上传:</label> <input
		type="file" name="uploadFile" /> <label for="foodPictures"
		class="label-top">行程餐图片上传1:</label> <input type="file"
		name="uploadFile" /> <input type="submit">提交
	</button>
</form>

<c:forEach items="${imagesList}" var="item">
	<img src="${tomcatImagesPath}${item.path}"/>
</c:forEach>


