package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class SystemAdminlog {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * 备注
     */
    private String content;

    /**
     * null
     */
    private String createtime;

    /**
     * null
     */
    private String createtimestr;

    /**
     * null
     */
    private String adminName;

    /**
     * null
     */
    private BigDecimal adminId;

    /**
     * null
     */
    private String ip;

    /**
     * null
     */
    private String url;

    /**
     * null
     * @return ID null
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 备注
     * @return CONTENT 备注
     */
    public String getContent() {
        return content;
    }

    /**
     * 备注
     * @param content 备注
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * null
     * @return CREATETIME null
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * null
     * @param createtime null
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * null
     * @return CREATETIMESTR null
     */
    public String getCreatetimestr() {
        return createtimestr;
    }

    /**
     * null
     * @param createtimestr null
     */
    public void setCreatetimestr(String createtimestr) {
        this.createtimestr = createtimestr == null ? null : createtimestr.trim();
    }

    /**
     * null
     * @return ADMIN_NAME null
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * null
     * @param adminName null
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * null
     * @return ADMIN_ID null
     */
    public BigDecimal getAdminId() {
        return adminId;
    }

    /**
     * null
     * @param adminId null
     */
    public void setAdminId(BigDecimal adminId) {
        this.adminId = adminId;
    }

    /**
     * null
     * @return IP null
     */
    public String getIp() {
        return ip;
    }

    /**
     * null
     * @param ip null
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * null
     * @return URL null
     */
    public String getUrl() {
        return url;
    }

    /**
     * null
     * @param url null
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}