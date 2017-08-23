<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<title>user manage</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<link href="assets/css/profile.css" rel="stylesheet" type="text/css" />
<!-- page specific plugin styles -->
<!-- ace styles -->
<link rel="stylesheet" href="assets/css/ace_1.css"
	class="ace-main-stylesheet" id="main-ace-style" />
<link
	href="assets/plugins/bootstrap-datetimepicker/css/datetimepicker.css"
	rel="stylesheet" type="text/css" />
<style type="text/css">
.jump {
	padding: 0px;
}
.jump a {
	padding: 6px !important;
	background-color: lightblue;
	color: whiter;
}
.jump input {
	padding: 0px;
	border: none;
	outline: 0px;
	width: 20px
}
.headImage{
	padding:15px 0px;
}
.userInfo h3{
	margin:0px;
	padding:0px;
}
.userInfo ul li{
	padding:5px 0px;
}
</style>
</head>
<body>
	<form id="queryForm" method="post">
		<input type="hidden" id="id" value="${user.id }" />
		
		<div class="clearfix" id="">
			<div class="col-md-8">
				<%-- <img src="${tomcatImagesPath}userIcon/${user.userIco}" style="width:200px;border:1px solid" alt="" /> --%>
				<div class="col-md-5 headImage">
					<img src="img/t1.jpg" style="width:150px;border:1px solid" alt="" />
				</div>
				
				<div class="col-md-7 userInfo"> 
					<h3>
						当前状态：
						<c:choose>
							<c:when test="${user.state == 1}">已注册</c:when>
							<c:when test="${user.state == 2}">已入会</c:when>
							<c:when test="${user.state == 3}">已添加爱车</c:when>
							<c:when test="${user.state == 4}">已签订互助协议 </c:when>
							<c:when test="${user.state == 5}">互助生效</c:when>
							<c:when test="${user.state == 9}">用户冻结</c:when>
							<c:otherwise>无状态...请联系管理员</c:otherwise>
						</c:choose> 
					</h3>
					<ul class="list-unstyled list-group">
						<li><span>姓名:</span>${user.username } </li>
						<li><span>昵称:</span>${user.petName }</li>
						<li><span>性别:</span> ${user.sex }</li>
						<li><span>手机号码:</span>${user.telphone }</li>
						<li><span>注册时间:</span><fmt:formatDate value='${user.createTime }' pattern='yyyy-MM-dd HH:mm:ss'/></li>
					</ul>
				</div>
			</div>
			<div class="col-md-4">
				<div class="portlet sale-summary">
					<div class="portlet-title">
						<div class="caption">综合信息</div>
					</div>
					<ul class="unstyled">
						<li><span class="sale-info">累计访问次数 <i
								class="icon-img-up"></i></span> <span class="sale-num">23</span></li>
						<li><span class="sale-info">上次访问时间 <i
								class="icon-img-down"></i></span> <span class="sale-num">2017-07-15</span></li>
						<li><span class="sale-info">账户可用积分</span> <span
							class="sale-num">2377</span></li>
					</ul>
				</div>
			</div>
		</div>
		<hr/>
	
		<div class="row-fluid">
			<div class="tabbable tabbable-custom tabbable-full-width">
				<ul class="nav nav-tabs">
					<li class="active"><a data-url="<%=basePath %>rest/userInfo/controlInfo?id=${user.id }" data-toggle="tab" class="btn edit btn-warning btn-xs">操作记录</a></li>
					<li><a data-url="<%=basePath %>rest/userInfo/carManage?id=${user.id }" data-toggle="tab" class="btn edit btn-warning btn-xs">车辆管理</a></li>
					<li><a data-url="<%=basePath %>rest/userInfo/helpManage?id=${user.id }" data-toggle="tab" class="btn edit btn-warning btn-xs">求助记录</a></li>
					<li><a data-url="<%=basePath %>rest/userInfo/showUserPay?id=${user.id }" data-toggle="tab" class="btn edit btn-warning btn-xs">支付记录</a></li>
					<li><a data-url="<%=basePath %>rest/userInfo/scoreManage?id=${user.id }" data-toggle="tab" class="btn edit btn-warning btn-xs">积分兑换记录 </a></li>
				</ul>
				<br/>
				<br/>
				<div id="innerPage">
					<div class="form-horizontal" >
						<div class="form-group">
							<div class="col-md-3">
								<div class="input-group">
									<div class="input-group-addon">费用名称</div>
									<!-- <input name="moneyName" type="text" placeholder="请输入费用名称" value=""
										class="form-control" /> -->
										<select name="moneyName"  style="width: 150px">
											<option value=""></option>
											<option value="1">入会支付</option>
											<option value="2">小圈分摊</option>
											<option value="3">大圈分摊</option>
											<option value="4">商场购物</option>
											<option value="5">充值</option>
											<option value="6">充值赠送</option>
										</select>
								</div>
							</div>
							<div class="col-md-3">
								<div class="input-group">
									<div class="input-group-addon">支付方式</div>
									<!-- <input name="moneyType" type="text" placeholder="请输入支付方式" value=""
										class="form-control" /> -->
										<select name="moneyType" style="width: 100px">
											<option value=""></option>
											<option value="1">微信</option>
											<option value="2">支付宝</option>
											<option value="3">银行转账</option>
											<option value="4">互助币</option>
										</select>
									</div>
							</div>
							<div class="col-md-3">
								<div class="input-group ">
									<div class="input-group-addon">支付时间</div>
									<input name="beginTime" placeholder="起始时间" type="text" value=""
										data-date-format="yyyy/mm/dd"
										class="form-control date form_date" /> <input name="endTime"
										placeholder="结束时间" type="text" value=""
										data-date-format="yyyy/mm/dd"
										class="form-control date form_date" />
								</div>
							</div>
						</div>
						
						<div class="from-group text-center">
							<button type="button" data-url="<%=basePath%>rest/userInfo/showUserPay?id=${user.id}"
								id="queryBy" class="btn btn-success ">查询</button>
							<button type="reset" class="btn btn-default ">重置</button>
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
							<table id="exmaple"
								class="table table-striped table-bordered table-advance table-hover">
								<thead>
									<tr class="blue">
										<th>费用名称</th>
										<th>支付时间</th>
									</tr>
								</thead>
								<tbody>
									<%-- <c:forEach items="${userPayList }" var="obj" varStatus="u">
										<tr>
											<td><c:choose>
													<c:when test="${obj.payReason == 1}">
								 				入会支付
								    </c:when>
													<c:when test="${obj.payReason == 2}">
								 				 小圈分摊
								    </c:when>
													<c:when test="${obj.payReason == 3}">
								 				 大圈分摊
								    </c:when>
													<c:when test="${obj.payReason == 4}">
								 				商场购物
								    </c:when>
													<c:when test="${obj.payReason == 5}">
								 				充值
								    </c:when>
													<c:when test="${obj.payReason == 6}">
								 				 充值赠送
								    </c:when>
												</c:choose></td>
											<td><fmt:formatDate value="${obj.payTime}" type="both" />
											</td>
											<td><c:choose>
													<c:when test="${obj.payType == 1}">
								 				微信
								    </c:when>
													<c:when test="${obj.payType == 2}">
								 				 支付宝
								    </c:when>
													<c:when test="${obj.payType == 3}">
								 				 银行转账
								    </c:when>
													<c:when test="${obj.payType == 4}">
								 				互助币
								    </c:when>
												</c:choose></td>
											<td>${obj.pay}</td>
											<td><a data-url="<%=basePath %>rest/user/getuserByid?id=${obj.id}" class="btn edit btn-warning btn-xs"> 查看</a>
									<a data-url="<%=basePath %>rest/user/lockUserByid?id=${obj.id}" class="btn edit btn-warning btn-xs"> 冻结</a>
								</td>
										</tr>
									</c:forEach> --%>
								</tbody>
							</table>
							<div class="text-right">
								<ul class="pagination">
									<li><a class="pageTo"
										data-url="<%=basePath%>rest/userInfo/showUserPay?id=${user.id }" data-pageno="1">首页</a>
									</li>
									<li><a class="pageTo"
										data-url="<%=basePath %>rest/userInfo/showUserPay?id=${user.id }"
										data-pageno="${page.pageNo>1?page.pageNo-1:1 }">上一页</a></li>
									<li class="active"><a>${page.pageNo }</a></li>
									<li><a class="pageTo"
										data-url="<%=basePath %>rest/userInfo/showUserPay?id=${user.id }"
										data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }">下一页</a>
									</li>
									<li><a class="pageTo"
										data-url="<%=basePath %>rest/userInfo/showUserPay?id=${user.id }"
										data-pageno="${page.totalPages }">尾页</a></li>
									<li><a href="">共${page.totalPages }页</a></li>
									<li class="jump " data-url="<%=basePath%>rest/userInfo/showUserPay?id=${user.id }"><a>
											点击跳转到<input type="text" />页
									</a></li>
								</ul>
							</div>
							<hr />
						</div>
					</div>
				</div>
		   </div>
		</div>
	</form>
	<script type="text/javascript" src="js/web_util_2.js"></script>
	<script type="text/javascript">
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
		
		
	</script>
</body>
</html>