<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
	$(function() {
		var sessionInfo_userId = '${sessionInfo.userId}';
		//alert('${sessionInfo.userId}')
		if (sessionInfo_userId) {/*目的是，如果已经登陆过了，那么刷新页面后也不需要弹出登录窗体*/
			$('#layout_west_tree').tree({
				url : '${pageContext.request.contextPath}/sysRes/menuTree.do',
				parentField : 'pid',
				lines : true,
				onClick : function(node) {
				
					var url;
					if (node.url) {
						url = '${pageContext.request.contextPath}' + node.url;
					} else {
						url = '${pageContext.request.contextPath}/error/dog.jsp';
					}
					//alert(url);
	
					layout_center_addTabFun({
						title : node.text,
						closable : true,
						//iconCls : node.iconCls,
						href : url
					});
					
				}/**/
			});
		}
		
		
		
		$('#userBtn').bind('click', function(){    
			layout_center_addTabFun({
				title:"用户信息",
				closable : true,
				href:"${pageContext.request.contextPath}/jsp/system/sysuser/list_user.jsp"
			});	
	    });  
		
		$('#roleBtn').bind('click', function(){    
			layout_center_addTabFun({
				title:"角色信息",
				closable : true,
				href:"${pageContext.request.contextPath}/jsp/system/sysrole/list_role.jsp"
			});	
	    });  
		$('#resBtn').bind('click', function(){    
			layout_center_addTabFun({
				title:"权限信息",
				closable : true,
				href:"${pageContext.request.contextPath}/jsp/system/sysresource/list_res.jsp"
			});	
	    });  

	});
	
 
		
	
</script>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<div title="业务功能菜单" data-options="iconCls:'icon-menu',
			tools : [ {
				iconCls : 'icon-reload',
				handler : function() {
					$('#layout_west_tree').tree('reload');
				}
			}, {
				iconCls : 'icon-redo',
				handler : function() {
					var node = $('#layout_west_tree').tree('getSelected');
					if (node) {
						$('#layout_west_tree').tree('expandAll', node.target);
					} else {
						$('#layout_west_tree').tree('expandAll');
					}
				}
			}, {
				iconCls : 'icon-undo',
				handler : function() {
					var node = $('#layout_west_tree').tree('getSelected');
					if (node) {
						$('#layout_west_tree').tree('collapseAll', node.target);
					} else {
						$('#layout_west_tree').tree('collapseAll');
					}
				}
			} ]">
		<ul id="layout_west_tree"></ul>
	</div>
	<div title="树形系统菜单" data-options="iconCls:'icon-menu'">
		
		<a herf="#"   id="userBtn"  class="easyui-linkbutton" >用户</a><br/>
		<a herf="#"   id="roleBtn"  class="easyui-linkbutton" >角色</a><br/>
		<a herf="#"   id="resBtn"  class="easyui-linkbutton" >权限</a><br/>
		<a herf="#"   id="menuBtn"  class="easyui-linkbutton" >菜单</a><br/>
		
	</div>
	
</div>