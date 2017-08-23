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
                <li class="#">资讯分类</li>  
            </ul>  
            <!-- /.breadcrumb -->  
        </div>  
        <form id="queryForm" method="post">
       		<div class="form-horizontal">
	        	<div class="form-group">
	        		<div class="col-md-12">
	        			<div class="input-group">
	        				<div class="input-group-addon">
	        					根据名称
	        				</div>
	        				<input name="typeName" type="text" placeholder="请输入标题" value="${n.typeName }" class="form-control"/>
	        			</div>
	        		</div>
	   			</div>
	   			<div class="from-group text-center">
	   				<button type="button" data-url="<%=basePath %>rest/page/informationType" id="queryBy" class="btn btn-success "> 根据条件查询</button>
	   				<button type="button" id="reset" class="btn btn-default "> 重置条件</button>
	   				<button type="button" data-url="<%=basePath %>rest/page/informationPage" id="add"  class="btn btn-info "> 增加数据</button>
					<button type="button" data-url="<%=basePath %>rest/page/delInformation" id="del" class="btn btn-danger "> 删除选中数据</button>
				</div>
        	</div>
            <!-- //表格 -->  
            <div class="row"> 
            	
                <div class="col-xs-12">  
                <hr/> 
             	  <table id="exmaple" class="table table-striped table-bordered table-advance table-hover">
					<thead>
						<tr class="blue">
							<th>
								序号
							</th>
							<th >
								<input type="checkbox" id="allchecked"/>
							</th>
							<th>类型名称</th>
							<th>图标名称</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach items="${list }" var="obj" varStatus="i">
						<tr>
							<td >
								${i.count }
							</td>
							<td >
								<input type="checkbox"  name="ids[]" value="${obj.typeId}@${obj.typeIcon }"/>
							</td>
							<td>${obj.typeName }</td>
							<td>${obj.typeIcon }</td>
							<td><button type="button" data-url="<%=basePath %>rest/page/informationPage?id=${obj.typeId}" class="btn edit btn-warning btn-xs"> 修改</button></td>
						</tr>
						
					</c:forEach>
					</tbody>
				</table>
				<div class="text-right">
					</div>
				<div class="text-right">
					<ul class="pagination">
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/informationType" data-pageno="1" >首页</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/informationType" data-pageno="${page.pageNo>1?page.pageNo-1:1 }" >上一页</a>
						</li>
						<li class="active">
							<a href="">${page.pageNo }</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/informationType" data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }" >下一页</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/informationType" data-pageno="${page.totalPages }" >尾页</a>
						</li>
						<li><a >共${page.totalPages }页</a></li>
						<li class="jump " data-url="<%=basePath %>rest/page/informationType" >
							<a>
								点击跳转到<input type="text"/>页
							</a>
						</li>
					</ul>
				</div>
				<hr/> 
             </div>
        </div>     
		</form>
		<!-- page specific plugin scripts -->
		<script type="text/javascript" src="js/web_util.js"></script>
		<script type="text/javascript">
			//跳转页页面
			util_p.navigateTo('#queryBy,#add,.edit,#del','#queryForm',function(){
				console.log('跳转页成功');
			},'post',"#main-content");
			
		</script>
    </body>
</html>