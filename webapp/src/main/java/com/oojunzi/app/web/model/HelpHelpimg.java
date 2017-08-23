package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class HelpHelpimg {
    /**
     * 求助照片id(主键)
     */
    private BigDecimal helpimgId;

    /**
     * null
     */
    private BigDecimal num;

    /**
     * null
     */
    private String path;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 求助id(外键)
     */
    private String helpFid;

    /**
     * 求助照片id(主键)
     * @return HELPIMG_ID 求助照片id(主键)
     */
    public BigDecimal getHelpimgId() {
        return helpimgId;
    }

    /**
     * 求助照片id(主键)
     * @param helpimgId 求助照片id(主键)
     */
    public void setHelpimgId(BigDecimal helpimgId) {
        this.helpimgId = helpimgId;
    }

    /**
     * null
     * @return NUM null
     */
    public BigDecimal getNum() {
        return num;
    }

    /**
     * null
     * @param num null
     */
    public void setNum(BigDecimal num) {
        this.num = num;
    }

    /**
     * null
     * @return PATH null
     */
    public String getPath() {
        return path;
    }

    /**
     * null
     * @param path null
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * null
     * @return STATUS null
     */
    public String getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * null
     * @return REMARK null
     */
    public String getRemark() {
        return remark;
    }

    /**
     * null
     * @param remark null
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 求助id(外键)
     * @return HELP_FID 求助id(外键)
     */
    public String getHelpFid() {
        return helpFid;
    }

    /**
     * 求助id(外键)
     * @param helpFid 求助id(外键)
     */
    public void setHelpFid(String helpFid) {
        this.helpFid = helpFid == null ? null : helpFid.trim();
    }
}