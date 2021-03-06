<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top">
	<!-- BEGIN TOP NAVIGATION BAR -->
	<div class="header-inner">
		<!-- BEGIN LOGO -->
		<a class="navbar-brand" href="javascript:;"> <img
			src="assets/img/logo.png" alt="logo" class="img-responsive" />
		</a>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse"> <img
			src="assets/img/menu-toggler.png" alt="" />
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<ul class="nav navbar-nav pull-right">
			<li class="dropdown user"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" data-hover="dropdown"
				data-close-others="true"> <img alt=""
					src="assets/img/avatar1_small.jpg" /> <span class="username">
						${user.username } </span> <i class="fa fa-angle-down"></i>
			</a>
				<ul class="dropdown-menu">
					<li><a href="javascript:;" id="trigger_fullscreen"> <i
							class="fa fa-move"></i> 全屏
					</a></li>
					<li><a href="extra_lock.html"> <i class="fa fa-lock"></i>
							锁屏
					</a></li>
					<li><a href="rest/user/adminlogout"> <i class="fa fa-key"></i>
							退出
					</a></li>
				</ul></li>
			<!-- END USER LOGIN DROPDOWN -->
		</ul>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->