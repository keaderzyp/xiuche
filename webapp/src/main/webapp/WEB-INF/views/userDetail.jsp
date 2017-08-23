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

	<link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	
		<link href="assets/css/profile.css" rel="stylesheet" type="text/css" />
	
	
	
		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="assets/css/jquery-ui.css" />
		<link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css" />
		<link rel="stylesheet" href="assets/css/ui.jqgrid.css" />


		<!-- ace styles -->
		<link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />



		<!-- inline styles related to this page -->


		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		        
    </head>
    <body>
    
    
			    <div class="tab-pane row-fluid" id="">
			
												<ul class="unstyled profile-nav span3">
			
			
													<div class="span6"><img src="assets/image/profile-img.png" alt="" /></div>
												</ul>
			
												<div class="span9">
			
													<div class="row-fluid">
			
														<div class="span8 profile-info">
			
															<h1>当前状态：<c:choose>
																    <c:when test="${userinfo.state == 1}">
																 				已注册
																    </c:when>
																    <c:when test="${userinfo.state == 2}">
																 				 已入会
																    </c:when>
																   <c:when test="${userinfo.state == 3}">
																 				 已添加爱车
																    </c:when>
																    <c:when test="${userinfo.state == 4}">
																 				 已签订互助协议
																    </c:when>
																    <c:when test="${userinfo.state == 5}">
																 				互助生效
																    </c:when>
																    <c:when test="${userinfo.state == 9}">
																 				 用户冻结
																    </c:when>
																    <c:otherwise>
																			无状态...请联系管理员
																    </c:otherwise>
																</c:choose>
															</h1>
			
															<ul class="unstyled span10">
			
																<li><span>姓名:</span> ${userinfo.username }</li>
						
																<li><span>昵称:</span> ${userinfo.petName }</li>
						
																<li><span>性别:</span> ${userinfo.sex }</li>
						
																<li><span>手机号码:</span>${userinfo.telphone }</li>
						
																<li><span>注册时间:</span><fmt:formatDate value='${userinfo.createTime}' pattern='yyyy-MM-dd HH:mm:ss'/></li>
						
															</ul>
			
			
															
			
														</div>
														<input type="hidden" id="userId" value="${userId}"/>
														<!--end span8-->
			
														<div class="span4">
			
															<div class="portlet sale-summary">
			
																<div class="portlet-title">
			
																	<div class="caption">综合信息</div>
			
			
																</div>
			
																<ul class="unstyled">
			
																	<li>
			
																		<span class="sale-info">累计访问次数 <i class="icon-img-up"></i></span> 
			
																		<span class="sale-num">23</span>
			
																	</li>
			
																	<li>
			
																		<span class="sale-info">上次访问时间 <i class="icon-img-down"></i></span> 
			
																		<span class="sale-num">2017-07-15</span>
			
																	</li>
			
																	<li>
			
																		<span class="sale-info">账户可用积分</span> 
			
																		<span class="sale-num">2377</span>
			
																	</li>
			
			
																</ul>
			
															</div>
			
														</div>
			
														<!--end span4-->
			
													</div>
			
													<!--end row-fluid-->
			
			
												</div>
			
												<!--end span9-->
			
											</div>   
    </br>   </br>
			<div class="row-fluid">

					<div class="tabbable tabbable-custom tabbable-full-width">

						<ul class="nav nav-tabs">

							<li class="active"><a data-toggle="tab" href="#tab_2_2">操作记录</a></li>

							<li><a data-toggle="tab" href="#tab_2_5">车辆管理</a></li>

							<li><a data-toggle="tab" href="#tab_2_3">求助记录</a></li>

							<li ><a data-toggle="tab" href="#tab_1_2">支付记录</a></li>

							<li><a data-toggle="tab" href="#tab_1_5">积分兑换记录 </a></li>

						</ul>

						<div class="tab-content">

							<div id="tab_2_2" class="tab-pane active">
											<!-- PAGE CONTENT BEGINS -->
			
											<table id="grid-table_userOper"></table>
			
											<div id="grid-pager_userOper"></div>
			
			
											<!-- PAGE CONTENT ENDS -->



							</div>

							<!--end tab-pane-->


							<!--end tab-pane-->

							<div id="tab_2_5" class="tab-pane">

											<!-- PAGE CONTENT BEGINS -->
			
											<table id="grid-table_userCar"></table>
			
											<div id="grid-pager_userCar"></div>
			
			
											<!-- PAGE CONTENT ENDS -->
									
									

							</div>
							<div id="tab_2_3" class="tab-pane">
											<!-- PAGE CONTENT BEGINS -->
			
											<table id="grid-table_Help"></table>
			
											<div id="grid-pager_Help"></div>
			
			
											<!-- PAGE CONTENT ENDS -->

							</div>
							
							<div id="modifyform" title="新增求助记录" style='display:none;'>  <!-- 该Div的作用就是当点击jqGrid表格中的修改链接时弹出的dialog, 注意是在上面的Modify(id)函数中给下面的input赋值 -->
								<form id="dialogForm" method="post" action="rest/help/maintainAddr">
							    <input type="hidden" id="addrId" name="helpId" />
							    <p><span>求助人：</span><input type="text" id="userName" name="param7" /></p>
							    <p><span>电话：</span><input type="text" id="telephone" name="param4"/></p>
							    <p><span>类型：</span><input type="checkbox"  name="param3" value="0"/>事故<input type="checkbox"  name="param3" value="1" />其他</p>
							    <!-- <p><span>求助时间：</span><input type="datetime"  name="helpTime"/></p> -->
							 <p><span>求助时间：<input class="m-wrap" size="16" type="text" value="" name="helpTime" id="ui_date_picker"/></p>
							    <p><span>求助地点：</span><textarea  name="happenPosition"/></p>
							    <p><span>车管家：</span><input type="text" id="carManager" name="param5" />
							    </p>
							  </form>  
							</div>
							
							<div id="modifyformHelpInfo" title="处理信息维护" style="display:none;">  <!-- 该Div的作用就是当点击jqGrid表格中的修改链接时弹出的dialog, 注意是在上面的Modify(id)函数中给下面的input赋值 -->
								<form id="dialogFormHelpInfo" method="post" action="rest/help/maintainInfo">
							    <input type="hidden" id="infoId" name="helpId" />
							    <p><span>情况说明：</span><textarea rows="3" cols="20" id="param2" name="param2" /></p>
							    <p><span>照片：</span><input type="file" id="param6" name="param6"/></p>
							    <p><span>维修费用：</span><input type="text" id="factCost" name="factCost" /></p>
							    <p><span>车主承担：</span><input type="text" id="ownerPay" name="ownerPay"/></p>
							 <!-- <p><span>求助时间：<input class="m-wrap" size="16" type="text" value="" name="helpTime" id="ui_date_picker"/></p> -->
							    <!-- <p><span>车主圈内分摊：</span><input type="text" id="" name="circlePay"/></p> -->
							  </form>  
							</div>
							<!--end tab-pane-->

							<div id="tab_1_2" class="tab-pane">

											<!-- PAGE CONTENT BEGINS -->
			
											<table id="grid-table_UserPay"></table>
			
											<div id="grid-pager_UserPay"></div>
			
			
											<!-- PAGE CONTENT ENDS -->

							</div>

							<!--end tab-pane-->


							<!--end tab-pane-->


							<!--end tab-pane-->

							<div id="tab_1_5" class="tab-pane">

											<!-- PAGE CONTENT BEGINS -->
			
											<table id="grid-table_scoreOper"></table>
			
											<div id="grid-pager_scoreOper"></div>
			
			
											<!-- PAGE CONTENT ENDS -->

							</div>

							<!--end tab-pane-->

						</div>

					</div>

					<!--end tabbable-->           

				</div>
    
    
    
    
    

						






		<!-- basic scripts -->



		<!-- page specific plugin scripts -->
		<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
		<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
		<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
		<script src="app/js/jquery-ui.min.js"></script>
		<script src="app/js/jquery-ui-timepicker-addon.js"></script>
		<script src="js/bootstrap.autocomplete.js"></script>
		

		
		
		
		
		<script type="text/javascript">
			
		var grid_data = [ {   
	        id: "m0",   
	        ddbh : "20160701001",  
	        ddlx : "制造订单",  
	        ddjb : "1级",  
	        khbh : "000201",  
	        khmc : "东风",  
	        khjb : "0级",  
	        jfrq : "2016-7-15",  
	        qsrq : "2016-7-03",  
	        ddzt : "已闭单"  
	    },{  
	        id: "m1",   
	        ddbh : "20160725001",  
	        ddlx : "制造订单",  
	        ddjb : "1级",  
	        khbh : "000105",  
	        khmc : "比亚迪",  
	        khjb : "1级",  
	        jfrq : "2016-8-15",  
	        qsrq : "2016-7-26",  
	        ddzt : "生产中"  
	    },  
	    {  
	        id: "m2",   
	        ddbh : "20160726001",  
	        ddlx : "制造订单",  
	        ddjb : "0级",  
	        khbh : "000122",  
	        khmc : "长城汽车",  
	        khjb : "2级",  
	        jfrq : "2016-8-08",  
	        qsrq : "2016-7-28",  
	        ddzt : "生产中"  
	    },  
	    {     
	        id: "m3",   
	        ddbh : "20160728001",  
	        ddlx : "制造订单",  
	        ddjb : "1级",  
	        khbh : "000102",  
	        khmc : "宇通",  
	        khjb : "0级",  
	        jfrq : "2016-8-11",  
	        qsrq : "2016-8-01",  
	        ddzt : "生产中"  
	    },  
	    {     
	        id: "m4",   
	        ddbh : "20160802001",  
	        ddlx : "制造订单",  
	        ddjb : "1级",  
	        khbh : "000203",  
	        khmc : "长安汽车",  
	        khjb : "0级",  
	        jfrq : "2016-8-12",  
	        qsrq : "2016-8-04",  
	        ddzt : "未生产"  
	    }];  
	  
	  
	    var subgrid_data = {  
	    m0:[{           //二级菜单  
	        cpbh : "20401150106",     //订单0  
	        cpmc : "产品2",   
	        cpxh : "m6",  
	        cpgg : "m6*1 45",  
	        cplx : "A类",  
	        gy :"工艺3",  
	        cpsl : 1000,  
	        scsl : 600  
	    }],   
	    m1:[{             
	        cpbh : "20401150106",     //订单1  
	        cpmc : "产品1",   
	        cpxh : "m6",  
	        cpgg : "m6*1 45",  
	        cplx : "A类",  
	        gy :"工艺1",  
	        cpsl : 2000,  
	        scsl : 1000  
	    }, {              
	        cpbh : "20401150207",  
	        cpmc : "产品2",   
	        cpxh : "m8",  
	        cpgg : "m8*1.25 45",  
	        cplx : "A类",  
	        gy :"工艺1",  
	        cpsl : 2000,  
	        scsl : 800  
	    }],  
	    m2:[{             
	        cpbh : "2040315038",    //订单2  
	        cpmc : "产品3",   
	        cpxh : "m14",  
	        cpgg : "m14*1 45",  
	        cplx : "C类",  
	        gy :"工艺1",  
	        cpsl : 2000,  
	        scsl : 700  
	    }],  
	    m3:[{             
	        cpbh : "20401150106",     //订单3  
	        cpmc : "产品1",   
	        cpxh : "m6",  
	        cpgg : "m6*1 45",  
	        cplx : "A类",  
	        gy :"工艺1",  
	        cpsl : 1000,  
	        scsl : 600  
	    }],  
	    m4:[{             
	        cpbh : "20405234531",     //订单4  
	        cpmc : "产品2",   
	        cpxh : "m6",  
	        cpgg : "m6*1 45",  
	        cplx : "A类",  
	        gy :"工艺2",  
	        cpsl : 1000,  
	        scsl : 500  
	    }]};  
	  
	    var userId = $("#userId").attr("value");
		$.ajax({  
	        async:false,  
	        type:'get',//get是获取数据，post是带数据的向服务器发送请求  
	        url:'rest/user/getUserOper?id=' + userId ,  
	        dataType:'json',  
	        success:function(data){  
	        	grid_data = data;
	        },  
	        error:function(data){
	            alert("JSON数据获取失败，请联系管理员！");  
	        }  
	    });
	    jQuery(function($) {  
			var grid_selector = "#grid-table_userOper";
			var pager_selector = "#grid-pager_userOper";  
	  
	        //resize to fit page size 调整自动适应页面大小  
/* 	        $(window).on(  
	                'resize.jqGrid',  
	                function() {  
	                    $(grid_selector).jqGrid('setGridWidth',  
	                            $(".page-content").width());  
	                })  
	        //resize on sidebar collapse/expand  调整工具栏  
	        var parent_column = $(grid_selector).closest('[class*="col-"]');  
	        $(document).on(  
	                'settings.ace.jqGrid',  
	                function(ev, event_name, collapsed) {  
	                    if (event_name === 'sidebar_collapsed'  
	                            || event_name === 'main_container_fixed') {  
	                        //setTimeout is for webkit only to give time for DOM changes and then redraw!!!  
	                        setTimeout(function() {  
	                            $(grid_selector).jqGrid('setGridWidth',  
	                                    parent_column.width());  
	                        }, 0);  
	                    }  
	                })  */ 
	  
	        //if your grid is inside another element, for example a tab pane, you should use its parent's width:  
	         
 				$(window).on('resize.jqGrid', function () {
					var parent_width = $(grid_selector).closest('.tab-pane').width();
					$(grid_selector).jqGrid( 'setGridWidth', parent_width );
				})
				//and also set width when tab pane becomes visible
				$('.tabbable a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
				  if($(e.target).attr('href') == '#tab_2_2') {
					var parent_width = $(grid_selector).closest('.tab-pane').width();
					$(grid_selector).jqGrid( 'setGridWidth', parent_width );
				  }
				}) 
	          
	  
	        jQuery(grid_selector)                            //grid_selector  
	                .jqGrid(  
	                        {  
	                            //direction: "rtl",  
	  
	                            //subgrid options  
	                            subGrid : false,                         //当此项设为true的时候，Grid表格的最左边将会添加一列，里面有一个“+”图标，用于展开子格  
	                            //subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],  
	                            //datatype: "xml",  
	                            subGridOptions : {  
	                                plusicon : "ace-icon fa fa-plus center bigger-110 blue",  
	                                minusicon : "ace-icon fa fa-minus center bigger-110 blue",  
	                                openicon : "ace-icon fa fa-chevron-right center orange"  
	                            },  
	                            //for this example we are using local data  
	                            subGridRowExpanded : function(subgridDivId, rowId) {    // (子表格的id,主表格中所要展开子表格的行的id)  当点击“+”展开子表格时，将触发此选项定义的事件方法；  
	                                var subgridTableId = subgridDivId + "_t";       //根据subgrid_id定义对应的子表格的table的id  
	                                var pager_id = "p_" + subgridTableId;  
	                                  
	                                $("#" + subgridDivId)  
	                                        .html(  
	                                                /* "<table id='" + subgridTableId + "'></table>" */  
	                                                 "<table id='" + subgridTableId + "' class='scroll'></table><div id='" + pager_id + "' class='scroll'></div>"  
	                                                      
	                                                );  
	                                                  
	                                $("#" + subgridTableId).jqGrid({        //subgrid_data显示格式  
	                                    datatype : 'local',  
	                                    data : subgrid_data[rowId],      //rowId  
	                                    /* caption : "产品信息表", */  
	                                      
	                                    colNames : ['产品编号', '产品名称','产品型号', '产品规格', '产品类型', '工艺', '产品数量','生产数量','操作'],  
	                                    colModel : [{  
	                                        name : 'cpbh',  //对应id  
	                                        width : 110,    //数据显示宽度  
	                                        sorttype : "int",  
	                                        editable : true  
	                                    }, {  
	                                        name : 'cpmc',  
	                                        width : 110 ,  
	                                        editable : true,  
	                                        editoptions : {  
	                                            size : "20",  
	                                            maxlength : "30"  
	                                        }  
	                                    }, {  
	                                        name : 'cpxh',  
	                                        width : 110 ,  
	                                        editable : true,  
	                                        edittype : "select",  
	                                        editoptions : {  
	                                            value : "FE:m6;IN:m8;TN:m14;AR:m16"  
	                                        }  
	                                    }, {  
	                                        name : 'cpgg',  
	                                        width : 110 ,  
	                                        editable : true,  
	                                        edittype : "select",  
	                                        editoptions : {  
	                                            value : "FE:m6*1 45;IN:m8*1.25 45;TN:m14*1 45;AR:m16*1 45"  
	                                        }  
	                                    }, {  
	                                        name : 'cplx',  
	                                        width : 110 ,  
	                                        editable : true,  
	                                        edittype : "select",  
	                                        editoptions : {  
	                                            value : "FE:A类;IN:B类;TN:C类;AR:D类"  
	                                        }  
	                                    }, {  
	                                        name : 'gy',  
	                                        width : 110,  
	                                        editable : true,  
	                                        edittype : "select",  
	                                        editoptions : {  
	                                            value : "FE:工艺1;IN:工艺2;TN:工艺3;AR:工艺4"  
	                                        }  
	                                    }, {  
	                                        name : 'cpsl',  
	                                        width : 110 ,  
	                                        sorttype : "int",  
	                                        editable : true  
	                                    } ,{  
	                                        name : 'scsl',  
	                                        width : 110 ,  
	                                        sorttype : "int",  
	                                        editable : true  
	                                    } ,{  
	                                        name : 'myac',  
	                                        index : '',  
	                                        width : 80,  
	                                        fixed : true,  
	                                        sortable : false,  
	                                        resize : false,  
	                                        formatter : 'actions',  
	                                        formatoptions : {  
	                                            keys : true,  
	                                            //delbutton: false,//disable delete button  
	                                            delOptions : {  
	                                                recreateForm : true,  
	                                                beforeShowForm : beforeDeleteCallback  
	                                            },  
	                                        //editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
	                                        }  
	                                    }],  
	                                      
	                            rowNum : 5,  
	                            rowList : [ 1, 2, 3],  
	                            pager: pager_id,  
	                            altRows : true,  
	                            multiselect : true,  
	                            multiboxonly : true,  
	                            loadComplete : function() {  
	                                var table = this;  
	                                setTimeout(function() {  
	                                    styleCheckbox(table);  
	  
	                                    updateActionIcons(table);  
	                                    updatePagerIcons(table);  
	                                    enableTooltips(table);  
	                                }, 0);  
	                            },  
	                                      
	                                });  
	                                  
	                                  
	                                    jQuery("#" + subgridTableId).jqGrid('navGrid',            //二级表格底部功能  
	                                      "#" + pager_id, {  
	                                            edit : false,  
	                                            add : true,  
	                                            addicon : 'ace-icon fa fa-plus-circle purple',  
	                                            addtitle: "增加新产品",  
	                                            search : true,  
	                                            searchicon : 'ace-icon fa fa-search orange',  
	                                            refresh : true,  
	                                            refreshicon : 'ace-icon fa fa-refresh green',  
	                                      },  
	                                        {  
	                                            //new record form  
	                                            //width: 700,  
	                                            closeAfterAdd : true,  
	                                            recreateForm : true,  
	                                            viewPagerButtons : false,  
	                                            beforeShowForm : function(e) {  
	                                                var form = $(e[0]);  
	                                                form.closest('.ui-jqdialog').find(  
	                                                        '.ui-jqdialog-titlebar').wrapInner(  
	                                                        '<div class="widget-header" />')  
	                                                style_edit_form(form);  
	                                            }  
	                                        },  
	                                        {  
	                                            //delete record form  
	                                            recreateForm : true,  
	                                            beforeShowForm : function(e) {  
	                                                var form = $(e[0]);  
	                                                if (form.data('styled'))  
	                                                    return false;  
	                          
	                                                form.closest('.ui-jqdialog').find(  
	                                                        '.ui-jqdialog-titlebar').wrapInner(  
	                                                        '<div class="widget-header" />')  
	                                                style_delete_form(form);  
	                          
	                                                form.data('styled', true);  
	                                            },  
	                                            onClick : function(e) {  
	                                                //alert(1);  
	                                            }  
	                                        });  
	                                  
	                            },  
	                            //url:"rest/user/userAll",
	                            data : grid_data, 
	            				datatype: "local",
	        					//mtype: "GET",
	                            //datatype : "local",  
	                            height : 275,  
	                            colNames : ['编号','时间','节点','金额', '状态'],   
	                            colModel : [  
	                                    {  
	                                        name : 'id',  
	                                        index : 'id',  
	                                          width : 120,    
	                                        sorttype : "int",  
	                                        editable : false  
	                                    },  
	                                    {  
	                                        name : 'createtime',  
	                                        index : 'createtime',  
	                                        editable : false,  
	                                        editoptions : {  
	                                            size : "20",  
	                                            maxlength : "30"  
	                                        }
	                                    },
	                                    {  
	                                        name : 'content',  
	                                        index : 'content',  
	                                        editable : false,  
	                                        editoptions : {  
	                                            size : "20",  
	                                            maxlength : "30"  
	                                        }  
	                                    },
	                                    {  
	                                        name : 'url',  
	                                        index : 'url',  
	                                        editable : false,  
	                                        editoptions : {  
	                                            size : "20",  
	                                            maxlength : "30"  
	                                        }  
	                                    },
	                                    {  
	                                        name : 'ip',  
	                                        index : 'ip',  
	                                        editable : false,  
	                                        editoptions : {  
	                                            size : "20",  
	                                            maxlength : "30"  
	                                        }  
	                                    }],  
	  
	                            viewrecords : true,  
	                            rowNum : 10,  
	                            rowList : [ 10, 20, 30 ],  
	                            pager : pager_selector,  
	                            altRows : true,  
	                            //toppager: true,  
	  
	                            multiselect : true,  
	                            //multikey: "ctrlKey",  
	                            multiboxonly : true,  
	  
	                            loadComplete : function() {  
	                                var table = this;  
	                                setTimeout(function() {  
	                                    styleCheckbox(table);  
	  
	                                    updateActionIcons(table);  
	                                    updatePagerIcons(table);  
	                                    enableTooltips(table);  
	                                }, 0);  
	                            },  
	                            editurl: "rest/user/manage",
	                            /* editurl : "/dummy.html",//nothing is saved */  
	                            caption : "操作记录"  
	  
	                        //,autowidth: true,  
	  
	                        /** 
	                        , 
	                        grouping:true,  
	                        groupingView : {  
	                             groupField : ['name'], 
	                             groupDataSorted : true, 
	                             plusicon : 'fa fa-chevron-down bigger-110', 
	                             minusicon : 'fa fa-chevron-up bigger-110' 
	                        }, 
	                        caption: "Grouping" 
	                         */  
	  
	                        });  
	        $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size  
	  
	        //enable search/filter toolbar  
	        //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})  
	        //jQuery(grid_selector).filterToolbar({});  
	  
	        //switch element when editing inline  
	        function aceSwitch(cellvalue, options, cell) {  
	            setTimeout(function() {                     //复选框  
	                $(cell).find('input[type=checkbox]').addClass(  
	                        'ace ace-switch ace-switch-5').after(  
	                        '<span class="lbl"></span>');  
	            }, 0);  
	        }  
	        //enable datepicker  
	        function pickDate(cellvalue, options, cell) {     //日期格式  
	            setTimeout(function() {  
	                $(cell).find('input[type=text]').datepicker({  
	                    format : 'yyyy-mm-dd',  
	                    autoclose : true  
	                });  
	            }, 0);  
	        }  
	  
	        //navButtons    页尾按钮  
	        jQuery(grid_selector).jqGrid(     
	                'navGrid',  
	                pager_selector,  
	                { //navbar options  
	                     edit : false,  
	                    /* editicon : 'ace-icon fa fa-pencil blue', */  
	                    add : false,  
	                    addicon : 'ace-icon fa fa-plus-circle purple',  
	                    del : false,  
	                    delicon : 'ace-icon fa fa-trash-o red',  
	                    search : true,  
	                    searchicon : 'ace-icon fa fa-search orange',  
	                    refresh : true,  
	                    refreshicon : 'ace-icon fa fa-refresh green',  
	                    /* view : true, 
	                    viewicon : 'ace-icon fa fa-search-plus grey', */  
	                },  
	                {  
	                                                                //edit record form  
	                    //closeAfterEdit: true,  
	                    //width: 700,  
	                    recreateForm : true,  
	                    beforeShowForm : function(e) {  
	                        var form = $(e[0]);  
	                        form.closest('.ui-jqdialog').find(  
	                                '.ui-jqdialog-titlebar').wrapInner(  
	                                '<div class="widget-header" />')  
	                        style_edit_form(form);  
	                    }  
	                },  
	                {  
	                    //new record form  
	                    //width: 700,  
	                    closeAfterAdd : true,  
	                    recreateForm : true,  
	                    viewPagerButtons : false,  
	                    beforeShowForm : function(e) {  
	                        var form = $(e[0]);  
	                        form.closest('.ui-jqdialog').find(  
	                                '.ui-jqdialog-titlebar').wrapInner(  
	                                '<div class="widget-header" />')  
	                        style_edit_form(form);  
	                    }  
	                },  
	                {  
	                    //delete record form  
	                    recreateForm : true,  
	                    beforeShowForm : function(e) {  
	                        var form = $(e[0]);  
	                        if (form.data('styled'))  
	                            return false;  
	  
	                        form.closest('.ui-jqdialog').find(  
	                                '.ui-jqdialog-titlebar').wrapInner(  
	                                '<div class="widget-header" />')  
	                        style_delete_form(form);  
	  
	                        form.data('styled', true);  
	                    },  
	                    onClick : function(e) {  
	                        //alert(1);  
	                    }  
	                },  
	                {  
	                    //search form  
	                    recreateForm : true,  
	                    afterShowSearch : function(e) {  
	                        var form = $(e[0]);  
	                        form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
	                                .wrap('<div class="widget-header" />')  
	                        style_search_form(form);  
	                    },  
	                    afterRedraw : function() {  
	                        style_search_filters($(this));  
	                    },  
	                    multipleSearch : true,  
	                /** 
	                multipleGroup:true, 
	                showQuery: true 
	                 */  
	                },  
	                {  
	                    //view record form  
	                    recreateForm : true,  
	                    beforeShowForm : function(e) {  
	                        var form = $(e[0]);  
	                        form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
	                                .wrap('<div class="widget-header" />')  
	                    }  
	                })  
	  
	        function style_edit_form(form) {  
	            //enable datepicker on "sdate" field and switches for "stock" field   //已改  
	            form.find('input[name=jfrq]').datepicker({  
	                format : 'yyyy-mm-dd',  
	                autoclose : true  
	            })  
	            form.find('input[name=qsrq]').datepicker({  
	                format : 'yyyy-mm-dd',  
	                autoclose : true  
	            })  
	  
	            form.find('input[name=stock]').addClass(  
	                    'ace ace-switch ace-switch-5').after(  
	                    '<span class="lbl"></span>');  
	            //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)  
	            //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');  
	  
	            //update buttons classes  
	            var buttons = form.next().find('.EditButton .fm-button');  
	            buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon  
	            buttons.eq(0).addClass('btn-primary').prepend(  
	                    '<i class="ace-icon fa fa-check"></i>');  
	            buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')  
	  
	            buttons = form.next().find('.navButton a');  
	            buttons.find('.ui-icon').hide();  
	            buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');  
	            buttons.eq(1)  
	                    .append('<i class="ace-icon fa fa-chevron-right"></i>');  
	        }  
	  
	        function style_delete_form(form) {  
	            var buttons = form.next().find('.EditButton .fm-button');  
	            buttons.addClass('btn btn-sm btn-white btn-round').find(  
	                    '[class*="-icon"]').hide();//ui-icon, s-icon  
	            buttons.eq(0).addClass('btn-danger').prepend(  
	                    '<i class="ace-icon fa fa-trash-o"></i>');  
	            buttons.eq(1).addClass('btn-default').prepend(  
	                    '<i class="ace-icon fa fa-times"></i>')  
	        }  
	  
	        function style_search_filters(form) {  
	            form.find('.delete-rule').val('X');  
	            form.find('.add-rule').addClass('btn btn-xs btn-primary');  
	            form.find('.add-group').addClass('btn btn-xs btn-success');  
	            form.find('.delete-group').addClass('btn btn-xs btn-danger');  
	        }  
	        function style_search_form(form) {  
	            var dialog = form.closest('.ui-jqdialog');  
	            var buttons = dialog.find('.EditTable')  
	            buttons.find('.EditButton a[id*="_reset"]').addClass(  
	                    'btn btn-sm btn-info').find('.ui-icon').attr('class',  
	                    'ace-icon fa fa-retweet');  
	            buttons.find('.EditButton a[id*="_query"]').addClass(  
	                    'btn btn-sm btn-inverse').find('.ui-icon').attr('class',  
	                    'ace-icon fa fa-comment-o');  
	            buttons.find('.EditButton a[id*="_search"]').addClass(  
	                    'btn btn-sm btn-purple').find('.ui-icon').attr('class',  
	                    'ace-icon fa fa-search');  
	        }  
	  
	        function beforeDeleteCallback(e) {  
	            var form = $(e[0]);  
	            if (form.data('styled'))  
	                return false;  
	  
	            form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
	                    .wrapInner('<div class="widget-header" />')  
	            style_delete_form(form);  
	  
	            form.data('styled', true);  
	        }  
	  
	        function beforeEditCallback(e) {  
	            var form = $(e[0]);  
	            form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
	                    .wrapInner('<div class="widget-header" />')  
	            style_edit_form(form);  
	        }  
	  
	        //it causes some flicker when reloading or navigating grid  
	        //it may be possible to have some custom formatter to do this as the grid is being created to prevent this  
	        //or go back to default browser checkbox styles for the grid  
	        function styleCheckbox(table) {             //  
	            /** 
	                $(table).find('input:checkbox').addClass('ace') 
	                .wrap('<label />') 
	                .after('<span class="lbl align-top" />') 
	             
	             
	                $('.ui-jqgrid-labels th[id*="_cb"]:first-child') 
	                .find('input.cbox[type=checkbox]').addClass('ace') 
	                .wrap('<label />').after('<span class="lbl align-top" />'); 
	             */  
	        }  
	  
	        //unlike navButtons icons, action icons in rows seem to be hard-coded  
	        //you can change them like this in here if you want  
	        function updateActionIcons(table) {  
	            /** 
	            var replacement =  
	            { 
	                'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue', 
	                'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red', 
	                'ui-icon-disk' : 'ace-icon fa fa-check green', 
	                'ui-icon-cancel' : 'ace-icon fa fa-times red' 
	            }; 
	            $(table).find('.ui-pg-div span.ui-icon').each(function(){ 
	                var icon = $(this); 
	                var $class = $.trim(icon.attr('class').replace('ui-icon', '')); 
	                if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]); 
	            }) 
	             */  
	        }  
	  
	        //replace icons with FontAwesome icons like above  
	        function updatePagerIcons(table) {  
	            var replacement = {  
	                'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',  
	                'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',  
	                'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',  
	                'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'  
	            };  
	            $(  
	                    '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')  
	                    .each(  
	                            function() {  
	                                var icon = $(this);  
	                                var $class = $.trim(icon.attr('class').replace(  
	                                        'ui-icon', ''));  
	  
	                                if ($class in replacement)  
	                                    icon.attr('class', 'ui-icon '  
	                                            + replacement[$class]);  
	                            })  
	        }  
	  
	        function enableTooltips(table) {  
	            $('.navtable .ui-pg-button').tooltip({  
	                container : 'body'  
	            });  
	            $(table).find('.ui-pg-div').tooltip({  
	                container : 'body'  
	            });  
	        }  
	  
	        //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');  
	  
	        $(document).one('ajaxloadstart.page', function(e) {  
	            $(grid_selector).jqGrid('GridUnload');  
	            $('.ui-jqdialog').remove();  
	        });  
	    });  		
		
			
			

			
		</script>
		
		
		
		
		
<script type="text/javascript">

			var grid_data = [ {   
			    id: "m0",   
			    ddbh : "20160701001",  
			    ddlx : "制造订单",  
			    ddjb : "1级",  
			    khbh : "000201",  
			    khmc : "东风",  
			    khjb : "0级",  
			    jfrq : "2016-7-15",  
			    qsrq : "2016-7-03",  
			    ddzt : "已闭单"  
			},{  
			    id: "m1",   
			    ddbh : "20160725001",  
			    ddlx : "制造订单",  
			    ddjb : "1级",  
			    khbh : "000105",  
			    khmc : "比亚迪",  
			    khjb : "1级",  
			    jfrq : "2016-8-15",  
			    qsrq : "2016-7-26",  
			    ddzt : "生产中"  
			},  
			{  
			    id: "m2",   
			    ddbh : "20160726001",  
			    ddlx : "制造订单",  
			    ddjb : "0级",  
			    khbh : "000122",  
			    khmc : "长城汽车",  
			    khjb : "2级",  
			    jfrq : "2016-8-08",  
			    qsrq : "2016-7-28",  
			    ddzt : "生产中"  
			},  
			{     
			    id: "m3",   
			    ddbh : "20160728001",  
			    ddlx : "制造订单",  
			    ddjb : "1级",  
			    khbh : "000102",  
			    khmc : "宇通",  
			    khjb : "0级",  
			    jfrq : "2016-8-11",  
			    qsrq : "2016-8-01",  
			    ddzt : "生产中"  
			},  
			{     
			    id: "m4",   
			    ddbh : "20160802001",  
			    ddlx : "制造订单",  
			    ddjb : "1级",  
			    khbh : "000203",  
			    khmc : "长安汽车",  
			    khjb : "0级",  
			    jfrq : "2016-8-12",  
			    qsrq : "2016-8-04",  
			    ddzt : "未生产"  
			}];  
			
			
			var subgrid_data = {  
			m0:[{           //二级菜单  
			    cpbh : "20401150106",     //订单0  
			    cpmc : "产品2",   
			    cpxh : "m6",  
			    cpgg : "m6*1 45",  
			    cplx : "A类",  
			    gy :"工艺3",  
			    cpsl : 1000,  
			    scsl : 600  
			}],   
			m1:[{             
			    cpbh : "20401150106",     //订单1  
			    cpmc : "产品1",   
			    cpxh : "m6",  
			    cpgg : "m6*1 45",  
			    cplx : "A类",  
			    gy :"工艺1",  
			    cpsl : 2000,  
			    scsl : 1000  
			}, {              
			    cpbh : "20401150207",  
			    cpmc : "产品2",   
			    cpxh : "m8",  
			    cpgg : "m8*1.25 45",  
			    cplx : "A类",  
			    gy :"工艺1",  
			    cpsl : 2000,  
			    scsl : 800  
			}],  
			m2:[{             
			    cpbh : "2040315038",    //订单2  
			    cpmc : "产品3",   
			    cpxh : "m14",  
			    cpgg : "m14*1 45",  
			    cplx : "C类",  
			    gy :"工艺1",  
			    cpsl : 2000,  
			    scsl : 700  
			}],  
			m3:[{             
			    cpbh : "20401150106",     //订单3  
			    cpmc : "产品1",   
			    cpxh : "m6",  
			    cpgg : "m6*1 45",  
			    cplx : "A类",  
			    gy :"工艺1",  
			    cpsl : 1000,  
			    scsl : 600  
			}],  
			m4:[{             
			    cpbh : "20405234531",     //订单4  
			    cpmc : "产品2",   
			    cpxh : "m6",  
			    cpgg : "m6*1 45",  
			    cplx : "A类",  
			    gy :"工艺2",  
			    cpsl : 1000,  
			    scsl : 500  
			}]};  
			
			var userId = $("#userId").attr("value");
			$.ajax({  
		        async:false,  
		        type:'get',//get是获取数据，post是带数据的向服务器发送请求  
		        url:'rest/carInfo/getCarsFromUser?id=' + userId,  
		        dataType:'json',  
		        success:function(data){  
		        	grid_data = data;
		        },  
		        error:function(data){  
		        	alert(data);
		            //alert("JSON数据获取失败，请联系管理员！");  
		        }  
		    });
			
			jQuery(function($) {  
				var grid_selector = "#grid-table_userCar";
				var pager_selector = "#grid-pager_userCar"; 
			
			    //resize to fit page size 调整自动适应页面大小  
			/* 	        $(window).on(  
			            'resize.jqGrid',  
			            function() {  
			                $(grid_selector).jqGrid('setGridWidth',  
			                        $(".page-content").width());  
			            })  
			    //resize on sidebar collapse/expand  调整工具栏  
			    var parent_column = $(grid_selector).closest('[class*="col-"]');  
			    $(document).on(  
			            'settings.ace.jqGrid',  
			            function(ev, event_name, collapsed) {  
			                if (event_name === 'sidebar_collapsed'  
			                        || event_name === 'main_container_fixed') {  
			                    //setTimeout is for webkit only to give time for DOM changes and then redraw!!!  
			                    setTimeout(function() {  
			                        $(grid_selector).jqGrid('setGridWidth',  
			                                parent_column.width());  
			                    }, 0);  
			                }  
			            })  */ 
			
			    //if your grid is inside another element, for example a tab pane, you should use its parent's width:  
			     
						$(window).on('resize.jqGrid', function () {
						var parent_width = $(grid_selector).closest('.tab-pane').width();
						$(grid_selector).jqGrid( 'setGridWidth', parent_width );
					})
					//and also set width when tab pane becomes visible
					$('.tabbable a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
					  if($(e.target).attr('href') == '#tab_2_5') {
						var parent_width = $(grid_selector).closest('.tab-pane').width();
						$(grid_selector).jqGrid( 'setGridWidth', parent_width );
					  }
					}) 
			      
			
			    jQuery(grid_selector)                            //grid_selector  
			            .jqGrid(  
			                    {  
			                        //direction: "rtl",  
			
			                        //subgrid options  
			                        subGrid : false,                         //当此项设为true的时候，Grid表格的最左边将会添加一列，里面有一个“+”图标，用于展开子格  
			                        //subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],  
			                        //datatype: "xml",  
			                        subGridOptions : {  
			                            plusicon : "ace-icon fa fa-plus center bigger-110 blue",  
			                            minusicon : "ace-icon fa fa-minus center bigger-110 blue",  
			                            openicon : "ace-icon fa fa-chevron-right center orange"  
			                        },  
			                        //for this example we are using local data  
			                        subGridRowExpanded : function(subgridDivId, rowId) {    // (子表格的id,主表格中所要展开子表格的行的id)  当点击“+”展开子表格时，将触发此选项定义的事件方法；  
			                            var subgridTableId = subgridDivId + "_t";       //根据subgrid_id定义对应的子表格的table的id  
			                            var pager_id = "p_" + subgridTableId;  
			                              
			                            $("#" + subgridDivId)  
			                                    .html(  
			                                            /* "<table id='" + subgridTableId + "'></table>" */  
			                                             "<table id='" + subgridTableId + "' class='scroll'></table><div id='" + pager_id + "' class='scroll'></div>"  
			                                                  
			                                            );  
			                                              
			                            $("#" + subgridTableId).jqGrid({        //subgrid_data显示格式  
			                                datatype : 'local',  
			                                data : subgrid_data[rowId],      //rowId  
			                                /* caption : "产品信息表", */  
			                                  
			                                colNames : ['产品编号', '产品名称','产品型号', '产品规格', '产品类型', '工艺', '产品数量','生产数量','操作'],  
			                                colModel : [{  
			                                    name : 'cpbh',  //对应id  
			                                    width : 110,    //数据显示宽度  
			                                    sorttype : "int",  
			                                    editable : true  
			                                }, {  
			                                    name : 'cpmc',  
			                                    width : 110 ,  
			                                    editable : true,  
			                                    editoptions : {  
			                                        size : "20",  
			                                        maxlength : "30"  
			                                    }  
			                                }, {  
			                                    name : 'cpxh',  
			                                    width : 110 ,  
			                                    editable : true,  
			                                    edittype : "select",  
			                                    editoptions : {  
			                                        value : "FE:m6;IN:m8;TN:m14;AR:m16"  
			                                    }  
			                                }, {  
			                                    name : 'cpgg',  
			                                    width : 110 ,  
			                                    editable : true,  
			                                    edittype : "select",  
			                                    editoptions : {  
			                                        value : "FE:m6*1 45;IN:m8*1.25 45;TN:m14*1 45;AR:m16*1 45"  
			                                    }  
			                                }, {  
			                                    name : 'cplx',  
			                                    width : 110 ,  
			                                    editable : true,  
			                                    edittype : "select",  
			                                    editoptions : {  
			                                        value : "FE:A类;IN:B类;TN:C类;AR:D类"  
			                                    }  
			                                }, {  
			                                    name : 'gy',  
			                                    width : 110,  
			                                    editable : true,  
			                                    edittype : "select",  
			                                    editoptions : {  
			                                        value : "FE:工艺1;IN:工艺2;TN:工艺3;AR:工艺4"  
			                                    }  
			                                }, {  
			                                    name : 'cpsl',  
			                                    width : 110 ,  
			                                    sorttype : "int",  
			                                    editable : true  
			                                } ,{  
			                                    name : 'scsl',  
			                                    width : 110 ,  
			                                    sorttype : "int",  
			                                    editable : true  
			                                } ,{  
			                                    name : 'myac',  
			                                    index : '',  
			                                    width : 80,  
			                                    fixed : true,  
			                                    sortable : false,  
			                                    resize : false,  
			                                    formatter : 'actions',  
			                                    formatoptions : {  
			                                        keys : true,  
			                                        //delbutton: false,//disable delete button  
			                                        delOptions : {  
			                                            recreateForm : true,  
			                                            beforeShowForm : beforeDeleteCallback  
			                                        },  
			                                    //editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
			                                    }  
			                                }],  
			                                  
			                        rowNum : 5,  
			                        rowList : [ 1, 2, 3],  
			                        pager: pager_id,  
			                        altRows : true,  
			                        multiselect : true,  
			                        multiboxonly : true,  
			                        loadComplete : function() {  
			                            var table = this;  
			                            setTimeout(function() {  
			                                styleCheckbox(table);  
			
			                                updateActionIcons(table);  
			                                updatePagerIcons(table);  
			                                enableTooltips(table);  
			                            }, 0);  
			                        },  
			                                  
			                            });  
			                              
			                              
			                                jQuery("#" + subgridTableId).jqGrid('navGrid',            //二级表格底部功能  
			                                  "#" + pager_id, {  
			                                        edit : false,  
			                                        add : true,  
			                                        addicon : 'ace-icon fa fa-plus-circle purple',  
			                                        addtitle: "增加新产品",  
			                                        search : true,  
			                                        searchicon : 'ace-icon fa fa-search orange',  
			                                        refresh : true,  
			                                        refreshicon : 'ace-icon fa fa-refresh green',  
			                                  },  
			                                    {  
			                                        //new record form  
			                                        //width: 700,  
			                                        closeAfterAdd : true,  
			                                        recreateForm : true,  
			                                        viewPagerButtons : false,  
			                                        beforeShowForm : function(e) {  
			                                            var form = $(e[0]);  
			                                            form.closest('.ui-jqdialog').find(  
			                                                    '.ui-jqdialog-titlebar').wrapInner(  
			                                                    '<div class="widget-header" />')  
			                                            style_edit_form(form);  
			                                        }  
			                                    },  
			                                    {  
			                                        //delete record form  
			                                        recreateForm : true,  
			                                        beforeShowForm : function(e) {  
			                                            var form = $(e[0]);  
			                                            if (form.data('styled'))  
			                                                return false;  
			                      
			                                            form.closest('.ui-jqdialog').find(  
			                                                    '.ui-jqdialog-titlebar').wrapInner(  
			                                                    '<div class="widget-header" />')  
			                                            style_delete_form(form);  
			                      
			                                            form.data('styled', true);  
			                                        },  
			                                        onClick : function(e) {  
			                                            //alert(1);  
			                                        }  
			                                    });  
			                        },  
			                        //url:"rest/user/userAll",
			                        data : grid_data, 
			        				datatype: "local",
			    					//mtype: "GET",
			                        //datatype : "local",  
			                        height : 275,  
			                        colNames : ['ID','车辆信息','注册时间','分摊上限', '照片','状态','操作'],   
			                        colModel : [  
			                                {  
			                                    name : 'id',  
			                                    index : 'id',  
			                                      width : 120,    
			                                    sorttype : "int",  
			                                    editable : true  
			                                }, 
			                                {  
			                                    name : 'plateNumber',  
			                                    index : 'plateNumber',  
			                                      width : 120,    
			                                    sorttype : "int",  
			                                    editable : false  
			                                },  
			                                {  
			                                    name : 'registerDate',  
			                                    index : 'registerDate',  
			                                    editable : false,  
			                                    formatter:"date",formatoptions: {srcformat:'u',newformat:'Y-m-d'}
			                                },
			                                {  
			                                    name : 'partakeMax',  
			                                    index : 'partakeMax',  
			                                      width : 120,    
			                                    sorttype : "int",  
			                                    editable : false  
			                                }, 
			                                {  
			                                    name : 'carIco',  
			                                    index : 'carIco',  
			                                    editable : false,  
			                                    editoptions : {  
			                                        size : "20",  
			                                        maxlength : "30"  
			                                    }  
			                                },
			                                {  
		                                        name : 'status',  
		                                        index : 'status',  
		                                        editable : true,  
		                                        width : 120,   
		                                        edittype : "select",  
		                                        editoptions : {  
		                                        	value : "0:审核通过;1:审核未通过"
		                                        },formatter: function (cellvalue, options, rowObject) {
		                                        	var tst = "";
		            								if(cellvalue == 0){
		            									tst = "审核通过";
		            								}else if(cellvalue == 1){
		            									tst = "审核未通过";
		            								}else {
		            									tst= "待审核";
		            								}
		            								
		            							    return tst;   
		            				          }  
		                                    }, {  
		                                        name : 'myac',  
		                                        index : '',  
		                                        width : 80,  
		                                        fixed : true,  
		                                        sortable : false,  
		                                        resize : false,  
		                                        formatter : 'actions',  
		                                        formatoptions : {  
		                                            keys : true,  
		                                            //delbutton: false,//disable delete button  
		  
		                                            delOptions : {  
		                                                recreateForm : true,  
		                                                beforeShowForm : beforeDeleteCallback  
		                                            },  
		                                        editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
		                                        }  
		                                    }],  
			
			                        viewrecords : true,  
			                        rowNum : 10,  
			                        rowList : [ 10, 20, 30 ],  
			                        pager : pager_selector,  
			                        altRows : true,  
			                        //toppager: true,  
			
			                        multiselect : true,  
			                        //multikey: "ctrlKey",  
			                        multiboxonly : true,  
			
			                        loadComplete : function() {  
			                            var table = this;  
			                            setTimeout(function() {  
			                                styleCheckbox(table);  
			
			                                updateActionIcons(table);  
			                                updatePagerIcons(table);  
			                                enableTooltips(table);  
			                            }, 0);  
			                        },  
			                        editurl: "rest/user/manage",
			                        /* editurl : "/dummy.html",//nothing is saved */  
			                        caption : "车辆管理"  
			
			                    //,autowidth: true,  
			
			                    /** 
			                    , 
			                    grouping:true,  
			                    groupingView : {  
			                         groupField : ['name'], 
			                         groupDataSorted : true, 
			                         plusicon : 'fa fa-chevron-down bigger-110', 
			                         minusicon : 'fa fa-chevron-up bigger-110' 
			                    }, 
			                    caption: "Grouping" 
			                     */  
			
			                    });  
			    $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size  
			
			    //enable search/filter toolbar  
			    //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})  
			    //jQuery(grid_selector).filterToolbar({});  
			
			    //switch element when editing inline  
			    function aceSwitch(cellvalue, options, cell) {  
			        setTimeout(function() {                     //复选框  
			            $(cell).find('input[type=checkbox]').addClass(  
			                    'ace ace-switch ace-switch-5').after(  
			                    '<span class="lbl"></span>');  
			        }, 0);  
			    }  
			    //enable datepicker  
			    function pickDate(cellvalue, options, cell) {     //日期格式  
			        setTimeout(function() {  
			            $(cell).find('input[type=text]').datepicker({  
			                format : 'yyyy-mm-dd',  
			                autoclose : true  
			            });  
			        }, 0);  
			    }  
			
			    //navButtons    页尾按钮  
			    jQuery(grid_selector).jqGrid(     
			            'navGrid',  
			            pager_selector,  
			            { //navbar options  
			                 edit : false,  
			                /* editicon : 'ace-icon fa fa-pencil blue', */  
			                add : false,  
			                addicon : 'ace-icon fa fa-plus-circle purple',  
			                del : false,  
			                delicon : 'ace-icon fa fa-trash-o red',  
			                search : true,  
			                searchicon : 'ace-icon fa fa-search orange',  
			                refresh : true,  
			                refreshicon : 'ace-icon fa fa-refresh green',  
			                /* view : true, 
			                viewicon : 'ace-icon fa fa-search-plus grey', */  
			            },  
			            {  
			                                                            //edit record form  
			                //closeAfterEdit: true,  
			                //width: 700,  
			                recreateForm : true,  
			                beforeShowForm : function(e) {  
			                    var form = $(e[0]);  
			                    form.closest('.ui-jqdialog').find(  
			                            '.ui-jqdialog-titlebar').wrapInner(  
			                            '<div class="widget-header" />')  
			                    style_edit_form(form);  
			                }  
			            },  
			            {  
			                //new record form  
			                //width: 700,  
			                closeAfterAdd : true,  
			                recreateForm : true,  
			                viewPagerButtons : false,  
			                beforeShowForm : function(e) {  
			                    var form = $(e[0]);  
			                    form.closest('.ui-jqdialog').find(  
			                            '.ui-jqdialog-titlebar').wrapInner(  
			                            '<div class="widget-header" />')  
			                    style_edit_form(form);  
			                }  
			            },  
			            {  
			                //delete record form  
			                recreateForm : true,  
			                beforeShowForm : function(e) {  
			                    var form = $(e[0]);  
			                    if (form.data('styled'))  
			                        return false;  
			
			                    form.closest('.ui-jqdialog').find(  
			                            '.ui-jqdialog-titlebar').wrapInner(  
			                            '<div class="widget-header" />')  
			                    style_delete_form(form);  
			
			                    form.data('styled', true);  
			                },  
			                onClick : function(e) {  
			                    //alert(1);  
			                }  
			            },  
			            {  
			                //search form  
			                recreateForm : true,  
			                afterShowSearch : function(e) {  
			                    var form = $(e[0]);  
			                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
			                            .wrap('<div class="widget-header" />')  
			                    style_search_form(form);  
			                },  
			                afterRedraw : function() {  
			                    style_search_filters($(this));  
			                },  
			                multipleSearch : true,  
			            /** 
			            multipleGroup:true, 
			            showQuery: true 
			             */  
			            },  
			            {  
			                //view record form  
			                recreateForm : true,  
			                beforeShowForm : function(e) {  
			                    var form = $(e[0]);  
			                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
			                            .wrap('<div class="widget-header" />')  
			                }  
			            })  
			
			    function style_edit_form(form) {  
			        //enable datepicker on "sdate" field and switches for "stock" field   //已改  
			        form.find('input[name=jfrq]').datepicker({  
			            format : 'yyyy-mm-dd',  
			            autoclose : true  
			        })  
			        form.find('input[name=qsrq]').datepicker({  
			            format : 'yyyy-mm-dd',  
			            autoclose : true  
			        })  
			
			        form.find('input[name=stock]').addClass(  
			                'ace ace-switch ace-switch-5').after(  
			                '<span class="lbl"></span>');  
			        //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)  
			        //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');  
			
			        //update buttons classes  
			        var buttons = form.next().find('.EditButton .fm-button');  
			        buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon  
			        buttons.eq(0).addClass('btn-primary').prepend(  
			                '<i class="ace-icon fa fa-check"></i>');  
			        buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')  
			
			        buttons = form.next().find('.navButton a');  
			        buttons.find('.ui-icon').hide();  
			        buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');  
			        buttons.eq(1)  
			                .append('<i class="ace-icon fa fa-chevron-right"></i>');  
			    }  
			
			    function style_delete_form(form) {  
			        var buttons = form.next().find('.EditButton .fm-button');  
			        buttons.addClass('btn btn-sm btn-white btn-round').find(  
			                '[class*="-icon"]').hide();//ui-icon, s-icon  
			        buttons.eq(0).addClass('btn-danger').prepend(  
			                '<i class="ace-icon fa fa-trash-o"></i>');  
			        buttons.eq(1).addClass('btn-default').prepend(  
			                '<i class="ace-icon fa fa-times"></i>')  
			    }  
			
			    function style_search_filters(form) {  
			        form.find('.delete-rule').val('X');  
			        form.find('.add-rule').addClass('btn btn-xs btn-primary');  
			        form.find('.add-group').addClass('btn btn-xs btn-success');  
			        form.find('.delete-group').addClass('btn btn-xs btn-danger');  
			    }  
			    function style_search_form(form) {  
			        var dialog = form.closest('.ui-jqdialog');  
			        var buttons = dialog.find('.EditTable')  
			        buttons.find('.EditButton a[id*="_reset"]').addClass(  
			                'btn btn-sm btn-info').find('.ui-icon').attr('class',  
			                'ace-icon fa fa-retweet');  
			        buttons.find('.EditButton a[id*="_query"]').addClass(  
			                'btn btn-sm btn-inverse').find('.ui-icon').attr('class',  
			                'ace-icon fa fa-comment-o');  
			        buttons.find('.EditButton a[id*="_search"]').addClass(  
			                'btn btn-sm btn-purple').find('.ui-icon').attr('class',  
			                'ace-icon fa fa-search');  
			    }  
			
			    function beforeDeleteCallback(e) {  
			        var form = $(e[0]);  
			        if (form.data('styled'))  
			            return false;  
			
			        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
			                .wrapInner('<div class="widget-header" />')  
			        style_delete_form(form);  
			
			        form.data('styled', true);  
			    }  
			
			    function beforeEditCallback(e) {  
			        var form = $(e[0]);  
			        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
			                .wrapInner('<div class="widget-header" />')  
			        style_edit_form(form);  
			    }  
			
			    //it causes some flicker when reloading or navigating grid  
			    //it may be possible to have some custom formatter to do this as the grid is being created to prevent this  
			    //or go back to default browser checkbox styles for the grid  
			    function styleCheckbox(table) {             //  
			        /** 
			            $(table).find('input:checkbox').addClass('ace') 
			            .wrap('<label />') 
			            .after('<span class="lbl align-top" />') 
			         
			         
			            $('.ui-jqgrid-labels th[id*="_cb"]:first-child') 
			            .find('input.cbox[type=checkbox]').addClass('ace') 
			            .wrap('<label />').after('<span class="lbl align-top" />'); 
			         */  
			    }  
			
			    //unlike navButtons icons, action icons in rows seem to be hard-coded  
			    //you can change them like this in here if you want  
			    function updateActionIcons(table) {  
			        /** 
			        var replacement =  
			        { 
			            'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue', 
			            'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red', 
			            'ui-icon-disk' : 'ace-icon fa fa-check green', 
			            'ui-icon-cancel' : 'ace-icon fa fa-times red' 
			        }; 
			        $(table).find('.ui-pg-div span.ui-icon').each(function(){ 
			            var icon = $(this); 
			            var $class = $.trim(icon.attr('class').replace('ui-icon', '')); 
			            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]); 
			        }) 
			         */  
			    }  
			
			    //replace icons with FontAwesome icons like above  
			    function updatePagerIcons(table) {  
			        var replacement = {  
			            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',  
			            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',  
			            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',  
			            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'  
			        };  
			        $(  
			                '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')  
			                .each(  
			                        function() {  
			                            var icon = $(this);  
			                            var $class = $.trim(icon.attr('class').replace(  
			                                    'ui-icon', ''));  
			
			                            if ($class in replacement)  
			                                icon.attr('class', 'ui-icon '  
			                                        + replacement[$class]);  
			                        })  
			    }  
			
			    function enableTooltips(table) {  
			        $('.navtable .ui-pg-button').tooltip({  
			            container : 'body'  
			        });  
			        $(table).find('.ui-pg-div').tooltip({  
			            container : 'body'  
			        });  
			    }  
			
			    //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');  
			
			    $(document).one('ajaxloadstart.page', function(e) {  
			        $(grid_selector).jqGrid('GridUnload');  
			        $('.ui-jqdialog').remove();  
			    });  
			}); 
		</script>

<script type="text/javascript">
				var grid_data = [ {   
				    id: "m0",   
				    ddbh : "20160701001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000201",  
				    khmc : "东风",  
				    khjb : "0级",  
				    jfrq : "2016-7-15",  
				    qsrq : "2016-7-03",  
				    ddzt : "已闭单"  
				},{  
				    id: "m1",   
				    ddbh : "20160725001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000105",  
				    khmc : "比亚迪",  
				    khjb : "1级",  
				    jfrq : "2016-8-15",  
				    qsrq : "2016-7-26",  
				    ddzt : "生产中"  
				},  
				{  
				    id: "m2",   
				    ddbh : "20160726001",  
				    ddlx : "制造订单",  
				    ddjb : "0级",  
				    khbh : "000122",  
				    khmc : "长城汽车",  
				    khjb : "2级",  
				    jfrq : "2016-8-08",  
				    qsrq : "2016-7-28",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m3",   
				    ddbh : "20160728001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000102",  
				    khmc : "宇通",  
				    khjb : "0级",  
				    jfrq : "2016-8-11",  
				    qsrq : "2016-8-01",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m4",   
				    ddbh : "20160802001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000203",  
				    khmc : "长安汽车",  
				    khjb : "0级",  
				    jfrq : "2016-8-12",  
				    qsrq : "2016-8-04",  
				    ddzt : "未生产"  
				}];  
				
				
				var subgrid_data = {  
				m0:[{           //二级菜单  
				    cpbh : "20401150106",     //订单0  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺3",  
				    cpsl : 1000,  
				    scsl : 600  
				}],   
				m1:[{             
				    cpbh : "20401150106",     //订单1  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 1000  
				}, {              
				    cpbh : "20401150207",  
				    cpmc : "产品2",   
				    cpxh : "m8",  
				    cpgg : "m8*1.25 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 800  
				}],  
				m2:[{             
				    cpbh : "2040315038",    //订单2  
				    cpmc : "产品3",   
				    cpxh : "m14",  
				    cpgg : "m14*1 45",  
				    cplx : "C类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 700  
				}],  
				m3:[{             
				    cpbh : "20401150106",     //订单3  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 1000,  
				    scsl : 600  
				}],  
				m4:[{             
				    cpbh : "20405234531",     //订单4  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺2",  
				    cpsl : 1000,  
				    scsl : 500  
				}]};  
				
				 var userId = $("#userId").attr("value");
				 //alert(userId);
				$.ajax({  
				    async:false,  
				    type:'get',//get是获取数据，post是带数据的向服务器发送请求  
				    url:'rest/help/getHelpInfo?id=' + userId,  
				    dataType:'json',  
				    success:function(data){  
				    	grid_data = data;
				    },  
				    error:function(data){  
				        alert("JSON数据获取失败，请联系管理员！");  
				    }  
				});
		        function ModifyHappenAddress(id) {   //单击修改链接的操作        
		        	//alert(id);
		            var model = jQuery("#grid-table_Help").jqGrid('getRowData', id);

		            //alert(model.helpId);
		            $("#addrId").val(model.helpId);
		            //$("#txtCityName").val(model.Name);
		            //$("#txtFID").val(model.Fid);
		            $("#modifyform").dialog({
		                height:400,
		                width:400,
		                resizable:false,
		                modal:true,  //这里就是控制弹出为模态
		                buttons:{
		                    "确定":function(){                    
		                        var form = $("#dialogForm");  
		                        $.ajax({  
		                            url:form.attr('action'),  
		                            type:form.attr('method'),  
		                            data:form.serialize(),  
		                            dataType:"json",  
		                            success:function(data){  
		                            	//alert(data);
		                                $("#modifyform").dialog("close");  
		                                alert("成功啦");  
		                            },  
		                            error:function(){  
		                                $("#modifyform").dialog("close");  
		                                alert("出错了哦");  
		                            }  
		                        })  
		                    },  
		                    "取消": function() {  
		                        $("#modifyform").dialog("close");  
		                    }  
		                }
		                    
		            });
		        }
		        
		        function ModifyHelpInfo(id) {   //单击修改链接的操作        
		        	//alert(id);
		            var model = jQuery("#grid-table_Help").jqGrid('getRowData', id);

		            //alert(model.Id);
		            $("#infoId").val(model.helpId);
		            //$("#txtCityName").val(model.Name);
		            //$("#txtFID").val(model.Fid);
		            $("#modifyformHelpInfo").dialog({
		                height:400,
		                width:400,
		                resizable:false,
		                modal:true,  //这里就是控制弹出为模态
		                buttons:{
		                    "确定":function(){                    
		                        var form = $("#dialogFormHelpInfo");  
		                        $.ajax({  
		                            url:form.attr('action'),  
		                            type:form.attr('method'),  
		                            data:form.serialize(),  
		                            dataType:"json",  
		                            success:function(data){  
		                            	//alert(data);
		                                $("#modifyformHelpInfo").dialog("close");  
		                                alert("成功啦");  
		                            },  
		                            error:function(){  
		                                $("#modifyformHelpInfo").dialog("close");  
		                                alert("出错了哦");  
		                            }  
		                        })  
		                    },  
		                    "取消": function() {  
		                        $("#modifyformHelpInfo").dialog("close");  
		                    }  
		                }
		                    
		            });
		        }		        
				jQuery(function($) {  
					var grid_selector = "#grid-table_Help";
					var pager_selector = "#grid-pager_Help"; 
				
				    //resize to fit page size 调整自动适应页面大小  
				/* 	        $(window).on(  
				            'resize.jqGrid',  
				            function() {  
				                $(grid_selector).jqGrid('setGridWidth',  
				                        $(".page-content").width());  
				            })  
				    //resize on sidebar collapse/expand  调整工具栏  
				    var parent_column = $(grid_selector).closest('[class*="col-"]');  
				    $(document).on(  
				            'settings.ace.jqGrid',  
				            function(ev, event_name, collapsed) {  
				                if (event_name === 'sidebar_collapsed'  
				                        || event_name === 'main_container_fixed') {  
				                    //setTimeout is for webkit only to give time for DOM changes and then redraw!!!  
				                    setTimeout(function() {  
				                        $(grid_selector).jqGrid('setGridWidth',  
				                                parent_column.width());  
				                    }, 0);  
				                }  
				            })  */ 
				
				    //if your grid is inside another element, for example a tab pane, you should use its parent's width:  
				     
							$(window).on('resize.jqGrid', function () {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						})
						//and also set width when tab pane becomes visible
						$('.tabbable a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
						  if($(e.target).attr('href') == '#tab_2_3') {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						  }
						}) 
				      
				
				    jQuery(grid_selector)                            //grid_selector  
				            .jqGrid(  
				                    {  
				                        //direction: "rtl",  
				
				                        //subgrid options  
				                        subGrid : false,                         //当此项设为true的时候，Grid表格的最左边将会添加一列，里面有一个“+”图标，用于展开子格  
				                        //subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],  
				                        //datatype: "xml",  
				                        subGridOptions : {  
				                            plusicon : "ace-icon fa fa-plus center bigger-110 blue",  
				                            minusicon : "ace-icon fa fa-minus center bigger-110 blue",  
				                            openicon : "ace-icon fa fa-chevron-right center orange"  
				                        },  
				                        //for this example we are using local data  
				                        subGridRowExpanded : function(subgridDivId, rowId) {    // (子表格的id,主表格中所要展开子表格的行的id)  当点击“+”展开子表格时，将触发此选项定义的事件方法；  
				                            var subgridTableId = subgridDivId + "_t";       //根据subgrid_id定义对应的子表格的table的id  
				                            var pager_id = "p_" + subgridTableId;  
				                              
				                            $("#" + subgridDivId)  
				                                    .html(  
				                                            /* "<table id='" + subgridTableId + "'></table>" */  
				                                             "<table id='" + subgridTableId + "' class='scroll'></table><div id='" + pager_id + "' class='scroll'></div>"  
				                                                  
				                                            );  
				                                              
				                            $("#" + subgridTableId).jqGrid({        //subgrid_data显示格式  
				                                datatype : 'local',  
				                                data : subgrid_data[rowId],      //rowId  
				                                /* caption : "产品信息表", */  
				                                  
				                                colNames : ['产品编号', '产品名称','产品型号', '产品规格', '产品类型', '工艺', '产品数量','生产数量','操作'],  
				                                colModel : [{  
				                                    name : 'cpbh',  //对应id  
				                                    width : 110,    //数据显示宽度  
				                                    sorttype : "int",  
				                                    editable : true  
				                                }, {  
				                                    name : 'cpmc',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                }, {  
				                                    name : 'cpxh',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6;IN:m8;TN:m14;AR:m16"  
				                                    }  
				                                }, {  
				                                    name : 'cpgg',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6*1 45;IN:m8*1.25 45;TN:m14*1 45;AR:m16*1 45"  
				                                    }  
				                                }, {  
				                                    name : 'cplx',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:A类;IN:B类;TN:C类;AR:D类"  
				                                    }  
				                                }, {  
				                                    name : 'gy',  
				                                    width : 110,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:工艺1;IN:工艺2;TN:工艺3;AR:工艺4"  
				                                    }  
				                                }, {  
				                                    name : 'cpsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'scsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    //editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				                                  
				                        rowNum : 5,  
				                        rowList : [ 1, 2, 3],  
				                        pager: pager_id,  
				                        altRows : true,  
				                        multiselect : true,  
				                        multiboxonly : true,  
				                        loadComplete : function() {  
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                                  
				                            });  
				                              
				                              
				                                jQuery("#" + subgridTableId).jqGrid('navGrid',            //二级表格底部功能  
				                                  "#" + pager_id, {  
				                                        edit : false,  
				                                        add : true,  
				                                        addicon : 'ace-icon fa fa-plus-circle purple',  
				                                        addtitle: "增加新产品",  
				                                        search : true,  
				                                        searchicon : 'ace-icon fa fa-search orange',  
				                                        refresh : true,  
				                                        refreshicon : 'ace-icon fa fa-refresh green',  
				                                  },  
				                                    {  
				                                        //new record form  
				                                        //width: 700,  
				                                        closeAfterAdd : true,  
				                                        recreateForm : true,  
				                                        viewPagerButtons : false,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_edit_form(form);  
				                                        }  
				                                    },  
				                                    {  
				                                        //delete record form  
				                                        recreateForm : true,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            if (form.data('styled'))  
				                                                return false;  
				                      
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_delete_form(form);  
				                      
				                                            form.data('styled', true);  
				                                        },  
				                                        onClick : function(e) {  
				                                            //alert(1);  
				                                        }  
				                                    });  
				                        },  
				                        //url:"rest/user/userAll",
				                        data : grid_data, 
				        				datatype: "local",
				    					//mtype: "GET",
				                        //datatype : "local",  
				                        height : 275,  
				                        colNames : ['ID','求助信息','车管家','情况说明', '照片','费用','状态','处理','操作'],   
				                        colModel : [  
				                                {  
				                                    name : 'helpId',  
				                                    index : 'helpId',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : true  
				                                },
				                                
				                                {  
				                                    name : 'happenPosition',  
				                                    index : 'happenPosition',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'param5',  
				                                    index : 'param5',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  //情况说明
				                                    name : 'param2',  
				                                    index : 'param2',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'carIco',  
				                                    index : 'carIco',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'ownerPay',  
				                                    index : 'ownerPay',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'status',  
				                                    index : 'status',  
				                                    editable : true,  
				                                    width : 120,   
				                                    edittype : "select",  
				                                    editoptions : {  
				                                    	value : "1:发起求助;2:求助已解决;3:完成维修"
				                                    },formatter: function (cellvalue, options, rowObject) {
				                                    	var tst = "";
				        								if(cellvalue == 1){
				        									tst = "发起求助";
				        								}else if(cellvalue == 2){
				        									tst = "已派单";
				        								}else if(cellvalue == 3){
				        									tst = "待验车";
				        								}else {
				        									tst= "未知状态";
				        								}
				        								
				        							    return tst;   
				        				          }  
				                                }, 
				                                {name:'Modify',index:'helpId',sortable:false},
				                                {  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				
				                        viewrecords : true,  
				                        rowNum : 10,  
				                        rowList : [ 10, 20, 30 ],  
				                        pager : pager_selector,  
				                        altRows : true,  
				                        //toppager: true,  
				
				                        multiselect : true,  
				                        //multikey: "ctrlKey",  
				                        multiboxonly : true,  
				
				                        loadComplete : function() {  
				                        	
				                            var ids=jQuery("#grid-table_Help").jqGrid('getDataIDs');
				                            for(var i=0; i<ids.length; i++){
				                                var id=ids[i];   
				                                var rowdata=jQuery("#grid-table_Help").jqGrid('getRowData',id);
				                                //console.log(rowdata["status"]);
				                                if(rowdata["status"] == "发起求助"){
				                                	 modify = "<a href='#' style='color:#f60' onclick='ModifyHappenAddress(" + id + ")'>维护事故地址</a>";  //这里的onclick就是调用了上面的javascript函数 Modify(id)
						                                //del = "<a href='#'  style='color:#f60' onclick='Delete(" + id + ")' >删除</a>";   
						                                jQuery("#grid-table_Help").jqGrid('setRowData', ids[i], { Modify: modify});
				                                	
				                                }
				                                else if(rowdata["status"] == "已派单"){
				                                	 modify = "<a href='#' style='color:#f60' onclick='ModifyHelpInfo(" + id + ")'>维护处理信息</a>";  //这里的onclick就是调用了上面的javascript函数 Modify(id)
						                                //del = "<a href='#'  style='color:#f60' onclick='Delete(" + id + ")' >删除</a>";   
						                                jQuery("#grid-table_Help").jqGrid('setRowData', ids[i], { Modify: modify});
				                                	
				                                }
				                               
				                            }
				                                
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                        editurl: "rest/user/manage",
				                        /* editurl : "/dummy.html",//nothing is saved */  
				                        caption : "求助记录"  
				
				                    //,autowidth: true,  
				
				                    /** 
				                    , 
				                    grouping:true,  
				                    groupingView : {  
				                         groupField : ['name'], 
				                         groupDataSorted : true, 
				                         plusicon : 'fa fa-chevron-down bigger-110', 
				                         minusicon : 'fa fa-chevron-up bigger-110' 
				                    }, 
				                    caption: "Grouping" 
				                     */  
				
				                    });  
				    $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size  
				
				    //enable search/filter toolbar  
				    //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})  
				    //jQuery(grid_selector).filterToolbar({});  
				
				    //switch element when editing inline  
				    function aceSwitch(cellvalue, options, cell) {  
				        setTimeout(function() {                     //复选框  
				            $(cell).find('input[type=checkbox]').addClass(  
				                    'ace ace-switch ace-switch-5').after(  
				                    '<span class="lbl"></span>');  
				        }, 0);  
				    }  
				    //enable datepicker  
				    function pickDate(cellvalue, options, cell) {     //日期格式  
				        setTimeout(function() {  
				            $(cell).find('input[type=text]').datepicker({  
				                format : 'yyyy-mm-dd',  
				                autoclose : true  
				            });  
				        }, 0);  
				    }  
				
				    //navButtons    页尾按钮  
				    jQuery(grid_selector).jqGrid(     
				            'navGrid',  
				            pager_selector,  
				            { //navbar options  
				                 edit : false,  
				                /* editicon : 'ace-icon fa fa-pencil blue', */  
				                add : false,  
				                addicon : 'ace-icon fa fa-plus-circle purple',  
				                del : false,  
				                delicon : 'ace-icon fa fa-trash-o red',  
				                search : true,  
				                searchicon : 'ace-icon fa fa-search orange',  
				                refresh : true,  
				                refreshicon : 'ace-icon fa fa-refresh green',  
				                /* view : true, 
				                viewicon : 'ace-icon fa fa-search-plus grey', */  
				            },  
				            {  
				                                                            //edit record form  
				                //closeAfterEdit: true,  
				                //width: 700,  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //new record form  
				                //width: 700,  
				                closeAfterAdd : true,  
				                recreateForm : true,  
				                viewPagerButtons : false,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //delete record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    if (form.data('styled'))  
				                        return false;  
				
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_delete_form(form);  
				
				                    form.data('styled', true);  
				                },  
				                onClick : function(e) {  
				                    //alert(1);  
				                }  
				            },  
				            {  
				                //search form  
				                recreateForm : true,  
				                afterShowSearch : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                    style_search_form(form);  
				                },  
				                afterRedraw : function() {  
				                    style_search_filters($(this));  
				                },  
				                multipleSearch : true,  
				            /** 
				            multipleGroup:true, 
				            showQuery: true 
				             */  
				            },  
				            {  
				                //view record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                }  
				            })  
				
				    function style_edit_form(form) {  
				        //enable datepicker on "sdate" field and switches for "stock" field   //已改  
				        form.find('input[name=jfrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				        form.find('input[name=qsrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				
				        form.find('input[name=stock]').addClass(  
				                'ace ace-switch ace-switch-5').after(  
				                '<span class="lbl"></span>');  
				        //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)  
				        //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');  
				
				        //update buttons classes  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-primary').prepend(  
				                '<i class="ace-icon fa fa-check"></i>');  
				        buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')  
				
				        buttons = form.next().find('.navButton a');  
				        buttons.find('.ui-icon').hide();  
				        buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');  
				        buttons.eq(1)  
				                .append('<i class="ace-icon fa fa-chevron-right"></i>');  
				    }  
				
				    function style_delete_form(form) {  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm btn-white btn-round').find(  
				                '[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-danger').prepend(  
				                '<i class="ace-icon fa fa-trash-o"></i>');  
				        buttons.eq(1).addClass('btn-default').prepend(  
				                '<i class="ace-icon fa fa-times"></i>')  
				    }  
				
				    function style_search_filters(form) {  
				        form.find('.delete-rule').val('X');  
				        form.find('.add-rule').addClass('btn btn-xs btn-primary');  
				        form.find('.add-group').addClass('btn btn-xs btn-success');  
				        form.find('.delete-group').addClass('btn btn-xs btn-danger');  
				    }  
				    function style_search_form(form) {  
				        var dialog = form.closest('.ui-jqdialog');  
				        var buttons = dialog.find('.EditTable')  
				        buttons.find('.EditButton a[id*="_reset"]').addClass(  
				                'btn btn-sm btn-info').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-retweet');  
				        buttons.find('.EditButton a[id*="_query"]').addClass(  
				                'btn btn-sm btn-inverse').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-comment-o');  
				        buttons.find('.EditButton a[id*="_search"]').addClass(  
				                'btn btn-sm btn-purple').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-search');  
				    }  
				
				    function beforeDeleteCallback(e) {  
				        var form = $(e[0]);  
				        if (form.data('styled'))  
				            return false;  
				
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_delete_form(form);  
				
				        form.data('styled', true);  
				    }  
				
				    function beforeEditCallback(e) {  
				        var form = $(e[0]);  
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_edit_form(form);  
				    }  
				
				    //it causes some flicker when reloading or navigating grid  
				    //it may be possible to have some custom formatter to do this as the grid is being created to prevent this  
				    //or go back to default browser checkbox styles for the grid  
				    function styleCheckbox(table) {             //  
				        /** 
				            $(table).find('input:checkbox').addClass('ace') 
				            .wrap('<label />') 
				            .after('<span class="lbl align-top" />') 
				         
				         
				            $('.ui-jqgrid-labels th[id*="_cb"]:first-child') 
				            .find('input.cbox[type=checkbox]').addClass('ace') 
				            .wrap('<label />').after('<span class="lbl align-top" />'); 
				         */  
				    }  
				
				    //unlike navButtons icons, action icons in rows seem to be hard-coded  
				    //you can change them like this in here if you want  
				    function updateActionIcons(table) {  
				        /** 
				        var replacement =  
				        { 
				            'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue', 
				            'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red', 
				            'ui-icon-disk' : 'ace-icon fa fa-check green', 
				            'ui-icon-cancel' : 'ace-icon fa fa-times red' 
				        }; 
				        $(table).find('.ui-pg-div span.ui-icon').each(function(){ 
				            var icon = $(this); 
				            var $class = $.trim(icon.attr('class').replace('ui-icon', '')); 
				            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]); 
				        }) 
				         */  
				    }  
				
				    //replace icons with FontAwesome icons like above  
				    function updatePagerIcons(table) {  
				        var replacement = {  
				            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',  
				            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',  
				            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',  
				            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'  
				        };  
				        $(  
				                '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')  
				                .each(  
				                        function() {  
				                            var icon = $(this);  
				                            var $class = $.trim(icon.attr('class').replace(  
				                                    'ui-icon', ''));  
				
				                            if ($class in replacement)  
				                                icon.attr('class', 'ui-icon '  
				                                        + replacement[$class]);  
				                        })  
				    }  
				
				    function enableTooltips(table) {  
				        $('.navtable .ui-pg-button').tooltip({  
				            container : 'body'  
				        });  
				        $(table).find('.ui-pg-div').tooltip({  
				            container : 'body'  
				        });  
				    }  
				
				    //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');  
				
				    $(document).one('ajaxloadstart.page', function(e) {  
				        $(grid_selector).jqGrid('GridUnload');  
				        $('.ui-jqdialog').remove();  
				    });  
				}); 
		</script>
<script type="text/javascript">
				var grid_data = [ {   
				    id: "m0",   
				    ddbh : "20160701001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000201",  
				    khmc : "东风",  
				    khjb : "0级",  
				    jfrq : "2016-7-15",  
				    qsrq : "2016-7-03",  
				    ddzt : "已闭单"  
				},{  
				    id: "m1",   
				    ddbh : "20160725001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000105",  
				    khmc : "比亚迪",  
				    khjb : "1级",  
				    jfrq : "2016-8-15",  
				    qsrq : "2016-7-26",  
				    ddzt : "生产中"  
				},  
				{  
				    id: "m2",   
				    ddbh : "20160726001",  
				    ddlx : "制造订单",  
				    ddjb : "0级",  
				    khbh : "000122",  
				    khmc : "长城汽车",  
				    khjb : "2级",  
				    jfrq : "2016-8-08",  
				    qsrq : "2016-7-28",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m3",   
				    ddbh : "20160728001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000102",  
				    khmc : "宇通",  
				    khjb : "0级",  
				    jfrq : "2016-8-11",  
				    qsrq : "2016-8-01",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m4",   
				    ddbh : "20160802001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000203",  
				    khmc : "长安汽车",  
				    khjb : "0级",  
				    jfrq : "2016-8-12",  
				    qsrq : "2016-8-04",  
				    ddzt : "未生产"  
				}];  
				
				
				var subgrid_data = {  
				m0:[{           //二级菜单  
				    cpbh : "20401150106",     //订单0  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺3",  
				    cpsl : 1000,  
				    scsl : 600  
				}],   
				m1:[{             
				    cpbh : "20401150106",     //订单1  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 1000  
				}, {              
				    cpbh : "20401150207",  
				    cpmc : "产品2",   
				    cpxh : "m8",  
				    cpgg : "m8*1.25 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 800  
				}],  
				m2:[{             
				    cpbh : "2040315038",    //订单2  
				    cpmc : "产品3",   
				    cpxh : "m14",  
				    cpgg : "m14*1 45",  
				    cplx : "C类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 700  
				}],  
				m3:[{             
				    cpbh : "20401150106",     //订单3  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 1000,  
				    scsl : 600  
				}],  
				m4:[{             
				    cpbh : "20405234531",     //订单4  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺2",  
				    cpsl : 1000,  
				    scsl : 500  
				}]};  
				
				
/* 				$.ajax({  
				    async:false,  
				    type:'get',//get是获取数据f，post是带数据的向服务器发送请求  
				    url:'rest/carInfo/getCarsFromUser',  
				    dataType:'json',  
				    success:function(data){  
				    	grid_data = data;
				    },  
				    error:function(data){  
				        alert("JSON数据获取失败，请联系管理员！");  
				    }  
				});
				 */
				jQuery(function($) {  
					var grid_selector = "#grid-table_UserPay";
					var pager_selector = "#grid-pager_UserPay"; 
				    //resize to fit page size 调整自动适应页面大小  
				/* 	        $(window).on(  
				            'resize.jqGrid',  
				            function() {  
				                $(grid_selector).jqGrid('setGridWidth',  
				                        $(".page-content").width());  
				            })  
				    //resize on sidebar collapse/expand  调整工具栏  
				    var parent_column = $(grid_selector).closest('[class*="col-"]');  
				    $(document).on(  
				            'settings.ace.jqGrid',  
				            function(ev, event_name, collapsed) {  
				                if (event_name === 'sidebar_collapsed'  
				                        || event_name === 'main_container_fixed') {  
				                    //setTimeout is for webkit only to give time for DOM changes and then redraw!!!  
				                    setTimeout(function() {  
				                        $(grid_selector).jqGrid('setGridWidth',  
				                                parent_column.width());  
				                    }, 0);  
				                }  
				            })  */ 
				
				    //if your grid is inside another element, for example a tab pane, you should use its parent's width:  
				     
							$(window).on('resize.jqGrid', function () {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						})
						//and also set width when tab pane becomes visible
						$('.tabbable a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
						  if($(e.target).attr('href') == '#tab_1_2') {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						  }
						}) 
				      
				
				    jQuery(grid_selector)                            //grid_selector  
				            .jqGrid(  
				                    {  
				                        //direction: "rtl",  
				
				                        //subgrid options  
				                        subGrid : false,                         //当此项设为true的时候，Grid表格的最左边将会添加一列，里面有一个“+”图标，用于展开子格  
				                        //subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],  
				                        //datatype: "xml",  
				                        subGridOptions : {  
				                            plusicon : "ace-icon fa fa-plus center bigger-110 blue",  
				                            minusicon : "ace-icon fa fa-minus center bigger-110 blue",  
				                            openicon : "ace-icon fa fa-chevron-right center orange"  
				                        },  
				                        //for this example we are using local data  
				                        subGridRowExpanded : function(subgridDivId, rowId) {    // (子表格的id,主表格中所要展开子表格的行的id)  当点击“+”展开子表格时，将触发此选项定义的事件方法；  
				                            var subgridTableId = subgridDivId + "_t";       //根据subgrid_id定义对应的子表格的table的id  
				                            var pager_id = "p_" + subgridTableId;  
				                              
				                            $("#" + subgridDivId)  
				                                    .html(  
				                                            /* "<table id='" + subgridTableId + "'></table>" */  
				                                             "<table id='" + subgridTableId + "' class='scroll'></table><div id='" + pager_id + "' class='scroll'></div>"  
				                                                  
				                                            );  
				                                              
				                            $("#" + subgridTableId).jqGrid({        //subgrid_data显示格式  
				                                datatype : 'local',  
				                                data : subgrid_data[rowId],      //rowId  
				                                /* caption : "产品信息表", */  
				                                  
				                                colNames : ['产品编号', '产品名称','产品型号', '产品规格', '产品类型', '工艺', '产品数量','生产数量','操作'],  
				                                colModel : [{  
				                                    name : 'cpbh',  //对应id  
				                                    width : 110,    //数据显示宽度  
				                                    sorttype : "int",  
				                                    editable : true  
				                                }, {  
				                                    name : 'cpmc',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                }, {  
				                                    name : 'cpxh',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6;IN:m8;TN:m14;AR:m16"  
				                                    }  
				                                }, {  
				                                    name : 'cpgg',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6*1 45;IN:m8*1.25 45;TN:m14*1 45;AR:m16*1 45"  
				                                    }  
				                                }, {  
				                                    name : 'cplx',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:A类;IN:B类;TN:C类;AR:D类"  
				                                    }  
				                                }, {  
				                                    name : 'gy',  
				                                    width : 110,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:工艺1;IN:工艺2;TN:工艺3;AR:工艺4"  
				                                    }  
				                                }, {  
				                                    name : 'cpsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'scsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    //editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				                                  
				                        rowNum : 5,  
				                        rowList : [ 1, 2, 3],  
				                        pager: pager_id,  
				                        altRows : true,  
				                        multiselect : true,  
				                        multiboxonly : true,  
				                        loadComplete : function() {  
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                                  
				                            });  
				                              
				                              
				                                jQuery("#" + subgridTableId).jqGrid('navGrid',            //二级表格底部功能  
				                                  "#" + pager_id, {  
				                                        edit : false,  
				                                        add : true,  
				                                        addicon : 'ace-icon fa fa-plus-circle purple',  
				                                        addtitle: "增加新产品",  
				                                        search : true,  
				                                        searchicon : 'ace-icon fa fa-search orange',  
				                                        refresh : true,  
				                                        refreshicon : 'ace-icon fa fa-refresh green',  
				                                  },  
				                                    {  
				                                        //new record form  
				                                        //width: 700,  
				                                        closeAfterAdd : true,  
				                                        recreateForm : true,  
				                                        viewPagerButtons : false,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_edit_form(form);  
				                                        }  
				                                    },  
				                                    {  
				                                        //delete record form  
				                                        recreateForm : true,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            if (form.data('styled'))  
				                                                return false;  
				                      
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_delete_form(form);  
				                      
				                                            form.data('styled', true);  
				                                        },  
				                                        onClick : function(e) {  
				                                            //alert(1);  
				                                        }  
				                                    });  
				                        },  
				                        //url:"rest/user/userAll",
				                        data : grid_data, 
				        				datatype: "local",
				    					//mtype: "GET",
				                        //datatype : "local",  
				                        height : 275,  
				                        colNames : ['ID','车辆信息','注册时间','分摊上限', '照片','状态','操作'],   
				                        colModel : [  
				                                {  
				                                    name : 'id',  
				                                    index : 'id',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : true  
				                                }, 
				                                {  
				                                    name : 'plateNumber',  
				                                    index : 'plateNumber',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : false  
				                                },  
				                                {  
				                                    name : 'registerDate',  
				                                    index : 'registerDate',  
				                                    editable : false,  
				                                    formatter:"date",formatoptions: {srcformat:'u',newformat:'Y-m-d'}
				                                },
				                                {  
				                                    name : 'partakeMax',  
				                                    index : 'partakeMax',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : false  
				                                }, 
				                                {  
				                                    name : 'carIco',  
				                                    index : 'carIco',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'status',  
				                                    index : 'status',  
				                                    editable : true,  
				                                    width : 120,   
				                                    edittype : "select",  
				                                    editoptions : {  
				                                    	value : "0:审核通过;1:审核未通过"
				                                    },formatter: function (cellvalue, options, rowObject) {
				                                    	var tst = "";
				        								if(cellvalue == 0){
				        									tst = "审核通过";
				        								}else if(cellvalue == 1){
				        									tst = "审核未通过";
				        								}else {
				        									tst= "待审核";
				        								}
				        								
				        							    return tst;   
				        				          }  
				                                }, {  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				
				                        viewrecords : true,  
				                        rowNum : 10,  
				                        rowList : [ 10, 20, 30 ],  
				                        pager : pager_selector,  
				                        altRows : true,  
				                        //toppager: true,  
				
				                        multiselect : true,  
				                        //multikey: "ctrlKey",  
				                        multiboxonly : true,  
				
				                        loadComplete : function() {  
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                        editurl: "rest/user/manage",
				                        /* editurl : "/dummy.html",//nothing is saved */  
				                        caption : "支付记录"  
				
				                    //,autowidth: true,  
				
				                    /** 
				                    , 
				                    grouping:true,  
				                    groupingView : {  
				                         groupField : ['name'], 
				                         groupDataSorted : true, 
				                         plusicon : 'fa fa-chevron-down bigger-110', 
				                         minusicon : 'fa fa-chevron-up bigger-110' 
				                    }, 
				                    caption: "Grouping" 
				                     */  
				
				                    });  
				    $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size  
				
				    //enable search/filter toolbar  
				    //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})  
				    //jQuery(grid_selector).filterToolbar({});  
				
				    //switch element when editing inline  
				    function aceSwitch(cellvalue, options, cell) {  
				        setTimeout(function() {                     //复选框  
				            $(cell).find('input[type=checkbox]').addClass(  
				                    'ace ace-switch ace-switch-5').after(  
				                    '<span class="lbl"></span>');  
				        }, 0);  
				    }  
				    //enable datepicker  
				    function pickDate(cellvalue, options, cell) {     //日期格式  
				        setTimeout(function() {  
				            $(cell).find('input[type=text]').datepicker({  
				                format : 'yyyy-mm-dd',  
				                autoclose : true  
				            });  
				        }, 0);  
				    }  
				
				    //navButtons    页尾按钮  
				    jQuery(grid_selector).jqGrid(     
				            'navGrid',  
				            pager_selector,  
				            { //navbar options  
				                 edit : false,  
				                /* editicon : 'ace-icon fa fa-pencil blue', */  
				                add : false,  
				                addicon : 'ace-icon fa fa-plus-circle purple',  
				                del : false,  
				                delicon : 'ace-icon fa fa-trash-o red',  
				                search : true,  
				                searchicon : 'ace-icon fa fa-search orange',  
				                refresh : true,  
				                refreshicon : 'ace-icon fa fa-refresh green',  
				                /* view : true, 
				                viewicon : 'ace-icon fa fa-search-plus grey', */  
				            },  
				            {  
				                                                            //edit record form  
				                //closeAfterEdit: true,  
				                //width: 700,  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //new record form  
				                //width: 700,  
				                closeAfterAdd : true,  
				                recreateForm : true,  
				                viewPagerButtons : false,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //delete record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    if (form.data('styled'))  
				                        return false;  
				
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_delete_form(form);  
				
				                    form.data('styled', true);  
				                },  
				                onClick : function(e) {  
				                    //alert(1);  
				                }  
				            },  
				            {  
				                //search form  
				                recreateForm : true,  
				                afterShowSearch : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                    style_search_form(form);  
				                },  
				                afterRedraw : function() {  
				                    style_search_filters($(this));  
				                },  
				                multipleSearch : true,  
				            /** 
				            multipleGroup:true, 
				            showQuery: true 
				             */  
				            },  
				            {  
				                //view record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                }  
				            })  
				
				    function style_edit_form(form) {  
				        //enable datepicker on "sdate" field and switches for "stock" field   //已改  
				        form.find('input[name=jfrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				        form.find('input[name=qsrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				
				        form.find('input[name=stock]').addClass(  
				                'ace ace-switch ace-switch-5').after(  
				                '<span class="lbl"></span>');  
				        //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)  
				        //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');  
				
				        //update buttons classes  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-primary').prepend(  
				                '<i class="ace-icon fa fa-check"></i>');  
				        buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')  
				
				        buttons = form.next().find('.navButton a');  
				        buttons.find('.ui-icon').hide();  
				        buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');  
				        buttons.eq(1)  
				                .append('<i class="ace-icon fa fa-chevron-right"></i>');  
				    }  
				
				    function style_delete_form(form) {  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm btn-white btn-round').find(  
				                '[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-danger').prepend(  
				                '<i class="ace-icon fa fa-trash-o"></i>');  
				        buttons.eq(1).addClass('btn-default').prepend(  
				                '<i class="ace-icon fa fa-times"></i>')  
				    }  
				
				    function style_search_filters(form) {  
				        form.find('.delete-rule').val('X');  
				        form.find('.add-rule').addClass('btn btn-xs btn-primary');  
				        form.find('.add-group').addClass('btn btn-xs btn-success');  
				        form.find('.delete-group').addClass('btn btn-xs btn-danger');  
				    }  
				    function style_search_form(form) {  
				        var dialog = form.closest('.ui-jqdialog');  
				        var buttons = dialog.find('.EditTable')  
				        buttons.find('.EditButton a[id*="_reset"]').addClass(  
				                'btn btn-sm btn-info').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-retweet');  
				        buttons.find('.EditButton a[id*="_query"]').addClass(  
				                'btn btn-sm btn-inverse').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-comment-o');  
				        buttons.find('.EditButton a[id*="_search"]').addClass(  
				                'btn btn-sm btn-purple').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-search');  
				    }  
				
				    function beforeDeleteCallback(e) {  
				        var form = $(e[0]);  
				        if (form.data('styled'))  
				            return false;  
				
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_delete_form(form);  
				
				        form.data('styled', true);  
				    }  
				
				    function beforeEditCallback(e) {  
				        var form = $(e[0]);  
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_edit_form(form);  
				    }  
				
				    //it causes some flicker when reloading or navigating grid  
				    //it may be possible to have some custom formatter to do this as the grid is being created to prevent this  
				    //or go back to default browser checkbox styles for the grid  
				    function styleCheckbox(table) {             //  
				        /** 
				            $(table).find('input:checkbox').addClass('ace') 
				            .wrap('<label />') 
				            .after('<span class="lbl align-top" />') 
				         
				         
				            $('.ui-jqgrid-labels th[id*="_cb"]:first-child') 
				            .find('input.cbox[type=checkbox]').addClass('ace') 
				            .wrap('<label />').after('<span class="lbl align-top" />'); 
				         */  
				    }  
				
				    //unlike navButtons icons, action icons in rows seem to be hard-coded  
				    //you can change them like this in here if you want  
				    function updateActionIcons(table) {  
				        /** 
				        var replacement =  
				        { 
				            'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue', 
				            'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red', 
				            'ui-icon-disk' : 'ace-icon fa fa-check green', 
				            'ui-icon-cancel' : 'ace-icon fa fa-times red' 
				        }; 
				        $(table).find('.ui-pg-div span.ui-icon').each(function(){ 
				            var icon = $(this); 
				            var $class = $.trim(icon.attr('class').replace('ui-icon', '')); 
				            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]); 
				        }) 
				         */  
				    }  
				
				    //replace icons with FontAwesome icons like above  
				    function updatePagerIcons(table) {  
				        var replacement = {  
				            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',  
				            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',  
				            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',  
				            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'  
				        };  
				        $(  
				                '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')  
				                .each(  
				                        function() {  
				                            var icon = $(this);  
				                            var $class = $.trim(icon.attr('class').replace(  
				                                    'ui-icon', ''));  
				
				                            if ($class in replacement)  
				                                icon.attr('class', 'ui-icon '  
				                                        + replacement[$class]);  
				                        })  
				    }  
				
				    function enableTooltips(table) {  
				        $('.navtable .ui-pg-button').tooltip({  
				            container : 'body'  
				        });  
				        $(table).find('.ui-pg-div').tooltip({  
				            container : 'body'  
				        });  
				    }  
				
				    //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');  
				
				    $(document).one('ajaxloadstart.page', function(e) {  
				        $(grid_selector).jqGrid('GridUnload');  
				        $('.ui-jqdialog').remove();  
				    });  
				});
		</script>
<script type="text/javascript">
				var grid_data = [ {   
				    id: "m0",   
				    ddbh : "20160701001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000201",  
				    khmc : "东风",  
				    khjb : "0级",  
				    jfrq : "2016-7-15",  
				    qsrq : "2016-7-03",  
				    ddzt : "已闭单"  
				},{  
				    id: "m1",   
				    ddbh : "20160725001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000105",  
				    khmc : "比亚迪",  
				    khjb : "1级",  
				    jfrq : "2016-8-15",  
				    qsrq : "2016-7-26",  
				    ddzt : "生产中"  
				},  
				{  
				    id: "m2",   
				    ddbh : "20160726001",  
				    ddlx : "制造订单",  
				    ddjb : "0级",  
				    khbh : "000122",  
				    khmc : "长城汽车",  
				    khjb : "2级",  
				    jfrq : "2016-8-08",  
				    qsrq : "2016-7-28",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m3",   
				    ddbh : "20160728001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000102",  
				    khmc : "宇通",  
				    khjb : "0级",  
				    jfrq : "2016-8-11",  
				    qsrq : "2016-8-01",  
				    ddzt : "生产中"  
				},  
				{     
				    id: "m4",   
				    ddbh : "20160802001",  
				    ddlx : "制造订单",  
				    ddjb : "1级",  
				    khbh : "000203",  
				    khmc : "长安汽车",  
				    khjb : "0级",  
				    jfrq : "2016-8-12",  
				    qsrq : "2016-8-04",  
				    ddzt : "未生产"  
				}];  
				
				
				var subgrid_data = {  
				m0:[{           //二级菜单  
				    cpbh : "20401150106",     //订单0  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺3",  
				    cpsl : 1000,  
				    scsl : 600  
				}],   
				m1:[{             
				    cpbh : "20401150106",     //订单1  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 1000  
				}, {              
				    cpbh : "20401150207",  
				    cpmc : "产品2",   
				    cpxh : "m8",  
				    cpgg : "m8*1.25 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 800  
				}],  
				m2:[{             
				    cpbh : "2040315038",    //订单2  
				    cpmc : "产品3",   
				    cpxh : "m14",  
				    cpgg : "m14*1 45",  
				    cplx : "C类",  
				    gy :"工艺1",  
				    cpsl : 2000,  
				    scsl : 700  
				}],  
				m3:[{             
				    cpbh : "20401150106",     //订单3  
				    cpmc : "产品1",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺1",  
				    cpsl : 1000,  
				    scsl : 600  
				}],  
				m4:[{             
				    cpbh : "20405234531",     //订单4  
				    cpmc : "产品2",   
				    cpxh : "m6",  
				    cpgg : "m6*1 45",  
				    cplx : "A类",  
				    gy :"工艺2",  
				    cpsl : 1000,  
				    scsl : 500  
				}]};  
				
				
/* 				$.ajax({  
				    async:false,  
				    type:'get',//get是获取数据，post是带数据的向服务器发送请求  
				    url:'rest/carInfo/getCarsFromUser',  
				    dataType:'json',  
				    success:function(data){  
				    	grid_data = data;
				    },  
				    error:function(data){  
				        alert("JSON数据获取失败，请联系管理员！");  
				    }  
				}); */
				
				jQuery(function($) {  
					var grid_selector = "#grid-table_scoreOper";
					var pager_selector = "#grid-pager_scoreOper"; 
				
				    //resize to fit page size 调整自动适应页面大小  
				/* 	        $(window).on(  
				            'resize.jqGrid',  
				            function() {  
				                $(grid_selector).jqGrid('setGridWidth',  
				                        $(".page-content").width());  
				            })  
				    //resize on sidebar collapse/expand  调整工具栏  
				    var parent_column = $(grid_selector).closest('[class*="col-"]');  
				    $(document).on(  
				            'settings.ace.jqGrid',  
				            function(ev, event_name, collapsed) {  
				                if (event_name === 'sidebar_collapsed'  
				                        || event_name === 'main_container_fixed') {  
				                    //setTimeout is for webkit only to give time for DOM changes and then redraw!!!  
				                    setTimeout(function() {  
				                        $(grid_selector).jqGrid('setGridWidth',  
				                                parent_column.width());  
				                    }, 0);  
				                }  
				            })  */ 
				
				    //if your grid is inside another element, for example a tab pane, you should use its parent's width:  
				     
							$(window).on('resize.jqGrid', function () {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						})
						//and also set width when tab pane becomes visible
						$('.tabbable a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
						  if($(e.target).attr('href') == '#tab_1_5') {
							var parent_width = $(grid_selector).closest('.tab-pane').width();
							$(grid_selector).jqGrid( 'setGridWidth', parent_width );
						  }
						}) 
				      
				
				    jQuery(grid_selector)                            //grid_selector  
				            .jqGrid(  
				                    {  
				                        //direction: "rtl",  
				
				                        //subgrid options  
				                        subGrid : false,                         //当此项设为true的时候，Grid表格的最左边将会添加一列，里面有一个“+”图标，用于展开子格  
				                        //subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],  
				                        //datatype: "xml",  
				                        subGridOptions : {  
				                            plusicon : "ace-icon fa fa-plus center bigger-110 blue",  
				                            minusicon : "ace-icon fa fa-minus center bigger-110 blue",  
				                            openicon : "ace-icon fa fa-chevron-right center orange"  
				                        },  
				                        //for this example we are using local data  
				                        subGridRowExpanded : function(subgridDivId, rowId) {    // (子表格的id,主表格中所要展开子表格的行的id)  当点击“+”展开子表格时，将触发此选项定义的事件方法；  
				                            var subgridTableId = subgridDivId + "_t";       //根据subgrid_id定义对应的子表格的table的id  
				                            var pager_id = "p_" + subgridTableId;  
				                              
				                            $("#" + subgridDivId)  
				                                    .html(  
				                                            /* "<table id='" + subgridTableId + "'></table>" */  
				                                             "<table id='" + subgridTableId + "' class='scroll'></table><div id='" + pager_id + "' class='scroll'></div>"  
				                                                  
				                                            );  
				                                              
				                            $("#" + subgridTableId).jqGrid({        //subgrid_data显示格式  
				                                datatype : 'local',  
				                                data : subgrid_data[rowId],      //rowId  
				                                /* caption : "产品信息表", */  
				                                  
				                                colNames : ['产品编号', '产品名称','产品型号', '产品规格', '产品类型', '工艺', '产品数量','生产数量','操作'],  
				                                colModel : [{  
				                                    name : 'cpbh',  //对应id  
				                                    width : 110,    //数据显示宽度  
				                                    sorttype : "int",  
				                                    editable : true  
				                                }, {  
				                                    name : 'cpmc',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                }, {  
				                                    name : 'cpxh',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6;IN:m8;TN:m14;AR:m16"  
				                                    }  
				                                }, {  
				                                    name : 'cpgg',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:m6*1 45;IN:m8*1.25 45;TN:m14*1 45;AR:m16*1 45"  
				                                    }  
				                                }, {  
				                                    name : 'cplx',  
				                                    width : 110 ,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:A类;IN:B类;TN:C类;AR:D类"  
				                                    }  
				                                }, {  
				                                    name : 'gy',  
				                                    width : 110,  
				                                    editable : true,  
				                                    edittype : "select",  
				                                    editoptions : {  
				                                        value : "FE:工艺1;IN:工艺2;TN:工艺3;AR:工艺4"  
				                                    }  
				                                }, {  
				                                    name : 'cpsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'scsl',  
				                                    width : 110 ,  
				                                    sorttype : "int",  
				                                    editable : true  
				                                } ,{  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    //editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				                                  
				                        rowNum : 5,  
				                        rowList : [ 1, 2, 3],  
				                        pager: pager_id,  
				                        altRows : true,  
				                        multiselect : true,  
				                        multiboxonly : true,  
				                        loadComplete : function() {  
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                                  
				                            });  
				                              
				                              
				                                jQuery("#" + subgridTableId).jqGrid('navGrid',            //二级表格底部功能  
				                                  "#" + pager_id, {  
				                                        edit : false,  
				                                        add : true,  
				                                        addicon : 'ace-icon fa fa-plus-circle purple',  
				                                        addtitle: "增加新产品",  
				                                        search : true,  
				                                        searchicon : 'ace-icon fa fa-search orange',  
				                                        refresh : true,  
				                                        refreshicon : 'ace-icon fa fa-refresh green',  
				                                  },  
				                                    {  
				                                        //new record form  
				                                        //width: 700,  
				                                        closeAfterAdd : true,  
				                                        recreateForm : true,  
				                                        viewPagerButtons : false,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_edit_form(form);  
				                                        }  
				                                    },  
				                                    {  
				                                        //delete record form  
				                                        recreateForm : true,  
				                                        beforeShowForm : function(e) {  
				                                            var form = $(e[0]);  
				                                            if (form.data('styled'))  
				                                                return false;  
				                      
				                                            form.closest('.ui-jqdialog').find(  
				                                                    '.ui-jqdialog-titlebar').wrapInner(  
				                                                    '<div class="widget-header" />')  
				                                            style_delete_form(form);  
				                      
				                                            form.data('styled', true);  
				                                        },  
				                                        onClick : function(e) {  
				                                            //alert(1);  
				                                        }  
				                                    });  
				                        },  
				                        //url:"rest/user/userAll",
				                        data : grid_data, 
				        				datatype: "local",
				    					//mtype: "GET",
				                        //datatype : "local",  
				                        height : 275,  
				                        colNames : ['ID','车辆信息','注册时间','分摊上限', '照片','状态','操作'],   
				                        colModel : [  
				                                {  
				                                    name : 'id',  
				                                    index : 'id',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : true  
				                                }, 
				                                {  
				                                    name : 'plateNumber',  
				                                    index : 'plateNumber',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : false  
				                                },  
				                                {  
				                                    name : 'registerDate',  
				                                    index : 'registerDate',  
				                                    editable : false,  
				                                    formatter:"date",formatoptions: {srcformat:'u',newformat:'Y-m-d'}
				                                },
				                                {  
				                                    name : 'partakeMax',  
				                                    index : 'partakeMax',  
				                                      width : 120,    
				                                    sorttype : "int",  
				                                    editable : false  
				                                }, 
				                                {  
				                                    name : 'carIco',  
				                                    index : 'carIco',  
				                                    editable : false,  
				                                    editoptions : {  
				                                        size : "20",  
				                                        maxlength : "30"  
				                                    }  
				                                },
				                                {  
				                                    name : 'status',  
				                                    index : 'status',  
				                                    editable : true,  
				                                    width : 120,   
				                                    edittype : "select",  
				                                    editoptions : {  
				                                    	value : "0:审核通过;1:审核未通过"
				                                    },formatter: function (cellvalue, options, rowObject) {
				                                    	var tst = "";
				        								if(cellvalue == 0){
				        									tst = "审核通过";
				        								}else if(cellvalue == 1){
				        									tst = "审核未通过";
				        								}else {
				        									tst= "待审核";
				        								}
				        								
				        							    return tst;   
				        				          }  
				                                }, {  
				                                    name : 'myac',  
				                                    index : '',  
				                                    width : 80,  
				                                    fixed : true,  
				                                    sortable : false,  
				                                    resize : false,  
				                                    formatter : 'actions',  
				                                    formatoptions : {  
				                                        keys : true,  
				                                        //delbutton: false,//disable delete button  
				
				                                        delOptions : {  
				                                            recreateForm : true,  
				                                            beforeShowForm : beforeDeleteCallback  
				                                        },  
				                                    editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}  
				                                    }  
				                                }],  
				
				                        viewrecords : true,  
				                        rowNum : 10,  
				                        rowList : [ 10, 20, 30 ],  
				                        pager : pager_selector,  
				                        altRows : true,  
				                        //toppager: true,  
				
				                        multiselect : true,  
				                        //multikey: "ctrlKey",  
				                        multiboxonly : true,  
				
				                        loadComplete : function() {  
				                            var table = this;  
				                            setTimeout(function() {  
				                                styleCheckbox(table);  
				
				                                updateActionIcons(table);  
				                                updatePagerIcons(table);  
				                                enableTooltips(table);  
				                            }, 0);  
				                        },  
				                        editurl: "rest/user/manage",
				                        /* editurl : "/dummy.html",//nothing is saved */  
				                        caption : "积分兑换记录"  
				
				                    //,autowidth: true,  
				
				                    /** 
				                    , 
				                    grouping:true,  
				                    groupingView : {  
				                         groupField : ['name'], 
				                         groupDataSorted : true, 
				                         plusicon : 'fa fa-chevron-down bigger-110', 
				                         minusicon : 'fa fa-chevron-up bigger-110' 
				                    }, 
				                    caption: "Grouping" 
				                     */  
				
				                    });  
				    $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size  
				
				    //enable search/filter toolbar  
				    //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})  
				    //jQuery(grid_selector).filterToolbar({});  
				
				    //switch element when editing inline  
				    function aceSwitch(cellvalue, options, cell) {  
				        setTimeout(function() {                     //复选框  
				            $(cell).find('input[type=checkbox]').addClass(  
				                    'ace ace-switch ace-switch-5').after(  
				                    '<span class="lbl"></span>');  
				        }, 0);  
				    }  
				    //enable datepicker  
				    function pickDate(cellvalue, options, cell) {     //日期格式  
				        setTimeout(function() {  
				            $(cell).find('input[type=text]').datepicker({  
				                format : 'yyyy-mm-dd',  
				                autoclose : true  
				            });  
				        }, 0);  
				    }  
				
				    //navButtons    页尾按钮  
				    jQuery(grid_selector).jqGrid(     
				            'navGrid',  
				            pager_selector,  
				            { //navbar options  
				                 edit : false,  
				                /* editicon : 'ace-icon fa fa-pencil blue', */  
				                add : false,  
				                addicon : 'ace-icon fa fa-plus-circle purple',  
				                del : false,  
				                delicon : 'ace-icon fa fa-trash-o red',  
				                search : true,  
				                searchicon : 'ace-icon fa fa-search orange',  
				                refresh : true,  
				                refreshicon : 'ace-icon fa fa-refresh green',  
				                /* view : true, 
				                viewicon : 'ace-icon fa fa-search-plus grey', */  
				            },  
				            {  
				                                                            //edit record form  
				                //closeAfterEdit: true,  
				                //width: 700,  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //new record form  
				                //width: 700,  
				                closeAfterAdd : true,  
				                recreateForm : true,  
				                viewPagerButtons : false,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_edit_form(form);  
				                }  
				            },  
				            {  
				                //delete record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    if (form.data('styled'))  
				                        return false;  
				
				                    form.closest('.ui-jqdialog').find(  
				                            '.ui-jqdialog-titlebar').wrapInner(  
				                            '<div class="widget-header" />')  
				                    style_delete_form(form);  
				
				                    form.data('styled', true);  
				                },  
				                onClick : function(e) {  
				                    //alert(1);  
				                }  
				            },  
				            {  
				                //search form  
				                recreateForm : true,  
				                afterShowSearch : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                    style_search_form(form);  
				                },  
				                afterRedraw : function() {  
				                    style_search_filters($(this));  
				                },  
				                multipleSearch : true,  
				            /** 
				            multipleGroup:true, 
				            showQuery: true 
				             */  
				            },  
				            {  
				                //view record form  
				                recreateForm : true,  
				                beforeShowForm : function(e) {  
				                    var form = $(e[0]);  
				                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title')  
				                            .wrap('<div class="widget-header" />')  
				                }  
				            })  
				
				    function style_edit_form(form) {  
				        //enable datepicker on "sdate" field and switches for "stock" field   //已改  
				        form.find('input[name=jfrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				        form.find('input[name=qsrq]').datepicker({  
				            format : 'yyyy-mm-dd',  
				            autoclose : true  
				        })  
				
				        form.find('input[name=stock]').addClass(  
				                'ace ace-switch ace-switch-5').after(  
				                '<span class="lbl"></span>');  
				        //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)  
				        //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');  
				
				        //update buttons classes  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-primary').prepend(  
				                '<i class="ace-icon fa fa-check"></i>');  
				        buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')  
				
				        buttons = form.next().find('.navButton a');  
				        buttons.find('.ui-icon').hide();  
				        buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');  
				        buttons.eq(1)  
				                .append('<i class="ace-icon fa fa-chevron-right"></i>');  
				    }  
				
				    function style_delete_form(form) {  
				        var buttons = form.next().find('.EditButton .fm-button');  
				        buttons.addClass('btn btn-sm btn-white btn-round').find(  
				                '[class*="-icon"]').hide();//ui-icon, s-icon  
				        buttons.eq(0).addClass('btn-danger').prepend(  
				                '<i class="ace-icon fa fa-trash-o"></i>');  
				        buttons.eq(1).addClass('btn-default').prepend(  
				                '<i class="ace-icon fa fa-times"></i>')  
				    }  
				
				    function style_search_filters(form) {  
				        form.find('.delete-rule').val('X');  
				        form.find('.add-rule').addClass('btn btn-xs btn-primary');  
				        form.find('.add-group').addClass('btn btn-xs btn-success');  
				        form.find('.delete-group').addClass('btn btn-xs btn-danger');  
				    }  
				    function style_search_form(form) {  
				        var dialog = form.closest('.ui-jqdialog');  
				        var buttons = dialog.find('.EditTable')  
				        buttons.find('.EditButton a[id*="_reset"]').addClass(  
				                'btn btn-sm btn-info').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-retweet');  
				        buttons.find('.EditButton a[id*="_query"]').addClass(  
				                'btn btn-sm btn-inverse').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-comment-o');  
				        buttons.find('.EditButton a[id*="_search"]').addClass(  
				                'btn btn-sm btn-purple').find('.ui-icon').attr('class',  
				                'ace-icon fa fa-search');  
				    }  
				
				    function beforeDeleteCallback(e) {  
				        var form = $(e[0]);  
				        if (form.data('styled'))  
				            return false;  
				
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_delete_form(form);  
				
				        form.data('styled', true);  
				    }  
				
				    function beforeEditCallback(e) {  
				        var form = $(e[0]);  
				        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')  
				                .wrapInner('<div class="widget-header" />')  
				        style_edit_form(form);  
				    }  
				
				    //it causes some flicker when reloading or navigating grid  
				    //it may be possible to have some custom formatter to do this as the grid is being created to prevent this  
				    //or go back to default browser checkbox styles for the grid  
				    function styleCheckbox(table) {             //  
				        /** 
				            $(table).find('input:checkbox').addClass('ace') 
				            .wrap('<label />') 
				            .after('<span class="lbl align-top" />') 
				         
				         
				            $('.ui-jqgrid-labels th[id*="_cb"]:first-child') 
				            .find('input.cbox[type=checkbox]').addClass('ace') 
				            .wrap('<label />').after('<span class="lbl align-top" />'); 
				         */  
				    }  
				
				    //unlike navButtons icons, action icons in rows seem to be hard-coded  
				    //you can change them like this in here if you want  
				    function updateActionIcons(table) {  
				        /** 
				        var replacement =  
				        { 
				            'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue', 
				            'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red', 
				            'ui-icon-disk' : 'ace-icon fa fa-check green', 
				            'ui-icon-cancel' : 'ace-icon fa fa-times red' 
				        }; 
				        $(table).find('.ui-pg-div span.ui-icon').each(function(){ 
				            var icon = $(this); 
				            var $class = $.trim(icon.attr('class').replace('ui-icon', '')); 
				            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]); 
				        }) 
				         */  
				    }  
				
				    //replace icons with FontAwesome icons like above  
				    function updatePagerIcons(table) {  
				        var replacement = {  
				            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',  
				            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',  
				            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',  
				            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'  
				        };  
				        $(  
				                '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')  
				                .each(  
				                        function() {  
				                            var icon = $(this);  
				                            var $class = $.trim(icon.attr('class').replace(  
				                                    'ui-icon', ''));  
				
				                            if ($class in replacement)  
				                                icon.attr('class', 'ui-icon '  
				                                        + replacement[$class]);  
				                        })  
				    }  
				
				    function enableTooltips(table) {  
				        $('.navtable .ui-pg-button').tooltip({  
				            container : 'body'  
				        });  
				        $(table).find('.ui-pg-div').tooltip({  
				            container : 'body'  
				        });  
				    }  
				
				    //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');  
				
				    $(document).one('ajaxloadstart.page', function(e) {  
				        $(grid_selector).jqGrid('GridUnload');  
				        $('.ui-jqdialog').remove();  
				    });  
				}); 
		</script>								
		 <script type="text/javascript">

        </script>        
        
        <script>
		jQuery(document).ready(function() {     
	        $('.gridcell a').click(function(e) {
	            e.preventDefault();
	            var url = this.href;
	            if (url != null && url != 'javascript:;') {
	                $.get(url, function(data) {
	                    $('#main-content').html(data);
	                });
	            }
	        });
            $("#ui_date_picker").datetimepicker({
            });
            
            
            
/*     		$('#carManager').autocomplete({
    			source : function(query, process) {
    				var matchCount = this.options.items;
    				$.post("rest/user/getCarManager", {
    					"cname" : query,
    					"matchCount" : matchCount
    				}, function(respData) {
    					return process(respData);
    				});
    			},
    			formatItem : function(item) {
    				return item["cname"];
    			},
    			setValue : function(item) {
    				return {
    					'data-value' : item["userId"],
    					'real-value' : item["userName"]
    				};
    			}
    		}).change(function() {
    			$('#sellcompanyid').val($("#sellcname").attr("real-value") || "");
    		});
             */
            
		});
	</script>

    </body>
</html>
</html>