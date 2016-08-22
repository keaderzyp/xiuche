<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/include_code.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />

        
        <link rel="icon" href="favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" type="text/css" id="theme" href="css/theme-default.css"/>
	</head>
	<body>
	    <div class="page-container">
            <!-- START PAGE SIDEBAR -->
            <div class="page-sidebar">
                <!-- START X-NAVIGATION -->
                <ul class="x-navigation">
                    <li class="xn-logo">
                        <a href="index.html">ATLANT</a>
                        <a href="#" class="x-navigation-control"></a>
                    </li>
                    <li class="xn-profile">
                        <div class="profile">
                            <div class="profile-image">
                                <img src="assets/images/gallery/girls-1.jpg" alt="John Doe"/>
                            </div>
                            <div class="profile-data">
                                <div class="profile-data-name">张小鹏</div>
                                <div class="profile-data-title">最牛的前端工程师</div>
                            </div>
                            <div class="profile-controls">
                                <a href="pages-profile.html" class="profile-control-left"><span class="fa fa-info"></span></a>
                                <a href="pages-messages.html" class="profile-control-right"><span class="fa fa-envelope"></span></a>
                            </div>
                        </div>                                                                        
                    </li>
                    <li class="xn-title">导航菜单</li>
                    <li class="active"><a href="#">权限管理</a></li>
                    <li class="xn-openable">
                    	<a href="#" ><span class="fa fa-user"></span><span class="xn-text">学生信息</span></a>
                    	<ul>
                    		<li><a href="<%=ctx %>/testUser/queryPage.do?page=1&rows=10" target="right"><span class="fa fa-info"></span>查询学生信息</a></li>
                    		<li><a href="<%=ctx %>/jsp/test/testcrud/page.jsp" target="right"><span class="fa fa-info"></span>增加学生信息</a></li>
                    		<li><a href="<%=ctx %>/stu/query.do" target="right"><span class="fa fa-info"></span>测试stu</a></li>
                    	</ul>
                    </li>
                    <li class="xn-openable">
                    	<a href="#" ><span class="fa fa-android"></span><span class="xn-text">个人中心</span></a>
                    	<ul>
                    		<li><a href="list.jsp" target="right"><span class="fa fa-info"></span>修改密码</a></li>
                    		<li><a href="#" class="mb-control" data-box="#mb-signout" ><span class="fa fa-info"></span>退出登录</a></li>
                    	</ul>
                    </li>
                </ul>
            </div>
            <div class="page-content" id="body-content" style="border:1px solid"  >
            	<ul class="x-navigation x-navigation-horizontal x-navigation-panel">
            		<li class="xn-icon-button" >
            			<a href="#" class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>
            		</li>
            		<li class="xn-search">
            			<form >
            				<input type="text" name="search" placeholder="Search" />
            			</form>
            		</li>
            		
            		<li class="xn-icon-button pull-right">
                        <a href="#" class="mb-control" data-box="#mb-signout"><span class="fa fa-sign-out"></span></a>                        
                    </li> 
                    
                    <li class="xn-icon-button pull-right">
                        <a href="#"><span class="fa fa-comments"></span></a>
                        <div class="informer informer-danger">4</div>
                        <div class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
                            <div class="panel-heading">
                                <h3 class="panel-title"><span class="fa fa-comments"></span> Messages</h3>                                
                                <div class="pull-right">
                                    <span class="label label-danger">4 new</span>
                                </div>
                            </div>
                            <div class="panel-body list-group list-group-contacts scroll" style="height: 200px;">
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-online"></div>
                                    <img src="assets/images/users/user2.jpg" class="pull-left" alt="John Doe"/>
                                    <span class="contacts-title">John Doe</span>
                                    <p>Praesent placerat tellus id augue condimentum</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-away"></div>
                                    <img src="assets/images/users/user.jpg" class="pull-left" alt="Dmitry Ivaniuk"/>
                                    <span class="contacts-title">Dmitry Ivaniuk</span>
                                    <p>Donec risus sapien, sagittis et magna quis</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-away"></div>
                                    <img src="assets/images/users/user3.jpg" class="pull-left" alt="Nadia Ali"/>
                                    <span class="contacts-title">Nadia Ali</span>
                                    <p>Mauris vel eros ut nunc rhoncus cursus sed</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-offline"></div>
                                    <img src="assets/images/users/user6.jpg" class="pull-left" alt="Darth Vader"/>
                                    <span class="contacts-title">Darth Vader</span>
                                    <p>I want my money back!</p>
                                </a>
                            </div>     
                            <div class="panel-footer text-center">
                                <a href="pages-messages.html">Show all messages</a>
                            </div>                            
                        </div>                        
                    </li>
            	</ul>
            	<object  id="obj" name="right" type="text/html" data="<%=ctx%>/index.jsp" width="100%" height="94%"></object>
            	
            	
            </div>
        </div>
        <div class="message-box animated fadeIn" data-sound="alert" id="mb-signout">
            <div class="mb-container">
                <div class="mb-middle">
                    <div class="mb-title"><span class="fa fa-sign-out"></span> 确认退出吗 ?</div>
                    <div class="mb-content">
                        <p>Are you sure you want to log out?</p>                    
                        <p>Press No if youwant to continue work. Press Yes to logout current user.</p>
                    </div>
                    <div class="mb-footer">
                        <div class="pull-right">
                            <a href="login.jsp" class="btn btn-success btn-lg">确认</a>
                            <button class="btn btn-default btn-lg mb-control-close">取消</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <audio id="audio-alert" src="audio/alert.mp3" preload="auto"></audio>
        <audio id="audio-fail" src="audio/fail.mp3" preload="auto"></audio>
		<!-- START SCRIPTS -->
        <!-- START PLUGINS -->
      	<%@include file="include/include.jsp" %>
        <%@include file="include/include_frame.jsp" %>
      	
       
        <!-- END TEMPLATE -->
    <!-- END SCRIPTS -->      
	</body>
</html>
