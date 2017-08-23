<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<hr/>
<input type="hidden" id="helpId" name="helpId" value="${helpInfo.helpId}"/>
<input type="hidden" name="id" value="${user.id }"/>
<div class="form-horizontal col-xs-12">
	<div class="form-group">
		<div class="">
			<div class="input-group">
				<div class="input-group-addon">求助人</div>
				<input type="text" class="form-control" name="param7" placeholder="请输入求助人的真实姓名" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="">
			<div class="input-group">
				<div class="input-group-addon">电话</div>
				<input type="text" class="form-control"  name="param4" value="${user.username }"/>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="">
			<div class="input-group">
				<div class="input-group-addon">类型</div>
				<div class="" style="padding-left:15px">
					<label class="radio-inline" for="optionsRadios3">
				        <input type="radio" name="param3"  id="optionsRadios3" value="" > 事故
				    </label>
				    <label class="radio-inline" for="optionsRadios4">
				        <input type="radio" name="param3"  id="optionsRadios4"  value=""> 其他
				    </label>
				</div>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="">
			<div class="input-group ">
				<div class="input-group-addon">求助时间</div>
				<input name="time" placeholder="请选择求助时间" type="text" value=""
					data-date-format="yyyy/mm/dd"
					class="form-control date form_date" /> 
				
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="">
			<div class="input-group">
				<div class="input-group-addon"  >求助地点</div>
				<textarea class="form-control" name="happenPosition"></textarea>
			</div>
		</div>
	</div>
	<div class="form-group text-center">
		<button type="button" id="sub" data-url="<%=basePath %>rest/help/maintainAddr" class="btn btn-primary">提交</button>
		<button type="reset" id="reset" class="btn btn-default">重置</button>
	</div>
</div>
<hr/>
<script type="text/javascript" src="js/web_util_2.js"></script>
<script type="text/javascript">
		//跳转页面代码
		$('.form_date').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			minView: 2,
			forceParse: 0
	    });
		util_p.navigateTo('#sub', '#queryForm', function() {
			console.log('跳转页成功');
		}, 'post', "#innerPage");
		
		
		
</script>

