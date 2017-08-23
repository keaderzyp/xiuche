<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>

<!-- BEGIN HEAD -->

<head>

        <base href="<%=basePath%>">
        <meta charset="UTF-8">


	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="<%=basePath%>assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

	<link href="<%=basePath%>media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="<%=basePath%>media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="<%=basePath%>media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="<%=basePath%>media/css/style.css" rel="stylesheet" type="text/css"/>


	<link href="<%=basePath%>media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>


	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES --> 

	<link href="<%=basePath%>media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>

	<link href="<%=basePath%>media/css/daterangepicker.css" rel="stylesheet" type="text/css" />

	<link href="<%=basePath%>media/css/fullcalendar.css" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>media/css/datetimepicker.css" />
	<link href="<%=basePath%>media/css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>

	<!-- END PAGE LEVEL STYLES -->

	<style type="text/css">
		.control-label{
			width: auto !important;
		}
		.portlet{
			margin: 0px !important;
		}
		tr{
			cursor: pointer;
		}
	</style>
			<style type="text/css">
			.jump{
				padding:0px;
				
			}
			.jump a{
				padding:6px !important;
				background-color:lightblue;
				color:whiter;
			}
			.jump input{
				padding:0px;
				border:none;
				outline:0px;
				width:20px
			}
		</style>
</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed aa" >

	
	<form id="queryForm" method="post" >
			<div class="portlet box grey">
				<div class="portlet-title ">
					<div class="caption"><i class="icon-bell"></i>事故记录</div>
					<div class="tools">
						<a href="javascript:;" class="collapse"></a>
						<a href="#portlet-config" data-toggle="modal" class="config"></a>
						<a href="javascript:;" class="reload"></a>
						<a href="javascript:;" class="remove"></a>
					</div>
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-advance table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="allCheck" /></th>
								<th><i class="icon-briefcase"></i> 事故编号</th>
								<th class="hidden-phone"><i class="icon-user"></i> 事故时间</th>
								<th><i class="icon-shopping-cart"></i> 事故地点</th>
								<th style="width: 300px;">事故说明</th>
								<th>费用</th>
								<th>状态</th>
							</tr>
						</thead>
						<tbody>
						                                <c:forEach items="${helpInfos}" var="helpInfos" varStatus="status">  
						                                    <tr  <c:if test="${status.index % 2 != 0}">style='background-color:#ECF6EE;'</c:if>>  
						                                        <td><input type="checkbox"  name="id" value="${helpInfos.helpId}"/></td>  
						                                        <td>${helpInfos.helpId}</td>  
						                                        <td>${helpInfos.helpTime}</td>  
						                                        <td>${helpInfos.happenPosition}</td>  
						                                        <td>${helpInfos.param2}</td> 
						                                        <td>${helpInfos.factCost}</td> 
						                                        <td>${helpInfos.status}</td> 
						                                    </tr>  
						                                </c:forEach>  
						</tbody>
					</table>
							<div class="text-right">
								<ul class="pagination">
									<li>
										<a class="pageTo" data-url="<%=basePath %>rest/help/getHelpInfoForBill" data-pageno="1" >首页</a>
									</li>
									<li>
										<a class="pageTo" data-url="<%=basePath %>rest/help/getHelpInfoForBill" data-pageno="${page.pageNo>1?page.pageNo-1:1 }" >上一页</a>
									</li>
									<li class="active">
										<a >${page.pageNo }</a>
									</li>
									<li>
										<a class="pageTo" data-url="<%=basePath %>rest/help/getHelpInfoForBill" data-pageno="${page.pageNo<page.totalPages?page.pageNo+1:page.totalPages }" >下一页</a>
									</li>
									<li>
										<a class="pageTo" data-url="<%=basePath %>rest/help/getHelpInfoForBill" data-pageno="${page.totalPages }" >尾页</a>
									</li>
									<li><a href="">共${page.totalPages }页</a></li>
									<li class="jump " data-url="<%=basePath %>rest/help/getHelpInfoForBill" >
										<a>
											点击跳转到<input type="text"/>页
										</a>
									</li>
								</ul>
							</div>
				</div>
			</div>
			</form>
			<!-- END PAGE CONTAINER-->    
		<!-- END PAGE -->
	
	<!-- END FOOTER -->

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->

	<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>

	<script src="media/js/excanvas.min.js"></script>

	<script src="media/js/respond.min.js"></script>  

	<![endif]-->   

	<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<script type="text/javascript" src="media/js/bootstrap-datetimepicker.js"></script>

	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL PLUGINS -->


	<script src="media/js/jquery.flot.js" type="text/javascript"></script>

	<script src="media/js/jquery.flot.resize.js" type="text/javascript"></script>

	<script src="media/js/jquery.pulsate.min.js" type="text/javascript"></script>

	<script src="media/js/date.js" type="text/javascript"></script>

	<script src="media/js/daterangepicker.js" type="text/javascript"></script>     

	<script src="media/js/jquery.gritter.js" type="text/javascript"></script>

	<script src="media/js/fullcalendar.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.easy-pie-chart.js" type="text/javascript"></script>

	<script src="media/js/jquery.sparkline.min.js" type="text/javascript"></script>  

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="media/js/app.js" type="text/javascript"></script>
	<script src="media/js/form-components.js"></script>  
	<script src="media/js/index.js" type="text/javascript"></script>        
				<script type="text/javascript" src="js/web_util.js"></script>

	<!-- END PAGE LEVEL SCRIPTS -->  

	<script>
		//返回给页面外的全局变量不支持跳页式分页因为变量会被重置
		var rn=[];
		jQuery(document).ready(function() {    
		   App.init(); // initlayout and core plugins
		   //FormComponents.init();
		   Index.init();
			//解决全选和反选效果并且控制表格的数据放置到全局返回变量或者清除
			//支持去重复，支持前端js分页
			$("#allCheck").on('click',function(){
				if($(this).prop('checked')){
					$("input[type='checkbox']:not(:eq(0))").parent().addClass('checked')
					$("input[type='checkbox']:not(:eq(0))").prop('checked',true);
					$("input[type='checkbox']:not(:eq(0))").parent().parent().parent().parent();
					for(var i=0;i<$("input[type='checkbox']:not(:eq(0))").length;i++){
						var tr = $("input[type='checkbox']:not(:eq(0))").eq(i).parent().parent().parent().parent();
						var info = getTRobj(tr);
						var repeat = false;
						for(var j=0;j<rn.length;j++){
							if(rn[j].id==info.id){
								repeat = true;
							}
						}
						if(repeat==false){
							rn.push(info);
						}
					}
				}else{
					$("input[type='checkbox']:not(:eq(0))").parent().removeClass('checked')
					$("input[type='checkbox']:not(:eq(0))").prop('checked',false);
					$("input[type='checkbox']:not(:eq(0))").parent().parent().parent().parent().removeClass('info');
					$("input[type='checkbox']:not(:eq(0))").parent().parent().parent().parent().css('color','#000000');
					for(var i=0;i<$("input[type='checkbox']:not(:eq(0))").length;i++){
						var id = $("input[type='checkbox']:not(:eq(0))").eq(i).val();
						for(var j=0;j<rn.length;j++){
							if(rn[j].id==id){
								console.log(1);
								rn.splice(j,1);
								break;
							}
						}
					}
					//console.log(rn);
				}
			})
			//单个点击每行时产生效果以及对全局返回变量的操作
			$('tbody tr').on('click',function(){
				var span = $(this).children().eq(0).children().eq(0).children().eq(0);
				var ipt = $(this).children().eq(0).children().eq(0).children().eq(0).children().eq(0);
				var info = getTRobj($(this));
				//console.log(id,accidentNo,accidentTime,accidentAddr,accidentInfo,accidentSale,accidentType);
				if(span.hasClass('checked')){
					span.removeClass('checked');
					ipt.prop('checked',false);
					$(this).css('color','#000000');
					$(this).removeClass('info');
					delObj(info.id,rn);
				}else{
					span.addClass('checked');
					ipt.prop('checked',true);
					$(this).addClass('info');
					rn.push(info);
				}
				//console.log(rn);
			});
			function getTRobj(tr){
				var info = {};
				var ipt = tr.children().eq(0).children().eq(0).children().eq(0).children().eq(0);
				info['id'] = ipt.val();
				info['helpId'] = tr.children().eq(1).html().trim();
				info['helpTime']  = tr.children().eq(2).html().trim();
				info['happenPosition']  = tr.children().eq(3).html().trim();
				info['param2']  =  tr.children().eq(4).html().trim();
				info['factCost']  =  tr.children().eq(5).html().trim();
				info['status']  = tr.children().eq(6).html().trim();
				return info;
			}
			function delObj(id,rn){
				for(var i=0;i<rn.length;i++){
					if(id==rn[i].id){
						//console.log(id==rn[i].id)
						rn.splice(i,1);
						return;
					}
				}
			}
			
			
			
			
			
			
		    $(".pagination .pageTo").on('click',function(){
		    	var pageNo = this.dataset.pageno;
		    	var url = this.dataset.url;
		    	$("#queryForm")[0].action= url+'?pageNo='+pageNo;
		    	$("#queryForm")[0].submit();
		    /* 	$.ajax({
		     		url: url+'?pageNo='+pageNo,
		     		type: 'POST',
		     		cache: false,
		     		data: new FormData($('#queryForm')[0]),
		     		processData: false,
		     		contentType: false,
		     		}).done(function(res) {
		     			 $("#frame").html(res);
		     		}).fail(function(res) {
		     			
		     		}); */
		    })
		    
		    
		});

	</script>

	<!-- END JAVASCRIPTS -->


<!-- END BODY -->

</html>