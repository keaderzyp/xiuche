package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class HelpPartake {
    /**
     * 分摊详情id（主键）
     */
    private BigDecimal payId;

    /**
     * 求助id（外键）
     */
    private BigDecimal helpFid;

    /**
     * 小圈id（外键）
     */
    private BigDecimal fcircleFid;

    /**
     * 车主需分摊费用
     */
    private BigDecimal needPay;

    /**
     * 分摊费用
     */
    private BigDecimal factPay;

    /**
     * 是否求助发起人
     */
    private String isHelper;

    /**
     * 1:已支付   2：未支付   3：无需分摊
     */
    private String status;

    /**
     * 支付方式  1：微信支付
     */
    private String payType;

    /**
     * 下达时间
     */
    private Date informTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 车辆id（外键）
     */
    private BigDecimal carFid;

    /**
     * 分摊类型 1：小圈分摊（需填小圈id） 2：圈圈分摊
     */
    private BigDecimal type;

    /**
     * null
     */
    private String remark;

    /**
     * 主题id from helpbill titleid
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
     * 时间区间（7月5日-7月11日）
     */
    private String param7;

    /**
     * 主题，(第几周账单)
     */
    private String param8;

    /**
     * 主题id（help_bill表titleid）
     */
    private String param9;

    /**
     * null
     */
    private String param10;

    /**
     * 用户id（已废弃不用）
     */
    private String userFid;

    /**
     * 分摊详情id（主键）
     * @return PAY_ID 分摊详情id（主键）
     */
    public BigDecimal getPayId() {
        return payId;
    }

    /**
     * 分摊详情id（主键）
     * @param payId 分摊详情id（主键）
     */
    public void setPayId(BigDecimal payId) {
        this.payId = payId;
    }

    /**
     * 求助id（外键）
     * @return HELP_FID 求助id（外键）
     */
    public BigDecimal getHelpFid() {
        return helpFid;
    }

    /**
     * 求助id（外键）
     * @param helpFid 求助id（外键）
     */
    public void setHelpFid(BigDecimal helpFid) {
        this.helpFid = helpFid;
    }

    /**
     * 小圈id（外键）
     * @return FCIRCLE_FID 小圈id（外键）
     */
    public BigDecimal getFcircleFid() {
        return fcircleFid;
    }

    /**
     * 小圈id（外键）
     * @param fcircleFid 小圈id（外键）
     */
    public void setFcircleFid(BigDecimal fcircleFid) {
        this.fcircleFid = fcircleFid;
    }

    /**
     * 车主需分摊费用
     * @return NEED_PAY 车主需分摊费用
     */
    public BigDecimal getNeedPay() {
        return needPay;
    }

    /**
     * 车主需分摊费用
     * @param needPay 车主需分摊费用
     */
    public void setNeedPay(BigDecimal needPay) {
        this.needPay = needPay;
    }

    /**
     * 分摊费用
     * @return FACT_PAY 分摊费用
     */
    public BigDecimal getFactPay() {
        return factPay;
    }

    /**
     * 分摊费用
     * @param factPay 分摊费用
     */
    public void setFactPay(BigDecimal factPay) {
        this.factPay = factPay;
    }

    /**
     * 是否求助发起人
     * @return IS_HELPER 是否求助发起人
     */
    public String getIsHelper() {
        return isHelper;
    }

    /**
     * 是否求助发起人
     * @param isHelper 是否求助发起人
     */
    public void setIsHelper(String isHelper) {
        this.isHelper = isHelper == null ? null : isHelper.trim();
    }

    /**
     * 1:已支付   2：未支付   3：无需分摊
     * @return STATUS 1:已支付   2：未支付   3：无需分摊
     */
    public String getStatus() {
        return status;
    }

    /**
     * 1:已支付   2：未支付   3：无需分摊
     * @param status 1:已支付   2：未支付   3：无需分摊
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 支付方式  1：微信支付
     * @return PAY_TYPE 支付方式  1：微信支付
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 支付方式  1：微信支付
     * @param payType 支付方式  1：微信支付
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * 下达时间
     * @return INFORM_TIME 下达时间
     */
    public Date getInformTime() {
        return informTime;
    }

    /**
     * 下达时间
     * @param informTime 下达时间
     */
    public void setInformTime(Date informTime) {
        this.informTime = informTime;
    }

    /**
     * 支付时间
     * @return PAY_TIME 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 支付时间
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 车辆id（外键）
     * @return CAR_FID 车辆id（外键）
     */
    public BigDecimal getCarFid() {
        return carFid;
    }

    /**
     * 车辆id（外键）
     * @param carFid 车辆id（外键）
     */
    public void setCarFid(BigDecimal carFid) {
        this.carFid = carFid;
    }

    /**
     * 分摊类型 1：小圈分摊（需填小圈id） 2：圈圈分摊
     * @return TYPE 分摊类型 1：小圈分摊（需填小圈id） 2：圈圈分摊
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * 分摊类型 1：小圈分摊（需填小圈id） 2：圈圈分摊
     * @param type 分摊类型 1：小圈分摊（需填小圈id） 2：圈圈分摊
     */
    public void setType(BigDecimal type) {
        this.type = type;
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
     * 主题id from helpbill titleid
     * @return PARAM1 主题id from helpbill titleid
     */
    public String getParam1() {
        return param1;
    }

    /**
     * 主题id from helpbill titleid
     * @param param1 主题id from helpbill titleid
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
     * 时间区间（7月5日-7月11日）
     * @return PARAM7 时间区间（7月5日-7月11日）
     */
    public String getParam7() {
        return param7;
    }

    /**
     * 时间区间（7月5日-7月11日）
     * @param param7 时间区间（7月5日-7月11日）
     */
    public void setParam7(String param7) {
        this.param7 = param7 == null ? null : param7.trim();
    }

    /**
     * 主题，(第几周账单)
     * @return PARAM8 主题，(第几周账单)
     */
    public String getParam8() {
        return param8;
    }

    /**
     * 主题，(第几周账单)
     * @param param8 主题，(第几周账单)
     */
    public void setParam8(String param8) {
        this.param8 = param8 == null ? null : param8.trim();
    }

    /**
     * 主题id（help_bill表titleid）
     * @return PARAM9 主题id（help_bill表titleid）
     */
    public String getParam9() {
        return param9;
    }

    /**
     * 主题id（help_bill表titleid）
     * @param param9 主题id（help_bill表titleid）
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
     * 用户id（已废弃不用）
     * @return USER_FID 用户id（已废弃不用）
     */
    public String getUserFid() {
        return userFid;
    }

    /**
     * 用户id（已废弃不用）
     * @param userFid 用户id（已废弃不用）
     */
    public void setUserFid(String userFid) {
        this.userFid = userFid == null ? null : userFid.trim();
    }
}