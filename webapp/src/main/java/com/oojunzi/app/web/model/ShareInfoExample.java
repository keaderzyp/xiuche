package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShareInfoExample {
    /**
     * T_SHARE_INFO
     */
    protected String orderByClause;

    /**
     * T_SHARE_INFO
     */
    protected boolean distinct;

    /**
     * T_SHARE_INFO
     */
    protected List<Criteria> oredCriteria;

    public ShareInfoExample() {
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
     * T_SHARE_INFO 2017-07-05
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

        public Criteria andShareIdIsNull() {
            addCriterion("SHARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNotNull() {
            addCriterion("SHARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(BigDecimal value) {
            addCriterion("SHARE_ID =", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualTo(BigDecimal value) {
            addCriterion("SHARE_ID <>", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThan(BigDecimal value) {
            addCriterion("SHARE_ID >", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHARE_ID >=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThan(BigDecimal value) {
            addCriterion("SHARE_ID <", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHARE_ID <=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<BigDecimal> values) {
            addCriterion("SHARE_ID in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotIn(List<BigDecimal> values) {
            addCriterion("SHARE_ID not in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHARE_ID between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHARE_ID not between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSimpleDescIsNull() {
            addCriterion("SIMPLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSimpleDescIsNotNull() {
            addCriterion("SIMPLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleDescEqualTo(String value) {
            addCriterion("SIMPLE_DESC =", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescNotEqualTo(String value) {
            addCriterion("SIMPLE_DESC <>", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescGreaterThan(String value) {
            addCriterion("SIMPLE_DESC >", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescGreaterThanOrEqualTo(String value) {
            addCriterion("SIMPLE_DESC >=", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescLessThan(String value) {
            addCriterion("SIMPLE_DESC <", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescLessThanOrEqualTo(String value) {
            addCriterion("SIMPLE_DESC <=", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescLike(String value) {
            addCriterion("SIMPLE_DESC like", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescNotLike(String value) {
            addCriterion("SIMPLE_DESC not like", value, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescIn(List<String> values) {
            addCriterion("SIMPLE_DESC in", values, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescNotIn(List<String> values) {
            addCriterion("SIMPLE_DESC not in", values, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescBetween(String value1, String value2) {
            addCriterion("SIMPLE_DESC between", value1, value2, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andSimpleDescNotBetween(String value1, String value2) {
            addCriterion("SIMPLE_DESC not between", value1, value2, "simpleDesc");
            return (Criteria) this;
        }

        public Criteria andShareTypeIsNull() {
            addCriterion("SHARE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShareTypeIsNotNull() {
            addCriterion("SHARE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShareTypeEqualTo(String value) {
            addCriterion("SHARE_TYPE =", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotEqualTo(String value) {
            addCriterion("SHARE_TYPE <>", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeGreaterThan(String value) {
            addCriterion("SHARE_TYPE >", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE >=", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLessThan(String value) {
            addCriterion("SHARE_TYPE <", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLessThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE <=", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLike(String value) {
            addCriterion("SHARE_TYPE like", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotLike(String value) {
            addCriterion("SHARE_TYPE not like", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeIn(List<String> values) {
            addCriterion("SHARE_TYPE in", values, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotIn(List<String> values) {
            addCriterion("SHARE_TYPE not in", values, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE between", value1, value2, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE not between", value1, value2, "shareType");
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

        public Criteria andShareIcoIsNull() {
            addCriterion("SHARE_ICO is null");
            return (Criteria) this;
        }

        public Criteria andShareIcoIsNotNull() {
            addCriterion("SHARE_ICO is not null");
            return (Criteria) this;
        }

        public Criteria andShareIcoEqualTo(String value) {
            addCriterion("SHARE_ICO =", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoNotEqualTo(String value) {
            addCriterion("SHARE_ICO <>", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoGreaterThan(String value) {
            addCriterion("SHARE_ICO >", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_ICO >=", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoLessThan(String value) {
            addCriterion("SHARE_ICO <", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoLessThanOrEqualTo(String value) {
            addCriterion("SHARE_ICO <=", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoLike(String value) {
            addCriterion("SHARE_ICO like", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoNotLike(String value) {
            addCriterion("SHARE_ICO not like", value, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoIn(List<String> values) {
            addCriterion("SHARE_ICO in", values, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoNotIn(List<String> values) {
            addCriterion("SHARE_ICO not in", values, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoBetween(String value1, String value2) {
            addCriterion("SHARE_ICO between", value1, value2, "shareIco");
            return (Criteria) this;
        }

        public Criteria andShareIcoNotBetween(String value1, String value2) {
            addCriterion("SHARE_ICO not between", value1, value2, "shareIco");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNull() {
            addCriterion("KEY_WORD is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNotNull() {
            addCriterion("KEY_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordEqualTo(String value) {
            addCriterion("KEY_WORD =", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotEqualTo(String value) {
            addCriterion("KEY_WORD <>", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThan(String value) {
            addCriterion("KEY_WORD >", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_WORD >=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThan(String value) {
            addCriterion("KEY_WORD <", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThanOrEqualTo(String value) {
            addCriterion("KEY_WORD <=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLike(String value) {
            addCriterion("KEY_WORD like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotLike(String value) {
            addCriterion("KEY_WORD not like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordIn(List<String> values) {
            addCriterion("KEY_WORD in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotIn(List<String> values) {
            addCriterion("KEY_WORD not in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordBetween(String value1, String value2) {
            addCriterion("KEY_WORD between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotBetween(String value1, String value2) {
            addCriterion("KEY_WORD not between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIsNull() {
            addCriterion("WECHAT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIsNotNull() {
            addCriterion("WECHAT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNumberEqualTo(String value) {
            addCriterion("WECHAT_NUMBER =", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotEqualTo(String value) {
            addCriterion("WECHAT_NUMBER <>", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberGreaterThan(String value) {
            addCriterion("WECHAT_NUMBER >", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_NUMBER >=", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLessThan(String value) {
            addCriterion("WECHAT_NUMBER <", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_NUMBER <=", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberLike(String value) {
            addCriterion("WECHAT_NUMBER like", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotLike(String value) {
            addCriterion("WECHAT_NUMBER not like", value, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberIn(List<String> values) {
            addCriterion("WECHAT_NUMBER in", values, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotIn(List<String> values) {
            addCriterion("WECHAT_NUMBER not in", values, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberBetween(String value1, String value2) {
            addCriterion("WECHAT_NUMBER between", value1, value2, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andWechatNumberNotBetween(String value1, String value2) {
            addCriterion("WECHAT_NUMBER not between", value1, value2, "wechatNumber");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("SHARE_URL is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("SHARE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("SHARE_URL =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("SHARE_URL <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("SHARE_URL >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_URL >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("SHARE_URL <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("SHARE_URL <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("SHARE_URL like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("SHARE_URL not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("SHARE_URL in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("SHARE_URL not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("SHARE_URL between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("SHARE_URL not between", value1, value2, "shareUrl");
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

        public Criteria andSharerNameIsNull() {
            addCriterion("SHARER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSharerNameIsNotNull() {
            addCriterion("SHARER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSharerNameEqualTo(String value) {
            addCriterion("SHARER_NAME =", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameNotEqualTo(String value) {
            addCriterion("SHARER_NAME <>", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameGreaterThan(String value) {
            addCriterion("SHARER_NAME >", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHARER_NAME >=", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameLessThan(String value) {
            addCriterion("SHARER_NAME <", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameLessThanOrEqualTo(String value) {
            addCriterion("SHARER_NAME <=", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameLike(String value) {
            addCriterion("SHARER_NAME like", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameNotLike(String value) {
            addCriterion("SHARER_NAME not like", value, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameIn(List<String> values) {
            addCriterion("SHARER_NAME in", values, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameNotIn(List<String> values) {
            addCriterion("SHARER_NAME not in", values, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameBetween(String value1, String value2) {
            addCriterion("SHARER_NAME between", value1, value2, "sharerName");
            return (Criteria) this;
        }

        public Criteria andSharerNameNotBetween(String value1, String value2) {
            addCriterion("SHARER_NAME not between", value1, value2, "sharerName");
            return (Criteria) this;
        }

        public Criteria andUserFidIsNull() {
            addCriterion("USER_FID is null");
            return (Criteria) this;
        }

        public Criteria andUserFidIsNotNull() {
            addCriterion("USER_FID is not null");
            return (Criteria) this;
        }

        public Criteria andUserFidEqualTo(BigDecimal value) {
            addCriterion("USER_FID =", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotEqualTo(BigDecimal value) {
            addCriterion("USER_FID <>", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidGreaterThan(BigDecimal value) {
            addCriterion("USER_FID >", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_FID >=", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidLessThan(BigDecimal value) {
            addCriterion("USER_FID <", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_FID <=", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidIn(List<BigDecimal> values) {
            addCriterion("USER_FID in", values, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotIn(List<BigDecimal> values) {
            addCriterion("USER_FID not in", values, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_FID between", value1, value2, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_FID not between", value1, value2, "userFid");
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
     * T_SHARE_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_SHARE_INFO 2017-07-05
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