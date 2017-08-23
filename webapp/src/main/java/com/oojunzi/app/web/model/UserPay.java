package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserPay {
    /**
     * 付款记录id(主键)
     */
    private BigDecimal payId;

    /**
     * 付款金额
     */
    private BigDecimal pay;

    /**
     * 付款原因，如类型为小圈分摊，填写小圈id
     */
    private String payReason;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 付款类型 1：入会支付 2：小圈分摊 3：大圈分摊 
     */
    private String payType;

    /**
     * 求助id
     */
    private BigDecimal helpFid;

    /**
     * 用户id
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
     * 付款记录id(主键)
     * @return PAY_ID 付款记录id(主键)
     */
    public BigDecimal getPayId() {
        return payId;
    }

    /**
     * 付款记录id(主键)
     * @param payId 付款记录id(主键)
     */
    public void setPayId(BigDecimal payId) {
        this.payId = payId;
    }

    /**
     * 付款金额
     * @return PAY 付款金额
     */
    public BigDecimal getPay() {
        return pay;
    }

    /**
     * 付款金额
     * @param pay 付款金额
     */
    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    /**
     * 付款原因，如类型为小圈分摊，填写小圈id
     * @return PAY_REASON 付款原因，如类型为小圈分摊，填写小圈id
     */
    public String getPayReason() {
        return payReason;
    }

    /**
     * 付款原因，如类型为小圈分摊，填写小圈id
     * @param payReason 付款原因，如类型为小圈分摊，填写小圈id
     */
    public void setPayReason(String payReason) {
        this.payReason = payReason == null ? null : payReason.trim();
    }

    /**
     * 付款时间
     * @return PAY_TIME 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 付款时间
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
     * 付款类型 1：入会支付 2：小圈分摊 3：大圈分摊 
     * @return PAY_TYPE 付款类型 1：入会支付 2：小圈分摊 3：大圈分摊 
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 付款类型 1：入会支付 2：小圈分摊 3：大圈分摊 
     * @param payType 付款类型 1：入会支付 2：小圈分摊 3：大圈分摊 
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * 求助id
     * @return HELP_FID 求助id
     */
    public BigDecimal getHelpFid() {
        return helpFid;
    }

    /**
     * 求助id
     * @param helpFid 求助id
     */
    public void setHelpFid(BigDecimal helpFid) {
        this.helpFid = helpFid;
    }

    /**
     * 用户id
     * @return USER_FID 用户id
     */
    public BigDecimal getUserFid() {
        return userFid;
    }

    /**
     * 用户id
     * @param userFid 用户id
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
}