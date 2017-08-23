package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class HelpBill {
    /**
     * 账单id
     */
    private Long billid;

    /**
     * 账目名称/主题
     */
    private String billname;

    /**
     * 状态 0:草稿1:计算完成2:分摊中3:分摊完成
     */
    private String status;

    /**
     * 事故id(求助记录表主键id)
     */
    private Long helpid;

    /**
     * 主题id
     */
    private Long titleid;

    /**
     * 应分摊金额
     */
    private BigDecimal costdone;

    /**
     * 未分摊金额
     */
    private BigDecimal costundone;

    /**
     * 0:无事故1:有事故
     */
    private String accidenttype;

    /**
     * 账单创建时间
     */
    private Date createtime;

    /**
     * 备注
     */
    private String remark;

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
     * 区间
     */
    private String timezone;

    /**
     * 账单id
     * @return BILLID 账单id
     */
    public Long getBillid() {
        return billid;
    }

    /**
     * 账单id
     * @param billid 账单id
     */
    public void setBillid(Long billid) {
        this.billid = billid;
    }

    /**
     * 账目名称/主题
     * @return BILLNAME 账目名称/主题
     */
    public String getBillname() {
        return billname;
    }

    /**
     * 账目名称/主题
     * @param billname 账目名称/主题
     */
    public void setBillname(String billname) {
        this.billname = billname == null ? null : billname.trim();
    }

    /**
     * 状态 0:草稿1:计算完成2:分摊中3:分摊完成
     * @return STATUS 状态 0:草稿1:计算完成2:分摊中3:分摊完成
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 0:草稿1:计算完成2:分摊中3:分摊完成
     * @param status 状态 0:草稿1:计算完成2:分摊中3:分摊完成
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 事故id(求助记录表主键id)
     * @return HELPID 事故id(求助记录表主键id)
     */
    public Long getHelpid() {
        return helpid;
    }

    /**
     * 事故id(求助记录表主键id)
     * @param helpid 事故id(求助记录表主键id)
     */
    public void setHelpid(Long helpid) {
        this.helpid = helpid;
    }

    /**
     * 主题id
     * @return TITLEID 主题id
     */
    public Long getTitleid() {
        return titleid;
    }

    /**
     * 主题id
     * @param titleid 主题id
     */
    public void setTitleid(Long titleid) {
        this.titleid = titleid;
    }

    /**
     * 应分摊金额
     * @return COSTDONE 应分摊金额
     */
    public BigDecimal getCostdone() {
        return costdone;
    }

    /**
     * 应分摊金额
     * @param costdone 应分摊金额
     */
    public void setCostdone(BigDecimal costdone) {
        this.costdone = costdone;
    }

    /**
     * 未分摊金额
     * @return COSTUNDONE 未分摊金额
     */
    public BigDecimal getCostundone() {
        return costundone;
    }

    /**
     * 未分摊金额
     * @param costundone 未分摊金额
     */
    public void setCostundone(BigDecimal costundone) {
        this.costundone = costundone;
    }

    /**
     * 0:无事故1:有事故
     * @return ACCIDENTTYPE 0:无事故1:有事故
     */
    public String getAccidenttype() {
        return accidenttype;
    }

    /**
     * 0:无事故1:有事故
     * @param accidenttype 0:无事故1:有事故
     */
    public void setAccidenttype(String accidenttype) {
        this.accidenttype = accidenttype == null ? null : accidenttype.trim();
    }

    /**
     * 账单创建时间
     * @return CREATETIME 账单创建时间
     */
    public Date getCreatetime() {
		return createtime;
	}
    /**
     * 账单创建时间
     * @param createtime 账单创建时间
     */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }





	/**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
     * 区间
     * @return TIMEZONE 区间
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 区间
     * @param timezone 区间
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone == null ? null : timezone.trim();
    }
}