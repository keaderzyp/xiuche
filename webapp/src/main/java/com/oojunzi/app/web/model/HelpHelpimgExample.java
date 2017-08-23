package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HelpHelpimgExample {
    /**
     * T_HELP_HELPIMG
     */
    protected String orderByClause;

    /**
     * T_HELP_HELPIMG
     */
    protected boolean distinct;

    /**
     * T_HELP_HELPIMG
     */
    protected List<Criteria> oredCriteria;

    public HelpHelpimgExample() {
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
     * T_HELP_HELPIMG 2017-07-05
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

        public Criteria andHelpimgIdIsNull() {
            addCriterion("HELPIMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdIsNotNull() {
            addCriterion("HELPIMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdEqualTo(BigDecimal value) {
            addCriterion("HELPIMG_ID =", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdNotEqualTo(BigDecimal value) {
            addCriterion("HELPIMG_ID <>", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdGreaterThan(BigDecimal value) {
            addCriterion("HELPIMG_ID >", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HELPIMG_ID >=", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdLessThan(BigDecimal value) {
            addCriterion("HELPIMG_ID <", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HELPIMG_ID <=", value, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdIn(List<BigDecimal> values) {
            addCriterion("HELPIMG_ID in", values, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdNotIn(List<BigDecimal> values) {
            addCriterion("HELPIMG_ID not in", values, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELPIMG_ID between", value1, value2, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andHelpimgIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELPIMG_ID not between", value1, value2, "helpimgId");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
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

        public Criteria andHelpFidIsNull() {
            addCriterion("HELP_FID is null");
            return (Criteria) this;
        }

        public Criteria andHelpFidIsNotNull() {
            addCriterion("HELP_FID is not null");
            return (Criteria) this;
        }

        public Criteria andHelpFidEqualTo(String value) {
            addCriterion("HELP_FID =", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotEqualTo(String value) {
            addCriterion("HELP_FID <>", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidGreaterThan(String value) {
            addCriterion("HELP_FID >", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidGreaterThanOrEqualTo(String value) {
            addCriterion("HELP_FID >=", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidLessThan(String value) {
            addCriterion("HELP_FID <", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidLessThanOrEqualTo(String value) {
            addCriterion("HELP_FID <=", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidLike(String value) {
            addCriterion("HELP_FID like", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotLike(String value) {
            addCriterion("HELP_FID not like", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidIn(List<String> values) {
            addCriterion("HELP_FID in", values, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotIn(List<String> values) {
            addCriterion("HELP_FID not in", values, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidBetween(String value1, String value2) {
            addCriterion("HELP_FID between", value1, value2, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotBetween(String value1, String value2) {
            addCriterion("HELP_FID not between", value1, value2, "helpFid");
            return (Criteria) this;
        }
    }

    /**
     * T_HELP_HELPIMG
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HELP_HELPIMG 2017-07-05
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