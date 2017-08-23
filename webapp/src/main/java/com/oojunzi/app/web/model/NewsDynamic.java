package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class NewsDynamic {
    /**
     * 动态id(主键)
     */
    private String dynamicId;
    /**
     * 类型 1：公告 2：活动 3：咨询 4：酷玩
     */
//    private String type;
    private NewsDynamicType type;
    public NewsDynamicType getType() {
		return type;
	}

	public void setType(NewsDynamicType type) {
		this.type = type;
	}

	/**
     * 标题
     */
    private String title;
    /**
     * 发布时间
     */
    private Date issueTime;

    /**
     * 描述
     */
    private String desciption;

    /**
     * 链接
     */
    private String dynamicUrl;

    /**
     * 图标
     */
    private String bynamicIco;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 发布人名称
     */
    private String issuer;

//    /**
//     * 创建人id(外键)
//     */
//    private String userFid;
    private User userFid;
    /**
     * 存储文章图片的字段
     */
    private String imgs;

    /**
     * null
     */
    private String param2;

    /**
     * null
     */
    private String param3;

    /**
     * null
     */
    private String param4;

    /**
     * null
     */
    private String param5;

    /**
     * null
     */
    private String param6;

    /**
     * null
     */
    private String param7;

    /**
     * null
     */
    private String param8;

    /**
     * null
     */
    private String param9;

    /**
     * null
     */
    private String param10;

    /**
     * 动态内容
     */
    private byte[] content;

    /**
     * 动态id(主键)
     * @return DYNAMIC_ID 动态id(主键)
     */
//    public BigDecimal getDynamicId() {
//        return dynamicId;
//    }
//
//    /**
//     * 动态id(主键)
//     * @param dynamicId 动态id(主键)
//     */
//    public void setDynamicId(BigDecimal dynamicId) {
//        this.dynamicId = dynamicId;
//    }

    /**
     * 类型 1：公告 2：活动 3：咨询 4：酷玩
     * @return TYPE 类型 1：公告 2：活动 3：咨询 4：酷玩
     */
//    public String getType() {
//        return type;
//    }
//
//    /**
//     * 类型 1：公告 2：活动 3：咨询 4：酷玩
//     * @param type 类型 1：公告 2：活动 3：咨询 4：酷玩
//     */
//    public void setType(String type) {
//        this.type = type == null ? null : type.trim();
//    }

    /**
     * 标题
     * @return TITLE 标题
     */
    public String getTitle() {
        return title;
    }

    public String getDynamicId() {
		return dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	/**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 发布时间
     * @return ISSUE_TIME 发布时间
     */
    public Date getIssueTime() {
        return issueTime;
    }

    /**
     * 发布时间
     * @param issueTime 发布时间
     */
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    /**
     * 描述
     * @return DESCIPTION 描述
     */
    public String getDesciption() {
        return desciption;
    }

    /**
     * 描述
     * @param desciption 描述
     */
    public void setDesciption(String desciption) {
        this.desciption = desciption == null ? null : desciption.trim();
    }

    /**
     * 链接
     * @return DYNAMIC_URL 链接
     */
    public String getDynamicUrl() {
        return dynamicUrl;
    }

    /**
     * 链接
     * @param dynamicUrl 链接
     */
    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl == null ? null : dynamicUrl.trim();
    }

    /**
     * 图标
     * @return BYNAMIC_ICO 图标
     */
    public String getBynamicIco() {
        return bynamicIco;
    }

    /**
     * 图标
     * @param bynamicIco 图标
     */
    public void setBynamicIco(String bynamicIco) {
        this.bynamicIco = bynamicIco == null ? null : bynamicIco.trim();
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
     * 发布人名称
     * @return ISSUER 发布人名称
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * 发布人名称
     * @param issuer 发布人名称
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }


    public User getUserFid() {
		return userFid;
	}

	public void setUserFid(User userFid) {
		this.userFid = userFid;
	}


    public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	/**
     * null
     * @return PARAM2 null
     */
    public String getParam2() {
        return param2;
    }

    /**
     * null
     * @param param2 null
     */
    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    /**
     * null
     * @return PARAM3 null
     */
    public String getParam3() {
        return param3;
    }

    /**
     * null
     * @param param3 null
     */
    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
    }

    /**
     * null
     * @return PARAM4 null
     */
    public String getParam4() {
        return param4;
    }

    /**
     * null
     * @param param4 null
     */
    public void setParam4(String param4) {
        this.param4 = param4 == null ? null : param4.trim();
    }

    /**
     * null
     * @return PARAM5 null
     */
    public String getParam5() {
        return param5;
    }

    /**
     * null
     * @param param5 null
     */
    public void setParam5(String param5) {
        this.param5 = param5 == null ? null : param5.trim();
    }

    /**
     * null
     * @return PARAM6 null
     */
    public String getParam6() {
        return param6;
    }

    /**
     * null
     * @param param6 null
     */
    public void setParam6(String param6) {
        this.param6 = param6 == null ? null : param6.trim();
    }

    /**
     * null
     * @return PARAM7 null
     */
    public String getParam7() {
        return param7;
    }

    /**
     * null
     * @param param7 null
     */
    public void setParam7(String param7) {
        this.param7 = param7 == null ? null : param7.trim();
    }

    /**
     * null
     * @return PARAM8 null
     */
    public String getParam8() {
        return param8;
    }

    /**
     * null
     * @param param8 null
     */
    public void setParam8(String param8) {
        this.param8 = param8 == null ? null : param8.trim();
    }

    /**
     * null
     * @return PARAM9 null
     */
    public String getParam9() {
        return param9;
    }

    /**
     * null
     * @param param9 null
     */
    public void setParam9(String param9) {
        this.param9 = param9 == null ? null : param9.trim();
    }

    /**
     * null
     * @return PARAM10 null
     */
    public String getParam10() {
        return param10;
    }

    /**
     * null
     * @param param10 null
     */
    public void setParam10(String param10) {
        this.param10 = param10 == null ? null : param10.trim();
    }

    /**
     * 动态内容
     * @return CONTENT 动态内容
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * 动态内容
     * @param content 动态内容
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}