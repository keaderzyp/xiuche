package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class GarageMend {
    /**
     * 修车记录id（主键）
     */
    private BigDecimal mendId;

    /**
     * 求助id（外键）
     */
    private BigDecimal helpFid;

    /**
     * null
     */
    private String status;

    /**
     * 记录内容
     */
    private String mendRecord;

    /**
     * 前期费用
     */
    private BigDecimal preCosst;

    /**
     * 实付费用
     */
    private BigDecimal payInfact;

    /**
     * 评价
     */
    private String result;

    /**
     * 负责员工id（外键）
     */
    private BigDecimal staffFid;

    /**
     * null
     */
    private Date beginTime;

    /**
     * null
     */
    private Date endTime;

    /**
     * null
     */
    private String remark;

    /**
     * 预计费用
     */
    private BigDecimal guessCost;

    /**
     * 修车厂id（外键）
     */
    private BigDecimal garageFid;

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
     * 修车记录id（主键）
     * @return MEND_ID 修车记录id（主键）
     */
    public BigDecimal getMendId() {
        return mendId;
    }

    /**
     * 修车记录id（主键）
     * @param mendId 修车记录id（主键）
     */
    public void setMendId(BigDecimal mendId) {
        this.mendId = mendId;
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
     * 记录内容
     * @return MEND_RECORD 记录内容
     */
    public String getMendRecord() {
        return mendRecord;
    }

    /**
     * 记录内容
     * @param mendRecord 记录内容
     */
    public void setMendRecord(String mendRecord) {
        this.mendRecord = mendRecord == null ? null : mendRecord.trim();
    }

    /**
     * 前期费用
     * @return PRE_COSST 前期费用
     */
    public BigDecimal getPreCosst() {
        return preCosst;
    }

    /**
     * 前期费用
     * @param preCosst 前期费用
     */
    public void setPreCosst(BigDecimal preCosst) {
        this.preCosst = preCosst;
    }

    /**
     * 实付费用
     * @return PAY_INFACT 实付费用
     */
    public BigDecimal getPayInfact() {
        return payInfact;
    }

    /**
     * 实付费用
     * @param payInfact 实付费用
     */
    public void setPayInfact(BigDecimal payInfact) {
        this.payInfact = payInfact;
    }

    /**
     * 评价
     * @return RESULT 评价
     */
    public String getResult() {
        return result;
    }

    /**
     * 评价
     * @param result 评价
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * 负责员工id（外键）
     * @return STAFF_FID 负责员工id（外键）
     */
    public BigDecimal getStaffFid() {
        return staffFid;
    }

    /**
     * 负责员工id（外键）
     * @param staffFid 负责员工id（外键）
     */
    public void setStaffFid(BigDecimal staffFid) {
        this.staffFid = staffFid;
    }

    /**
     * null
     * @return BEGIN_TIME null
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * null
     * @param beginTime null
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * null
     * @return END_TIME null
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * null
     * @param endTime null
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * 预计费用
     * @return GUESS_COST 预计费用
     */
    public BigDecimal getGuessCost() {
        return guessCost;
    }

    /**
     * 预计费用
     * @param guessCost 预计费用
     */
    public void setGuessCost(BigDecimal guessCost) {
        this.guessCost = guessCost;
    }

    /**
     * 修车厂id（外键）
     * @return GARAGE_FID 修车厂id（外键）
     */
    public BigDecimal getGarageFid() {
        return garageFid;
    }

    /**
     * 修车厂id（外键）
     * @param garageFid 修车厂id（外键）
     */
    public void setGarageFid(BigDecimal garageFid) {
        this.garageFid = garageFid;
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