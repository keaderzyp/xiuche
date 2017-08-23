/**
 * 
 */
(function(){
			//分页查询代码
		    $(".pagination .pageTo").on('click',function(){
		    	var pageNo = this.dataset.pageno;
		    	var url = this.dataset.url;
		    	var container = "#main-content";
		    	if(this.dataset.container!=null&&this.dataset.container!=undefined&&this.dataset.container!=""){
		    		container = this.dataset.container
		    	}
		    	console.log($('#queryForm')[0]);
		    	$.ajax({
		     		url: url+'?pageNo='+pageNo,
		     		type: 'POST',
		     		cache: false,
		     		data: new FormData($('#queryForm')[0]),
		     		processData: false,
		     		contentType: false,
		     		}).done(function(res) {
		     			 $(container).html(res);
		     		}).fail(function(res) {
		     			
		     		});
		    })
		    $(document).on('click',"#reset",function(){
				resetForm("#queryForm");
				resetForm("#addForm");
			})
		    //指定页数跳转的方法
		    $(".pagination .jump").on('click',function(e){
				console.log($(".pagination .jump a input").val())
		    	var pageNo = $(".pagination .jump a input").val();
				var container = "#main-content";
		    	if(this.dataset.container!=null&&this.dataset.container!=undefined&&this.dataset.container!=""){
		    		container = this.dataset.container;
		    	}
		    	if(pageNo>=$(".pagination .pageTo:first")[0].dataset.pageno&&pageNo<=$(".pagination .pageTo:last")[0].dataset.pageno){
		    		var url = this.dataset.url;
		        	$.ajax({
		         		url: url+'?pageNo='+pageNo,
		         		type: 'POST',
		         		cache: false,
		         		data: new FormData($('#queryForm')[0]),
		         		processData: false,
		         		contentType: false,
		         		}).done(function(res) {
		         			 $(container).html(res);
		         		}).fail(function(res) {
		         			
		         		});
		    	}else{
		    	}
		    	
		    })
		    //条件查询清空表单事件，el代表表单id，需要添加可以直接在on事件中追加，el带表表单id，需要给按钮加入id="reset"
		    function resetForm(el){
				$(el+" .form-group input").val("");
				$(el+" .form-group select option").prop('selected',false);
				for(var i=0;i<$(el+" .form-group select ").length;i++){
					$(el+" .form-group select ").eq(i).children().eq(0)[0].selected=true;
				}
				$(el+" .form-group textarea").html(""); 
			}
			$("#reset").on('click',function(){
				resetForm("#queryForm");
				resetForm("#addForm");
			})
		    //表格全选的方法
		    $("#allchecked").on('click',function(){
		    	console.log(this.checked);
		    	$("input").prop('checked',this.checked);
		    });
		    //表单提交跳页的工具方法以及表单验证的工具方法
			return util_p = {
				/**
				* el:添加点击事件的对象选择器（＃id ，.class, tagName）
				* url:转向或者提交的路径
				* formId:提交表单的对象选择器 推荐使用id 与el用法相同
				* callback:执行完毕的回调函数，如果需要给目标页面添加js方法可以使用这个函数，解决某些页面
				* 中用代码直接写js失效的方法
				* type:提交数据的类型 get／post
				* targetContainer:返回数据的容器对象选择器，显示返回的页面的标签 id class 与el用法相同 默认是#main-content
				* checkForm,表单验证方法必须放返回值 返回是boolean
				*/
				navigateTo:function(el,formId,callback,type,targetContainer,checkForm){
					//console.log(this.dataset.url);
					$(el).on("click",function(){
						if(checkForm!=undefined&&checkForm()==false){
							return;
						}
						$.ajax({
							url: this.dataset.url,
		            		type: type,
		            		cache: false,
		            		data: new FormData($(formId)[0]),
		            		processData: false,
		            		contentType: false,
		            		}).done(function(res) {
		            			$(targetContainer).html(res);
		            			callback();
		            		}).fail(function(res) {
		            			
		            		});
					})
				},
				/**
				 * 通用的非空验证
				 * el是元素的选择器适配jquery所有选择器
				 * info是提示信息
				 * formId是表单的id，可以不填
				 * 
				 */
				checkNull:function(el,info,formId){
					$(".help-block").remove();
					$(".form-group .arrow").remove();
					$(".form-group").removeClass("has-error");
					if($(el).val()==""||$(el).val()=="%"){
						$(el).parent().parent().addClass("has-error");
						$(el).parent().after("<div class='arrow' ></div>")
						$(el).parent().after("<div class='help-block' >"+info+"</div>")
						return true;
					}else{
						$('.input-group').popover('destroy')
						return false;
					}
					
				}
			};
		})();