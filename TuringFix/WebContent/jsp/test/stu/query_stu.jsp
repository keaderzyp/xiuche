<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../include/include_code.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<link rel="stylesheet" type="text/css"  href="<%=ctx %>/css/theme-default.css" />

</head>
<body>
	<!-- 1.头不动     2.条件查询收缩   3.全选    4.清空 下拉框   5.分页信息 响应式     6.返回异常 -->
	<div class="page-content-wrap">
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="panel-title-box">
						<h3>学生信息</h3>
						<span>全校学生信息表</span>
					</div>
					<ul class="panel-controls" style="margin-top: 2px;">
						<li><a  data-toggle="collapse" data-target="#tjcx"><span class="fa fa-angle-down"></span></a></li>
						<li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
					</ul>
				</div>
				<div class="panel-body collapse in" id="tjcx">
					<form class="form-horizontal"  name="queryForm"
						action="<%=request.getContextPath()%>/stu/query.do" method="post">
						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label class="col-md-3 control-label">姓名</label>
									<div class="col-md-9">
										<div class="input-group">
											<span class="input-group-addon">
												<span class="fa fa-pencil"></span>
											</span> 
											<input type="text" name="name" value="${page.name}" class="form-control" />
										</div>
									</div>
								</div>
							</div>


							<div class="col-md-3">
								<div class="form-group">
									<label class="col-md-3 control-label">年龄:从</label>
									<div class="col-md-9 col-xs-12">
										<div class="input-group">
											<span class="input-group-addon">
												<span class="fa fa-step-backward"></span>
											</span> 
											<input type="text" class="form-control" name="ageFrom" value="${page.ageFrom}" />
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label class="col-md-3 control-label">到</label>
									<div class="col-md-9">
										<div class="input-group">
											<span class="input-group-addon">
												<span 	class="fa fa-step-forward"></span>
											</span> 
											<input type="text" class="form-control" name="ageTo" value="${page.ageTo}">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label class="col-md-3 control-label">班级</label>
									<div class="col-md-9">
									<div class="input-group">
										<span class="input-group-addon">
											<span class="fa fa-list"></span>
										</span> 
										<select class="form-control select" name="ctId">
											<option value="%">--全部--</option>
											<c:forEach var="ct" items="${ctList }">
												<option value="${ct.ctId }"
													<c:if test="${ct.ctId==page.ctId }">selected</c:if>>${ct.ctName }</option>
											</c:forEach>
										</select>
									</div>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="panel-body text-center">
					<div class="visible-xs">
						<button class="btn btn-primary btn-sm"   onclick="query()"><span class="fa fa-search"></span>查询</button>
						<button class="btn btn-primary btn-sm"  type="button" onclick="clearAll()"><span class="fa fa-eraser"></span>清空</button>
						<button onclick="location.href='<%=ctx %>/stu/addOrEditPage.do'" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus"></span>添加</button>
						<button class="btn btn-danger btn-sm" id="delRows" onclick="delRows()"><span class="glyphicon glyphicon-trash"></span>删除</button>
					</div>
					<div class="visible-sm visible-md visible-lg">
						<button class="btn btn-primary btn-lg"   onclick="query()"><span class="fa fa-search"></span>查询</button>
						<button class="btn btn-primary btn-lg"  type="button" onclick="clearAll()"><span class="fa fa-eraser"></span>清空</button>
						<button onclick="location.href='<%=ctx %>/stu/addOrEditPage.do'" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-plus"></span>添加</button>
						<button class="btn btn-danger btn-lg"  onclick="delRows()"><span class="glyphicon glyphicon-trash"></span>删除</button>
					</div>
				</div>



				<div class="panel-body">
					<div class="table-min table-responsive ">
						<table  class="table  table-actions table-striped table-hover ">
							<thead>
								<tr>
									<th width="2%"></th>
									<th width="3%"><input  class="icheckbox"  onclick="chk(this)" type="checkbox"></th>
									<th width="15%">操作</th>
									<th>姓名</th>
									<th>年龄</th>
									<th>班级</th>
									<th>好朋友</th>
									
								</tr>
							</thead>
							<tbody id="dataTable">
								<c:forEach items="${list}" var="stu" varStatus="i">
									<tr>
										<td  >${i.count }</td>
										<td><input class="icheckbox" type="checkbox" value="${stu.stuId}"/></td>
										<td >
											<button onclick="location.href='<%=request.getContextPath()%>/stu/addOrEditPage.do?id=${stu.stuId}'" class="visible-md-inline visible-sm-inline visible-lg-inline btn btn-primary">修改</button>
											<button onclick="deleteOne('${stu.stuId}',this)" class="visible-md-inline visible-sm-inline visible-lg-inline btn btn-danger">删除</button>
											<button onclick="location.href='<%=request.getContextPath()%>/stu/addOrEditPage.do?id=${stu.stuId}'" class="visible-xs-inline btn btn-xs btn-primary"><span class="fa fa-edit"></span></button>
											<button onclick="deleteOne('${stu.stuId}',this)" class="visible-xs-inline btn btn-xs  btn-danger"><span class="glyphicon glyphicon-trash"></span></button>
										</td>
										<td >${stu.stuName}</td>
										<td >${stu.stuInAge}</td>
										<td >${stu.ctName}</td>
										<td >${stu.pyNames }</td>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</div>
				</div>
				<div class="panel-footer  ">
					
					<div class="container text-center visible-xs">
						<label class="control-label" onclick="ajaxPage('${(page.pageNo+1)>page.pageCount?page.pageCount:(page.pageNo+1)}')" style="cursor:pointer">
							<span id="pgcolor" class="">点击查看更多内容</span>
							<span class="fa fa-angle-down"></span>
						</label>
					</div>
					<!-- 自定义分页标签 先在footer中创建一个 class＝pageTag的div 再用include引入jsp的文件，在引入文件的 -->
					<div class="pageTag visible-md visible-sm visible-lg">
						<div id="customers2_length" class="col-sm-6">
							<label>
							<span>每页显示</span>
								<select id="rows" onchange="turnRows()" class="" name="customers2_length" aria-controls="customers2">
									<option value="5" ${page.pageSize==5?"selected":"" }>5</option>
									<option value="10" ${page.pageSize==10?"selected":"" }>10</option>
									<option value="30" ${page.pageSize==30?"selected":"" }>30</option>
									<option value="50" ${page.pageSize==50?"selected":"" }>50</option>
								</select>
							<span>条</span>	 
							&nbsp;&nbsp;&nbsp;     
							<span>从</span> <span id="rowFrom" >${page.pageSize*(page.pageNo-1)+1 }</span> 到 <span id="rowTo" >${page.pageSize*page.pageNo>page.pageTotalSize?page.pageTotalSize:page.pageSize*page.pageNo}</span><span>条 </span>
							共 <span id="rowCount" >${page.pageTotalSize }</span> 条
							</label>
						</div>
						<div id="customers2_paginate" class="dataTables_paginate ">
							<a href="javascript:pagego('1')" class="paginate_button previous disabled" aria-controls="customers2" data-dt-idx="0" tabindex="0">首页</a>
							<a href="javascript:pagego('${(page.pageNo-1)<1?1:(page.pageNo-1)}')" id="customers2_previous" class="paginate_button previous disabled" aria-controls="customers2" data-dt-idx="0" tabindex="0">前一页</a>
							<a id="ppp" href="javascript:ppp('${page.pageGroup }')"    class="paginate_button " aria-controls="customers2" data-dt-idx="0" tabindex="0">...</a>
							
							<span>
							
								<c:forEach  begin="1"  end="${(page.pageCount -(page.pageGroup-1)* page.pageGroupSize) >page.pageGroupSize ? page.pageGroupSize :( page.pageCount -(page.pageGroup-1)* page.pageGroupSize )}"  varStatus="i">
									<a id="pagenumber${page.pageNo}"   href="javascript:pagego('${i.count+(page.pageGroup-1)* page.pageGroupSize}')" class="paginate_button  " aria-controls="customers2" data-dt-idx="${i.count+(page.pageGroup-1)* page.pageGroupSize}" tabindex="0">${i.count+(page.pageGroup-1)* 5}</a>
								</c:forEach>
								
							</span>
							<a id="nnn"  href="javascript:nnn('${page.pageGroup }')"  class="paginate_button " aria-controls="customers2" data-dt-idx="6" tabindex="0">...</a>
							<a  href="javascript:pagego('${(page.pageNo+1)>page.pageCount?page.pageCount:(page.pageNo+1)}')" id="customers2_next" class="paginate_button next" aria-controls="customers2" data-dt-idx="7" tabindex="0">后一页</a>
							<a  href="javascript:pagego('${page.pageCount }')" class="paginate_button next" aria-controls="customers2" data-dt-idx="7" tabindex="0">尾页</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<%@include file="../../../include/include.jsp"%>
<%@include file="../../../include/include_obj_action.jsp"%>

<script type="text/javascript">

	//移动端的分页方式解决方案
	var pno=${page.pageNo+1};
	var psz=${page.pageSize};
	function ajaxPage(p){
		//alert(p);
		$.get("<%=request.getContextPath()%>/stu/ajaxPage.do?pageNo="+pno+"&pageSize="+$("#rows").val(),"",function(msg){
			//alert(msg.length);
			//alert('${page.pageNo}');
			//由于页面不会刷新pageNo是定值但是条件查询会引发冲突，所以当pageNo不是1
			//的时候强制刷新回第一页
			var ppp='${page.pageNo}';
			if(ppp!='1'){
				location.href="<%=request.getContextPath()%>/stu/query.do?pageNo="+1+"&pageSize="+$("#rows").val();
				return;
			}
			if(pno<=parseInt('${page.pageCount }')){
				for(var i=0;i<msg.length;i++){
				
					var str="<tr> "+
				"		<td  >"+((pno-1)*psz+1+i) +"</td>"+
				"		<td><div class=\"icheckbox_minimal-grey\" style=\"position: relative;\"><input class=\"icheckbox\" type=\"checkbox\" value=\""+msg[i].stuId+"\" style=\"position: absolute; visibility: hidden;\"><ins class=\"iCheck-helper\" style=\"position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);\"></ins></div></td>"+
				"		<td >"+
				"			<button onclick=\"location.href='<%=request.getContextPath()%>/stu/addOrEditPage.do?id="+msg[i].stuId+"'\" class=\"visible-md-inline visible-sm-inline visible-lg-inline btn btn-primary\">修改</button>"+
				"			<button onclick=\"deleteOne('"+msg[i].stuId+"',this)\" class=\"visible-md-inline visible-sm-inline visible-lg-inline btn btn-danger\">删除</button>"+
				"			<button onclick=\"location.href='<%=request.getContextPath()%>/stu/addOrEditPage.do?id="+msg[i].stuId+"'\" class=\"visible-xs-inline btn btn-xs btn-primary\"><span class=\"fa fa-edit\"></span></button>"+
				"			<button onclick=\"deleteOne('"+msg[i].stuId+"',this)\" class=\"visible-xs-inline btn btn-xs  btn-danger\"><span class=\"glyphicon glyphicon-trash\"></span></button>"+
				"		</td>"+
				"		<td >"+msg[i].stuName+"</td>"+
				"		<td >"+msg[i].stuInAge+"</td>"+
				"		<td >"+msg[i].ctName+"</td>"+
				"		<td >"+msg[i].pyNames+"</td>"+
						
				"	</tr>";
				
				$("#dataTable").append(str);
				}
				pno++;
				$("#pgcolor").html("点击查看更多内容");
				$("#pgcolor").removeClass("text-muted");
			}else{
				$("#pgcolor").html("没有更多内容");
				$("#pgcolor").addClass("text-muted");
			}
			//alert($(".iCheck-helper:not(:first)").length);
			//让后创建的复选框可以选中的方法
		
			$(".iCheck-helper:gt("+((pno-2)*psz)+")").bind('click',chk);
		},"json");
	}

	function pagego(p){
		location.href="<%=request.getContextPath()%>/stu/query.do?pageNo="+p+"&pageSize="+$("#rows").val();
	}
	function turnRows(){
		location.href="<%=request.getContextPath()%>/stu/query.do?pageNo=1&pageSize="+$("#rows").val();
	}
	
 	function ppp(pg){
 		var pageSize=$("#rows").val();
 		var pageNo=(pg-2)*parseInt('${page.pageGroupSize}')+1;
 		window.location.href="<%=ctx%>/stu/query.do?pageNo="+pageNo+"&pageSize="+pageSize;
 	}
 	
 	function nnn(pg){
 		var pageSize=$("#rows").val();
 		var pageNo=(pg)*parseInt('${page.pageGroupSize}')+1;
 		window.location.href="<%=ctx%>/stu/query.do?pageNo="+pageNo+"&pageSize="+pageSize;
 	}
 	//让后创建的复选框选中的方法
 	function chk(){
			//alert(1);
			//alert($(this).parent().attr("class").indexOf("checked"))
			if($(this).parent().attr("class").indexOf("checked")==-1){
				$(this).parent().addClass("checked");
				$(this).prev().attr("checked",true);
 			}else{
 				$(this).prev().attr("checked",false)
 				$(this).parent().removeClass("checked");
 			}
		}
 	$(function(){
 		//主题样式的复选框全选的解决方案
 		$(".iCheck-helper:first").on("click",function(){
 			var name=$(".icheckbox_minimal-grey:first").attr("class");
 			//alert(name.indexOf("checked"))
 			if(name.indexOf("checked")!=-1){
 				$(".icheckbox_minimal-grey:not(:eq(0))").addClass("checked");
 				$(".icheckbox_minimal-grey:not(:eq(0)) > input").attr("checked",true);
 			}else{
 				$(".icheckbox_minimal-grey:not(:eq(0)) > input").attr("checked",false)
 				$(".icheckbox_minimal-grey:not(:eq(0))").removeClass("checked");
 			}
 	 		//$(".icheckbox_minimal-grey").addClass("checked");
 	 	}) 
 	 	
 	 	
 		//current
 		var as=$("a[id^=pagenumber]");
 		$.each(as,function(index,item){
 			
 			if($(item).html()=='${page.pageNo}'){
 				$(item).addClass("current");
 			}
 		});
 		
 		
 		if( parseInt('${page.pageCount}')<=5){		
 			$("#ppp").hide();
 			$("#nnn").hide();
 		}else if( parseInt('${page.pageCount}')>parseInt('${page.pageGroupSize}') && parseInt('${page.pageGroup}')==1){
 			$("#ppp").hide();
 			$("#nnn").show();
 		}else if( parseInt('${page.pageCount}')>parseInt('${page.pageGroupSize}')  && parseInt('${page.pageGroup}')>1  &&  (parseInt('${page.pageGroup}')*parseInt('${page.pageGroupSize}'))<parseInt('${page.pageCount}')){
 			$("#ppp").show();
 			$("#nnn").show();
 		}else if( parseInt('${page.pageCount}')>parseInt('${page.pageGroupSize}')  &&  parseInt('${page.pageGroup}')>1  &&  (parseInt('${page.pageGroup}')*parseInt('${page.pageGroupSize}'))>parseInt('${page.pageCount}')){
 			$("#ppp").show();
 			$("#nnn").hide();
 		}else{
 			$("#ppp").hide();
 			$("#nnn").hide();
 		}
 	});
 	
 	
 	
 	function clearAll(){
 		$("form[name=queryForm] input").val("");
 		//还原下拉菜单的方法
 		$("form[name=queryForm] select > option:eq(0)").attr("selected",true)
 		$("form[name=queryForm] select > option:not(:eq(0))").attr("selected",false)
 		$(".bootstrap-select > div > ul > li").removeClass("selected");
 		$(".bootstrap-select > div > ul > li:first").addClass("selected");
 		$(".bootstrap-select > button > span:first").html("--全部--")
 		//表单提交
		document.queryForm.submit();
 	}
 	

	function deleteOne(id,btn){
		$(btn).addClass("btn-rounded");
		if(confirm("是否要删除当前内容?")){
	 	 		window.location.href="<%=ctx%>/stu/delete.do?id="+id;
	 	}
		$(btn).removeClass("btn-rounded");
	}

 	
 	function delRows(){
 		//alert($(".icheckbox").length);
 		var delIds="";
 		 $.each($(".icheckbox:not(#ids)"),function(){
 			if($(this).prop("checked")){
 				delIds+=$(this).val()+"@";
 			}
 		}) 
 		if(delIds.toString().length>1){
 			if(confirm("是否要删除所选内容?")){
 	 	 		window.location.href="<%=ctx%>/stu/delRows.do?ids="+delIds;
 	 		}
 		}
 	
 	}
	
	function query(){
		//表单提交
		document.queryForm.submit();
	}
	
	</script>
</html>