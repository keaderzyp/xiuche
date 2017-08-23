<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div class="form-horizontal">
	<div class="form-group">
		<div class="col-md-3">
			<div class="input-group">
				<div class="input-group-addon">状态</div>
				<!-- <input name="moneyName" type="text" placeholder="请输入费用名称" value=""
					class="form-control" /> -->
					<select name="type"  style="width: 150px">
						<option value="" ></option>
						<option value="1" ${"1"==u.type?"selected":"" }>发起求助</option>
						<option value="2" ${"2"==u.type?"selected":"" }>已派单</option>
						<option value="3" ${"3"==u.type?"selected":"" }>待检验</option>
						<option value="4" ${"4"==u.type?"selected":"" }>完成维修</option>
					</select>
			</div>
		</div>
		<div class="col-md-3">
			<div class="input-group ">
				<div class="input-group-addon">事故时间</div>
				<input name="beginTime" placeholder="起始时间" type="text" value="${u.beginTime }"
					data-date-format="yyyy/mm/dd"
					class="form-control date form_date" /> <input name="endTime"
					placeholder="结束时间" type="text" value="${u.endTime }"
					data-date-format="yyyy/mm/dd"
					class="form-control date form_date" />
			</div>
		</div>
	</div>
	
	<div class="from-group text-center">
		<button type="button" data-url="<%=basePath%>rest/userInfo/helpManage?id=${id}"
			id="queryBy" class="btn btn-success queryBy">查询</button>
		<button type="button" id="reset" class="btn btn-default ">重置</button>
		<%-- <button type="button"
			data-url="<%=basePath%>rest/user/userAddPage" id="add"
			class="btn btn-info ">增加用户</button> --%>
		<%-- <button type="button" data-url="<%=basePath %>rest/page/delInfContent" id="del" class="btn btn-danger ">删除选中数据</button> --%>
	</div>
</div>
<input type="hidden" name="id" value="${id }"/>
<!-- //表格 -->
<div class="row">
	<div class="col-xs-12">
		<hr />
		<table id="exmaple"
			class="table table-striped table-bordered table-advance table-hover">
			<thead>
				<tr class="blue">
					<th>ID</th>
					<th>求助信息</th>
					<th>车管家</th>
					<th>事故时间</th>
					<th>情况说明</th>
					<th>费用</th>
					<th>状态</th>
					<th>处理</th>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${helpInfoList }" var="obj" varStatus="u">
					<tr>
						<td>${obj.helpId }</td>
						<td>${obj.happenPosition }</td>
						<td>${obj.param5 }</td>
						<td><fmt:formatDate value="${obj.happenTime}" type="both" />
						<td>${obj.remark }</td>
						<td>${obj.factCost }</td>
						<td><c:choose>
								<c:when test="${obj.status == 1}">
			 						发起求助
			    				</c:when>
								<c:when test="${obj.status == 2}">
			 						 已派单
			   					 </c:when>
								<c:when test="${obj.status == 3}">
			 						 待验车
			   					 </c:when>
			   					 <c:when test="${obj.status == 4}">
			 						 完成维修
			   					 </c:when>
							</c:choose></td>
						<td>
							<c:choose>
								<c:when test="${obj.status == 1}">
			 						<a data-url="<%=basePath %>rest/help/goToMaintainAddr?helpId=${obj.helpId}"  class="btn edit btn-warning btn-xs" style='color:#f60'>维护事故地址</a>
			   					</c:when>
								<c:when test="${obj.status == 2}">
			 						<a href='#' style='color:#f60'>维护处理信息</a>
			 				    </c:when>
								<c:when test="${obj.status == 3}">
			 						 <a href='#' style='color:#f60'>待验车</a>
			  					</c:when>
			  					<c:when test="${obj.status == 4}">
			 						 <a href='#' style='color:black;'>完成维修</a>
			  					</c:when>
							</c:choose>
						</td>
						<%-- <td><a data-url="<%=basePath %>rest/user/getuserByid?id=${obj.id}" class="btn edit btn-warning btn-xs"> 查看</a>
				<a data-url="<%=basePath %>rest/user/lockUserByid?id=${obj.id}" class="btn edit btn-warning btn-xs"> 冻结</a>
			</td> --%>
					</tr>
				</c:forEach> 
			</tbody>
		</table>
		<div class="text-right">
			<ul class="pagination">
				<li><a class="pageTo"
					data-url="<%=basePath%>rest/userInfo/helpManage?id=${user.id }" data-pageno="1" data-container="#innerPage">首页</a>
				</li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/helpManage?id=${user.id }"
					data-pageno="${page.pageNo>1?page.pageNo-1:1 }" data-container="#innerPage">上一页</a></li>
				<li class="active"><a>${page.pageNo }</a></li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/helpManage?id=${user.id }"
					data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }" data-container="#innerPage">下一页</a>
				</li>
				<li><a class="pageTo"
					data-url="<%=basePath %>rest/userInfo/helpManage?id=${user.id }"
					data-pageno="${page.totalPages }" data-container="#innerPage">尾页</a></li>
				<li><a href="">共${page.totalPages }页</a></li>
				<li class="jump " data-url="<%=basePath%>rest/userInfo/helpManage?id=${user.id }" data-container="#innerPage"><a>
						点击跳转到<input type="text" />页
				</a></li>
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
