package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HelpSpotExample {
    /**
     * T_HELP_SPOT
     */
    protected String orderByClause;

    /**
     * T_HELP_SPOT
     */
    protected boolean distinct;

    /**
     * T_HELP_SPOT
     */
    protected List<Criteria> oredCriteria;

    public HelpSpotExample() {
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
     * T_HELP_SPOT 2017-07-05
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSpotIdIsNull() {
            addCriterion("SPOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpotIdIsNotNull() {
            addCriterion("SPOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpotIdEqualTo(BigDecimal value) {
            addCriterion("SPOT_ID =", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotEqualTo(BigDecimal value) {
            addCriterion("SPOT_ID <>", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThan(BigDecimal value) {
            addCriterion("SPOT_ID >", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPOT_ID >=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThan(BigDecimal value) {
            addCriterion("SPOT_ID <", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPOT_ID <=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdIn(List<BigDecimal> values) {
            addCriterion("SPOT_ID in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotIn(List<BigDecimal> values) {
            addCriterion("SPOT_ID not in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPOT_ID between", value1, value2, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPOT_ID not between", value1, value2, "spotId");
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

        public Criteria andSpotTimeIsNull() {
            addCriterion("SPOT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSpotTimeIsNotNull() {
            addCriterion("SPOT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSpotTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SPOT_TIME =", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SPOT_TIME <>", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SPOT_TIME >", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPOT_TIME >=", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeLessThan(Date value) {
            addCriterionForJDBCDate("SPOT_TIME <", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPOT_TIME <=", value, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SPOT_TIME in", values, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SPOT_TIME not in", values, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPOT_TIME between", value1, value2, "spotTime");
            return (Criteria) this;
        }

        public Criteria andSpotTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPOT_TIME not between", value1, value2, "spotTime");
            return (Criteria) this;
        }

        public Criteria andButler2FtidIsNull() {
            addCriterion("BUTLER2_FTID is null");
            return (Criteria) this;
        }

        public Criteria andButler2FtidIsNotNull() {
            addCriterion("BUTLER2_FTID is not null");
            return (Criteria) this;
        }

        public Criteria andButler2FtidEqualTo(BigDecimal value) {
            addCriterion("BUTLER2_FTID =", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidNotEqualTo(BigDecimal value) {
            addCriterion("BUTLER2_FTID <>", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidGreaterThan(BigDecimal value) {
            addCriterion("BUTLER2_FTID >", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER2_FTID >=", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidLessThan(BigDecimal value) {
            addCriterion("BUTLER2_FTID <", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER2_FTID <=", value, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidIn(List<BigDecimal> values) {
            addCriterion("BUTLER2_FTID in", values, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidNotIn(List<BigDecimal> values) {
            addCriterion("BUTLER2_FTID not in", values, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER2_FTID between", value1, value2, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andButler2FtidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER2_FTID not between", value1, value2, "butler2Ftid");
            return (Criteria) this;
        }

        public Criteria andSpotRecordIsNull() {
            addCriterion("SPOT_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andSpotRecordIsNotNull() {
            addCriterion("SPOT_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andSpotRecordEqualTo(String value) {
            addCriterion("SPOT_RECORD =", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordNotEqualTo(String value) {
            addCriterion("SPOT_RECORD <>", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordGreaterThan(String value) {
            addCriterion("SPOT_RECORD >", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordGreaterThanOrEqualTo(String value) {
            addCriterion("SPOT_RECORD >=", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordLessThan(String value) {
            addCriterion("SPOT_RECORD <", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordLessThanOrEqualTo(String value) {
            addCriterion("SPOT_RECORD <=", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordLike(String value) {
            addCriterion("SPOT_RECORD like", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordNotLike(String value) {
            addCriterion("SPOT_RECORD not like", value, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordIn(List<String> values) {
            addCriterion("SPOT_RECORD in", values, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordNotIn(List<String> values) {
            addCriterion("SPOT_RECORD not in", values, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordBetween(String value1, String value2) {
            addCriterion("SPOT_RECORD between", value1, value2, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andSpotRecordNotBetween(String value1, String value2) {
            addCriterion("SPOT_RECORD not between", value1, value2, "spotRecord");
            return (Criteria) this;
        }

        public Criteria andReterenceIsNull() {
            addCriterion("RETERENCE is null");
            return (Criteria) this;
        }

        public Criteria andReterenceIsNotNull() {
            addCriterion("RETERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andReterenceEqualTo(String value) {
            addCriterion("RETERENCE =", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceNotEqualTo(String value) {
            addCriterion("RETERENCE <>", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceGreaterThan(String value) {
            addCriterion("RETERENCE >", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceGreaterThanOrEqualTo(String value) {
            addCriterion("RETERENCE >=", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceLessThan(String value) {
            addCriterion("RETERENCE <", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceLessThanOrEqualTo(String value) {
            addCriterion("RETERENCE <=", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceLike(String value) {
            addCriterion("RETERENCE like", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceNotLike(String value) {
            addCriterion("RETERENCE not like", value, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceIn(List<String> values) {
            addCriterion("RETERENCE in", values, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceNotIn(List<String> values) {
            addCriterion("RETERENCE not in", values, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceBetween(String value1, String value2) {
            addCriterion("RETERENCE between", value1, value2, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceNotBetween(String value1, String value2) {
            addCriterion("RETERENCE not between", value1, value2, "reterence");
            return (Criteria) this;
        }

        public Criteria andReterenceTelIsNull() {
            addCriterion("RETERENCE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andReterenceTelIsNotNull() {
            addCriterion("RETERENCE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andReterenceTelEqualTo(String value) {
            addCriterion("RETERENCE_TEL =", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelNotEqualTo(String value) {
            addCriterion("RETERENCE_TEL <>", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelGreaterThan(String value) {
            addCriterion("RETERENCE_TEL >", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelGreaterThanOrEqualTo(String value) {
            addCriterion("RETERENCE_TEL >=", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelLessThan(String value) {
            addCriterion("RETERENCE_TEL <", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelLessThanOrEqualTo(String value) {
            addCriterion("RETERENCE_TEL <=", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelLike(String value) {
            addCriterion("RETERENCE_TEL like", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelNotLike(String value) {
            addCriterion("RETERENCE_TEL not like", value, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelIn(List<String> values) {
            addCriterion("RETERENCE_TEL in", values, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelNotIn(List<String> values) {
            addCriterion("RETERENCE_TEL not in", values, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelBetween(String value1, String value2) {
            addCriterion("RETERENCE_TEL between", value1, value2, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andReterenceTelNotBetween(String value1, String value2) {
            addCriterion("RETERENCE_TEL not between", value1, value2, "reterenceTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideIsNull() {
            addCriterion("OTHER_SIDE is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideIsNotNull() {
            addCriterion("OTHER_SIDE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideEqualTo(String value) {
            addCriterion("OTHER_SIDE =", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideNotEqualTo(String value) {
            addCriterion("OTHER_SIDE <>", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideGreaterThan(String value) {
            addCriterion("OTHER_SIDE >", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_SIDE >=", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideLessThan(String value) {
            addCriterion("OTHER_SIDE <", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideLessThanOrEqualTo(String value) {
            addCriterion("OTHER_SIDE <=", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideLike(String value) {
            addCriterion("OTHER_SIDE like", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideNotLike(String value) {
            addCriterion("OTHER_SIDE not like", value, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideIn(List<String> values) {
            addCriterion("OTHER_SIDE in", values, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideNotIn(List<String> values) {
            addCriterion("OTHER_SIDE not in", values, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideBetween(String value1, String value2) {
            addCriterion("OTHER_SIDE between", value1, value2, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideNotBetween(String value1, String value2) {
            addCriterion("OTHER_SIDE not between", value1, value2, "otherSide");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelIsNull() {
            addCriterion("OTHER_SIDE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelIsNotNull() {
            addCriterion("OTHER_SIDE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelEqualTo(String value) {
            addCriterion("OTHER_SIDE_TEL =", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelNotEqualTo(String value) {
            addCriterion("OTHER_SIDE_TEL <>", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelGreaterThan(String value) {
            addCriterion("OTHER_SIDE_TEL >", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_SIDE_TEL >=", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelLessThan(String value) {
            addCriterion("OTHER_SIDE_TEL <", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelLessThanOrEqualTo(String value) {
            addCriterion("OTHER_SIDE_TEL <=", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelLike(String value) {
            addCriterion("OTHER_SIDE_TEL like", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelNotLike(String value) {
            addCriterion("OTHER_SIDE_TEL not like", value, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelIn(List<String> values) {
            addCriterion("OTHER_SIDE_TEL in", values, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelNotIn(List<String> values) {
            addCriterion("OTHER_SIDE_TEL not in", values, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelBetween(String value1, String value2) {
            addCriterion("OTHER_SIDE_TEL between", value1, value2, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andOtherSideTelNotBetween(String value1, String value2) {
            addCriterion("OTHER_SIDE_TEL not between", value1, value2, "otherSideTel");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentIsNull() {
            addCriterion("DUTY_PRECENT is null");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentIsNotNull() {
            addCriterion("DUTY_PRECENT is not null");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentEqualTo(String value) {
            addCriterion("DUTY_PRECENT =", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentNotEqualTo(String value) {
            addCriterion("DUTY_PRECENT <>", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentGreaterThan(String value) {
            addCriterion("DUTY_PRECENT >", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_PRECENT >=", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentLessThan(String value) {
            addCriterion("DUTY_PRECENT <", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentLessThanOrEqualTo(String value) {
            addCriterion("DUTY_PRECENT <=", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentLike(String value) {
            addCriterion("DUTY_PRECENT like", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentNotLike(String value) {
            addCriterion("DUTY_PRECENT not like", value, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentIn(List<String> values) {
            addCriterion("DUTY_PRECENT in", values, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentNotIn(List<String> values) {
            addCriterion("DUTY_PRECENT not in", values, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentBetween(String value1, String value2) {
            addCriterion("DUTY_PRECENT between", value1, value2, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andDutyPrecentNotBetween(String value1, String value2) {
            addCriterion("DUTY_PRECENT not between", value1, value2, "dutyPrecent");
            return (Criteria) this;
        }

        public Criteria andButler3FtidIsNull() {
            addCriterion("BUTLER3_FTID is null");
            return (Criteria) this;
        }

        public Criteria andButler3FtidIsNotNull() {
            addCriterion("BUTLER3_FTID is not null");
            return (Criteria) this;
        }

        public Criteria andButler3FtidEqualTo(BigDecimal value) {
            addCriterion("BUTLER3_FTID =", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidNotEqualTo(BigDecimal value) {
            addCriterion("BUTLER3_FTID <>", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidGreaterThan(BigDecimal value) {
            addCriterion("BUTLER3_FTID >", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER3_FTID >=", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidLessThan(BigDecimal value) {
            addCriterion("BUTLER3_FTID <", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER3_FTID <=", value, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidIn(List<BigDecimal> values) {
            addCriterion("BUTLER3_FTID in", values, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidNotIn(List<BigDecimal> values) {
            addCriterion("BUTLER3_FTID not in", values, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER3_FTID between", value1, value2, "butler3Ftid");
            return (Criteria) this;
        }

        public Criteria andButler3FtidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER3_FTID not between", value1, value2, "butler3Ftid");
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

        public Criteria andButlerFidIsNull() {
            addCriterion("BUTLER_FID is null");
            return (Criteria) this;
        }

        public Criteria andButlerFidIsNotNull() {
            addCriterion("BUTLER_FID is not null");
            return (Criteria) this;
        }

        public Criteria andButlerFidEqualTo(BigDecimal value) {
            addCriterion("BUTLER_FID =", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidNotEqualTo(BigDecimal value) {
            addCriterion("BUTLER_FID <>", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidGreaterThan(BigDecimal value) {
            addCriterion("BUTLER_FID >", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER_FID >=", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidLessThan(BigDecimal value) {
            addCriterion("BUTLER_FID <", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTLER_FID <=", value, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidIn(List<BigDecimal> values) {
            addCriterion("BUTLER_FID in", values, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidNotIn(List<BigDecimal> values) {
            addCriterion("BUTLER_FID not in", values, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER_FID between", value1, value2, "butlerFid");
            return (Criteria) this;
        }

        public Criteria andButlerFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTLER_FID not between", value1, value2, "butlerFid");
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

        public Criteria andHelpFidEqualTo(BigDecimal value) {
            addCriterion("HELP_FID =", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotEqualTo(BigDecimal value) {
            addCriterion("HELP_FID <>", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidGreaterThan(BigDecimal value) {
            addCriterion("HELP_FID >", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HELP_FID >=", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidLessThan(BigDecimal value) {
            addCriterion("HELP_FID <", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HELP_FID <=", value, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidIn(List<BigDecimal> values) {
            addCriterion("HELP_FID in", values, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotIn(List<BigDecimal> values) {
            addCriterion("HELP_FID not in", values, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELP_FID between", value1, value2, "helpFid");
            return (Criteria) this;
        }

        public Criteria andHelpFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELP_FID not between", value1, value2, "helpFid");
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
     * T_HELP_SPOT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HELP_SPOT 2017-07-05
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