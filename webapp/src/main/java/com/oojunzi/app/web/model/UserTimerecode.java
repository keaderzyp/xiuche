package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserTimerecode {
    /**
     * 用户时间记录id(主键)
     */
    private BigDecimal trecodeId;

    /**
     * 发生时间
     */
    private Date happenTime;

    /**
     * 类型 1：注册时间  2：入会时间（支付1元） 3：添加爱车时间 4：签订互助协议时间  11：入职时间 12：注册时间 13：审批时间 14：转正时间 15：加入部门时间
     */
    private String happenType;

    /**
     * null
     */
    private String status;

    /**
     * 用户类型：1：圈圈用户 2：员工
     */
    private String userType;

    /**
     * null
     */
    private String remark;

    /**
     * 审批人id（外键）
     */
    private BigDecimal approverFid;

    /**
     * 用户或员工id(外键)
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
     * 用户时间记录id(主键)
     * @return TRECODE_ID 用户时间记录id(主键)
     */
    public BigDecimal getTrecodeId() {
        return trecodeId;
    }

    /**
     * 用户时间记录id(主键)
     * @param trecodeId 用户时间记录id(主键)
     */
    public void setTrecodeId(BigDecimal trecodeId) {
        this.trecodeId = trecodeId;
    }

    /**
     * 发生时间
     * @return HAPPEN_TIME 发生时间
     */
    public Date getHappenTime() {
        return happenTime;
    }

    /**
     * 发生时间
     * @param happenTime 发生时间
     */
    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }

    /**
     * 类型 1：注册时间  2：入会时间（支付1元） 3：添加爱车时间 4：签订互助协议时间  11：入职时间 12：注册时间 13：审批时间 14：转正时间 15：加入部门时间
     * @return HAPPEN_TYPE 类型 1：注册时间  2：入会时间（支付1元） 3：添加爱车时间 4：签订互助协议时间  11：入职时间 12：注册时间 13：审批时间 14：转正时间 15：加入部门时间
     */
    public String getHappenType() {
        return happenType;
    }

    /**
     * 类型 1：注册时间  2：入会时间（支付1元） 3：添加爱车时间 4：签订互助协议时间  11：入职时间 12：注册时间 13：审批时间 14：转正时间 15：加入部门时间
     * @param happenType 类型 1：注册时间  2：入会时间（支付1元） 3：添加爱车时间 4：签订互助协议时间  11：入职时间 12：注册时间 13：审批时间 14：转正时间 15：加入部门时间
     */
    public void setHappenType(String happenType) {
        this.happenType = happenType == null ? null : happenType.trim();
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
     * 用户类型：1：圈圈用户 2：员工
     * @return USER_TYPE 用户类型：1：圈圈用户 2：员工
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型：1：圈圈用户 2：员工
     * @param userType 用户类型：1：圈圈用户 2：员工
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
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
     * 审批人id（外键）
     * @return APPROVER_FID 审批人id（外键）
     */
    public BigDecimal getApproverFid() {
        return approverFid;
    }

    /**
     * 审批人id（外键）
     * @param approverFid 审批人id（外键）
     */
    public void setApproverFid(BigDecimal approverFid) {
        this.approverFid = approverFid;
    }

    /**
     * 用户或员工id(外键)
     * @return USER_FID 用户或员工id(外键)
     */
    public BigDecimal getUserFid() {
        return userFid;
    }

    /**
     * 用户或员工id(外键)
     * @param userFid 用户或员工id(外键)
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