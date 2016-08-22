<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@include file="../../../include/include_code.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="<%=ctx %>/css/theme-default.css"/>
	</head>
	<body>
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
                        <form action="<%=ctx %>/stu/save.do" method="post" class="form-horizontal">
                        <input type="hidden"  name="stuId"  value="${stu.stuId }">
                        <div class="panel-body">        	
                            <div class="row">
                                <div class="form-group">
                                    <label class="col-md-3 control-label">姓名</label>
                                    <div class="col-md-7">                                            
                                        <div class="input-group">
                                            <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                            <input type="text" name="stuName"  value="${stu.stuName}" class="form-control"/>
                                        </div>                                            
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">年龄</label>
                                    <div class="col-md-7">                                            
                                        <div class="input-group">
                                            <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                            <input type="text"  name="stuInAge"  value="${stu.stuInAge}"  class="form-control"/>
                                        </div>                                            
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-3 control-label">专业</label>
                                    <div class="col-md-7">    
                                     <div class="input-group"> 
                                      <span class="input-group-addon"><span class="fa fa-list"></span></span>                                       
                                       <select class="form-control select" name="ctId">
											<option value="%">--请选择--</option>
											<c:forEach var="ct" items="${ctList }">
												<option value="${ct.ctId }"
													<c:if test="${ct.ctId==stu.ctId }">selected</c:if>>${ct.ctName }</option>
											</c:forEach>
										</select>                    
                                    </div>
                                    </div>
                                </div>
                        	</div>
                        </div>
	                     <div class="panel-footer text-center">
	                     	 <button type="button" onclick="history.back()"  class="btn btn-primary btn-lg"><span class="fa fa-mail-reply"></span>返回</button>        
	                     	 <button type="reset" class="btn btn-primary btn-lg"><span class="fa fa-retweet"></span>重置</button>                                    
                             <button type="submit" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-send"></span>提交</button>
	                    </div>
	                    </form>
                    </div>
        	</div>
        </div>
	</body>
    <%@include file="../../../include/include.jsp" %>
	 <%@include file="../../../include/include_obj_action.jsp" %>
	
</html>
