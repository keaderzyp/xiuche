package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class HelpPartakemax {
    /**
     * 分摊上限变更表id(主键)
     */
    private BigDecimal pmaxId;

    /**
     * 分摊上限金额
     */
    private BigDecimal partakeMax;

    /**
     * 变更时间
     */
    private Date changeTime;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 分摊类型 1：普通分摊  2：小圈分摊
     */
    private String partakeType;

    /**
     * 变更原因
     */
    private String changeReason;

    /**
     * 车辆或小圈id(外键)
     */
    private BigDecimal carCircleFid;

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
     * 分摊上限变更表id(主键)
     * @return PMAX_ID 分摊上限变更表id(主键)
     */
    public BigDecimal getPmaxId() {
        return pmaxId;
    }

    /**
     * 分摊上限变更表id(主键)
     * @param pmaxId 分摊上限变更表id(主键)
     */
    public void setPmaxId(BigDecimal pmaxId) {
        this.pmaxId = pmaxId;
    }

    /**
     * 分摊上限金额
     * @return PARTAKE_MAX 分摊上限金额
     */
    public BigDecimal getPartakeMax() {
        return partakeMax;
    }

    /**
     * 分摊上限金额
     * @param partakeMax 分摊上限金额
     */
    public void setPartakeMax(BigDecimal partakeMax) {
        this.partakeMax = partakeMax;
    }

    /**
     * 变更时间
     * @return CHANGE_TIME 变更时间
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * 变更时间
     * @param changeTime 变更时间
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
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
     * 分摊类型 1：普通分摊  2：小圈分摊
     * @return PARTAKE_TYPE 分摊类型 1：普通分摊  2：小圈分摊
     */
    public String getPartakeType() {
        return partakeType;
    }

    /**
     * 分摊类型 1：普通分摊  2：小圈分摊
     * @param partakeType 分摊类型 1：普通分摊  2：小圈分摊
     */
    public void setPartakeType(String partakeType) {
        this.partakeType = partakeType == null ? null : partakeType.trim();
    }

    /**
     * 变更原因
     * @return CHANGE_REASON 变更原因
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * 变更原因
     * @param changeReason 变更原因
     */
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }

    /**
     * 车辆或小圈id(外键)
     * @return CAR_CIRCLE_FID 车辆或小圈id(外键)
     */
    public BigDecimal getCarCircleFid() {
        return carCircleFid;
    }

    /**
     * 车辆或小圈id(外键)
     * @param carCircleFid 车辆或小圈id(外键)
     */
    public void setCarCircleFid(BigDecimal carCircleFid) {
        this.carCircleFid = carCircleFid;
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