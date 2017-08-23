package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class CircleUser {
    /**
     * 小圈用户id（主键）
     */
    private BigDecimal cuserId;

    /**
     * 是否创建人
     */
    private String isCreater;

    /**
     * 小圈ID（外键）
     */
    private BigDecimal circleFid;

    /**
     * 状态
     */
    private String status;

    /**
     * 加入时间
     */
    private Date addTime;

    /**
     * 圈内评分
     */
    private BigDecimal scoreInside;

    /**
     * 备注
     */
    private String remark;

    /**
     * 用户id（外键）
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
     * 小圈用户id（主键）
     * @return CUSER_ID 小圈用户id（主键）
     */
    public BigDecimal getCuserId() {
        return cuserId;
    }

    /**
     * 小圈用户id（主键）
     * @param cuserId 小圈用户id（主键）
     */
    public void setCuserId(BigDecimal cuserId) {
        this.cuserId = cuserId;
    }

    /**
     * 是否创建人
     * @return IS_CREATER 是否创建人
     */
    public String getIsCreater() {
        return isCreater;
    }

    /**
     * 是否创建人
     * @param isCreater 是否创建人
     */
    public void setIsCreater(String isCreater) {
        this.isCreater = isCreater == null ? null : isCreater.trim();
    }

    /**
     * 小圈ID（外键）
     * @return CIRCLE_FID 小圈ID（外键）
     */
    public BigDecimal getCircleFid() {
        return circleFid;
    }

    /**
     * 小圈ID（外键）
     * @param circleFid 小圈ID（外键）
     */
    public void setCircleFid(BigDecimal circleFid) {
        this.circleFid = circleFid;
    }

    /**
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 加入时间
     * @return ADD_TIME 加入时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 加入时间
     * @param addTime 加入时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 圈内评分
     * @return SCORE_INSIDE 圈内评分
     */
    public BigDecimal getScoreInside() {
        return scoreInside;
    }

    /**
     * 圈内评分
     * @param scoreInside 圈内评分
     */
    public void setScoreInside(BigDecimal scoreInside) {
        this.scoreInside = scoreInside;
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
     * 用户id（外键）
     * @return USER_FID 用户id（外键）
     */
    public BigDecimal getUserFid() {
        return userFid;
    }

    /**
     * 用户id（外键）
     * @param userFid 用户id（外键）
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