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
                		修改资讯种类
                	</c:if>
                	<c:if test="${obj==null }">
                		增加资讯种类
                	</c:if>
                </li>  
            </ul>  
            <!-- /.breadcrumb -->  
        </div>  
        <!-- /section:basics/content.breadcrumbs -->  
   		<div class=" ">
	         <form id="addForm" action="<%=basePath %>rest/page/informationSave" class="" method="post">
	         	<input type="hidden" name="typeId" value="${obj.typeId}"/>
	         	
	         	<div class="form-group " >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				资讯种类名称
	         			</label>
	         			<input type="text" name="typeName" class="form-control" value="${obj.typeName }">
	         		</div>
	         	</div>
	         	<div class="form-group " >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				资讯图标名称
	         			</label>
	         			<input type="text" name="typeIcon" class="form-control" value="${obj.typeIcon }">
	         		</div>
	         	</div>
	         	<div class="form-group text-center" >
	         		图标预览
	         		<img alt="" src="img/${obj.typeIcon }.png">
	         	</div>
	         	<div class="form-group " >
	         		<div class="input-group ">
	         			<label class="input-group-addon">
	         				资讯图标
	         			</label>
	         			<input type="file" name="file" class="form-control">
	         		</div>
	         	</div>
	         	
	         	<div class="form-group text-center " >
	         		<button id="sub" data-url="<%=basePath %>rest/page/informationSave" type="button" class="btn btn-primary">提交</button>
	         		<button type="reset" class="btn btn-default">重置</button>
	         	</div>
	         </form>  
        </div>     
        <script type="text/javascript" src="js/web_util.js"></script>
 		<script type="text/javascript">
 			//给添加页的提交按钮增加点击事件
			util_p.navigateTo('#sub','#addForm',function(){
				console.log('添加成功');
			},'post',"#main-content",function(){
				if(util_p.checkNull("[name='typeName']","种类名称不可以为空","#addForm")){
 					return;
 				}
 				if(util_p.checkNull("[name='typeIcon']","图标名称不可以为空","#addForm")){
 					return;
 				}
 				if(util_p.checkNull("[name='file']","请选择一张图片上传","#addForm")){
 					return;
 				}
 				
 				return true;
			});
 		</script>
    </body>
</html>