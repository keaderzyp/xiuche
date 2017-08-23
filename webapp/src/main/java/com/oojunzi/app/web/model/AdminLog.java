package com.oojunzi.app.web.model;

public class AdminLog {
	private Integer id;
	 
	private String content;
	 
	private String createtime;
	 
	private String startTime;
	 
	private String endTime;
	 
	private String createtimestr;
	 
	private String adminName;
	 
	private Integer adminId;
	 
	private String ip;
	 
	private String url;
	 
	public Integer getId() {
	return id;
	}
	 
	public void setId(Integer id) {
	this.id = id;
	}
	 
	public String getContent() {
	return content;
	}
	 
	public void setContent(String content) {
	this.content = content == null ? null : content.trim();
	}
	 
	public String getCreatetime() {
	return createtime;
	}
	 
	public void setCreatetime(String createtime) {
	this.createtime = createtime;
	}
	 
	public String getAdminName() {
	return adminName;
	}
	 
	public void setAdminName(String adminName) {
	this.adminName = adminName == null ? null : adminName.trim();
	}
	 
	public Integer getAdminId() {
	return adminId;
	}
	 
	public void setAdminId(Integer adminId) {
	this.adminId = adminId;
	}
	 
	public String getIp() {
	return ip;
	}
	 
	public void setIp(String ip) {
	this.ip = ip == null ? null : ip.trim();
	}
	 
	public String getUrl() {
	return url;
	}
	 
	public void setUrl(String url) {
	this.url = url == null ? null : url.trim();
	}
	 
	public String getStartTime() {
	return startTime;
	}
	 
	public void setStartTime(String startTime) {
	this.startTime = startTime;
	}
	 
	public String getEndTime() {
	return endTime;
	}
	 
	public void setEndTime(String endTime) {
	this.endTime = endTime;
	}
	 
	public String getCreatetimestr() {
	return createtimestr;
	}
	 
	public void setCreatetimestr(String createtimestr) {
	this.createtimestr = createtimestr;
	}
}
