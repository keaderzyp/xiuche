<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <base href="<%=basePath%>">
        <meta charset="utf-8" />
        <title>互助修车</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1.0" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <meta name="MobileOptimized" content="320">


        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        
        
        <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        
		

        <!-- BEGIN THEME STYLES -->
        <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/plugins.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="assets/css/custom.css" rel="stylesheet" type="text/css" />
        <link href="css/summernote.css" rel="stylesheet" type="text/css" />
        <!-- END THEME STYLES -->

        <link rel="shortcut icon" href="app/img/favicon.ico" />
    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class="page-header-fixed">
        <%@include file="../system/admin/top.jsp"%>
        <div class="clearfix"></div>
        <!-- BEGIN CONTAINER -->
        <div class="page-container">
			<%@include file="../system/admin/left.jsp"%>
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <div class="page-content">
				<%@include file="../system/admin/customizer.jsp"%>
                    <!-- BEGIN PAGE HEADER-->
                    <div class="row">
                        <div class="col-md-12">
                            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                            <h3 class="page-title" id="index-page-title">Dashboard</h3>
<!--                             <ul class="page-breadcrumb breadcrumb">
                                <li>
                                    <i class="fa fa-home"></i>
                                    <a href="javascript:;">
                                        首页
                                    </a>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                                <li>
                                    <a href="javascript:;">
                                        Dashboard
                                    </a>
                                </li>
                            </ul> -->
                            <!-- END PAGE TITLE & BREADCRUMB-->
                        </div>
                    </div>
                    <!-- END PAGE HEADER-->

                    <!-- BEGIN DASHBOARD STATS -->
                    <div id="main-content" class="clearFix"></div>

                    <!-- END PORTLET-->
                </div>
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- END CONTAINER -->
        <%@include file="../system/admin/footer.jsp"%>
        <!--[if lt IE 9]>
        <script src="assets/plugins/respond.min.js"></script>
        <script src="assets/plugins/excanvas.min.js"></script>
        <![endif]-->
        
   
        		
        <script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="assets/js/jquery.js"></script> 
        <script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/summernote.min.js" type="text/javascript"></script>
        <script src="js/summernote-zh-CN.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="assets/plugins/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
        <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
        <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

        <script src="assets/plugins/jquery-validation/jquery.validate.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>

        <script src="assets/scripts/app.js" type="text/javascript"></script>
        <script type="text/javascript" src="app/js/index.js"></script>
        
       

        <!-- <script data-main="app/js/main" src="app/lib/requirejs/require.js"></script> -->
    </body>
</html>