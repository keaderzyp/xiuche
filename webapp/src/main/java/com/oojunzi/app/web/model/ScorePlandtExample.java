package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ScorePlandtExample {
    /**
     * T_SCORE_PLANDT
     */
    protected String orderByClause;

    /**
     * T_SCORE_PLANDT
     */
    protected boolean distinct;

    /**
     * T_SCORE_PLANDT
     */
    protected List<Criteria> oredCriteria;

    public ScorePlandtExample() {
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
     * T_SCORE_PLANDT 2017-07-05
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

        public Criteria andPlandtIdIsNull() {
            addCriterion("PLANDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlandtIdIsNotNull() {
            addCriterion("PLANDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlandtIdEqualTo(BigDecimal value) {
            addCriterion("PLANDT_ID =", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdNotEqualTo(BigDecimal value) {
            addCriterion("PLANDT_ID <>", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdGreaterThan(BigDecimal value) {
            addCriterion("PLANDT_ID >", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANDT_ID >=", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdLessThan(BigDecimal value) {
            addCriterion("PLANDT_ID <", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANDT_ID <=", value, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdIn(List<BigDecimal> values) {
            addCriterion("PLANDT_ID in", values, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdNotIn(List<BigDecimal> values) {
            addCriterion("PLANDT_ID not in", values, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANDT_ID between", value1, value2, "plandtId");
            return (Criteria) this;
        }

        public Criteria andPlandtIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANDT_ID not between", value1, value2, "plandtId");
            return (Criteria) this;
        }

        public Criteria andGiveTypeIsNull() {
            addCriterion("GIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGiveTypeIsNotNull() {
            addCriterion("GIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGiveTypeEqualTo(String value) {
            addCriterion("GIVE_TYPE =", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeNotEqualTo(String value) {
            addCriterion("GIVE_TYPE <>", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeGreaterThan(String value) {
            addCriterion("GIVE_TYPE >", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GIVE_TYPE >=", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeLessThan(String value) {
            addCriterion("GIVE_TYPE <", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeLessThanOrEqualTo(String value) {
            addCriterion("GIVE_TYPE <=", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeLike(String value) {
            addCriterion("GIVE_TYPE like", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeNotLike(String value) {
            addCriterion("GIVE_TYPE not like", value, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeIn(List<String> values) {
            addCriterion("GIVE_TYPE in", values, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeNotIn(List<String> values) {
            addCriterion("GIVE_TYPE not in", values, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeBetween(String value1, String value2) {
            addCriterion("GIVE_TYPE between", value1, value2, "giveType");
            return (Criteria) this;
        }

        public Criteria andGiveTypeNotBetween(String value1, String value2) {
            addCriterion("GIVE_TYPE not between", value1, value2, "giveType");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andGiveSumIsNull() {
            addCriterion("GIVE_SUM is null");
            return (Criteria) this;
        }

        public Criteria andGiveSumIsNotNull() {
            addCriterion("GIVE_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andGiveSumEqualTo(BigDecimal value) {
            addCriterion("GIVE_SUM =", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumNotEqualTo(BigDecimal value) {
            addCriterion("GIVE_SUM <>", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumGreaterThan(BigDecimal value) {
            addCriterion("GIVE_SUM >", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GIVE_SUM >=", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumLessThan(BigDecimal value) {
            addCriterion("GIVE_SUM <", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GIVE_SUM <=", value, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumIn(List<BigDecimal> values) {
            addCriterion("GIVE_SUM in", values, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumNotIn(List<BigDecimal> values) {
            addCriterion("GIVE_SUM not in", values, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIVE_SUM between", value1, value2, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIVE_SUM not between", value1, value2, "giveSum");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeIsNull() {
            addCriterion("GIVE_ONETIME is null");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeIsNotNull() {
            addCriterion("GIVE_ONETIME is not null");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeEqualTo(BigDecimal value) {
            addCriterion("GIVE_ONETIME =", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeNotEqualTo(BigDecimal value) {
            addCriterion("GIVE_ONETIME <>", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeGreaterThan(BigDecimal value) {
            addCriterion("GIVE_ONETIME >", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GIVE_ONETIME >=", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeLessThan(BigDecimal value) {
            addCriterion("GIVE_ONETIME <", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GIVE_ONETIME <=", value, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeIn(List<BigDecimal> values) {
            addCriterion("GIVE_ONETIME in", values, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeNotIn(List<BigDecimal> values) {
            addCriterion("GIVE_ONETIME not in", values, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIVE_ONETIME between", value1, value2, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andGiveOnetimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIVE_ONETIME not between", value1, value2, "giveOnetime");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(BigDecimal value) {
            addCriterion("VALID_DAYS =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(BigDecimal value) {
            addCriterion("VALID_DAYS <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(BigDecimal value) {
            addCriterion("VALID_DAYS >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_DAYS >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(BigDecimal value) {
            addCriterion("VALID_DAYS <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_DAYS <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<BigDecimal> values) {
            addCriterion("VALID_DAYS in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<BigDecimal> values) {
            addCriterion("VALID_DAYS not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_DAYS between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_DAYS not between", value1, value2, "validDays");
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

        public Criteria andPlanFidIsNull() {
            addCriterion("PLAN_FID is null");
            return (Criteria) this;
        }

        public Criteria andPlanFidIsNotNull() {
            addCriterion("PLAN_FID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanFidEqualTo(BigDecimal value) {
            addCriterion("PLAN_FID =", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidNotEqualTo(BigDecimal value) {
            addCriterion("PLAN_FID <>", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidGreaterThan(BigDecimal value) {
            addCriterion("PLAN_FID >", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_FID >=", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidLessThan(BigDecimal value) {
            addCriterion("PLAN_FID <", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_FID <=", value, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidIn(List<BigDecimal> values) {
            addCriterion("PLAN_FID in", values, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidNotIn(List<BigDecimal> values) {
            addCriterion("PLAN_FID not in", values, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_FID between", value1, value2, "planFid");
            return (Criteria) this;
        }

        public Criteria andPlanFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_FID not between", value1, value2, "planFid");
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
     * T_SCORE_PLANDT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_SCORE_PLANDT 2017-07-05
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