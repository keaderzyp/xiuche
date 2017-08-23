<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
    <head>
     <base href="<%=basePath%>">
        <meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>动态</title>
		<link href="css/moments-styles.css" rel="stylesheet">
		<style type="text/css">
			.nav-bar .tab-bar-icon i{
				width:24px;
				height:24px;
				background-size:100% 100%;
				background-position:center
			}
		</style>
    </head>
   <body>
		<div class="nav">
			<div class="nav-city">
				动态
			</div>
			<div class="search">
				<img src="img/search.png" alt="" />
			</div>
		</div>
		<div class="tab-bar nav-bar">
		    <c:forEach items="${list }" var="obj">
				<div class="tab-bar-icon  " id="${obj.typeId }">
					<i class="${obj.typeIcon }">
					</i>
					<span >
						${obj.typeName }
					</span>
					<!-- <span class="badge">2</span> -->
				</div>
			</c:forEach>
		</div>
		<div class="pages">
			<c:forEach items="${list }" var="obj">
				<!--公告-->
				<div class="${obj.typeIcon }-page  " data-pageNo="1">
				</div>
			</c:forEach>
		</div>
		
		<div class="tab-bar">
			<div class="tab-bar-icon ">
				<a href="rest/userAdd/mainIndex"> <i class="shouye"> </i> <span>
						首页 </span>
				</a>
			</div>
			<div class="tab-bar-icon active">
				<a href="rest/moments/index"> <i class="dongtai"> </i> <span>
						动态 </span>
				</a>
			</div>
			<div class="tab-bar-icon ">
				<a href="rest/user/gotoMainDeal"> <i class="wode"> </i> <span>
						我的 </span>
				</a>
			</div>
		</div>
	</body>
	<script src="js/util.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		
	   
		//加载内部页面的通用方法
	    function initInsetPage(list,pageName){
	    	for(var i=0;i<list.length;i++){
	    		var d = new Date(list[i].issueTime.time);
	    		var icon,username;
	    		if(list[i].userFid==null){
	    			icon="";
	    			username="";
	    		}else{
	    			icon=list[i].userFid.userIco;
	    			username=list[i].userFid.username;
	    		}
	    		$(pageName).append('<div class="moments-bar" onclick="redirectTo(\''+list[i].dynamicUrl+'?id='+list[i].dynamicId+'\')"> '+
			'	<div class="moments-head"> '+
			'	<div class="moments-user"> '+
			'		<img src="<%=basePath%>img/'+icon+'"/> '+
			'		'+username+' '+
			'	</div> '+
			'	<div class="moments-time"> '+
			 d.getFullYear()+'-'+(d.getMonth()+1)+'-'+d.getDate()+
			'	</div> '+
			'</div> '+
			'<div class="moments-body"> '+
			'	<img src="<%=basePath%>img/'+list[i].bynamicIco+'" alt="" /> '+
			'</div> '+
			'<div class="moments-foot"> '+
		  '	 '+list[i].title+' '+
		'	</div> '+
		'</div>');
	    	}
	    }
		//解决动态内部切换页面
		(function(){
			var tabs = $('.nav-bar .tab-bar-icon');
			addClass(tabs[0],'active');
			addClass($(".pages").children()[0],'show');
			//第一次打开时加载公告
			(function(){
				var url="rest/moments/queryNewsByType";
		    	var id = $(".nav-bar .active").prop("id");
		    	var name = tabs[0].children[0].className;
		    	var data = {type:id};
		    	$.post(url,data,function(res){
		    		initInsetPage(res[0].list,'.'+name+'-page');
		    		$('.show')[0].dataset.pagetotal=res[0].pageTotal;
		    		$('.gonggao-page .load').remove();
		    	},'json');
			})()
			
			for(var i=0;i<tabs.length;i++){
				
				$('.nav-bar .tab-bar-icon i').eq(i).css("background-image","url(img/"+$('.nav-bar .tab-bar-icon i').eq(i).prop("className")+".png)");
				tabs[i].addEventListener('click',changeTab);
			}
			function changeTab(){
				for(var i=0;i<tabs.length;i++){
					//console.log(tabs[i])
					removeClass(tabs[i],'active');
					var name = tabs[i].children[0].className;
					var tabPage = document.getElementsByClassName(name+'-page')[0];
					tabPage.style.marginTop="120px";
					tabPage.style.paddingLeft="8px";
					tabPage.style.paddingRight="8px";
					removeClass(tabPage,'show');
				}
				var name = this.children[0].className;
				var tabPage = document.getElementsByClassName(name+'-page')[0];
				console.log(tabPage);
				//第一次打开每个模块的时候检测模块内部是否有页面如果没有就加载
				if(tabPage.innerHTML.trim()==""){
					$(tabPage).append('<div class="load">'+
							'<img src="img/loading.gif"/>'+
							'	加载中...'+
							'</div>');
					var url="rest/moments/queryNewsByType";
			    	var id = $(this).prop('id');
			    	var data = {type:id,pageNo:1};
			    	$.post(url,data,function(res){
			    		console.log(res);
			    		console.log(name);
			    		initInsetPage(res[0].list,'.'+name+'-page');
			    		$('.show')[0].dataset.pagetotal=res[0].pageTotal;
			    		$('.'+name+'-page .load').remove();
			    	},'json'); 
			    	
				}
				addClass(this,'active')
				addClass(tabPage,'show')
			}
			function addClass(tag,name){
				tag.className+=" "+name;
			}
			function removeClass(tag,name){
				tag.className = tag.className.replace(name,'');
			}
			//当滑动到最底部时检测如果没有加载到最后一页就继续加载
			document.addEventListener('scroll',function(){
				if($("body").scrollTop()+window.innerHeight>=$("body").height()){
					if($('.show').children('.load').length==0&&$('.show')[0].dataset.pageno<$('.show')[0].dataset.pagetotal){
						$(".show").append('<div class="load">'+
								'<img src="img/loading.gif"/>'+
								'	加载中...'+
								'</div>');
						var url="rest/moments/queryNewsByType";
						var className=$('.show').prop('className');
						console.log(className);
						var name = className.split(' ')[0].substring(0,className.split(' ')[0].lastIndexOf('-'))
						var id = $('.'+name).parent().prop("id");
						var pageNo = parseInt($('.show')[0].dataset.pageno)+1;
				    	var data = {type:id,pageNo:pageNo};
				    	$.post(url,data,function(res){
				    		//更新总页数信息
				    		$('.show')[0].dataset.pagetotal = res[0].pageTotal;
				    		//如果有页数就更新
				    		if(res.length>0){
				    			initInsetPage(res[0].list,'.'+name+'-page');
					    		$('.show')[0].dataset.pageno = pageNo;
				    		}
				    		$('.'+name+'-page .load').remove();
				    	},'json');  
					}
				}
			})
		})();
	</script>
    </body>
</html>