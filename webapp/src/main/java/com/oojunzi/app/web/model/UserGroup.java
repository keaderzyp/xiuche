package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class UserGroup {
    /**
     * 分组id(主键)
     */
    private BigDecimal groupId;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 要求
     */
    private String term;

    /**
     * 特权
     */
    private String right;

    /**
     * 组名
     */
    private String groupName;

    /**
     * 负责员工id(外键)
     */
    private BigDecimal leaderFid;

    /**
     * 达到积分
     */
    private BigDecimal addScore;

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
     * 分组id(主键)
     * @return GROUP_ID 分组id(主键)
     */
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     * 分组id(主键)
     * @param groupId 分组id(主键)
     */
    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
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
     * 要求
     * @return TERM 要求
     */
    public String getTerm() {
        return term;
    }

    /**
     * 要求
     * @param term 要求
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * 特权
     * @return RIGHT 特权
     */
    public String getRight() {
        return right;
    }

    /**
     * 特权
     * @param right 特权
     */
    public void setRight(String right) {
        this.right = right == null ? null : right.trim();
    }

    /**
     * 组名
     * @return GROUP_NAME 组名
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 组名
     * @param groupName 组名
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 负责员工id(外键)
     * @return LEADER_FID 负责员工id(外键)
     */
    public BigDecimal getLeaderFid() {
        return leaderFid;
    }

    /**
     * 负责员工id(外键)
     * @param leaderFid 负责员工id(外键)
     */
    public void setLeaderFid(BigDecimal leaderFid) {
        this.leaderFid = leaderFid;
    }

    /**
     * 达到积分
     * @return ADD_SCORE 达到积分
     */
    public BigDecimal getAddScore() {
        return addScore;
    }

    /**
     * 达到积分
     * @param addScore 达到积分
     */
    public void setAddScore(BigDecimal addScore) {
        this.addScore = addScore;
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