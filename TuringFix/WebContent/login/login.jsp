<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
	$(function() {

		var formParam = {
			url : '${pageContext.request.contextPath}/sysUser/login.do',
			success : function(result) {
				//alert(result);
				var r = $.parseJSON(result);
				if (r.success) {
					$('#user_login_loginDialog').dialog('close');

					$('#sessionInfoDiv').html(formatString('[<strong>{0}</strong>]，欢迎你！您使用[<strong>{1}</strong>]IP登录！', r.obj.loginName, r.obj.ip));

					$('#layout_east_onlineDatagrid').datagrid('load', {});
					
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
					
				} else {
					$.messager.show({
						title : '提示',
						msg : r.msg
					});
				}
			}
		};

		$('#user_login_loginInputForm').form(formParam);



		$('#user_login_loginDialog').show().dialog({
			modal : true,
			title : '系统登录',
			closable : false,
			buttons : [ {
				text : '注册',
				handler : function() {
					$('#user_reg_regDialog').dialog('open');
				}
			}, {
				text : '登录',
				handler : function() {
					$("#user_login_loginInputForm").submit();
				}
			} ]
		});

		var sessionInfo_userId = '${sessionInfo.userId}';
		//alert('${sessionInfo.userId}')
		if (sessionInfo_userId) {/*目的是，如果已经登陆过了，那么刷新页面后也不需要弹出登录窗体*/
			$('#user_login_loginDialog').dialog('close');
		}

	});
</script>
<div id="user_login_loginDialog" style="display: none;width: 300px;height: 210px;overflow: hidden;">
	<div id="user_login_loginTab">
		<div title="输入方式" style="overflow: hidden;">
			<div>
				<div class="info">
					<div class="tip icon-tip"></div>
					<div>用户名，密码不能空</div>
				</div>
			</div>
			<div align="center">
				<form method="post" id="user_login_loginInputForm">
					<table class="tableForm">
						<tr>
							<th>登录名</th>
							<td><input name="userName" class="easyui-validatebox" style="width: 150px;" data-options="required:true" value="admin" />
							</td>
						</tr>
						<tr>
							<th>密码</th>
							<td><input type="password" name="userPass" class="easyui-validatebox" data-options="required:true" style="width: 150px;" value="admin" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</div>