package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShareInfo {
    /**
     * 分享id（主键）
     */
    private BigDecimal shareId;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String simpleDesc;

    /**
     * 分享类型 1：邀请好友 2：一分钟介绍
     */
    private String shareType;

    /**
     * null
     */
    private String status;

    /**
     * 图标
     */
    private String shareIco;

    /**
     * null
     */
    private Date createTime;

    /**
     * 关键字
     */
    private String keyWord;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 链接
     */
    private String shareUrl;

    /**
     * null
     */
    private String remark;

    /**
     * 分享人名称
     */
    private String sharerName;

    /**
     * 创建用户id（外键）
     */
    private BigDecimal userFid;

    /**
     * null
     */
    private String param1;

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
     * 内容
     */
    private byte[] content;

    /**
     * 分享id（主键）
     * @return SHARE_ID 分享id（主键）
     */
    public BigDecimal getShareId() {
        return shareId;
    }

    /**
     * 分享id（主键）
     * @param shareId 分享id（主键）
     */
    public void setShareId(BigDecimal shareId) {
        this.shareId = shareId;
    }

    /**
     * 标题
     * @return TITLE 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 简介
     * @return SIMPLE_DESC 简介
     */
    public String getSimpleDesc() {
        return simpleDesc;
    }

    /**
     * 简介
     * @param simpleDesc 简介
     */
    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc == null ? null : simpleDesc.trim();
    }

    /**
     * 分享类型 1：邀请好友 2：一分钟介绍
     * @return SHARE_TYPE 分享类型 1：邀请好友 2：一分钟介绍
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * 分享类型 1：邀请好友 2：一分钟介绍
     * @param shareType 分享类型 1：邀请好友 2：一分钟介绍
     */
    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
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
     * 图标
     * @return SHARE_ICO 图标
     */
    public String getShareIco() {
        return shareIco;
    }

    /**
     * 图标
     * @param shareIco 图标
     */
    public void setShareIco(String shareIco) {
        this.shareIco = shareIco == null ? null : shareIco.trim();
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 关键字
     * @return KEY_WORD 关键字
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * 关键字
     * @param keyWord 关键字
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    /**
     * 微信号
     * @return WECHAT_NUMBER 微信号
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 微信号
     * @param wechatNumber 微信号
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber == null ? null : wechatNumber.trim();
    }

    /**
     * 链接
     * @return SHARE_URL 链接
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * 链接
     * @param shareUrl 链接
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
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
     * 分享人名称
     * @return SHARER_NAME 分享人名称
     */
    public String getSharerName() {
        return sharerName;
    }

    /**
     * 分享人名称
     * @param sharerName 分享人名称
     */
    public void setSharerName(String sharerName) {
        this.sharerName = sharerName == null ? null : sharerName.trim();
    }

    /**
     * 创建用户id（外键）
     * @return USER_FID 创建用户id（外键）
     */
    public BigDecimal getUserFid() {
        return userFid;
    }

    /**
     * 创建用户id（外键）
     * @param userFid 创建用户id（外键）
     */
    public void setUserFid(BigDecimal userFid) {
        this.userFid = userFid;
    }

    /**
     * null
     * @return PARAM1 null
     */
    public String getParam1() {
        return param1;
    }

    /**
     * null
     * @param param1 null
     */
    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
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
     * 内容
     * @return CONTENT 内容
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}