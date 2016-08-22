$(document).scrollTop(0);
window.onload=function(){
	
        	var obj = document.getElementById("obj");
        	//alert($(obj.contentDocument.body).height());
        	$("#body-content").height($(obj.contentDocument.body).height());
        	obj.height=$(obj.contentDocument.body).height();
        	$(obj).height($(obj.contentDocument.body).height());
        }
        window.onresize=function(){
        	var obj = document.getElementById("obj");
        	//alert($(obj.contentDocument.body).height());
        	$("#body-content").height($(obj.contentDocument.body).height());
        	obj.height=$(obj.contentDocument.body).height();
        	$(obj).height($(obj.contentDocument.body).height());
        }