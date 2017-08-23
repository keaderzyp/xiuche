package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HelpSpotimgExample {
    /**
     * T_HELP_SPOTIMG
     */
    protected String orderByClause;

    /**
     * T_HELP_SPOTIMG
     */
    protected boolean distinct;

    /**
     * T_HELP_SPOTIMG
     */
    protected List<Criteria> oredCriteria;

    public HelpSpotimgExample() {
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
     * T_HELP_SPOTIMG 2017-07-05
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

        public Criteria andSpotimgIdIsNull() {
            addCriterion("SPOTIMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdIsNotNull() {
            addCriterion("SPOTIMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdEqualTo(BigDecimal value) {
            addCriterion("SPOTIMG_ID =", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdNotEqualTo(BigDecimal value) {
            addCriterion("SPOTIMG_ID <>", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdGreaterThan(BigDecimal value) {
            addCriterion("SPOTIMG_ID >", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPOTIMG_ID >=", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdLessThan(BigDecimal value) {
            addCriterion("SPOTIMG_ID <", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPOTIMG_ID <=", value, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdIn(List<BigDecimal> values) {
            addCriterion("SPOTIMG_ID in", values, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdNotIn(List<BigDecimal> values) {
            addCriterion("SPOTIMG_ID not in", values, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPOTIMG_ID between", value1, value2, "spotimgId");
            return (Criteria) this;
        }

        public Criteria andSpotimgIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPOTIMG_ID not between", value1, value2, "spotimgId");
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

        public Criteria andSpotFidIsNull() {
            addCriterion("SPOT_FID is null");
            return (Criteria) this;
        }

        public Criteria andSpotFidIsNotNull() {
            addCriterion("SPOT_FID is not null");
            return (Criteria) this;
        }

        public Criteria andSpotFidEqualTo(String value) {
            addCriterion("SPOT_FID =", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidNotEqualTo(String value) {
            addCriterion("SPOT_FID <>", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidGreaterThan(String value) {
            addCriterion("SPOT_FID >", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidGreaterThanOrEqualTo(String value) {
            addCriterion("SPOT_FID >=", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidLessThan(String value) {
            addCriterion("SPOT_FID <", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidLessThanOrEqualTo(String value) {
            addCriterion("SPOT_FID <=", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidLike(String value) {
            addCriterion("SPOT_FID like", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidNotLike(String value) {
            addCriterion("SPOT_FID not like", value, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidIn(List<String> values) {
            addCriterion("SPOT_FID in", values, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidNotIn(List<String> values) {
            addCriterion("SPOT_FID not in", values, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidBetween(String value1, String value2) {
            addCriterion("SPOT_FID between", value1, value2, "spotFid");
            return (Criteria) this;
        }

        public Criteria andSpotFidNotBetween(String value1, String value2) {
            addCriterion("SPOT_FID not between", value1, value2, "spotFid");
            return (Criteria) this;
        }

        public Criteria andParam1IsNull() {
            addCriterion("PARAM1 is null");
            return (Criteria) this;
        }

        public Criteria andParam1IsNotNull() {
            addCriterion("PARAM1 is not null");
            return (Criteria) this;
        }

        public Criteria andParam1EqualTo(String value) {
            addCriterion("PARAM1 =", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotEqualTo(String value) {
            addCriterion("PARAM1 <>", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThan(String value) {
            addCriterion("PARAM1 >", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM1 >=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThan(String value) {
            addCriterion("PARAM1 <", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThanOrEqualTo(String value) {
            addCriterion("PARAM1 <=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Like(String value) {
            addCriterion("PARAM1 like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotLike(String value) {
            addCriterion("PARAM1 not like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1In(List<String> values) {
            addCriterion("PARAM1 in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotIn(List<String> values) {
            addCriterion("PARAM1 not in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Between(String value1, String value2) {
            addCriterion("PARAM1 between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotBetween(String value1, String value2) {
            addCriterion("PARAM1 not between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam2IsNull() {
            addCriterion("PARAM2 is null");
            return (Criteria) this;
        }

        public Criteria andParam2IsNotNull() {
            addCriterion("PARAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andParam2EqualTo(String value) {
            addCriterion("PARAM2 =", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotEqualTo(String value) {
            addCriterion("PARAM2 <>", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThan(String value) {
            addCriterion("PARAM2 >", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM2 >=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThan(String value) {
            addCriterion("PARAM2 <", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThanOrEqualTo(String value) {
            addCriterion("PARAM2 <=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Like(String value) {
            addCriterion("PARAM2 like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotLike(String value) {
            addCriterion("PARAM2 not like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2In(List<String> values) {
            addCriterion("PARAM2 in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotIn(List<String> values) {
            addCriterion("PARAM2 not in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Between(String value1, String value2) {
            addCriterion("PARAM2 between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotBetween(String value1, String value2) {
            addCriterion("PARAM2 not between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam3IsNull() {
            addCriterion("PARAM3 is null");
            return (Criteria) this;
        }

        public Criteria andParam3IsNotNull() {
            addCriterion("PARAM3 is not null");
            return (Criteria) this;
        }

        public Criteria andParam3EqualTo(String value) {
            addCriterion("PARAM3 =", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotEqualTo(String value) {
            addCriterion("PARAM3 <>", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThan(String value) {
            addCriterion("PARAM3 >", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM3 >=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThan(String value) {
            addCriterion("PARAM3 <", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThanOrEqualTo(String value) {
            addCriterion("PARAM3 <=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Like(String value) {
            addCriterion("PARAM3 like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotLike(String value) {
            addCriterion("PARAM3 not like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3In(List<String> values) {
            addCriterion("PARAM3 in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotIn(List<String> values) {
            addCriterion("PARAM3 not in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Between(String value1, String value2) {
            addCriterion("PARAM3 between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotBetween(String value1, String value2) {
            addCriterion("PARAM3 not between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam4IsNull() {
            addCriterion("PARAM4 is null");
            return (Criteria) this;
        }

        public Criteria andParam4IsNotNull() {
            addCriterion("PARAM4 is not null");
            return (Criteria) this;
        }

        public Criteria andParam4EqualTo(String value) {
            addCriterion("PARAM4 =", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotEqualTo(String value) {
            addCriterion("PARAM4 <>", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThan(String value) {
            addCriterion("PARAM4 >", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM4 >=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThan(String value) {
            addCriterion("PARAM4 <", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThanOrEqualTo(String value) {
            addCriterion("PARAM4 <=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Like(String value) {
            addCriterion("PARAM4 like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotLike(String value) {
            addCriterion("PARAM4 not like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4In(List<String> values) {
            addCriterion("PARAM4 in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotIn(List<String> values) {
            addCriterion("PARAM4 not in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Between(String value1, String value2) {
            addCriterion("PARAM4 between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotBetween(String value1, String value2) {
            addCriterion("PARAM4 not between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam5IsNull() {
            addCriterion("PARAM5 is null");
            return (Criteria) this;
        }

        public Criteria andParam5IsNotNull() {
            addCriterion("PARAM5 is not null");
            return (Criteria) this;
        }

        public Criteria andParam5EqualTo(String value) {
            addCriterion("PARAM5 =", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotEqualTo(String value) {
            addCriterion("PARAM5 <>", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThan(String value) {
            addCriterion("PARAM5 >", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM5 >=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThan(String value) {
            addCriterion("PARAM5 <", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThanOrEqualTo(String value) {
            addCriterion("PARAM5 <=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Like(String value) {
            addCriterion("PARAM5 like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotLike(String value) {
            addCriterion("PARAM5 not like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5In(List<String> values) {
            addCriterion("PARAM5 in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotIn(List<String> values) {
            addCriterion("PARAM5 not in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Between(String value1, String value2) {
            addCriterion("PARAM5 between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotBetween(String value1, String value2) {
            addCriterion("PARAM5 not between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam6IsNull() {
            addCriterion("PARAM6 is null");
            return (Criteria) this;
        }

        public Criteria andParam6IsNotNull() {
            addCriterion("PARAM6 is not null");
            return (Criteria) this;
        }

        public Criteria andParam6EqualTo(String value) {
            addCriterion("PARAM6 =", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotEqualTo(String value) {
            addCriterion("PARAM6 <>", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6GreaterThan(String value) {
            addCriterion("PARAM6 >", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM6 >=", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6LessThan(String value) {
            addCriterion("PARAM6 <", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6LessThanOrEqualTo(String value) {
            addCriterion("PARAM6 <=", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6Like(String value) {
            addCriterion("PARAM6 like", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotLike(String value) {
            addCriterion("PARAM6 not like", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6In(List<String> values) {
            addCriterion("PARAM6 in", values, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotIn(List<String> values) {
            addCriterion("PARAM6 not in", values, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6Between(String value1, String value2) {
            addCriterion("PARAM6 between", value1, value2, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotBetween(String value1, String value2) {
            addCriterion("PARAM6 not between", value1, value2, "param6");
            return (Criteria) this;
        }

        public Criteria andParam7IsNull() {
            addCriterion("PARAM7 is null");
            return (Criteria) this;
        }

        public Criteria andParam7IsNotNull() {
            addCriterion("PARAM7 is not null");
            return (Criteria) this;
        }

        public Criteria andParam7EqualTo(String value) {
            addCriterion("PARAM7 =", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotEqualTo(String value) {
            addCriterion("PARAM7 <>", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThan(String value) {
            addCriterion("PARAM7 >", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM7 >=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThan(String value) {
            addCriterion("PARAM7 <", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThanOrEqualTo(String value) {
            addCriterion("PARAM7 <=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Like(String value) {
            addCriterion("PARAM7 like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotLike(String value) {
            addCriterion("PARAM7 not like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7In(List<String> values) {
            addCriterion("PARAM7 in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotIn(List<String> values) {
            addCriterion("PARAM7 not in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Between(String value1, String value2) {
            addCriterion("PARAM7 between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotBetween(String value1, String value2) {
            addCriterion("PARAM7 not between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam8IsNull() {
            addCriterion("PARAM8 is null");
            return (Criteria) this;
        }

        public Criteria andParam8IsNotNull() {
            addCriterion("PARAM8 is not null");
            return (Criteria) this;
        }

        public Criteria andParam8EqualTo(String value) {
            addCriterion("PARAM8 =", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotEqualTo(String value) {
            addCriterion("PARAM8 <>", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThan(String value) {
            addCriterion("PARAM8 >", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM8 >=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThan(String value) {
            addCriterion("PARAM8 <", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThanOrEqualTo(String value) {
            addCriterion("PARAM8 <=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Like(String value) {
            addCriterion("PARAM8 like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotLike(String value) {
            addCriterion("PARAM8 not like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8In(List<String> values) {
            addCriterion("PARAM8 in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotIn(List<String> values) {
            addCriterion("PARAM8 not in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Between(String value1, String value2) {
            addCriterion("PARAM8 between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotBetween(String value1, String value2) {
            addCriterion("PARAM8 not between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam9IsNull() {
            addCriterion("PARAM9 is null");
            return (Criteria) this;
        }

        public Criteria andParam9IsNotNull() {
            addCriterion("PARAM9 is not null");
            return (Criteria) this;
        }

        public Criteria andParam9EqualTo(String value) {
            addCriterion("PARAM9 =", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotEqualTo(String value) {
            addCriterion("PARAM9 <>", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThan(String value) {
            addCriterion("PARAM9 >", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM9 >=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThan(String value) {
            addCriterion("PARAM9 <", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThanOrEqualTo(String value) {
            addCriterion("PARAM9 <=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Like(String value) {
            addCriterion("PARAM9 like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotLike(String value) {
            addCriterion("PARAM9 not like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9In(List<String> values) {
            addCriterion("PARAM9 in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotIn(List<String> values) {
            addCriterion("PARAM9 not in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Between(String value1, String value2) {
            addCriterion("PARAM9 between", value1, value2, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotBetween(String value1, String value2) {
            addCriterion("PARAM9 not between", value1, value2, "param9");
            return (Criteria) this;
        }

        public Criteria andParam10IsNull() {
            addCriterion("PARAM10 is null");
            return (Criteria) this;
        }

        public Criteria andParam10IsNotNull() {
            addCriterion("PARAM10 is not null");
            return (Criteria) this;
        }

        public Criteria andParam10EqualTo(String value) {
            addCriterion("PARAM10 =", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotEqualTo(String value) {
            addCriterion("PARAM10 <>", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10GreaterThan(String value) {
            addCriterion("PARAM10 >", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM10 >=", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10LessThan(String value) {
            addCriterion("PARAM10 <", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10LessThanOrEqualTo(String value) {
            addCriterion("PARAM10 <=", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10Like(String value) {
            addCriterion("PARAM10 like", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotLike(String value) {
            addCriterion("PARAM10 not like", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10In(List<String> values) {
            addCriterion("PARAM10 in", values, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotIn(List<String> values) {
            addCriterion("PARAM10 not in", values, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10Between(String value1, String value2) {
            addCriterion("PARAM10 between", value1, value2, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotBetween(String value1, String value2) {
            addCriterion("PARAM10 not between", value1, value2, "param10");
            return (Criteria) this;
        }
    }

    /**
     * T_HELP_SPOTIMG
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HELP_SPOTIMG 2017-07-05
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