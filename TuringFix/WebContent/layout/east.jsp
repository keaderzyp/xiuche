<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript" charset="utf-8">
$(function() {
	/**/
	$('#layout_east_onlineDatagrid').datagrid({
		url : '${pageContext.request.contextPath}/sysOnline/datagrid.do',
		title : '',
		iconCls : '',
		fit : true,
		fitColumns : true,
		pagination : true,
		pageSize : 10,
		pageList : [ 10 ],
		nowarp : false,
		border : false,
		idField : 'olId',
		sortName : 'olLoginTime',
		sortOrder : 'desc',
		frozenColumns : [ [ {
			title : '编号',
			field : 'olId',
			width : 150,
			hidden : true
		} ] ],
		columns : [ [ {
			title : '登录名',
			field : 'olName',
			width : 100,
			sortable : true,
			formatter : function(value, rowData, rowIndex) {
				return formatString('<span title="{0}">{1}</span>', value, value);
			}
		}, {
			title : 'IP',
			field : 'olIp',
			width : 150,
			sortable : true,
			formatter : function(value, rowData, rowIndex) {
				return formatString('<span title="{0}">{1}</span>', value, value);
			}
		}, {
			title : '登录时间',
			field : 'olLoginTime',
			width : 150,
			sortable : true,
			formatter : function(value, rowData, rowIndex) {
				return formatString('<span title="{0}">{1}</span>', value, value);
			},
			hidden : true
		} ] ],
		onClickRow : function(rowIndex, rowData) {
		},
		onLoadSuccess : function(data) {
			$('#layout_east_onlinePanel').panel('setTitle', '( ' + data.total + ' )人在线');
		}
	}).datagrid('getPager').pagination({
		showPageList : false,
		showRefresh : false,
		beforePageText : '',
		afterPageText : '/{pages}',
		displayMsg : ''
	});

	$('#layout_east_onlinePanel').panel({
		tools : [ {
			iconCls : 'icon-reload',
			handler : function() {
				$('#layout_east_onlineDatagrid').datagrid('load', {});
			}
		} ]
	});

	window.setInterval(function() {
		$('#layout_east_onlineDatagrid').datagrid('load', {});
	}, 1000 * 60 * 10);

	
	
	
	$('#layout_east_calendar').calendar({
		fit : true,
		current : new Date(),
		border : true,
		onSelect : function(date) {
			$(this).calendar('moveTo', new Date());
		}
	});

});
	
		

</script>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'north',border:false" style="height:180px;overflow: hidden;">
		<div id="layout_east_calendar"></div>
	</div>
	<div data-options="region:'center',border:false" style="overflow: hidden;">
		<div id="layout_east_onlinePanel" data-options="fit:true,border:false" title="用户在线列表">
			<table id="layout_east_onlineDatagrid"></table>
		</div>
	</div>
</div>