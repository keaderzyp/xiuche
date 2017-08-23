<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>资讯</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>/assets/pc/css/style.css"/>
	</head>
	<body>
		<nav class="nav">
			<div class="container" >
				<div class="nav navbar-header">
					<a href="<%=basePath %>/rest/pc/index" class="title">
						<img class="logo" src="<%=basePath %>/assets/pc/img/logo.png"/>
						<span>互助修车</span>
					</a>
					<button class="btn  navbar-toggle "  data-toggle="collapse" data-target="#nav">
						<span class="glyphicon glyphicon-menu-hamburger"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse " id="nav">
					<ul class="nav navbar-nav navbar-right">
						<li >
							<a href="<%=basePath %>/rest/pc/index" >
								<span>首页</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/blockPublicity">
								<span>区块公示</span>
							</a>
						</li>
						<li class="active">
							<a href="<%=basePath %>/rest/pc/information">
								<span>资讯</span>
							</a>
						</li>
						<li >
							<a href="<%=basePath %>/rest/pc/about">
								<span>关于我们</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/downLoads">
								<span>下载app</span>
							</a>
						</li>
						<li>
							<a href="<%=basePath %>/rest/pc/problem">
								<span>常见问题</span>
							</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>
		<div class="nav-second ">
			<div class="container">
				<ul class="list-unstyled list-inline">
				 	<c:forEach items="${list }" var="obj">
						<li><a href="#a${obj.typeId }" id="${obj.typeId }" data-toggle="tab">${obj.typeName }</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="container">
			<div class="tab-content">
				<!--爱搞机页面-->
				<c:forEach items="${list }" var="obj">
					<div class="tab-pane fade " data-pageNo="1"  id="a${obj.typeId }">
						
					
					</div>
				</c:forEach>
			</div>
			
		</div>
		<div class="container">
			<ul class="pager">
				<li class="pager-prev"><a href="#">上一页</a></li>
				<li class="active no-page"><a href="#">1</a></li>
				<li class="pager-next"><a href="#">下一页</a></li>
				<li  class="disabled total-page"><a href="#">共2页</a></li>
			</ul>
		</div>
		<footer class="footer">
			<div class="container">
				<dl >
					<dt class="title col-md-1 col-sm-1">
						<img src="<%=basePath %>/assets/pc/img/Group Copy.png"/>
					</dt>
					<dd class="title col-md-9 col-sm-9">
						<p>
							Copyright &copy;互助修车 黔ICP备17007794号  版权声明
						</p>
						<p>
							互助修车，为您提供省心便捷的修车服务
						</p>
					</dd>
					<dd class="title col-md-2 col-sm-2 text-right">
						<img src="<%=basePath %>/assets/pc/img/weixin.png"/>
						<img src="<%=basePath %>/assets/pc/img/weibo.png" alt="" />
					</dd>
				</dl>
			</div>
		</footer>
	</body>
	<script src="<%=basePath %>/assets/pc/js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="<%=basePath %>/assets/pc/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		(function($){
			//加载时让默认第一组内部页面显示
			$(".nav-second li").eq(0).addClass('active');
			$(".tab-pane").eq(0).addClass('active in');
			//发送请求查询第一组页面的内容
			var url="<%=basePath %>/rest/moments/queryNewsByType";
	    	var id = $(".nav-second li a").eq(0).prop("id");
	    	//console.log(id);
	    	var data = {type:id,pageSize:9};
	    	$.post(url,data,function(res){
	    		//配置该组页面的总页数
	    		$('.tab-pane:eq(0)')[0].dataset.pagetotal=res[0].pageTotal;
	    		//晴空内容
	    		$('.tab-pane:eq(0)').empty();
	    		//生成页面内容
	    		initInsetPage(res[0].list,'.tab-pane:eq(0)');
	    		//处理分页器
	    		$('.total-page a ').html('共'+res[0].pageTotal+'页');
	    		$('.no-page a ').html($('.tab-pane:eq(0)')[0].dataset.pageno);
	    		/* $('.show')[0].dataset.pagetotal=res[0].pageTotal;
	    		$('.gonggao-page .load').remove(); */
	    		$(".pager-prev")[0].dataset.pageno = (parseInt($('.tab-pane:eq(0)')[0].dataset.pageno)<=1?1:parseInt($('.tab-pane:eq(0)')[0].dataset.pageno)-1);
	    		$(".pager-next")[0].dataset.pageno = (parseInt($('.tab-pane:eq(0)')[0].dataset.pageno)>=res[0].pageTotal?res[0].pageTotal:parseInt($('.tab-pane:eq(0)')[0].dataset.pageno)+1);
	    		$(".pager-prev")[0].dataset.id=id;
	    		$(".pager-next")[0].dataset.id=id;
	    	},'json'); 
	    	//加载页面内容的方法
	    	function initInsetPage(list,pageName){
	 	    	for(var i=0;i<list.length;i++){
	 	    		var icon,username;
		    		if(list[i].userFid==null){
		    			icon="";
		    			username="";
		    		}else{
		    			icon=list[i].userFid.userIco;
		    			username=list[i].userFid.username;
		    		}
	 	    		var d = new Date(list[i].issueTime.time);
	 	    		$(pageName).append('<div class="col-md-6 col-lg-4"> '+
					'	<div class="treval-item row"> '+
					'		<a href="<%=basePath %>'+list[i].dynamicUrl+'?id='+list[i].dynamicId+'&pc=1"> '+
					'			<img src="<%=basePath %>img/'+list[i].bynamicIco+'"/> '+
					'			<h4> '+
					'				'+list[i].title+' '+
					'			</h4> '+
					'			<p> '+
					'				'+list[i].desciption+' '+
					'			</p> '+
					'		</a> '+
					'		<div class="other"> '+
					'			<img class="face" src="<%=basePath %>img/'+icon+'"/>  '+
					'			'+username+' '+
					'			<div class="nice pull-right"> '+
					'				<img class="zan" src="<%=basePath %>/assets/pc/img/mdpi/zan copy.png"/> 1 '+
					'				<img class="ping" src="<%=basePath %>/assets/pc/img/mdpi/pinglun copy.png"/> 2 '+
					'			</div> '+
					'		</div> '+
					'	</div>	 '+
					'</div>');
	 	    	}
	 	    }
	    	//导航切换页面时加载内容的方法
	    	$(".nav-second li").on('click',function(){
	    		//console.log($(this).children().eq(0).prop('id'));
	    		var id = $(this).children().eq(0).prop('id');
	    		console.log(id);
	    		var target = '#a'+$(this).children().eq(0).prop('id');
	    		//console.log(target);
	    		$('.no-page a ').html($(target)[0].dataset.pageno);
	    		$(".pager-prev")[0].dataset.id=id;
	    		$(".pager-next")[0].dataset.id=id;
	    		$('.total-page a ').html('共'+$(target)[0].dataset.pagetotal+'页');
	    		if($(target).html().trim()==""){
	    			var url="<%=basePath %>/rest/moments/queryNewsByType";
	    	    	var data = {type:id,pageSize:9};
	    	    	$.post(url,data,function(res){
	    	    		console.log(res);
	    	    		$(target)[0].dataset.pagetotal=res[0].pageTotal;
	    	    		$(target).empty();
	    	    		initInsetPage(res[0].list,target);
	    	    		$('.total-page a ').html('共'+res[0].pageTotal+'页');
	    	    		$(".pager-prev")[0].dataset.pageno = (parseInt($(target)[0].dataset.pageno)<=1?1:parseInt($(target)[0].dataset.pageno)-1);
	    	    		$(".pager-next")[0].dataset.pageno = (parseInt($(target)[0].dataset.pageno)>=res[0].pageTotal?res[0].pageTotal:parseInt($(target)[0].dataset.pageno)+1);
	    	    	},'json'); 
	    		}
	    	});
	    	$(".pager-prev,.pager-next").on('click',function(){
	    		var url="<%=basePath %>/rest/moments/queryNewsByType";
	    		var id = $(this)[0].dataset.id;
	    		var target = '#a'+id;
	    		console.log(id);
	    		var pageNo = $(this)[0].dataset.pageno;
	    		var data = {type:id,pageSize:9,pageNo:pageNo};
	    		$.post(url,data,function(res){
    	    		$(target)[0].dataset.pagetotal=res[0].pageTotal;
    	    		$(target)[0].dataset.pageno=pageNo;
    	    		$(target).empty();
    	    		initInsetPage(res[0].list,target);
    	    		$('.total-page a ').html('共'+res[0].pageTotal+'页');
    	    		$('.no-page a ').html($(target)[0].dataset.pageno);
    	    		$(".pager-prev")[0].dataset.pageno = (parseInt($(target)[0].dataset.pageno)<=1?1:parseInt($(target)[0].dataset.pageno)-1);
    	    		$(".pager-next")[0].dataset.pageno = (parseInt($(target)[0].dataset.pageno)>=res[0].pageTotal?res[0].pageTotal:parseInt($(target)[0].dataset.pageno)+1);
    	    		$(".pager-prev")[0].dataset.id=id;
    	    		$(".pager-next")[0].dataset.id=id;
    	    	},'json'); 
	    	});
		})($)
	</script>
	<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
</html>
