<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
	<div class="page-sidebar navbar-collapse collapse">
		<!-- BEGIN SIDEBAR MENU -->
		<ul class="page-sidebar-menu" id="page-sidebar-menu">
			<li class="sidebar-toggler-wrapper">
				<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				<div class="sidebar-toggler hidden-phone"></div> <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
			</li>

			<li class="start active"><a href="rest/page/dashboard"
				id="btn-dashboard"> <i class="fa fa-home"></i><span
					class="title"> 首页 </span><span class="selected"> </span>
			</a></li>

			<li class=""><a href="javascript:;"> <i class="fa fa-gears"></i><span
					class="title"> 系统管理 </span><span class="arrow "> </span>
			</a>
				<ul class="sub-menu">
					<li><a href="rest/page/userManage"> 用户管理 </a></li>
					<li><a href="rest/page/roleManage"> 角色管理 </a></li>
					<li><a href="javascript:;"> 权限管理 </a></li>
					<shiro:hasAnyRoles name="admin">
						<li><a href="rest/page/druid">监控管理</a></li>
					</shiro:hasAnyRoles>
				</ul></li>

			<li class=""><a href="javascript:;"> <i class="fa fa-user"></i><span
					class="title"> 个人中心 </span><span class="arrow "> </span>
			</a>
				<ul class="sub-menu">
					<li><a href="javascript:;"> 信息修改 </a></li>
					<li><a href="javascript:;"> 密码修改 </a></li>

					<!-- 测试权限控制 -->
					<shiro:hasAnyRoles name="super_admin">
						<li><a href="javascript:;">super_admin 拥有此角色</a></li>
					</shiro:hasAnyRoles>

					<shiro:hasPermission name="user:create">
						<li><a href="javascript:;">user:create 拥有此权限</a></li>
					</shiro:hasPermission>

					<shiro:hasPermission name="user:update">
						<li><a href="javascript:;">user:update 拥有此权限</a></li>
					</shiro:hasPermission>

				</ul></li>

			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title"> 测试 </span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="rest/goFileUpload">文件上传</a></li>
				</ul>
			</li>
			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title">会员管理</span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="">会员分组</a></li>
					<li><a href="">会员等级</a></li>
					<li class="">
						<a href="javascript:;"><i class="fa fa-user"></i><span class="title">会员管理</span><span class="arrow "></span></a>
						<ul class="sub-menu">
							<li class="">
								<a href="javascript:;"><i class="fa fa-user"></i><span class="title">会员管理详情</span><span class="arrow "></span></a>
								<ul class="sub-menu">
									<li><a href="rest/help/addHelpPage">新增求助记录</a></li>
									<li><a href="">处理信息维护</a></li>
								</ul>
							</li>
						</ul>
					</li>
				</ul>
			</li>
			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title">修车厂管理</span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="">厂家分组</a></li>
				</ul>
			</li>
			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title">车型黑名单</span><span class="arrow "></span></a>
			</li>
			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title">商城管理</span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="">分类管理</a></li>
					<li class="">
						<a href="javascript:;"><i class="fa fa-user"></i><span class="title">商城维护</span><span class="arrow "></span></a>
						<ul class="sub-menu">
							<li><a href="">商品详情(新增)</a></li>
						</ul>
					</li>
					<li><a href="">订单管理</a></li>
				</ul>
			</li>
			<li class="">
				<a href="javascript:;"><i class="fa fa-user"></i><span class="title">积分管理</span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="rest/page/storePlanManage">积分方案</a></li>
				</ul>
			</li>
			<li class="">
				<a href="rest/page/shareManage"><i class="fa fa-user"></i><span class="title">分享管理</span><span class="arrow "></span></a>
				<ul class="sub-menu">
					<li><a href="">新增分享</a></li>
				</ul>
			</li>
			<li class="">
				<a href="rest/bill/billManage"><i class="fa fa-user"></i><span class="title">账单管理</span><span class="arrow "></span></a>
			</li>
			<li class="">
				<a href="rest/page/staffManage"><i class="fa fa-user"></i><span class="title">职员管理</span><span class="arrow "></span></a>
			</li>
			<li class="">
					<a href="javascript:;"><i class="fa fa-user"></i><span class="title">系统配置维护</span><span class="arrow "></span></a>
					<ul class="sub-menu">
					<li class="">
						<a href="javascript:;"><i class="fa fa-user"></i><span class="title">分摊系数维护</span><span class="arrow "></span></a>
					</li>
					<li class="">
						<a href="javascript:;"><i class="fa fa-user"></i><span class="title">小圈分摊比例维护</span><span class="arrow "></span></a>
					</li>					
				</ul>
			</li>
			<li class="">
					<a href="javascript:;"><i class="fa fa-user"></i><span class="title">资讯管理</span><span class="arrow "></span></a>
					<ul class="sub-menu">
					<li class="">
						<a href="rest/page/informationType"><i class="fa fa-user"></i><span class="title">资讯分类维护</span><span class="arrow "></span></a>
					</li>
					<li class="">
						<a href="rest/page/information"><i class="fa fa-user"></i><span class="title">资讯内容管理</span><span class="arrow "></span></a>
					</li>					
				</ul>
			</li>
		</ul>
		<!-- END SIDEBAR MENU -->
	</div>
</div>
<!-- END SIDEBAR -->
