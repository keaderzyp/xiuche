<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../../../include/include_code.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="<%=ctx %>/css/theme-default.css"/>
		<style type="text/css">
			.table-min{
				overflow: auto;
				
			}
		</style>
	</head>
	<body>
		<!-- 1.当前位置     2.菜单名,说明    3.信息list,实体   4.分页及条件查询 -->
        <div class="page-content-wrap">
        	<div class="row">
        		 <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="panel-title-box">
                                <h3>学生信息</h3>
                                <span>全校学生信息表</span>
                            </div>                                    
                            <ul class="panel-controls" style="margin-top: 2px;">
                                <li><a href="#" class="panel-collapse"><span class="fa fa-angle-down"></span></a></li>
                                <li>
                                    <a href="#" class="panel-remove" ><span class="fa fa-times"></span></a>                                        
                                </li>                                        
                            </ul>
                        </div>
                        <div class="panel-body">   
                        	<form class="form-horizontal">
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">姓名</label>
                                            <div class="col-md-9">                                            
                                                <div class="input-group">
                                                    <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                    <input type="text" class="form-control"/>
                                                </div>                                            
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group">                                        
                                            <label class="col-md-3 control-label">学校</label>
                                            <div class="col-md-9 col-xs-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                    <input type="text" class="form-control"/>
                                                </div>            
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group">                                        
                                            <label class="col-md-3 control-label">出生日期</label>
                                            <div class="col-md-9">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                    <input type="text" class="form-control datepicker" value="2014-11-01">                                            
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">专业</label>
                                            <div class="col-md-9">                                                                                            
                                                <select class="form-control select">
                                                    <option>Option 1</option>
                                                    <option>Option 2</option>
                                                    <option>Option 3</option>
                                                    <option>Option 4</option>
                                                    <option>Option 5</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="panel-body text-center">
                        	<button class="btn btn-primary">查询</button>
                        	<button onclick="location.href='page.jsp'" class="btn btn-primary">添加</button>
                        	<button class="btn btn-primary">删除</button>
                        </div>
                        

                        
                        <div class="panel-body">
                            <div class="table-min table-responsive ">
                                <table class="table  table-actions table-striped table-hover">
                                    <thead>
                                        <tr>
                                        	<th>序号</th>
                                        	<th width="1%">
                                            	<input class="icheckbox" type="checkbox" />
                                            </th>
                                            <th>姓名</th>
                                            <th>性别</th>
                                            <th>年龄</th>
                                            <th>出生日期</th>
                                            <th>学校</th>
                                            <th>专业</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${data.rows}" var="user" varStatus="i">
                         				<tr>
                                           <td>${i.count}</td>
                                           <td>
                                           		<input  class="icheckbox" type="checkbox" />
                                           </td>
                                           <td>${user.userName }</td>
                                           <td>男</td>
                                           <td>18</td>
                                           <td>${user.nickName }</td>
                                           <td>${user.userRegTime }</td>
                                           <td>计算机</td>
                                        </tr>
                        			</c:forEach>
                                    </tbody>
                                </table>
                                
                            </div>
                        </div>
                         <div class="panel-footer ">
                         <!-- 自定义分页标签 先在footer中创建一个 class＝pageTag的div 再用include引入jsp的文件，在引入文件的 -->
                         	<div class="pageTag">
                         	</div>
                        </div>
                    </div>
        	</div>
        </div>
	</body>
    <%@include file="../../../include/include.jsp" %>
	<%@include file="../../../include/include_obj_action.jsp" %>
	<%@include file="../../../include/include_page.jsp" %>
	<script type="text/javascript">
	function turnPage(p){
		location.href="<%=request.getContextPath()%>/sysUser/queryPage.do?page="+p+"&rows="+$("#rows").val();
	}
	function turnRows(){
		location.href="<%=request.getContextPath()%>/sysUser/queryPage.do?page=1&rows="+$("#rows").val();
	}
	</script>
</html>
