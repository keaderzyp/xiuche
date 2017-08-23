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
									<th>方式</th>
									<th>金额</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${userPayList }" var="obj" varStatus="u">
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
