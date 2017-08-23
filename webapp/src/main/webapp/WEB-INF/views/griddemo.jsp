<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>

<html lang="en">
<head>
		<base href="<%=basePath%>">
    <!-- The jQuery library is a prerequisite for all jqSuite products -->
    <script type="text/javascript" src="app/lib/jquery/jquery.min.js"></script> 
    <!-- This is the Javascript file of jqGrid -->   
    <script type="text/javascript" src="app/lib/jquery/jquery.jqGrid.min.js"></script>
    <!-- This is the localization file of the grid controlling messages, labels, etc.
    <!-- We support more than 40 localizations -->
    <script type="text/javascript" src="app/lib/jquery/grid.locale-cn.js"></script>
    <!-- A link to a jQuery UI ThemeRoller theme, more than 22 built-in and many more custom -->

        
    <link rel="stylesheet" type="text/css" media="screen" href="app/css/jquery-ui.css" />
     <link rel="stylesheet" type="text/css" media="screen" href="app/css/ui.jqgrid.css" /> 
    <!-- The link to the CSS that the grid needs -->

    <meta charset="utf-8" />
    <title>jqGrid Loading Data - Dialogs - Edit, Add, Delete</title>
</head>
<body>

    <table id="jqGrid"></table>
    <div id="jqGridPager"></div>

    <script type="text/javascript">

        $(document).ready(function () {
            $("#jqGrid").jqGrid({
                url: 'rest/user/userManage',
				// we set the changes to be made at client side using predefined word clientArray
                editurl: 'clientArray',
                cellSubmit: 'clientArray',
                //editurl: 'rest/user/userManage',
                datatype: "json",
                colModel: [
                    {
						label: 'id',
                        name: 'id',
                        width: 75,
						key: true,
						editable: true,
						editrules : { required: true}
                    },
                    {
						label: 'name',
                        name: 'username',
                        width: 140,
                        editable: true // must set editable to true if you want to make the field editable
                    },
                    {
						label : 'password',
                        name: 'password',
                        width: 100,
                        editable: true
                    },
                    {
						label: 'state',
                        name: 'state',
                        width: 80,
                        editable: true
                    },
                    {
						label: 'createtime',
                        name: 'createTime',
                        width: 140,
                        editable: true
                    }
                ],
				sortname: 'id',
				sortorder : 'asc',
				loadonce: true,
				viewrecords: true,
                width: 780,
                height: 200,
                rowNum: 10,
                pager: "#jqGridPager"
            });

            $('#jqGrid').navGrid('#jqGridPager',
            		
                // the buttons to appear on the toolbar of the grid
                { edit: true, add: true, del: true, search: false, refresh: false, view: false, position: "left", cloneToTop: false },
                // options for the Edit Dialog
                {
                    editCaption: "The Edit Dialog",
                    recreateForm: true,
					checkOnUpdate : true,
					checkOnSubmit : true,
                    closeAfterEdit: true,
                    errorTextFormat: function (data) {
                        return 'Error: ' + data.responseText
                    }
                },
                // options for the Add Dialog
                {
                    closeAfterAdd: true,
                    recreateForm: true,
                    errorTextFormat: function (data) {
                    	
                        return 'Error: ' + data.responseText
                    }
                },
                // options for the Delete Dailog
                {
                	
                	errorTextFormat: function (data) {
                		
                    
                        return 'Error: ' + data.responseText
                    }
                
                });
            
            
            
            
            
        });

    </script>

    
</body>
</html>