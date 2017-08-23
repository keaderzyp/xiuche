package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class CarMaxFormula {
    /**
     * null
     */
    private String formulaId;

    /**
     * null
     */
    private BigDecimal floorPrice;

    /**
     * null
     */
    private BigDecimal ceilPrice;

    /**
     * null
     */
    private BigDecimal quotient;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * null
     * @return FORMULA_ID null
     */
    public String getFormulaId() {
        return formulaId;
    }

    /**
     * null
     * @param formulaId null
     */
    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId == null ? null : formulaId.trim();
    }

    /**
     * null
     * @return FLOOR_PRICE null
     */
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    /**
     * null
     * @param floorPrice null
     */
    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * null
     * @return CEIL_PRICE null
     */
    public BigDecimal getCeilPrice() {
        return ceilPrice;
    }

    /**
     * null
     * @param ceilPrice null
     */
    public void setCeilPrice(BigDecimal ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    /**
     * null
     * @return QUOTIENT null
     */
    public BigDecimal getQuotient() {
        return quotient;
    }

    /**
     * null
     * @param quotient null
     */
    public void setQuotient(BigDecimal quotient) {
        this.quotient = quotient;
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
}