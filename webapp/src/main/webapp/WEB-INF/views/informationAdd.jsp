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
        <meta charset="UTF-8">
        <title>user manage</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<!-- page specific plugin styles -->
		<link href="css/check_page.css" rel="stylesheet"></head>
		
    </head>
    <body>
   
        <!-- #section:basics/content.breadcrumbs -->  
        <div class="breadcrumbs" id="breadcrumbs">  
            <script type="text/javascript">  
                try {  
                    ace.settings.check('breadcrumbs', 'fixed')  
                } catch (e) {  
                }  
            </script>  
  
            <ul class="breadcrumb">                           <!-- bread_crumb -->  
                <li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">首页</a>  
                </li>  
                <li><a href="#">资讯管理</a></li>  
                <li class="#">
                	<c:if test="${obj!=null }">
                		修改资讯详情
                	</c:if>
                	<c:if test="${obj==null }">
                		增加资讯详情
                	</c:if>
                </li>  
            </ul>  
            <!-- /.breadcrumb -->  
        </div>  
        <!-- /section:basics/content.breadcrumbs -->  
   		<div class="clearfix ">
	         <form id="addForm" action="<%=basePath %>rest/page/informationSave" class="clearfix" method="post">
	         	<input type="hidden" name="id" value="${obj.dynamicId }"/>
	         	<div class="form-group  col-md-6" >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				文章标题
	         			</label>
	         			<input type="text" name="title" placeholder="这里是文章的标题" class="form-control" value="${obj.title }">
	         		</div>
	         	</div>
	         	<div class="form-group col-md-6" >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				文章类型
	         			</label>
	         			<select class="form-control" name="type">
	         				<option value="%">请选择文章类型</option>
	         				<c:forEach items="${list_type }" var="obj_type">
		   						<option value="${obj_type.typeId }" ${obj_type.typeId==obj.type.typeId?"selected":"" } >${obj_type.typeName }</option>
		   					</c:forEach>
	         			</select>
	         		</div>
	         	</div>
	         	<div class="form-group col-md-6" >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				文章描述
	         			</label>
	         			<textarea class="form-control"  name="desciption" placeholder="请输入描述" rows="3" cols="">${obj.desciption }</textarea>
	         		</div>
	         	</div>
	         	<div class="form-group col-md-6" >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				备注
	         			</label>
	         			<textarea class="form-control"   name="remark" placeholder="请输入备注" rows="3" cols="">${obj.remark }</textarea>
	         		</div>
	         	</div>
	         	<div class="form-group col-md-12" >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				文章图标
	         			</label>
	         			<input type="file" name="icon" class="form-control">
	         		</div>
	         	</div>
	         	
	         	<div class="form-group col-md-12" >
	         		<h3>编辑文章内容</h3>
	         		<div>
		         		<ul class="list-group">
		         			<li class="list-group-item">文章使用的图片文件</li>
		         			<c:forEach items="${imgs }" var="imgObj">
		         				<li class="list-group-item">${imgObj.path }<span data-id="${imgObj.id }" data-path="${imgObj.path }" class="badge">删除</span></li>
		         			</c:forEach>
		         		</ul>
		         	</div>
	         		<textarea hidden="" name="content" rows="" cols=""></textarea>
	         		<div class="contentImgs " style="display:none" >
	         			<c:forEach items="${imgs }" var="imgObj">
	         				<input checked type="checkbox" name="imgs" value="${imgObj.name }"/>
	         			</c:forEach>
	         		</div>
	         		<div id="summernote">
	         			${content }
	         		</div> 
	         		
	         	</div>
	         	
	         	<div class="form-group text-center col-md-12 " >
	         		<button id="sub" data-url="<%=basePath %>rest/page/infContentSave?userid=${user.id}" type="button" class="btn btn-primary">提交</button>
	         		<button type="reset" class="btn btn-default">重置</button>
	         	</div>
	         </form>  
        </div>   
        
 		<script type="text/javascript">
	 		util_p.navigateTo('#sub','#addForm',function(){
				console.log('跳转页成功');
			},'post',"#main-content",function(){
				$("textarea[name='content']").html($(".note-editable").html());
				if(util_p.checkNull("[name='title']","标题不可以为空","#addForm")){
 					return false;
 				}
 				if(util_p.checkNull("[name='desciption']","文章描述不可以为空","#addForm")){
 					return false;
 				}
 				if(util_p.checkNull("[name='icon']","图标不可以为空","#addForm")){
 					return false;
 				}
 				if(util_p.checkNull("[name='remark']","备注不可以为空","#addForm")){
 					return false;
 				}
 				if(util_p.checkNull("[name='type']","请选择一个文章类型","#addForm")){
 					return false;
 				}
 				return true;
			});
 			/* $("#sub").on('click',function(){
 				$("textarea[name='content']").html($(".note-editable").html());
 				
 				$.ajax({
					url: this.dataset.url,
            		type: 'post',
            		cache: false,
            		data: new FormData($("#addForm")[0]),
            		processData: false,
            		contentType: false,
            		}).done(function(res) {
            			$("#main-content").html(res);
            		}).fail(function(res) {
            			
            		});
 			}); */
 			//初始化富文本编辑器
 			$(document).ready(function() {
 				  $('#summernote').summernote({
 				  	lang: 'zh-CN',
 				  	toolbar: [
 					    // [groupName, [list of button]]
 					    ['style', ['style','bold', 'italic', 'underline', 'clear']],
 					    ['font', ['strikethrough', 'superscript', 'subscript']],
 					    ['fontsize', ['fontsize','fontname']],
 					    ['color', ['color']],
 					    ['para', ['ul', 'ol', 'paragraph']],
 					    ['height', ['height']],
 					    ['insert',['picture','link','video','table','hr']],
 					    ['misc',['undo','redo','help','fullscreen']]
 					],
 				  	callbacks: {
 				  		//上传图片
 					    onImageUpload: function(files) {
 					      // upload image to server and create imgNode...
 					      console.log(files[0]);
 					      var formData = new FormData();
 					      formData.append('file',files[0])
 					     $.ajax({
 							url: '<%=basePath%>rest/page/informationImg',
 		            		type: 'POST',
 		            		cache: false,
 		            		data:formData ,
 		            		processData: false,
 		            		contentType: false,
 		            		dataType:'json',
 		            		}).done(function(res) {
 		            			console.log(res);
 		            			var id = res.imgName.substring(0,res.imgName.indexOf('.'));
 		            			//给文件列表添加信息
 		            			$(".list-group").append('<li class="list-group-item">'+res.filePath+'<span data-id="'+id+'" data-path="'+res.filePath+'" class="badge">删除</span></li>')
 		            			//给正文添加图片
 		            			$(".note-editable").append('<img id="'+id+'" src="<%=basePath%>img/'+res.imgName+'"/>');
 		            			//给提交数据添加结果
 		            			$(".contentImgs").append('<input type="checkbox" name="imgs" value="'+res.imgName+'" checked/>')
 		            		}).fail(function(res) {
 		            			
 		            		});
 					      console.log(1);
 					      //$summernote.summernote('insertNode', imgNode);
 					    },
 					    onBlur: function() {
 					      console.log($(".note-editable").html());
 					    }
 					},
 					placeholder: '输入编辑内容',
 					height: 300,                 // set editor height
 					minHeight: 300,
 				  });
 				});
 				//给删除按钮绑定删除事件
 				$(document).on('click','.badge',function(){
 					 var imgId = this.dataset.id.trim();
 					 var imgPath = this.dataset.path.trim();
 					 var that = $(this).parent();
 					 var formData = new FormData();
				     formData.append('path',imgPath)
				     //删除服务器上的图片成功后删除网页图片
 					 $.ajax({
						url: '<%=basePath%>rest/page/informationImgDel',
	            		type: 'POST',
	            		cache: false,
	            		data:formData,
	            		processData: false,
	            		contentType: false,
	            		dataType:'json',
	            		}).done(function(res) {
	            			if(res.success){
	            				//删除图片
	            				$("#"+imgId).remove();
	            				//从文件列表中删除图片
		     					that.remove();
	            				//从复选框中删除
	            				for(var i=0;i<$("input[name='imgs']").length;i++){
	            					if($("input[name='imgs']").eq(i).val().indexOf(imgId)!=-1){
	            						$("input[name='imgs']").eq(i).remove();
	            					}
	            				}
	            			}
	            		}).fail(function(res) {
	            			
	            		});
 				})
 		</script>
    </body>
</html>