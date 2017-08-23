package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserWeatherExample {
    /**
     * T_USER_WEATHER
     */
    protected String orderByClause;

    /**
     * T_USER_WEATHER
     */
    protected boolean distinct;

    /**
     * T_USER_WEATHER
     */
    protected List<Criteria> oredCriteria;

    public UserWeatherExample() {
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
     * T_USER_WEATHER 2017-08-03
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSuccFlagIsNull() {
            addCriterion("SUCC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSuccFlagIsNotNull() {
            addCriterion("SUCC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSuccFlagEqualTo(String value) {
            addCriterion("SUCC_FLAG =", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagNotEqualTo(String value) {
            addCriterion("SUCC_FLAG <>", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagGreaterThan(String value) {
            addCriterion("SUCC_FLAG >", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SUCC_FLAG >=", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagLessThan(String value) {
            addCriterion("SUCC_FLAG <", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagLessThanOrEqualTo(String value) {
            addCriterion("SUCC_FLAG <=", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagLike(String value) {
            addCriterion("SUCC_FLAG like", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagNotLike(String value) {
            addCriterion("SUCC_FLAG not like", value, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagIn(List<String> values) {
            addCriterion("SUCC_FLAG in", values, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagNotIn(List<String> values) {
            addCriterion("SUCC_FLAG not in", values, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagBetween(String value1, String value2) {
            addCriterion("SUCC_FLAG between", value1, value2, "succFlag");
            return (Criteria) this;
        }

        public Criteria andSuccFlagNotBetween(String value1, String value2) {
            addCriterion("SUCC_FLAG not between", value1, value2, "succFlag");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("CITY_ID like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("CITY_ID not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andHappydateIsNull() {
            addCriterion("HAPPYDATE is null");
            return (Criteria) this;
        }

        public Criteria andHappydateIsNotNull() {
            addCriterion("HAPPYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHappydateEqualTo(String value) {
            addCriterion("HAPPYDATE =", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateNotEqualTo(String value) {
            addCriterion("HAPPYDATE <>", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateGreaterThan(String value) {
            addCriterion("HAPPYDATE >", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateGreaterThanOrEqualTo(String value) {
            addCriterion("HAPPYDATE >=", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateLessThan(String value) {
            addCriterion("HAPPYDATE <", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateLessThanOrEqualTo(String value) {
            addCriterion("HAPPYDATE <=", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateLike(String value) {
            addCriterion("HAPPYDATE like", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateNotLike(String value) {
            addCriterion("HAPPYDATE not like", value, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateIn(List<String> values) {
            addCriterion("HAPPYDATE in", values, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateNotIn(List<String> values) {
            addCriterion("HAPPYDATE not in", values, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateBetween(String value1, String value2) {
            addCriterion("HAPPYDATE between", value1, value2, "happydate");
            return (Criteria) this;
        }

        public Criteria andHappydateNotBetween(String value1, String value2) {
            addCriterion("HAPPYDATE not between", value1, value2, "happydate");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("WEATHER is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("WEATHER is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("WEATHER =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("WEATHER <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("WEATHER >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("WEATHER >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("WEATHER <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("WEATHER <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("WEATHER like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("WEATHER not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("WEATHER in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("WEATHER not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("WEATHER between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("WEATHER not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("TEMP is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("TEMP =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("TEMP <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("TEMP >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("TEMP <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("TEMP <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("TEMP like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("TEMP not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("TEMP in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("TEMP not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("TEMP between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("TEMP not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTemphighIsNull() {
            addCriterion("TEMPHIGH is null");
            return (Criteria) this;
        }

        public Criteria andTemphighIsNotNull() {
            addCriterion("TEMPHIGH is not null");
            return (Criteria) this;
        }

        public Criteria andTemphighEqualTo(String value) {
            addCriterion("TEMPHIGH =", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighNotEqualTo(String value) {
            addCriterion("TEMPHIGH <>", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighGreaterThan(String value) {
            addCriterion("TEMPHIGH >", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPHIGH >=", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighLessThan(String value) {
            addCriterion("TEMPHIGH <", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighLessThanOrEqualTo(String value) {
            addCriterion("TEMPHIGH <=", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighLike(String value) {
            addCriterion("TEMPHIGH like", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighNotLike(String value) {
            addCriterion("TEMPHIGH not like", value, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighIn(List<String> values) {
            addCriterion("TEMPHIGH in", values, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighNotIn(List<String> values) {
            addCriterion("TEMPHIGH not in", values, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighBetween(String value1, String value2) {
            addCriterion("TEMPHIGH between", value1, value2, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemphighNotBetween(String value1, String value2) {
            addCriterion("TEMPHIGH not between", value1, value2, "temphigh");
            return (Criteria) this;
        }

        public Criteria andTemplowIsNull() {
            addCriterion("TEMPLOW is null");
            return (Criteria) this;
        }

        public Criteria andTemplowIsNotNull() {
            addCriterion("TEMPLOW is not null");
            return (Criteria) this;
        }

        public Criteria andTemplowEqualTo(String value) {
            addCriterion("TEMPLOW =", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowNotEqualTo(String value) {
            addCriterion("TEMPLOW <>", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowGreaterThan(String value) {
            addCriterion("TEMPLOW >", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLOW >=", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowLessThan(String value) {
            addCriterion("TEMPLOW <", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowLessThanOrEqualTo(String value) {
            addCriterion("TEMPLOW <=", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowLike(String value) {
            addCriterion("TEMPLOW like", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowNotLike(String value) {
            addCriterion("TEMPLOW not like", value, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowIn(List<String> values) {
            addCriterion("TEMPLOW in", values, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowNotIn(List<String> values) {
            addCriterion("TEMPLOW not in", values, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowBetween(String value1, String value2) {
            addCriterion("TEMPLOW between", value1, value2, "templow");
            return (Criteria) this;
        }

        public Criteria andTemplowNotBetween(String value1, String value2) {
            addCriterion("TEMPLOW not between", value1, value2, "templow");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayIsNull() {
            addCriterion("PM2P5DAY is null");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayIsNotNull() {
            addCriterion("PM2P5DAY is not null");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayEqualTo(String value) {
            addCriterion("PM2P5DAY =", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayNotEqualTo(String value) {
            addCriterion("PM2P5DAY <>", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayGreaterThan(String value) {
            addCriterion("PM2P5DAY >", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayGreaterThanOrEqualTo(String value) {
            addCriterion("PM2P5DAY >=", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayLessThan(String value) {
            addCriterion("PM2P5DAY <", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayLessThanOrEqualTo(String value) {
            addCriterion("PM2P5DAY <=", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayLike(String value) {
            addCriterion("PM2P5DAY like", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayNotLike(String value) {
            addCriterion("PM2P5DAY not like", value, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayIn(List<String> values) {
            addCriterion("PM2P5DAY in", values, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayNotIn(List<String> values) {
            addCriterion("PM2P5DAY not in", values, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayBetween(String value1, String value2) {
            addCriterion("PM2P5DAY between", value1, value2, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5dayNotBetween(String value1, String value2) {
            addCriterion("PM2P5DAY not between", value1, value2, "pm2p5day");
            return (Criteria) this;
        }

        public Criteria andPm2p5IsNull() {
            addCriterion("PM2P5 is null");
            return (Criteria) this;
        }

        public Criteria andPm2p5IsNotNull() {
            addCriterion("PM2P5 is not null");
            return (Criteria) this;
        }

        public Criteria andPm2p5EqualTo(String value) {
            addCriterion("PM2P5 =", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5NotEqualTo(String value) {
            addCriterion("PM2P5 <>", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5GreaterThan(String value) {
            addCriterion("PM2P5 >", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5GreaterThanOrEqualTo(String value) {
            addCriterion("PM2P5 >=", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5LessThan(String value) {
            addCriterion("PM2P5 <", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5LessThanOrEqualTo(String value) {
            addCriterion("PM2P5 <=", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5Like(String value) {
            addCriterion("PM2P5 like", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5NotLike(String value) {
            addCriterion("PM2P5 not like", value, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5In(List<String> values) {
            addCriterion("PM2P5 in", values, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5NotIn(List<String> values) {
            addCriterion("PM2P5 not in", values, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5Between(String value1, String value2) {
            addCriterion("PM2P5 between", value1, value2, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andPm2p5NotBetween(String value1, String value2) {
            addCriterion("PM2P5 not between", value1, value2, "pm2p5");
            return (Criteria) this;
        }

        public Criteria andAffectIsNull() {
            addCriterion("AFFECT is null");
            return (Criteria) this;
        }

        public Criteria andAffectIsNotNull() {
            addCriterion("AFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andAffectEqualTo(String value) {
            addCriterion("AFFECT =", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectNotEqualTo(String value) {
            addCriterion("AFFECT <>", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectGreaterThan(String value) {
            addCriterion("AFFECT >", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectGreaterThanOrEqualTo(String value) {
            addCriterion("AFFECT >=", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectLessThan(String value) {
            addCriterion("AFFECT <", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectLessThanOrEqualTo(String value) {
            addCriterion("AFFECT <=", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectLike(String value) {
            addCriterion("AFFECT like", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectNotLike(String value) {
            addCriterion("AFFECT not like", value, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectIn(List<String> values) {
            addCriterion("AFFECT in", values, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectNotIn(List<String> values) {
            addCriterion("AFFECT not in", values, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectBetween(String value1, String value2) {
            addCriterion("AFFECT between", value1, value2, "affect");
            return (Criteria) this;
        }

        public Criteria andAffectNotBetween(String value1, String value2) {
            addCriterion("AFFECT not between", value1, value2, "affect");
            return (Criteria) this;
        }

        public Criteria andWeatImgIsNull() {
            addCriterion("WEAT_IMG is null");
            return (Criteria) this;
        }

        public Criteria andWeatImgIsNotNull() {
            addCriterion("WEAT_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andWeatImgEqualTo(String value) {
            addCriterion("WEAT_IMG =", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgNotEqualTo(String value) {
            addCriterion("WEAT_IMG <>", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgGreaterThan(String value) {
            addCriterion("WEAT_IMG >", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgGreaterThanOrEqualTo(String value) {
            addCriterion("WEAT_IMG >=", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgLessThan(String value) {
            addCriterion("WEAT_IMG <", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgLessThanOrEqualTo(String value) {
            addCriterion("WEAT_IMG <=", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgLike(String value) {
            addCriterion("WEAT_IMG like", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgNotLike(String value) {
            addCriterion("WEAT_IMG not like", value, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgIn(List<String> values) {
            addCriterion("WEAT_IMG in", values, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgNotIn(List<String> values) {
            addCriterion("WEAT_IMG not in", values, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgBetween(String value1, String value2) {
            addCriterion("WEAT_IMG between", value1, value2, "weatImg");
            return (Criteria) this;
        }

        public Criteria andWeatImgNotBetween(String value1, String value2) {
            addCriterion("WEAT_IMG not between", value1, value2, "weatImg");
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

        public Criteria andParam5EqualTo(BigDecimal value) {
            addCriterion("PARAM5 =", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotEqualTo(BigDecimal value) {
            addCriterion("PARAM5 <>", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThan(BigDecimal value) {
            addCriterion("PARAM5 >", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM5 >=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThan(BigDecimal value) {
            addCriterion("PARAM5 <", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM5 <=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5In(List<BigDecimal> values) {
            addCriterion("PARAM5 in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotIn(List<BigDecimal> values) {
            addCriterion("PARAM5 not in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM5 between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM5 not between", value1, value2, "param5");
            return (Criteria) this;
        }
    }

    /**
     * T_USER_WEATHER
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_USER_WEATHER 2017-08-03
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