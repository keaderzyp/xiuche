package com.oojunzi.app.web.model;
/** 
* @author liguoqiang
* @date 2017年8月11日 下午4:29:20 
* @describe 
*/
public class SmsModel {
	private String phone;
	private String TemplateCode;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTemplateCode() {
		return TemplateCode;
	}
	public void setTemplateCode(String templateCode) {
		TemplateCode = templateCode;
	}
	private String param1;
	private String param2;
	private String param3;
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public String getParam3() {
		return param3;
	}
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	
}
