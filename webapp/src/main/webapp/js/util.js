function redirectTo(url){
	window.location.href=url;
}

//互相签订协议模态框提交事件
function sub(){
	//提交事件可以在这里使用ajax发送请求
	showModel();
}

//互相签订协议显示模态框提交事件
function showModel(){
	var model = document.getElementsByClassName("model")[0];
	document.getElementsByClassName('main-body')[0].style.filter="blur(3px)";
	model.style.display="block";
}
//互相签订协议隐藏模态框提交事件
function hideModel(){
	var model = document.getElementsByClassName("model")[0];
	if(document.getElementsByClassName('main-body')!=undefined){
		document.getElementsByClassName('main-body')[0].style.filter="blur(0px)";
	}
	model.style.display="none";
}
if(document.getElementsByClassName('model')[0]){
	document.getElementsByClassName('model')[0].addEventListener('touchstart',removeModel);
	function removeModel(event){
		if(event.target==this){
			hideModel();  
		}
	}
}

