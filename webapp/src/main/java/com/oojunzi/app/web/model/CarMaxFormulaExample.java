package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarMaxFormulaExample {
    /**
     * T_CAR_MAX_FORMULA
     */
    protected String orderByClause;

    /**
     * T_CAR_MAX_FORMULA
     */
    protected boolean distinct;

    /**
     * T_CAR_MAX_FORMULA
     */
    protected List<Criteria> oredCriteria;

    public CarMaxFormulaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_CAR_MAX_FORMULA 2017-07-14
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFormulaIdIsNull() {
            addCriterion("FORMULA_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIsNotNull() {
            addCriterion("FORMULA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdEqualTo(String value) {
            addCriterion("FORMULA_ID =", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotEqualTo(String value) {
            addCriterion("FORMULA_ID <>", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThan(String value) {
            addCriterion("FORMULA_ID >", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULA_ID >=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThan(String value) {
            addCriterion("FORMULA_ID <", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThanOrEqualTo(String value) {
            addCriterion("FORMULA_ID <=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLike(String value) {
            addCriterion("FORMULA_ID like", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotLike(String value) {
            addCriterion("FORMULA_ID not like", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIn(List<String> values) {
            addCriterion("FORMULA_ID in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotIn(List<String> values) {
            addCriterion("FORMULA_ID not in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdBetween(String value1, String value2) {
            addCriterion("FORMULA_ID between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotBetween(String value1, String value2) {
            addCriterion("FORMULA_ID not between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIsNull() {
            addCriterion("FLOOR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIsNotNull() {
            addCriterion("FLOOR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceEqualTo(BigDecimal value) {
            addCriterion("FLOOR_PRICE =", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotEqualTo(BigDecimal value) {
            addCriterion("FLOOR_PRICE <>", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceGreaterThan(BigDecimal value) {
            addCriterion("FLOOR_PRICE >", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOOR_PRICE >=", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceLessThan(BigDecimal value) {
            addCriterion("FLOOR_PRICE <", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOOR_PRICE <=", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIn(List<BigDecimal> values) {
            addCriterion("FLOOR_PRICE in", values, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotIn(List<BigDecimal> values) {
            addCriterion("FLOOR_PRICE not in", values, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOOR_PRICE between", value1, value2, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOOR_PRICE not between", value1, value2, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceIsNull() {
            addCriterion("CEIL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCeilPriceIsNotNull() {
            addCriterion("CEIL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCeilPriceEqualTo(BigDecimal value) {
            addCriterion("CEIL_PRICE =", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceNotEqualTo(BigDecimal value) {
            addCriterion("CEIL_PRICE <>", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceGreaterThan(BigDecimal value) {
            addCriterion("CEIL_PRICE >", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CEIL_PRICE >=", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceLessThan(BigDecimal value) {
            addCriterion("CEIL_PRICE <", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CEIL_PRICE <=", value, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceIn(List<BigDecimal> values) {
            addCriterion("CEIL_PRICE in", values, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceNotIn(List<BigDecimal> values) {
            addCriterion("CEIL_PRICE not in", values, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CEIL_PRICE between", value1, value2, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andCeilPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CEIL_PRICE not between", value1, value2, "ceilPrice");
            return (Criteria) this;
        }

        public Criteria andQuotientIsNull() {
            addCriterion("QUOTIENT is null");
            return (Criteria) this;
        }

        public Criteria andQuotientIsNotNull() {
            addCriterion("QUOTIENT is not null");
            return (Criteria) this;
        }

        public Criteria andQuotientEqualTo(BigDecimal value) {
            addCriterion("QUOTIENT =", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientNotEqualTo(BigDecimal value) {
            addCriterion("QUOTIENT <>", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientGreaterThan(BigDecimal value) {
            addCriterion("QUOTIENT >", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTIENT >=", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientLessThan(BigDecimal value) {
            addCriterion("QUOTIENT <", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTIENT <=", value, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientIn(List<BigDecimal> values) {
            addCriterion("QUOTIENT in", values, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientNotIn(List<BigDecimal> values) {
            addCriterion("QUOTIENT not in", values, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTIENT between", value1, value2, "quotient");
            return (Criteria) this;
        }

        public Criteria andQuotientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTIENT not between", value1, value2, "quotient");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * T_CAR_MAX_FORMULA
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CAR_MAX_FORMULA 2017-07-14
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}