package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HelpInfoExample {
    /**
     * T_HELP_INFO
     */
	protected String type;
    protected String beginTime;
    
   	protected String endTime;
    protected String orderByClause;
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	
    
    /**
     * T_HELP_INFO
     */
    protected boolean distinct;

    /**
     * T_HELP_INFO
     */
    protected List<Criteria> oredCriteria;

    public HelpInfoExample() {
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
     * T_HELP_INFO 2017-07-05
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

        public Criteria andHelpIdIsNull() {
            addCriterion("HELP_ID is null");
            return (Criteria) this;
        }

        public Criteria andHelpIdIsNotNull() {
            addCriterion("HELP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHelpIdEqualTo(BigDecimal value) {
            addCriterion("HELP_ID =", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotEqualTo(BigDecimal value) {
            addCriterion("HELP_ID <>", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdGreaterThan(BigDecimal value) {
            addCriterion("HELP_ID >", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HELP_ID >=", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdLessThan(BigDecimal value) {
            addCriterion("HELP_ID <", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HELP_ID <=", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdIn(List<BigDecimal> values) {
            addCriterion("HELP_ID in", values, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotIn(List<BigDecimal> values) {
            addCriterion("HELP_ID not in", values, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELP_ID between", value1, value2, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HELP_ID not between", value1, value2, "helpId");
            return (Criteria) this;
        }

        public Criteria andIsSpotIsNull() {
            addCriterion("IS_SPOT is null");
            return (Criteria) this;
        }

        public Criteria andIsSpotIsNotNull() {
            addCriterion("IS_SPOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpotEqualTo(String value) {
            addCriterion("IS_SPOT =", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotNotEqualTo(String value) {
            addCriterion("IS_SPOT <>", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotGreaterThan(String value) {
            addCriterion("IS_SPOT >", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SPOT >=", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotLessThan(String value) {
            addCriterion("IS_SPOT <", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotLessThanOrEqualTo(String value) {
            addCriterion("IS_SPOT <=", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotLike(String value) {
            addCriterion("IS_SPOT like", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotNotLike(String value) {
            addCriterion("IS_SPOT not like", value, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotIn(List<String> values) {
            addCriterion("IS_SPOT in", values, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotNotIn(List<String> values) {
            addCriterion("IS_SPOT not in", values, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotBetween(String value1, String value2) {
            addCriterion("IS_SPOT between", value1, value2, "isSpot");
            return (Criteria) this;
        }

        public Criteria andIsSpotNotBetween(String value1, String value2) {
            addCriterion("IS_SPOT not between", value1, value2, "isSpot");
            return (Criteria) this;
        }

        public Criteria andArea1IsNull() {
            addCriterion("AREA1 is null");
            return (Criteria) this;
        }

        public Criteria andArea1IsNotNull() {
            addCriterion("AREA1 is not null");
            return (Criteria) this;
        }

        public Criteria andArea1EqualTo(String value) {
            addCriterion("AREA1 =", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotEqualTo(String value) {
            addCriterion("AREA1 <>", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1GreaterThan(String value) {
            addCriterion("AREA1 >", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1GreaterThanOrEqualTo(String value) {
            addCriterion("AREA1 >=", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1LessThan(String value) {
            addCriterion("AREA1 <", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1LessThanOrEqualTo(String value) {
            addCriterion("AREA1 <=", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1Like(String value) {
            addCriterion("AREA1 like", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotLike(String value) {
            addCriterion("AREA1 not like", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1In(List<String> values) {
            addCriterion("AREA1 in", values, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotIn(List<String> values) {
            addCriterion("AREA1 not in", values, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1Between(String value1, String value2) {
            addCriterion("AREA1 between", value1, value2, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotBetween(String value1, String value2) {
            addCriterion("AREA1 not between", value1, value2, "area1");
            return (Criteria) this;
        }

        public Criteria andArea2IsNull() {
            addCriterion("AREA2 is null");
            return (Criteria) this;
        }

        public Criteria andArea2IsNotNull() {
            addCriterion("AREA2 is not null");
            return (Criteria) this;
        }

        public Criteria andArea2EqualTo(String value) {
            addCriterion("AREA2 =", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotEqualTo(String value) {
            addCriterion("AREA2 <>", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2GreaterThan(String value) {
            addCriterion("AREA2 >", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2GreaterThanOrEqualTo(String value) {
            addCriterion("AREA2 >=", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2LessThan(String value) {
            addCriterion("AREA2 <", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2LessThanOrEqualTo(String value) {
            addCriterion("AREA2 <=", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2Like(String value) {
            addCriterion("AREA2 like", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotLike(String value) {
            addCriterion("AREA2 not like", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2In(List<String> values) {
            addCriterion("AREA2 in", values, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotIn(List<String> values) {
            addCriterion("AREA2 not in", values, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2Between(String value1, String value2) {
            addCriterion("AREA2 between", value1, value2, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotBetween(String value1, String value2) {
            addCriterion("AREA2 not between", value1, value2, "area2");
            return (Criteria) this;
        }

        public Criteria andArea3IsNull() {
            addCriterion("AREA3 is null");
            return (Criteria) this;
        }

        public Criteria andArea3IsNotNull() {
            addCriterion("AREA3 is not null");
            return (Criteria) this;
        }

        public Criteria andArea3EqualTo(String value) {
            addCriterion("AREA3 =", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3NotEqualTo(String value) {
            addCriterion("AREA3 <>", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3GreaterThan(String value) {
            addCriterion("AREA3 >", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3GreaterThanOrEqualTo(String value) {
            addCriterion("AREA3 >=", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3LessThan(String value) {
            addCriterion("AREA3 <", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3LessThanOrEqualTo(String value) {
            addCriterion("AREA3 <=", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3Like(String value) {
            addCriterion("AREA3 like", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3NotLike(String value) {
            addCriterion("AREA3 not like", value, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3In(List<String> values) {
            addCriterion("AREA3 in", values, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3NotIn(List<String> values) {
            addCriterion("AREA3 not in", values, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3Between(String value1, String value2) {
            addCriterion("AREA3 between", value1, value2, "area3");
            return (Criteria) this;
        }

        public Criteria andArea3NotBetween(String value1, String value2) {
            addCriterion("AREA3 not between", value1, value2, "area3");
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

        public Criteria andFactCostIsNull() {
            addCriterion("FACT_COST is null");
            return (Criteria) this;
        }

        public Criteria andFactCostIsNotNull() {
            addCriterion("FACT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andFactCostEqualTo(BigDecimal value) {
            addCriterion("FACT_COST =", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostNotEqualTo(BigDecimal value) {
            addCriterion("FACT_COST <>", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostGreaterThan(BigDecimal value) {
            addCriterion("FACT_COST >", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_COST >=", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostLessThan(BigDecimal value) {
            addCriterion("FACT_COST <", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_COST <=", value, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostIn(List<BigDecimal> values) {
            addCriterion("FACT_COST in", values, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostNotIn(List<BigDecimal> values) {
            addCriterion("FACT_COST not in", values, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_COST between", value1, value2, "factCost");
            return (Criteria) this;
        }

        public Criteria andFactCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_COST not between", value1, value2, "factCost");
            return (Criteria) this;
        }

        public Criteria andGuessFeeIsNull() {
            addCriterion("GUESS_FEE is null");
            return (Criteria) this;
        }

        public Criteria andGuessFeeIsNotNull() {
            addCriterion("GUESS_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andGuessFeeEqualTo(BigDecimal value) {
            addCriterion("GUESS_FEE =", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeNotEqualTo(BigDecimal value) {
            addCriterion("GUESS_FEE <>", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeGreaterThan(BigDecimal value) {
            addCriterion("GUESS_FEE >", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUESS_FEE >=", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeLessThan(BigDecimal value) {
            addCriterion("GUESS_FEE <", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUESS_FEE <=", value, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeIn(List<BigDecimal> values) {
            addCriterion("GUESS_FEE in", values, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeNotIn(List<BigDecimal> values) {
            addCriterion("GUESS_FEE not in", values, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUESS_FEE between", value1, value2, "guessFee");
            return (Criteria) this;
        }

        public Criteria andGuessFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUESS_FEE not between", value1, value2, "guessFee");
            return (Criteria) this;
        }

        public Criteria andOwnerPayIsNull() {
            addCriterion("OWNER_PAY is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPayIsNotNull() {
            addCriterion("OWNER_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPayEqualTo(BigDecimal value) {
            addCriterion("OWNER_PAY =", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayNotEqualTo(BigDecimal value) {
            addCriterion("OWNER_PAY <>", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayGreaterThan(BigDecimal value) {
            addCriterion("OWNER_PAY >", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OWNER_PAY >=", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayLessThan(BigDecimal value) {
            addCriterion("OWNER_PAY <", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OWNER_PAY <=", value, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayIn(List<BigDecimal> values) {
            addCriterion("OWNER_PAY in", values, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayNotIn(List<BigDecimal> values) {
            addCriterion("OWNER_PAY not in", values, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWNER_PAY between", value1, value2, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andOwnerPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWNER_PAY not between", value1, value2, "ownerPay");
            return (Criteria) this;
        }

        public Criteria andCirclePayIsNull() {
            addCriterion("CIRCLE_PAY is null");
            return (Criteria) this;
        }

        public Criteria andCirclePayIsNotNull() {
            addCriterion("CIRCLE_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andCirclePayEqualTo(BigDecimal value) {
            addCriterion("CIRCLE_PAY =", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayNotEqualTo(BigDecimal value) {
            addCriterion("CIRCLE_PAY <>", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayGreaterThan(BigDecimal value) {
            addCriterion("CIRCLE_PAY >", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CIRCLE_PAY >=", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayLessThan(BigDecimal value) {
            addCriterion("CIRCLE_PAY <", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CIRCLE_PAY <=", value, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayIn(List<BigDecimal> values) {
            addCriterion("CIRCLE_PAY in", values, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayNotIn(List<BigDecimal> values) {
            addCriterion("CIRCLE_PAY not in", values, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CIRCLE_PAY between", value1, value2, "circlePay");
            return (Criteria) this;
        }

        public Criteria andCirclePayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CIRCLE_PAY not between", value1, value2, "circlePay");
            return (Criteria) this;
        }

        public Criteria andOoPayIsNull() {
            addCriterion("OO_PAY is null");
            return (Criteria) this;
        }

        public Criteria andOoPayIsNotNull() {
            addCriterion("OO_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andOoPayEqualTo(BigDecimal value) {
            addCriterion("OO_PAY =", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayNotEqualTo(BigDecimal value) {
            addCriterion("OO_PAY <>", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayGreaterThan(BigDecimal value) {
            addCriterion("OO_PAY >", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OO_PAY >=", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayLessThan(BigDecimal value) {
            addCriterion("OO_PAY <", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OO_PAY <=", value, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayIn(List<BigDecimal> values) {
            addCriterion("OO_PAY in", values, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayNotIn(List<BigDecimal> values) {
            addCriterion("OO_PAY not in", values, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OO_PAY between", value1, value2, "ooPay");
            return (Criteria) this;
        }

        public Criteria andOoPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OO_PAY not between", value1, value2, "ooPay");
            return (Criteria) this;
        }

        public Criteria andHelpTimeIsNull() {
            addCriterion("HELP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHelpTimeIsNotNull() {
            addCriterion("HELP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHelpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("HELP_TIME =", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("HELP_TIME <>", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("HELP_TIME >", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HELP_TIME >=", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeLessThan(Date value) {
            addCriterionForJDBCDate("HELP_TIME <", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HELP_TIME <=", value, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("HELP_TIME in", values, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("HELP_TIME not in", values, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HELP_TIME between", value1, value2, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHelpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HELP_TIME not between", value1, value2, "helpTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNull() {
            addCriterion("HAPPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNotNull() {
            addCriterion("HAPPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeEqualTo(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME =", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME <>", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME >", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME >=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThan(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME <", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HAPPEN_TIME <=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIn(List<Date> values) {
            addCriterionForJDBCDate("HAPPEN_TIME in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("HAPPEN_TIME not in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HAPPEN_TIME between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HAPPEN_TIME not between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHelpUserIsNull() {
            addCriterion("HELP_USER is null");
            return (Criteria) this;
        }

        public Criteria andHelpUserIsNotNull() {
            addCriterion("HELP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andHelpUserEqualTo(String value) {
            addCriterion("HELP_USER =", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserNotEqualTo(String value) {
            addCriterion("HELP_USER <>", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserGreaterThan(String value) {
            addCriterion("HELP_USER >", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserGreaterThanOrEqualTo(String value) {
            addCriterion("HELP_USER >=", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserLessThan(String value) {
            addCriterion("HELP_USER <", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserLessThanOrEqualTo(String value) {
            addCriterion("HELP_USER <=", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserLike(String value) {
            addCriterion("HELP_USER like", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserNotLike(String value) {
            addCriterion("HELP_USER not like", value, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserIn(List<String> values) {
            addCriterion("HELP_USER in", values, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserNotIn(List<String> values) {
            addCriterion("HELP_USER not in", values, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserBetween(String value1, String value2) {
            addCriterion("HELP_USER between", value1, value2, "helpUser");
            return (Criteria) this;
        }

        public Criteria andHelpUserNotBetween(String value1, String value2) {
            addCriterion("HELP_USER not between", value1, value2, "helpUser");
            return (Criteria) this;
        }

        public Criteria andServicer2FidIsNull() {
            addCriterion("SERVICER2_FID is null");
            return (Criteria) this;
        }

        public Criteria andServicer2FidIsNotNull() {
            addCriterion("SERVICER2_FID is not null");
            return (Criteria) this;
        }

        public Criteria andServicer2FidEqualTo(BigDecimal value) {
            addCriterion("SERVICER2_FID =", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidNotEqualTo(BigDecimal value) {
            addCriterion("SERVICER2_FID <>", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidGreaterThan(BigDecimal value) {
            addCriterion("SERVICER2_FID >", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER2_FID >=", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidLessThan(BigDecimal value) {
            addCriterion("SERVICER2_FID <", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER2_FID <=", value, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidIn(List<BigDecimal> values) {
            addCriterion("SERVICER2_FID in", values, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidNotIn(List<BigDecimal> values) {
            addCriterion("SERVICER2_FID not in", values, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER2_FID between", value1, value2, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer2FidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER2_FID not between", value1, value2, "servicer2Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidIsNull() {
            addCriterion("SERVICER3_FID is null");
            return (Criteria) this;
        }

        public Criteria andServicer3FidIsNotNull() {
            addCriterion("SERVICER3_FID is not null");
            return (Criteria) this;
        }

        public Criteria andServicer3FidEqualTo(BigDecimal value) {
            addCriterion("SERVICER3_FID =", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidNotEqualTo(BigDecimal value) {
            addCriterion("SERVICER3_FID <>", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidGreaterThan(BigDecimal value) {
            addCriterion("SERVICER3_FID >", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER3_FID >=", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidLessThan(BigDecimal value) {
            addCriterion("SERVICER3_FID <", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER3_FID <=", value, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidIn(List<BigDecimal> values) {
            addCriterion("SERVICER3_FID in", values, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidNotIn(List<BigDecimal> values) {
            addCriterion("SERVICER3_FID not in", values, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER3_FID between", value1, value2, "servicer3Fid");
            return (Criteria) this;
        }

        public Criteria andServicer3FidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER3_FID not between", value1, value2, "servicer3Fid");
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

        public Criteria andHavePayIsNull() {
            addCriterion("HAVE_PAY is null");
            return (Criteria) this;
        }

        public Criteria andHavePayIsNotNull() {
            addCriterion("HAVE_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andHavePayEqualTo(BigDecimal value) {
            addCriterion("HAVE_PAY =", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayNotEqualTo(BigDecimal value) {
            addCriterion("HAVE_PAY <>", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayGreaterThan(BigDecimal value) {
            addCriterion("HAVE_PAY >", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HAVE_PAY >=", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayLessThan(BigDecimal value) {
            addCriterion("HAVE_PAY <", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HAVE_PAY <=", value, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayIn(List<BigDecimal> values) {
            addCriterion("HAVE_PAY in", values, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayNotIn(List<BigDecimal> values) {
            addCriterion("HAVE_PAY not in", values, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HAVE_PAY between", value1, value2, "havePay");
            return (Criteria) this;
        }

        public Criteria andHavePayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HAVE_PAY not between", value1, value2, "havePay");
            return (Criteria) this;
        }

        public Criteria andCarFidIsNull() {
            addCriterion("CAR_FID is null");
            return (Criteria) this;
        }

        public Criteria andCarFidIsNotNull() {
            addCriterion("CAR_FID is not null");
            return (Criteria) this;
        }

        public Criteria andCarFidEqualTo(BigDecimal value) {
            addCriterion("CAR_FID =", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidNotEqualTo(BigDecimal value) {
            addCriterion("CAR_FID <>", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidGreaterThan(BigDecimal value) {
            addCriterion("CAR_FID >", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_FID >=", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidLessThan(BigDecimal value) {
            addCriterion("CAR_FID <", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_FID <=", value, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidIn(List<BigDecimal> values) {
            addCriterion("CAR_FID in", values, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidNotIn(List<BigDecimal> values) {
            addCriterion("CAR_FID not in", values, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_FID between", value1, value2, "carFid");
            return (Criteria) this;
        }

        public Criteria andCarFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_FID not between", value1, value2, "carFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidIsNull() {
            addCriterion("SERVICER_FID is null");
            return (Criteria) this;
        }

        public Criteria andServicerFidIsNotNull() {
            addCriterion("SERVICER_FID is not null");
            return (Criteria) this;
        }

        public Criteria andServicerFidEqualTo(BigDecimal value) {
            addCriterion("SERVICER_FID =", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidNotEqualTo(BigDecimal value) {
            addCriterion("SERVICER_FID <>", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidGreaterThan(BigDecimal value) {
            addCriterion("SERVICER_FID >", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER_FID >=", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidLessThan(BigDecimal value) {
            addCriterion("SERVICER_FID <", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICER_FID <=", value, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidIn(List<BigDecimal> values) {
            addCriterion("SERVICER_FID in", values, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidNotIn(List<BigDecimal> values) {
            addCriterion("SERVICER_FID not in", values, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER_FID between", value1, value2, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andServicerFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICER_FID not between", value1, value2, "servicerFid");
            return (Criteria) this;
        }

        public Criteria andHappenPositionIsNull() {
            addCriterion("HAPPEN_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andHappenPositionIsNotNull() {
            addCriterion("HAPPEN_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andHappenPositionEqualTo(String value) {
            addCriterion("HAPPEN_POSITION =", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionNotEqualTo(String value) {
            addCriterion("HAPPEN_POSITION <>", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionGreaterThan(String value) {
            addCriterion("HAPPEN_POSITION >", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionGreaterThanOrEqualTo(String value) {
            addCriterion("HAPPEN_POSITION >=", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionLessThan(String value) {
            addCriterion("HAPPEN_POSITION <", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionLessThanOrEqualTo(String value) {
            addCriterion("HAPPEN_POSITION <=", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionLike(String value) {
            addCriterion("HAPPEN_POSITION like", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionNotLike(String value) {
            addCriterion("HAPPEN_POSITION not like", value, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionIn(List<String> values) {
            addCriterion("HAPPEN_POSITION in", values, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionNotIn(List<String> values) {
            addCriterion("HAPPEN_POSITION not in", values, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionBetween(String value1, String value2) {
            addCriterion("HAPPEN_POSITION between", value1, value2, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andHappenPositionNotBetween(String value1, String value2) {
            addCriterion("HAPPEN_POSITION not between", value1, value2, "happenPosition");
            return (Criteria) this;
        }

        public Criteria andGuessCostIsNull() {
            addCriterion("GUESS_COST is null");
            return (Criteria) this;
        }

        public Criteria andGuessCostIsNotNull() {
            addCriterion("GUESS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andGuessCostEqualTo(String value) {
            addCriterion("GUESS_COST =", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostNotEqualTo(String value) {
            addCriterion("GUESS_COST <>", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostGreaterThan(String value) {
            addCriterion("GUESS_COST >", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostGreaterThanOrEqualTo(String value) {
            addCriterion("GUESS_COST >=", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostLessThan(String value) {
            addCriterion("GUESS_COST <", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostLessThanOrEqualTo(String value) {
            addCriterion("GUESS_COST <=", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostLike(String value) {
            addCriterion("GUESS_COST like", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostNotLike(String value) {
            addCriterion("GUESS_COST not like", value, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostIn(List<String> values) {
            addCriterion("GUESS_COST in", values, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostNotIn(List<String> values) {
            addCriterion("GUESS_COST not in", values, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostBetween(String value1, String value2) {
            addCriterion("GUESS_COST between", value1, value2, "guessCost");
            return (Criteria) this;
        }

        public Criteria andGuessCostNotBetween(String value1, String value2) {
            addCriterion("GUESS_COST not between", value1, value2, "guessCost");
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
     * T_HELP_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HELP_INFO 2017-07-05
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