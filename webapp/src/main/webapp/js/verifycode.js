		
		var InterValObj; //timer变量，控制时间
		var count = 60; //间隔函数，1秒执行
		var curCount;//当前剩余秒数
		function sendCode() {
			var phone = document.getElementById("username1").value;
			curCount = count;
			// 向后台发送处理数据
			if (phone == "") {
				document.getElementById("error").value = "请填写手机号码";
				return false;
			}
			if (!(/^1(3|4|5|7|8)\d{9}$/.test(phone))) {
				document.getElementById("error").value = "手机号码有误，请重填";
				return false;
			} else {
				InterValObj = window.setInterval(
						SetRemainTime, 1000); // 启动计时器timer处理函数，1秒执行一次
				$.ajax({
							type : 'GET',
							url : 'rest/user/verifyCode?phone=' + phone,
							dataType : "json",
							success : function(data) {
								if (data.isSucc == "NO") {
									document.getElementById("error").value = data.error;
								} else {
									// 设置button效果，开始计时
									document.getElementById("btnSendCode")
											.setAttribute("disabled", "true");//设置按钮为禁用状态
									document.getElementById("btnSendCode").value = curCount
											+ "s";//更改按钮文字
									
									//alert(data.code);
									document.getElementById("code2").value = data.code;
								}
							},
							error : function() {
								alert("JSON数据获取失败，请联系管理员！");
							}
						});
			}
		}
		//timer处理函数

		function SetRemainTime() {
			if (curCount == 0) {
				window.clearInterval(InterValObj);// 停止计时器
				document.getElementById("btnSendCode").removeAttribute(
						"disabled");//移除禁用状态改为可用
				document.getElementById("btnSendCode").style.background="#4098FF";
				document.getElementById("btnSendCode").innerHTML = "重新发送";
			} else {
				curCount--;//#4098FF;
				document.getElementById("btnSendCode").style.background="#CCCCCC";
				document.getElementById("btnSendCode").innerHTML = curCount + "s";
			}
		}