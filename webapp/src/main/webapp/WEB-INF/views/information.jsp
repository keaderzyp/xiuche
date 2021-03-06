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
        <title>user manage</title>
        
        
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

		<meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<link href="assets/plugins/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet" type="text/css" />
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
                <li class="#">资讯内容查询</li>  
            </ul>  
            <!-- /.breadcrumb -->  
        </div>  
        <form id="queryForm" method="post">
        <!-- /section:basics/content.breadcrumbs -->  
        	<div class="form-horizontal">
	        	<div class="form-group">
	        		<div class="col-md-6">
	        			<div class="input-group">
	        				<div class="input-group-addon">
	        					根据类别
	        				</div>
	        				<select name="type" class="form-control">
	        					<option value="%">请选择</option>
			   					<c:forEach items="${list_type }" var="obj">
			   						<option value="${obj.typeId }" ${obj.typeId==n.type?"selected":"" }>${obj.typeName }</option>
			   					</c:forEach>
			   				</select>
	        			</div>
		        		
	        		</div>
	        		<div class="col-md-6">
		        		<div class="input-group">
	        				<div class="input-group-addon">
	        					根据标题
	        				</div>
	        				<input name="title" type="text" placeholder="请输入标题" value="${n.title }" class="form-control"/>
	        			</div>
	        		</div>
	   			</div>
	   			<div class="form-group">
	        		<div class="col-md-6">
		        		<div class="input-group " >
	        				<div class="input-group-addon">
	        					根据时间
	        				</div>
	        				<input name="beginTime" placeholder="起始时间" type="text" value="${n.beginTime }" data-date-format="yyyy/mm/dd" class="form-control date form_date"/>
	        				<input name="endTime" placeholder="起始时间" type="text" value="${n.endTime }"  data-date-format="yyyy/mm/dd" class="form-control date form_date"/>
	        			</div>
	        		</div>
	        		<div class="col-md-6">
		        		<div class="input-group">
	        				<div class="input-group-addon">
	        					根据创建人
	        				</div>
	        				<select  class="form-control" name="user_id">
	        					<option value="%">请选择</option>
			   					<c:forEach items="${list_user }" var="obj_user">
			   						<option value="${obj_user.id }" ${obj_user.id eq (n.user_id=="%"?-1:n.user_id )?"selected":"" }>${obj_user.username }</option>
			   					</c:forEach>
			   				</select>
	        			</div>
	        		</div>
	   			</div>
	   			<div class="from-group text-center">
	   				<button type="button" data-url="<%=basePath %>rest/page/information" id="queryBy" class="btn btn-success "> 根据条件查询</button>
	   				<button type="button" id="reset"  class="btn btn-default "> 重置条件</button>
	   				<button type="button" data-url="<%=basePath %>rest/page/informationContentPage" id="add"  class="btn btn-info ">增加数据</button>
					<button type="button" data-url="<%=basePath %>rest/page/delInfContent" id="del" class="btn btn-danger ">删除选中数据</button>
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
							<th>类型</th>
							<th>标题</th>
							<th>创建时间</th>
							<th>描述</th>
							<th>创建人</th>
							<th>备注</th>
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
								<input type="checkbox"  name="ids[]" value="${obj.dynamicId}"/>
							</td>
							<td>${obj.type.typeName }</td>
							<td>${obj.title }</td>
							<td>
								<fmt:formatDate value="${obj.issueTime }" pattern="yyyy-MM-dd"/>
							</td>
							<td>${obj.desciption }</td>
							<td>${obj.issuer }</td>
							<td>${obj.remark }</td>
							<td><a data-url="<%=basePath %>rest/page/informationContentPage?id=${obj.dynamicId}" class="btn edit btn-warning btn-xs"> 修改</a></td>
						</tr>
						
					</c:forEach> 
					</tbody>
				</table>
				<div class="text-right">
					<ul class="pagination">
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/information" data-pageno="1" >首页</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/information" data-pageno="${page.pageNo>1?page.pageNo-1:1 }" >上一页</a>
						</li>
						<li class="active">
							<a >${page.pageNo }</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/information" data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }" >下一页</a>
						</li>
						<li>
							<a class="pageTo" data-url="<%=basePath %>rest/page/information" data-pageno="${page.totalPages }" >尾页</a>
						</li>
						<li><a href="">共${page.totalPages }页</a></li>
						<li class="jump " data-url="<%=basePath %>rest/page/information" >
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
			//跳转页面代码
			util_p.navigateTo('#queryBy,#add,.edit,#del','#queryForm',function(){
				console.log('跳转页成功');
			},'post',"#main-content");
			$('.form_date').datetimepicker({
		        language:  'zh-CN',
		        weekStart: 1,
		        todayBtn:  1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 2,
				minView: 2,
				forceParse: 0
		    });
			
		</script>
    </body>
</html>