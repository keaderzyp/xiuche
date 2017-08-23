<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true"></button>
				<h4 class="modal-title">Modal title</h4>
			</div>
			<div class="modal-body">Widget settings form goes here</div>
			<div class="modal-footer">
				<button type="button" class="btn blue">Save changes</button>
				<button type="button" class="btn default" data-dismiss="modal">
					Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
<!-- BEGIN STYLE CUSTOMIZER -->
<div class="theme-panel hidden-xs hidden-sm">
	<div class="toggler"></div>
	<div class="toggler-close"></div>
	<div class="theme-options">
		<div class="theme-option theme-colors clearfix">
			<span> 主题颜色 </span>
			<ul>
				<li class="color-black current color-default" data-style="default"></li>
				<li class="color-blue" data-style="blue"></li>
				<li class="color-brown" data-style="brown"></li>
				<li class="color-purple" data-style="purple"></li>
				<li class="color-grey" data-style="grey"></li>
				<li class="color-white color-light" data-style="light"></li>
			</ul>
		</div>
		<div class="theme-option">
			<span> 布局 </span> <select
				class="layout-option form-control input-small">
				<option value="fluid">顺序</option>
				<option value="boxed">盒状</option>
			</select>
		</div>
		<div class="theme-option">
			<span> 标题 </span> <select
				class="header-option form-control input-small">
				<option value="fixed">固定</option>
				<option value="default">默认</option>
			</select>
		</div>
		<div class="theme-option">
			<span> 工具栏 </span> <select
				class="sidebar-option form-control input-small">
				<option value="fixed">固定</option>
				<option value="default">默认</option>
			</select>
		</div>
		<div class="theme-option">
			<span> 工具栏位置 </span> <select
				class="sidebar-pos-option form-control input-small">
				<option value="left">左边</option>
				<option value="right">右边</option>
			</select>
		</div>
		<div class="theme-option">
			<span> 页脚 </span> <select
				class="footer-option form-control input-small">
				<option value="fixed">固定</option>
				<option value="default">默认</option>
			</select>
		</div>
	</div>
</div>
<!-- END STYLE CUSTOMIZER -->