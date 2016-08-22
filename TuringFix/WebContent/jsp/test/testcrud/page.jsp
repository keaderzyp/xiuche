<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../../../include/include_code.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="<%=ctx %>/css/theme-default.css"/>
	</head>
	<body>
		<ul class="breadcrumb">
            <li><a href="#">首页</a></li>                    
            <li class="active">当前位置</li>
        </ul>
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
                        <form action="<%=ctx %>/list.jsp" class="form-horizontal">
                        <div class="panel-body">   
                        	
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">账号</label>
                                        <div class="col-md-7">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                <input type="text" class="form-control"/>
                                            </div>                                            
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">密码</label>
                                        <div class="col-md-7">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                <input type="password" class="form-control"/>
                                            </div>                                            
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">姓名</label>
                                        <div class="col-md-7">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                <input type="text" class="form-control"/>
                                            </div>                                            
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">性别</label>
                                       
                                        <div class="col-md-7 ">   
                                        	<div class="col-md-6">
                                        		<label class="check">
	                                        		<input class="iradio" type="radio" /> 男
	                                        	</label>
                                        	</div>
                                        	<div class="col-md-6">
                                        		<label class="check">
	                                        		<input class="iradio" type="radio" /> 女
	                                        	</label>
                                        	</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">专业</label>
                                        <div class="col-md-7">                                            
                                           	<select class="select form-control">
                                           		<option>java</option>
                                           		<option>php</option>
                                           		<option>javascript</option>
                                           	</select>                                           
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">出生日期</label>
                                        <div class="col-md-7">                                            
                                            <div class="input-group">
                                            	<span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                            	<input type="text" class="datepicker form-control" />	
                                            </div>                                     
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">角色</label>
                                        <div class="col-md-7"> 
                                        	<div class="col-md-3">                                    
	                                            <label class="check"><input type="checkbox" class="icheckbox"/> Default</label>
	                                        </div>
	                                        <div class="col-md-3">                                    
	                                            <label class="check"><input type="checkbox" class="icheckbox" /> Checked</label>
	                                        </div>
	                                        <div class="col-md-3">                                    
	                                            <label class="check"><input type="checkbox" class="icheckbox"/> Disabled</label>
	                                        </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">头像</label>
                                        <div class="col-md-7">                                            
                                             <input type="file" class="fileinput btn-primary" />	
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">备注</label>
                                        <div class="col-md-7">                                            
                                             <textarea class="form-control"></textarea>
                                        </div>
                                    </div>
                                </div>
                            
                        </div>
	                     <div class="panel-footer text-center">
	                     	 <button type="button" class="btn btn-primary">返回</button>        
	                     	 <button type="reset" class="btn btn-primary">重置</button>                                    
                             <button type="submit" class="btn btn-primary">提交</button>
	                    </div>
	                    </form>
                    </div>
        	</div>
        </div>
	</body>
    <%@include file="../../../include/include.jsp" %>
	 <%@include file="../../../include/include_obj_action.jsp" %>
	
</html>
