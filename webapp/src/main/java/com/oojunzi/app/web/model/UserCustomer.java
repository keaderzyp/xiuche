package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserCustomer {
    /**
     * 分组服务id（主键）
     */
    private BigDecimal gcustomerId;

    /**
     * null
     */
    private String status;

    /**
     * 用户加入分组时间
     */
    private Date addTime;

    /**
     * 用户分组积分
     */
    private BigDecimal scoreInside;

    /**
     * null
     */
    private String remark;

    /**
     * 用户id（外键）
     */
    private BigDecimal userFid;

    /**
     * 客服id（外键）
     */
    private BigDecimal staffFid;

    /**
     * 分组id (外键)
     */
    private BigDecimal groupFid;

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
     * 分组服务id（主键）
     * @return GCUSTOMER_ID 分组服务id（主键）
     */
    public BigDecimal getGcustomerId() {
        return gcustomerId;
    }

    /**
     * 分组服务id（主键）
     * @param gcustomerId 分组服务id（主键）
     */
    public void setGcustomerId(BigDecimal gcustomerId) {
        this.gcustomerId = gcustomerId;
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
     * 用户加入分组时间
     * @return ADD_TIME 用户加入分组时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 用户加入分组时间
     * @param addTime 用户加入分组时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 用户分组积分
     * @return SCORE_INSIDE 用户分组积分
     */
    public BigDecimal getScoreInside() {
        return scoreInside;
    }

    /**
     * 用户分组积分
     * @param scoreInside 用户分组积分
     */
    public void setScoreInside(BigDecimal scoreInside) {
        this.scoreInside = scoreInside;
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
     * 客服id（外键）
     * @return STAFF_FID 客服id（外键）
     */
    public BigDecimal getStaffFid() {
        return staffFid;
    }

    /**
     * 客服id（外键）
     * @param staffFid 客服id（外键）
     */
    public void setStaffFid(BigDecimal staffFid) {
        this.staffFid = staffFid;
    }

    /**
     * 分组id (外键)
     * @return GROUP_FID 分组id (外键)
     */
    public BigDecimal getGroupFid() {
        return groupFid;
    }

    /**
     * 分组id (外键)
     * @param groupFid 分组id (外键)
     */
    public void setGroupFid(BigDecimal groupFid) {
        this.groupFid = groupFid;
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