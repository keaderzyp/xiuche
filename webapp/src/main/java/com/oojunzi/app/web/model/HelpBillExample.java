package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HelpBillExample {
    /**
     * T_HELP_BILL
     */
    protected String orderByClause;

    /**
     * T_HELP_BILL
     */
    protected boolean distinct;

    protected String beginTime;
    
	protected String endTime;
	protected String billName;
	protected String status;
	
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	/**
     * T_HELP_BILL
     */
    protected List<Criteria> oredCriteria;

    public HelpBillExample() {
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
     * T_HELP_BILL 2017-07-31
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
        public Criteria andBillidIsNull() {
            addCriterion("BILLID is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("BILLID is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Long value) {
            addCriterion("BILLID =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Long value) {
            addCriterion("BILLID <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Long value) {
            addCriterion("BILLID >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Long value) {
            addCriterion("BILLID >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Long value) {
            addCriterion("BILLID <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Long value) {
            addCriterion("BILLID <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Long> values) {
            addCriterion("BILLID in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Long> values) {
            addCriterion("BILLID not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Long value1, Long value2) {
            addCriterion("BILLID between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Long value1, Long value2) {
            addCriterion("BILLID not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNull() {
            addCriterion("BILLNAME is null");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNotNull() {
            addCriterion("BILLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBillnameEqualTo(String value) {
            addCriterion("BILLNAME =", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotEqualTo(String value) {
            addCriterion("BILLNAME <>", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThan(String value) {
            addCriterion("BILLNAME >", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNAME >=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThan(String value) {
            addCriterion("BILLNAME <", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThanOrEqualTo(String value) {
            addCriterion("BILLNAME <=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLike(String value) {
            addCriterion("BILLNAME like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotLike(String value) {
            addCriterion("BILLNAME not like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameIn(List<String> values) {
            addCriterion("BILLNAME in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotIn(List<String> values) {
            addCriterion("BILLNAME not in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameBetween(String value1, String value2) {
            addCriterion("BILLNAME between", value1, value2, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotBetween(String value1, String value2) {
            addCriterion("BILLNAME not between", value1, value2, "billname");
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

        public Criteria andHelpidIsNull() {
            addCriterion("HELPID is null");
            return (Criteria) this;
        }

        public Criteria andHelpidIsNotNull() {
            addCriterion("HELPID is not null");
            return (Criteria) this;
        }

        public Criteria andHelpidEqualTo(Long value) {
            addCriterion("HELPID =", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotEqualTo(Long value) {
            addCriterion("HELPID <>", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThan(Long value) {
            addCriterion("HELPID >", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThanOrEqualTo(Long value) {
            addCriterion("HELPID >=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThan(Long value) {
            addCriterion("HELPID <", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThanOrEqualTo(Long value) {
            addCriterion("HELPID <=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidIn(List<Long> values) {
            addCriterion("HELPID in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotIn(List<Long> values) {
            addCriterion("HELPID not in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidBetween(Long value1, Long value2) {
            addCriterion("HELPID between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotBetween(Long value1, Long value2) {
            addCriterion("HELPID not between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andTitleidIsNull() {
            addCriterion("TITLEID is null");
            return (Criteria) this;
        }

        public Criteria andTitleidIsNotNull() {
            addCriterion("TITLEID is not null");
            return (Criteria) this;
        }

        public Criteria andTitleidEqualTo(Long value) {
            addCriterion("TITLEID =", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotEqualTo(Long value) {
            addCriterion("TITLEID <>", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidGreaterThan(Long value) {
            addCriterion("TITLEID >", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidGreaterThanOrEqualTo(Long value) {
            addCriterion("TITLEID >=", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidLessThan(Long value) {
            addCriterion("TITLEID <", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidLessThanOrEqualTo(Long value) {
            addCriterion("TITLEID <=", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidIn(List<Long> values) {
            addCriterion("TITLEID in", values, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotIn(List<Long> values) {
            addCriterion("TITLEID not in", values, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidBetween(Long value1, Long value2) {
            addCriterion("TITLEID between", value1, value2, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotBetween(Long value1, Long value2) {
            addCriterion("TITLEID not between", value1, value2, "titleid");
            return (Criteria) this;
        }

        public Criteria andCostdoneIsNull() {
            addCriterion("COSTDONE is null");
            return (Criteria) this;
        }

        public Criteria andCostdoneIsNotNull() {
            addCriterion("COSTDONE is not null");
            return (Criteria) this;
        }

        public Criteria andCostdoneEqualTo(BigDecimal value) {
            addCriterion("COSTDONE =", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneNotEqualTo(BigDecimal value) {
            addCriterion("COSTDONE <>", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneGreaterThan(BigDecimal value) {
            addCriterion("COSTDONE >", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTDONE >=", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneLessThan(BigDecimal value) {
            addCriterion("COSTDONE <", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTDONE <=", value, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneIn(List<BigDecimal> values) {
            addCriterion("COSTDONE in", values, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneNotIn(List<BigDecimal> values) {
            addCriterion("COSTDONE not in", values, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTDONE between", value1, value2, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostdoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTDONE not between", value1, value2, "costdone");
            return (Criteria) this;
        }

        public Criteria andCostundoneIsNull() {
            addCriterion("COSTUNDONE is null");
            return (Criteria) this;
        }

        public Criteria andCostundoneIsNotNull() {
            addCriterion("COSTUNDONE is not null");
            return (Criteria) this;
        }

        public Criteria andCostundoneEqualTo(BigDecimal value) {
            addCriterion("COSTUNDONE =", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneNotEqualTo(BigDecimal value) {
            addCriterion("COSTUNDONE <>", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneGreaterThan(BigDecimal value) {
            addCriterion("COSTUNDONE >", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTUNDONE >=", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneLessThan(BigDecimal value) {
            addCriterion("COSTUNDONE <", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTUNDONE <=", value, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneIn(List<BigDecimal> values) {
            addCriterion("COSTUNDONE in", values, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneNotIn(List<BigDecimal> values) {
            addCriterion("COSTUNDONE not in", values, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTUNDONE between", value1, value2, "costundone");
            return (Criteria) this;
        }

        public Criteria andCostundoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTUNDONE not between", value1, value2, "costundone");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNull() {
            addCriterion("ACCIDENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNotNull() {
            addCriterion("ACCIDENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeEqualTo(String value) {
            addCriterion("ACCIDENTTYPE =", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotEqualTo(String value) {
            addCriterion("ACCIDENTTYPE <>", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThan(String value) {
            addCriterion("ACCIDENTTYPE >", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCIDENTTYPE >=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThan(String value) {
            addCriterion("ACCIDENTTYPE <", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThanOrEqualTo(String value) {
            addCriterion("ACCIDENTTYPE <=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLike(String value) {
            addCriterion("ACCIDENTTYPE like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotLike(String value) {
            addCriterion("ACCIDENTTYPE not like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIn(List<String> values) {
            addCriterion("ACCIDENTTYPE in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotIn(List<String> values) {
            addCriterion("ACCIDENTTYPE not in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeBetween(String value1, String value2) {
            addCriterion("ACCIDENTTYPE between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotBetween(String value1, String value2) {
            addCriterion("ACCIDENTTYPE not between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
        	addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
        	addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
        	addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
        	addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
        	addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
        	addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(Date value) {
        	addCriterionForJDBCDate("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(Date value) {
        	addCriterionForJDBCDate("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
        	addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
        	addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
        	addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
        	addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andTimezoneIsNull() {
            addCriterion("TIMEZONE is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("TIMEZONE is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("TIMEZONE =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("TIMEZONE <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("TIMEZONE >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEZONE >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("TIMEZONE <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("TIMEZONE <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("TIMEZONE like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("TIMEZONE not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("TIMEZONE in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("TIMEZONE not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("TIMEZONE between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("TIMEZONE not between", value1, value2, "timezone");
            return (Criteria) this;
        }
    }

    /**
     * T_HELP_BILL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HELP_BILL 2017-07-31
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