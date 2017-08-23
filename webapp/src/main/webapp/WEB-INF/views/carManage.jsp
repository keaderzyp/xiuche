<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div class="form-horizontal" >
	<div class="form-group">
		<div class="col-md-3">	
       		<div class="input-group">
 				<div class="input-group-addon">
 					车牌号
 				</div>
 				<input name="platenum" type="text" placeholder="请输入车牌号" value="${u.platenum }" class="form-control"/>
 			</div>
      	</div>
      	<div class="col-md-3">
       		<div class="input-group " >
   				<div class="input-group-addon">
   					注册时间
   				</div>
   				<input name="beginTime" placeholder="起始时间" type="text" value="${u.beginTime }" data-date-format="yyyy/mm/dd" class="form-control date form_date"/>
   				<input name="endTime" placeholder="结束时间" type="text" value="${u.endTime }"  data-date-format="yyyy/mm/dd" class="form-control date form_date"/>
   			</div>
 		</div>
	</div>
	<div class="from-group text-center">
		<button type="button" data-url="<%=basePath%>rest/userInfo/carManage?id=${id}"
			class="btn btn-success queryBy">查询</button>
		<button id="reset" type="reset" class="btn btn-default ">重置</button>
		<button class="btn btn-danger " type="button" data-url="<%=basePath %>rest/userInfo/delCarInfo" id="del">
							删除 
						</button>
		<%-- <button type="button"
			data-url="<%=basePath%>rest/user/userAddPage" id="add"
			class="btn btn-info ">增加用户</button> --%>
		<%-- <button type="button" data-url="<%=basePath %>rest/page/delInfContent" id="del" class="btn btn-danger ">删除选中数据</button> --%>
	</div>
</div>

				<!-- //表格 -->
<div class="row">
	<div class="col-xs-12">
		<hr />
		<input type="hidden" name="id" value="${id }"/>
		<table id="exmaple"
			class="table table-striped table-bordered table-advance table-hover">
			<thead>
				<tr class="blue">
					<th>序号</th>
					<th><input type="checkbox" id="allchecked" /></th>
					<th>车牌号</th>
					<th>品牌型号</th>
					<th>发动机型号</th>
					<th>分摊上限制</th>
					<th>状态</th>
					<th>发证日期</th>
					<th>注册日期</th>
				</tr>
			</thead>
			<tbody>
            <c:forEach items="${list }" var="obj" varStatus="u">
				<tr>
					<td >
						${u.count }
					</td>
					<td >
						<input type="checkbox"  name="ids[]" value="${obj.id}"/>
					</td>
					<td>${obj.plateNumber }</td>
					<td>${obj.brandModel }</td>
					<td>${obj.engineType }</td>
					<td>${obj.partakeMax }</td>
					<td>${obj.status }</td>
					<td>
						<fmt:formatDate value="${obj.certificateDate }" pattern="yyyy-MM-dd"/>
					</td>
					<td>
						<fmt:formatDate value="${obj.registerDate }" pattern="yyyy-MM-dd"/>
					</td>			
			</c:forEach> 
				
			</tbody>
		</table>
		<div class="text-right">
			<ul class="pagination">
				<li><a class="pageTo"
					data-url="<%=basePath%>rest/userInfo/carManage" data-container="#innerPage" data-pageno="1">首页</a>
				</li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/carManage"
					data-pageno="${page.pageNo>1?page.pageNo-1:1 }" data-container="#innerPage">上一页</a></li>
				<li class="active"><a>${page.pageNo }</a></li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/carManage"
					data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }" data-container="#innerPage">下一页</a>
				</li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/carManage"
					data-pageno="${page.totalPages }" data-container="#innerPage">尾页</a></li>
				<li><a >共${page.totalPages }页</a></li>
				<li class="jump " data-url="<%=basePath%>rest/userInfo/carManage" data-container="#innerPage">
					<a> 点击跳转到<input type="text" />页
				</a>
				</li>
			</ul>
		</div>
		<hr />
	</div>
</div>
<script type="text/javascript" src="js/web_util_2.js"></script>
<script type="text/javascript">
	$(function(){
		//跳转页面代码
		util_p.navigateTo('.queryBy,#add,.edit,#del', '#queryForm', function() {
			console.log('跳转页成功');
		}, 'post', "#innerPage");
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	})
		
		
</script>
<script>
$('.form_date').datetimepicker({
	language : 'zh-CN',
	weekStart : 1,
	todayBtn : 1,
	autoclose : 1,
	todayHighlight : 1,
	startView : 2,
	minView : 2,
	forceParse : 0
});

</script>