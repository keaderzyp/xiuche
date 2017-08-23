package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class MoneyDiscount {
    /**
     * 主键
     */
    private BigDecimal id;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 修改时间
     */
    private String updatetime;

    /**
     * 基本充值金额
     */
    private BigDecimal baseMoney;

    /**
     * 赠送金额
     */
    private BigDecimal giveMoney;

    /**
     * 优先级
     */
    private String priority;

    /**
     * 状态 1：使用中  0：已删除
     */
    private String status;

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
    private BigDecimal param5;

    /**
     * 主键
     * @return ID 主键
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 创建时间
     * @return CREATETIME 创建时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * 修改时间
     * @return UPDATETIME 修改时间
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     * @param updatetime 修改时间
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    /**
     * 基本充值金额
     * @return BASE_MONEY 基本充值金额
     */
    public BigDecimal getBaseMoney() {
        return baseMoney;
    }

    /**
     * 基本充值金额
     * @param baseMoney 基本充值金额
     */
    public void setBaseMoney(BigDecimal baseMoney) {
        this.baseMoney = baseMoney;
    }

    /**
     * 赠送金额
     * @return GIVE_MONEY 赠送金额
     */
    public BigDecimal getGiveMoney() {
        return giveMoney;
    }

    /**
     * 赠送金额
     * @param giveMoney 赠送金额
     */
    public void setGiveMoney(BigDecimal giveMoney) {
        this.giveMoney = giveMoney;
    }

    /**
     * 优先级
     * @return PRIORITY 优先级
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 优先级
     * @param priority 优先级
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /**
     * 状态 1：使用中  0：已删除
     * @return STATUS 状态 1：使用中  0：已删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 1：使用中  0：已删除
     * @param status 状态 1：使用中  0：已删除
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
    public BigDecimal getParam5() {
        return param5;
    }

    /**
     * null
     * @param param5 null
     */
    public void setParam5(BigDecimal param5) {
        this.param5 = param5;
    }
}