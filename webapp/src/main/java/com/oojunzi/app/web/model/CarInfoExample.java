package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarInfoExample {
	
	 	protected String beginTime;
	    
		protected String endTime;
		
		protected String platenum;
		
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

		public String getPlatenum() {
			return platenum;
		}

		public void setPlatenum(String platenum) {
			this.platenum = platenum;
		}

    /**
     * T_CAR_INFO
     */
    protected String orderByClause;

    /**
     * T_CAR_INFO
     */
    protected boolean distinct;

    /**
     * T_CAR_INFO
     */
    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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
     * T_CAR_INFO 2017-07-14
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("PLATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("PLATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("PLATE_NUMBER =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("PLATE_NUMBER <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("PLATE_NUMBER >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PLATE_NUMBER >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("PLATE_NUMBER <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("PLATE_NUMBER <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("PLATE_NUMBER like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("PLATE_NUMBER not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("PLATE_NUMBER in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("PLATE_NUMBER not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("PLATE_NUMBER between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("PLATE_NUMBER not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNull() {
            addCriterion("BRAND_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNotNull() {
            addCriterion("BRAND_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andBrandModelEqualTo(String value) {
            addCriterion("BRAND_MODEL =", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotEqualTo(String value) {
            addCriterion("BRAND_MODEL <>", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThan(String value) {
            addCriterion("BRAND_MODEL >", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_MODEL >=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThan(String value) {
            addCriterion("BRAND_MODEL <", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThanOrEqualTo(String value) {
            addCriterion("BRAND_MODEL <=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLike(String value) {
            addCriterion("BRAND_MODEL like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotLike(String value) {
            addCriterion("BRAND_MODEL not like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelIn(List<String> values) {
            addCriterion("BRAND_MODEL in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotIn(List<String> values) {
            addCriterion("BRAND_MODEL not in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelBetween(String value1, String value2) {
            addCriterion("BRAND_MODEL between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotBetween(String value1, String value2) {
            addCriterion("BRAND_MODEL not between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeIsNull() {
            addCriterion("VEHICLE_IDENTIFICATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeIsNotNull() {
            addCriterion("VEHICLE_IDENTIFICATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeEqualTo(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE =", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE <>", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeGreaterThan(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE >", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE >=", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeLessThan(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE <", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE <=", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeLike(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE like", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeNotLike(String value) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE not like", value, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeIn(List<String> values) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE in", values, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE not in", values, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE between", value1, value2, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andVehicleIdentificationCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_IDENTIFICATION_CODE not between", value1, value2, "vehicleIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNull() {
            addCriterion("ENGINE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNotNull() {
            addCriterion("ENGINE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeEqualTo(String value) {
            addCriterion("ENGINE_TYPE =", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotEqualTo(String value) {
            addCriterion("ENGINE_TYPE <>", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThan(String value) {
            addCriterion("ENGINE_TYPE >", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_TYPE >=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThan(String value) {
            addCriterion("ENGINE_TYPE <", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_TYPE <=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLike(String value) {
            addCriterion("ENGINE_TYPE like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotLike(String value) {
            addCriterion("ENGINE_TYPE not like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIn(List<String> values) {
            addCriterion("ENGINE_TYPE in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotIn(List<String> values) {
            addCriterion("ENGINE_TYPE not in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeBetween(String value1, String value2) {
            addCriterion("ENGINE_TYPE between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotBetween(String value1, String value2) {
            addCriterion("ENGINE_TYPE not between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageIsNull() {
            addCriterion("DRIVING_LICENSE_HOMEPAGE is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageIsNotNull() {
            addCriterion("DRIVING_LICENSE_HOMEPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE =", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageNotEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE <>", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageGreaterThan(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE >", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE >=", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageLessThan(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE <", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageLessThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE <=", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageLike(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE like", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageNotLike(String value) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE not like", value, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE in", values, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageNotIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE not in", values, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE between", value1, value2, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseHomepageNotBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_HOMEPAGE not between", value1, value2, "drivingLicenseHomepage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageIsNull() {
            addCriterion("DRIVING_LICENSE_VICE_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageIsNotNull() {
            addCriterion("DRIVING_LICENSE_VICE_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE =", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageNotEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE <>", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageGreaterThan(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE >", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE >=", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageLessThan(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE <", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageLessThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE <=", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageLike(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE like", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageNotLike(String value) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE not like", value, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE in", values, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageNotIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE not in", values, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE between", value1, value2, "drivingLicenseVicePage");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseVicePageNotBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_VICE_PAGE not between", value1, value2, "drivingLicenseVicePage");
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

        public Criteria andLevelIdIsNull() {
            addCriterion("LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(String value) {
            addCriterion("LEVEL_ID =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(String value) {
            addCriterion("LEVEL_ID <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(String value) {
            addCriterion("LEVEL_ID >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(String value) {
            addCriterion("LEVEL_ID <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLike(String value) {
            addCriterion("LEVEL_ID like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotLike(String value) {
            addCriterion("LEVEL_ID not like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<String> values) {
            addCriterion("LEVEL_ID in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<String> values) {
            addCriterion("LEVEL_ID not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(String value1, String value2) {
            addCriterion("LEVEL_ID between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(String value1, String value2) {
            addCriterion("LEVEL_ID not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinnfIsNull() {
            addCriterion("VINNF is null");
            return (Criteria) this;
        }

        public Criteria andVinnfIsNotNull() {
            addCriterion("VINNF is not null");
            return (Criteria) this;
        }

        public Criteria andVinnfEqualTo(String value) {
            addCriterion("VINNF =", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfNotEqualTo(String value) {
            addCriterion("VINNF <>", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfGreaterThan(String value) {
            addCriterion("VINNF >", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfGreaterThanOrEqualTo(String value) {
            addCriterion("VINNF >=", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfLessThan(String value) {
            addCriterion("VINNF <", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfLessThanOrEqualTo(String value) {
            addCriterion("VINNF <=", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfLike(String value) {
            addCriterion("VINNF like", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfNotLike(String value) {
            addCriterion("VINNF not like", value, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfIn(List<String> values) {
            addCriterion("VINNF in", values, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfNotIn(List<String> values) {
            addCriterion("VINNF not in", values, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfBetween(String value1, String value2) {
            addCriterion("VINNF between", value1, value2, "vinnf");
            return (Criteria) this;
        }

        public Criteria andVinnfNotBetween(String value1, String value2) {
            addCriterion("VINNF not between", value1, value2, "vinnf");
            return (Criteria) this;
        }

        public Criteria andCjmcIsNull() {
            addCriterion("CJMC is null");
            return (Criteria) this;
        }

        public Criteria andCjmcIsNotNull() {
            addCriterion("CJMC is not null");
            return (Criteria) this;
        }

        public Criteria andCjmcEqualTo(String value) {
            addCriterion("CJMC =", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotEqualTo(String value) {
            addCriterion("CJMC <>", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcGreaterThan(String value) {
            addCriterion("CJMC >", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcGreaterThanOrEqualTo(String value) {
            addCriterion("CJMC >=", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLessThan(String value) {
            addCriterion("CJMC <", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLessThanOrEqualTo(String value) {
            addCriterion("CJMC <=", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLike(String value) {
            addCriterion("CJMC like", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotLike(String value) {
            addCriterion("CJMC not like", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcIn(List<String> values) {
            addCriterion("CJMC in", values, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotIn(List<String> values) {
            addCriterion("CJMC not in", values, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcBetween(String value1, String value2) {
            addCriterion("CJMC between", value1, value2, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotBetween(String value1, String value2) {
            addCriterion("CJMC not between", value1, value2, "cjmc");
            return (Criteria) this;
        }

        public Criteria andPpIsNull() {
            addCriterion("PP is null");
            return (Criteria) this;
        }

        public Criteria andPpIsNotNull() {
            addCriterion("PP is not null");
            return (Criteria) this;
        }

        public Criteria andPpEqualTo(String value) {
            addCriterion("PP =", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotEqualTo(String value) {
            addCriterion("PP <>", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpGreaterThan(String value) {
            addCriterion("PP >", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpGreaterThanOrEqualTo(String value) {
            addCriterion("PP >=", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLessThan(String value) {
            addCriterion("PP <", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLessThanOrEqualTo(String value) {
            addCriterion("PP <=", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLike(String value) {
            addCriterion("PP like", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotLike(String value) {
            addCriterion("PP not like", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpIn(List<String> values) {
            addCriterion("PP in", values, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotIn(List<String> values) {
            addCriterion("PP not in", values, "pp");
            return (Criteria) this;
        }

        public Criteria andPpBetween(String value1, String value2) {
            addCriterion("PP between", value1, value2, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotBetween(String value1, String value2) {
            addCriterion("PP not between", value1, value2, "pp");
            return (Criteria) this;
        }

        public Criteria andCxIsNull() {
            addCriterion("CX is null");
            return (Criteria) this;
        }

        public Criteria andCxIsNotNull() {
            addCriterion("CX is not null");
            return (Criteria) this;
        }

        public Criteria andCxEqualTo(String value) {
            addCriterion("CX =", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotEqualTo(String value) {
            addCriterion("CX <>", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxGreaterThan(String value) {
            addCriterion("CX >", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxGreaterThanOrEqualTo(String value) {
            addCriterion("CX >=", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLessThan(String value) {
            addCriterion("CX <", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLessThanOrEqualTo(String value) {
            addCriterion("CX <=", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLike(String value) {
            addCriterion("CX like", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotLike(String value) {
            addCriterion("CX not like", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxIn(List<String> values) {
            addCriterion("CX in", values, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotIn(List<String> values) {
            addCriterion("CX not in", values, "cx");
            return (Criteria) this;
        }

        public Criteria andCxBetween(String value1, String value2) {
            addCriterion("CX between", value1, value2, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotBetween(String value1, String value2) {
            addCriterion("CX not between", value1, value2, "cx");
            return (Criteria) this;
        }

        public Criteria andPlIsNull() {
            addCriterion("PL is null");
            return (Criteria) this;
        }

        public Criteria andPlIsNotNull() {
            addCriterion("PL is not null");
            return (Criteria) this;
        }

        public Criteria andPlEqualTo(String value) {
            addCriterion("PL =", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotEqualTo(String value) {
            addCriterion("PL <>", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlGreaterThan(String value) {
            addCriterion("PL >", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlGreaterThanOrEqualTo(String value) {
            addCriterion("PL >=", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLessThan(String value) {
            addCriterion("PL <", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLessThanOrEqualTo(String value) {
            addCriterion("PL <=", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLike(String value) {
            addCriterion("PL like", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotLike(String value) {
            addCriterion("PL not like", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlIn(List<String> values) {
            addCriterion("PL in", values, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotIn(List<String> values) {
            addCriterion("PL not in", values, "pl");
            return (Criteria) this;
        }

        public Criteria andPlBetween(String value1, String value2) {
            addCriterion("PL between", value1, value2, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotBetween(String value1, String value2) {
            addCriterion("PL not between", value1, value2, "pl");
            return (Criteria) this;
        }

        public Criteria andFdjxhIsNull() {
            addCriterion("FDJXH is null");
            return (Criteria) this;
        }

        public Criteria andFdjxhIsNotNull() {
            addCriterion("FDJXH is not null");
            return (Criteria) this;
        }

        public Criteria andFdjxhEqualTo(String value) {
            addCriterion("FDJXH =", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotEqualTo(String value) {
            addCriterion("FDJXH <>", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhGreaterThan(String value) {
            addCriterion("FDJXH >", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhGreaterThanOrEqualTo(String value) {
            addCriterion("FDJXH >=", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLessThan(String value) {
            addCriterion("FDJXH <", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLessThanOrEqualTo(String value) {
            addCriterion("FDJXH <=", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLike(String value) {
            addCriterion("FDJXH like", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotLike(String value) {
            addCriterion("FDJXH not like", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhIn(List<String> values) {
            addCriterion("FDJXH in", values, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotIn(List<String> values) {
            addCriterion("FDJXH not in", values, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhBetween(String value1, String value2) {
            addCriterion("FDJXH between", value1, value2, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotBetween(String value1, String value2) {
            addCriterion("FDJXH not between", value1, value2, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andBsqlxIsNull() {
            addCriterion("BSQLX is null");
            return (Criteria) this;
        }

        public Criteria andBsqlxIsNotNull() {
            addCriterion("BSQLX is not null");
            return (Criteria) this;
        }

        public Criteria andBsqlxEqualTo(String value) {
            addCriterion("BSQLX =", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxNotEqualTo(String value) {
            addCriterion("BSQLX <>", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxGreaterThan(String value) {
            addCriterion("BSQLX >", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxGreaterThanOrEqualTo(String value) {
            addCriterion("BSQLX >=", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxLessThan(String value) {
            addCriterion("BSQLX <", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxLessThanOrEqualTo(String value) {
            addCriterion("BSQLX <=", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxLike(String value) {
            addCriterion("BSQLX like", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxNotLike(String value) {
            addCriterion("BSQLX not like", value, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxIn(List<String> values) {
            addCriterion("BSQLX in", values, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxNotIn(List<String> values) {
            addCriterion("BSQLX not in", values, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxBetween(String value1, String value2) {
            addCriterion("BSQLX between", value1, value2, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andBsqlxNotBetween(String value1, String value2) {
            addCriterion("BSQLX not between", value1, value2, "bsqlx");
            return (Criteria) this;
        }

        public Criteria andDwsIsNull() {
            addCriterion("DWS is null");
            return (Criteria) this;
        }

        public Criteria andDwsIsNotNull() {
            addCriterion("DWS is not null");
            return (Criteria) this;
        }

        public Criteria andDwsEqualTo(String value) {
            addCriterion("DWS =", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsNotEqualTo(String value) {
            addCriterion("DWS <>", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsGreaterThan(String value) {
            addCriterion("DWS >", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsGreaterThanOrEqualTo(String value) {
            addCriterion("DWS >=", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsLessThan(String value) {
            addCriterion("DWS <", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsLessThanOrEqualTo(String value) {
            addCriterion("DWS <=", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsLike(String value) {
            addCriterion("DWS like", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsNotLike(String value) {
            addCriterion("DWS not like", value, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsIn(List<String> values) {
            addCriterion("DWS in", values, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsNotIn(List<String> values) {
            addCriterion("DWS not in", values, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsBetween(String value1, String value2) {
            addCriterion("DWS between", value1, value2, "dws");
            return (Criteria) this;
        }

        public Criteria andDwsNotBetween(String value1, String value2) {
            addCriterion("DWS not between", value1, value2, "dws");
            return (Criteria) this;
        }

        public Criteria andPfbzIsNull() {
            addCriterion("PFBZ is null");
            return (Criteria) this;
        }

        public Criteria andPfbzIsNotNull() {
            addCriterion("PFBZ is not null");
            return (Criteria) this;
        }

        public Criteria andPfbzEqualTo(String value) {
            addCriterion("PFBZ =", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzNotEqualTo(String value) {
            addCriterion("PFBZ <>", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzGreaterThan(String value) {
            addCriterion("PFBZ >", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzGreaterThanOrEqualTo(String value) {
            addCriterion("PFBZ >=", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzLessThan(String value) {
            addCriterion("PFBZ <", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzLessThanOrEqualTo(String value) {
            addCriterion("PFBZ <=", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzLike(String value) {
            addCriterion("PFBZ like", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzNotLike(String value) {
            addCriterion("PFBZ not like", value, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzIn(List<String> values) {
            addCriterion("PFBZ in", values, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzNotIn(List<String> values) {
            addCriterion("PFBZ not in", values, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzBetween(String value1, String value2) {
            addCriterion("PFBZ between", value1, value2, "pfbz");
            return (Criteria) this;
        }

        public Criteria andPfbzNotBetween(String value1, String value2) {
            addCriterion("PFBZ not between", value1, value2, "pfbz");
            return (Criteria) this;
        }

        public Criteria andCldmIsNull() {
            addCriterion("CLDM is null");
            return (Criteria) this;
        }

        public Criteria andCldmIsNotNull() {
            addCriterion("CLDM is not null");
            return (Criteria) this;
        }

        public Criteria andCldmEqualTo(String value) {
            addCriterion("CLDM =", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmNotEqualTo(String value) {
            addCriterion("CLDM <>", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmGreaterThan(String value) {
            addCriterion("CLDM >", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmGreaterThanOrEqualTo(String value) {
            addCriterion("CLDM >=", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmLessThan(String value) {
            addCriterion("CLDM <", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmLessThanOrEqualTo(String value) {
            addCriterion("CLDM <=", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmLike(String value) {
            addCriterion("CLDM like", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmNotLike(String value) {
            addCriterion("CLDM not like", value, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmIn(List<String> values) {
            addCriterion("CLDM in", values, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmNotIn(List<String> values) {
            addCriterion("CLDM not in", values, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmBetween(String value1, String value2) {
            addCriterion("CLDM between", value1, value2, "cldm");
            return (Criteria) this;
        }

        public Criteria andCldmNotBetween(String value1, String value2) {
            addCriterion("CLDM not between", value1, value2, "cldm");
            return (Criteria) this;
        }

        public Criteria andSsnfIsNull() {
            addCriterion("SSNF is null");
            return (Criteria) this;
        }

        public Criteria andSsnfIsNotNull() {
            addCriterion("SSNF is not null");
            return (Criteria) this;
        }

        public Criteria andSsnfEqualTo(String value) {
            addCriterion("SSNF =", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfNotEqualTo(String value) {
            addCriterion("SSNF <>", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfGreaterThan(String value) {
            addCriterion("SSNF >", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfGreaterThanOrEqualTo(String value) {
            addCriterion("SSNF >=", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfLessThan(String value) {
            addCriterion("SSNF <", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfLessThanOrEqualTo(String value) {
            addCriterion("SSNF <=", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfLike(String value) {
            addCriterion("SSNF like", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfNotLike(String value) {
            addCriterion("SSNF not like", value, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfIn(List<String> values) {
            addCriterion("SSNF in", values, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfNotIn(List<String> values) {
            addCriterion("SSNF not in", values, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfBetween(String value1, String value2) {
            addCriterion("SSNF between", value1, value2, "ssnf");
            return (Criteria) this;
        }

        public Criteria andSsnfNotBetween(String value1, String value2) {
            addCriterion("SSNF not between", value1, value2, "ssnf");
            return (Criteria) this;
        }

        public Criteria andTcnfIsNull() {
            addCriterion("TCNF is null");
            return (Criteria) this;
        }

        public Criteria andTcnfIsNotNull() {
            addCriterion("TCNF is not null");
            return (Criteria) this;
        }

        public Criteria andTcnfEqualTo(String value) {
            addCriterion("TCNF =", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfNotEqualTo(String value) {
            addCriterion("TCNF <>", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfGreaterThan(String value) {
            addCriterion("TCNF >", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfGreaterThanOrEqualTo(String value) {
            addCriterion("TCNF >=", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfLessThan(String value) {
            addCriterion("TCNF <", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfLessThanOrEqualTo(String value) {
            addCriterion("TCNF <=", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfLike(String value) {
            addCriterion("TCNF like", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfNotLike(String value) {
            addCriterion("TCNF not like", value, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfIn(List<String> values) {
            addCriterion("TCNF in", values, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfNotIn(List<String> values) {
            addCriterion("TCNF not in", values, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfBetween(String value1, String value2) {
            addCriterion("TCNF between", value1, value2, "tcnf");
            return (Criteria) this;
        }

        public Criteria andTcnfNotBetween(String value1, String value2) {
            addCriterion("TCNF not between", value1, value2, "tcnf");
            return (Criteria) this;
        }

        public Criteria andZdjgIsNull() {
            addCriterion("ZDJG is null");
            return (Criteria) this;
        }

        public Criteria andZdjgIsNotNull() {
            addCriterion("ZDJG is not null");
            return (Criteria) this;
        }

        public Criteria andZdjgEqualTo(String value) {
            addCriterion("ZDJG =", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgNotEqualTo(String value) {
            addCriterion("ZDJG <>", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgGreaterThan(String value) {
            addCriterion("ZDJG >", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJG >=", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgLessThan(String value) {
            addCriterion("ZDJG <", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgLessThanOrEqualTo(String value) {
            addCriterion("ZDJG <=", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgLike(String value) {
            addCriterion("ZDJG like", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgNotLike(String value) {
            addCriterion("ZDJG not like", value, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgIn(List<String> values) {
            addCriterion("ZDJG in", values, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgNotIn(List<String> values) {
            addCriterion("ZDJG not in", values, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgBetween(String value1, String value2) {
            addCriterion("ZDJG between", value1, value2, "zdjg");
            return (Criteria) this;
        }

        public Criteria andZdjgNotBetween(String value1, String value2) {
            addCriterion("ZDJG not between", value1, value2, "zdjg");
            return (Criteria) this;
        }

        public Criteria andNLevelIdIsNull() {
            addCriterion("N_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNLevelIdIsNotNull() {
            addCriterion("N_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNLevelIdEqualTo(String value) {
            addCriterion("N_LEVEL_ID =", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdNotEqualTo(String value) {
            addCriterion("N_LEVEL_ID <>", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdGreaterThan(String value) {
            addCriterion("N_LEVEL_ID >", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("N_LEVEL_ID >=", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdLessThan(String value) {
            addCriterion("N_LEVEL_ID <", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdLessThanOrEqualTo(String value) {
            addCriterion("N_LEVEL_ID <=", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdLike(String value) {
            addCriterion("N_LEVEL_ID like", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdNotLike(String value) {
            addCriterion("N_LEVEL_ID not like", value, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdIn(List<String> values) {
            addCriterion("N_LEVEL_ID in", values, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdNotIn(List<String> values) {
            addCriterion("N_LEVEL_ID not in", values, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdBetween(String value1, String value2) {
            addCriterion("N_LEVEL_ID between", value1, value2, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andNLevelIdNotBetween(String value1, String value2) {
            addCriterion("N_LEVEL_ID not between", value1, value2, "nLevelId");
            return (Criteria) this;
        }

        public Criteria andSsyfIsNull() {
            addCriterion("SSYF is null");
            return (Criteria) this;
        }

        public Criteria andSsyfIsNotNull() {
            addCriterion("SSYF is not null");
            return (Criteria) this;
        }

        public Criteria andSsyfEqualTo(String value) {
            addCriterion("SSYF =", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfNotEqualTo(String value) {
            addCriterion("SSYF <>", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfGreaterThan(String value) {
            addCriterion("SSYF >", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfGreaterThanOrEqualTo(String value) {
            addCriterion("SSYF >=", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfLessThan(String value) {
            addCriterion("SSYF <", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfLessThanOrEqualTo(String value) {
            addCriterion("SSYF <=", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfLike(String value) {
            addCriterion("SSYF like", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfNotLike(String value) {
            addCriterion("SSYF not like", value, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfIn(List<String> values) {
            addCriterion("SSYF in", values, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfNotIn(List<String> values) {
            addCriterion("SSYF not in", values, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfBetween(String value1, String value2) {
            addCriterion("SSYF between", value1, value2, "ssyf");
            return (Criteria) this;
        }

        public Criteria andSsyfNotBetween(String value1, String value2) {
            addCriterion("SSYF not between", value1, value2, "ssyf");
            return (Criteria) this;
        }

        public Criteria andScnfIsNull() {
            addCriterion("SCNF is null");
            return (Criteria) this;
        }

        public Criteria andScnfIsNotNull() {
            addCriterion("SCNF is not null");
            return (Criteria) this;
        }

        public Criteria andScnfEqualTo(String value) {
            addCriterion("SCNF =", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfNotEqualTo(String value) {
            addCriterion("SCNF <>", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfGreaterThan(String value) {
            addCriterion("SCNF >", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfGreaterThanOrEqualTo(String value) {
            addCriterion("SCNF >=", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfLessThan(String value) {
            addCriterion("SCNF <", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfLessThanOrEqualTo(String value) {
            addCriterion("SCNF <=", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfLike(String value) {
            addCriterion("SCNF like", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfNotLike(String value) {
            addCriterion("SCNF not like", value, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfIn(List<String> values) {
            addCriterion("SCNF in", values, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfNotIn(List<String> values) {
            addCriterion("SCNF not in", values, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfBetween(String value1, String value2) {
            addCriterion("SCNF between", value1, value2, "scnf");
            return (Criteria) this;
        }

        public Criteria andScnfNotBetween(String value1, String value2) {
            addCriterion("SCNF not between", value1, value2, "scnf");
            return (Criteria) this;
        }

        public Criteria andNkIsNull() {
            addCriterion("NK is null");
            return (Criteria) this;
        }

        public Criteria andNkIsNotNull() {
            addCriterion("NK is not null");
            return (Criteria) this;
        }

        public Criteria andNkEqualTo(String value) {
            addCriterion("NK =", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkNotEqualTo(String value) {
            addCriterion("NK <>", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkGreaterThan(String value) {
            addCriterion("NK >", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkGreaterThanOrEqualTo(String value) {
            addCriterion("NK >=", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkLessThan(String value) {
            addCriterion("NK <", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkLessThanOrEqualTo(String value) {
            addCriterion("NK <=", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkLike(String value) {
            addCriterion("NK like", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkNotLike(String value) {
            addCriterion("NK not like", value, "nk");
            return (Criteria) this;
        }

        public Criteria andNkIn(List<String> values) {
            addCriterion("NK in", values, "nk");
            return (Criteria) this;
        }

        public Criteria andNkNotIn(List<String> values) {
            addCriterion("NK not in", values, "nk");
            return (Criteria) this;
        }

        public Criteria andNkBetween(String value1, String value2) {
            addCriterion("NK between", value1, value2, "nk");
            return (Criteria) this;
        }

        public Criteria andNkNotBetween(String value1, String value2) {
            addCriterion("NK not between", value1, value2, "nk");
            return (Criteria) this;
        }

        public Criteria andCxiIsNull() {
            addCriterion("CXI is null");
            return (Criteria) this;
        }

        public Criteria andCxiIsNotNull() {
            addCriterion("CXI is not null");
            return (Criteria) this;
        }

        public Criteria andCxiEqualTo(String value) {
            addCriterion("CXI =", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiNotEqualTo(String value) {
            addCriterion("CXI <>", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiGreaterThan(String value) {
            addCriterion("CXI >", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiGreaterThanOrEqualTo(String value) {
            addCriterion("CXI >=", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiLessThan(String value) {
            addCriterion("CXI <", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiLessThanOrEqualTo(String value) {
            addCriterion("CXI <=", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiLike(String value) {
            addCriterion("CXI like", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiNotLike(String value) {
            addCriterion("CXI not like", value, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiIn(List<String> values) {
            addCriterion("CXI in", values, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiNotIn(List<String> values) {
            addCriterion("CXI not in", values, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiBetween(String value1, String value2) {
            addCriterion("CXI between", value1, value2, "cxi");
            return (Criteria) this;
        }

        public Criteria andCxiNotBetween(String value1, String value2) {
            addCriterion("CXI not between", value1, value2, "cxi");
            return (Criteria) this;
        }

        public Criteria andXsmcIsNull() {
            addCriterion("XSMC is null");
            return (Criteria) this;
        }

        public Criteria andXsmcIsNotNull() {
            addCriterion("XSMC is not null");
            return (Criteria) this;
        }

        public Criteria andXsmcEqualTo(String value) {
            addCriterion("XSMC =", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotEqualTo(String value) {
            addCriterion("XSMC <>", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcGreaterThan(String value) {
            addCriterion("XSMC >", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcGreaterThanOrEqualTo(String value) {
            addCriterion("XSMC >=", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLessThan(String value) {
            addCriterion("XSMC <", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLessThanOrEqualTo(String value) {
            addCriterion("XSMC <=", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLike(String value) {
            addCriterion("XSMC like", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotLike(String value) {
            addCriterion("XSMC not like", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcIn(List<String> values) {
            addCriterion("XSMC in", values, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotIn(List<String> values) {
            addCriterion("XSMC not in", values, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcBetween(String value1, String value2) {
            addCriterion("XSMC between", value1, value2, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotBetween(String value1, String value2) {
            addCriterion("XSMC not between", value1, value2, "xsmc");
            return (Criteria) this;
        }

        public Criteria andCllxIsNull() {
            addCriterion("CLLX is null");
            return (Criteria) this;
        }

        public Criteria andCllxIsNotNull() {
            addCriterion("CLLX is not null");
            return (Criteria) this;
        }

        public Criteria andCllxEqualTo(String value) {
            addCriterion("CLLX =", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotEqualTo(String value) {
            addCriterion("CLLX <>", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThan(String value) {
            addCriterion("CLLX >", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThanOrEqualTo(String value) {
            addCriterion("CLLX >=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThan(String value) {
            addCriterion("CLLX <", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThanOrEqualTo(String value) {
            addCriterion("CLLX <=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLike(String value) {
            addCriterion("CLLX like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotLike(String value) {
            addCriterion("CLLX not like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxIn(List<String> values) {
            addCriterion("CLLX in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotIn(List<String> values) {
            addCriterion("CLLX not in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxBetween(String value1, String value2) {
            addCriterion("CLLX between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotBetween(String value1, String value2) {
            addCriterion("CLLX not between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andJbIsNull() {
            addCriterion("JB is null");
            return (Criteria) this;
        }

        public Criteria andJbIsNotNull() {
            addCriterion("JB is not null");
            return (Criteria) this;
        }

        public Criteria andJbEqualTo(String value) {
            addCriterion("JB =", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotEqualTo(String value) {
            addCriterion("JB <>", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThan(String value) {
            addCriterion("JB >", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThanOrEqualTo(String value) {
            addCriterion("JB >=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThan(String value) {
            addCriterion("JB <", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThanOrEqualTo(String value) {
            addCriterion("JB <=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLike(String value) {
            addCriterion("JB like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotLike(String value) {
            addCriterion("JB not like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbIn(List<String> values) {
            addCriterion("JB in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotIn(List<String> values) {
            addCriterion("JB not in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbBetween(String value1, String value2) {
            addCriterion("JB between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotBetween(String value1, String value2) {
            addCriterion("JB not between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andCsxsIsNull() {
            addCriterion("CSXS is null");
            return (Criteria) this;
        }

        public Criteria andCsxsIsNotNull() {
            addCriterion("CSXS is not null");
            return (Criteria) this;
        }

        public Criteria andCsxsEqualTo(String value) {
            addCriterion("CSXS =", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsNotEqualTo(String value) {
            addCriterion("CSXS <>", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsGreaterThan(String value) {
            addCriterion("CSXS >", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsGreaterThanOrEqualTo(String value) {
            addCriterion("CSXS >=", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsLessThan(String value) {
            addCriterion("CSXS <", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsLessThanOrEqualTo(String value) {
            addCriterion("CSXS <=", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsLike(String value) {
            addCriterion("CSXS like", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsNotLike(String value) {
            addCriterion("CSXS not like", value, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsIn(List<String> values) {
            addCriterion("CSXS in", values, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsNotIn(List<String> values) {
            addCriterion("CSXS not in", values, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsBetween(String value1, String value2) {
            addCriterion("CSXS between", value1, value2, "csxs");
            return (Criteria) this;
        }

        public Criteria andCsxsNotBetween(String value1, String value2) {
            addCriterion("CSXS not between", value1, value2, "csxs");
            return (Criteria) this;
        }

        public Criteria andCmsIsNull() {
            addCriterion("CMS is null");
            return (Criteria) this;
        }

        public Criteria andCmsIsNotNull() {
            addCriterion("CMS is not null");
            return (Criteria) this;
        }

        public Criteria andCmsEqualTo(String value) {
            addCriterion("CMS =", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsNotEqualTo(String value) {
            addCriterion("CMS <>", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsGreaterThan(String value) {
            addCriterion("CMS >", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsGreaterThanOrEqualTo(String value) {
            addCriterion("CMS >=", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsLessThan(String value) {
            addCriterion("CMS <", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsLessThanOrEqualTo(String value) {
            addCriterion("CMS <=", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsLike(String value) {
            addCriterion("CMS like", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsNotLike(String value) {
            addCriterion("CMS not like", value, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsIn(List<String> values) {
            addCriterion("CMS in", values, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsNotIn(List<String> values) {
            addCriterion("CMS not in", values, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsBetween(String value1, String value2) {
            addCriterion("CMS between", value1, value2, "cms");
            return (Criteria) this;
        }

        public Criteria andCmsNotBetween(String value1, String value2) {
            addCriterion("CMS not between", value1, value2, "cms");
            return (Criteria) this;
        }

        public Criteria andZwsIsNull() {
            addCriterion("ZWS is null");
            return (Criteria) this;
        }

        public Criteria andZwsIsNotNull() {
            addCriterion("ZWS is not null");
            return (Criteria) this;
        }

        public Criteria andZwsEqualTo(String value) {
            addCriterion("ZWS =", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotEqualTo(String value) {
            addCriterion("ZWS <>", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsGreaterThan(String value) {
            addCriterion("ZWS >", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsGreaterThanOrEqualTo(String value) {
            addCriterion("ZWS >=", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsLessThan(String value) {
            addCriterion("ZWS <", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsLessThanOrEqualTo(String value) {
            addCriterion("ZWS <=", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsLike(String value) {
            addCriterion("ZWS like", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotLike(String value) {
            addCriterion("ZWS not like", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsIn(List<String> values) {
            addCriterion("ZWS in", values, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotIn(List<String> values) {
            addCriterion("ZWS not in", values, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsBetween(String value1, String value2) {
            addCriterion("ZWS between", value1, value2, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotBetween(String value1, String value2) {
            addCriterion("ZWS not between", value1, value2, "zws");
            return (Criteria) this;
        }

        public Criteria andGlIsNull() {
            addCriterion("GL is null");
            return (Criteria) this;
        }

        public Criteria andGlIsNotNull() {
            addCriterion("GL is not null");
            return (Criteria) this;
        }

        public Criteria andGlEqualTo(String value) {
            addCriterion("GL =", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotEqualTo(String value) {
            addCriterion("GL <>", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThan(String value) {
            addCriterion("GL >", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThanOrEqualTo(String value) {
            addCriterion("GL >=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThan(String value) {
            addCriterion("GL <", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThanOrEqualTo(String value) {
            addCriterion("GL <=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLike(String value) {
            addCriterion("GL like", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotLike(String value) {
            addCriterion("GL not like", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlIn(List<String> values) {
            addCriterion("GL in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotIn(List<String> values) {
            addCriterion("GL not in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlBetween(String value1, String value2) {
            addCriterion("GL between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotBetween(String value1, String value2) {
            addCriterion("GL not between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andRylxIsNull() {
            addCriterion("RYLX is null");
            return (Criteria) this;
        }

        public Criteria andRylxIsNotNull() {
            addCriterion("RYLX is not null");
            return (Criteria) this;
        }

        public Criteria andRylxEqualTo(String value) {
            addCriterion("RYLX =", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxNotEqualTo(String value) {
            addCriterion("RYLX <>", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxGreaterThan(String value) {
            addCriterion("RYLX >", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxGreaterThanOrEqualTo(String value) {
            addCriterion("RYLX >=", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxLessThan(String value) {
            addCriterion("RYLX <", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxLessThanOrEqualTo(String value) {
            addCriterion("RYLX <=", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxLike(String value) {
            addCriterion("RYLX like", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxNotLike(String value) {
            addCriterion("RYLX not like", value, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxIn(List<String> values) {
            addCriterion("RYLX in", values, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxNotIn(List<String> values) {
            addCriterion("RYLX not in", values, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxBetween(String value1, String value2) {
            addCriterion("RYLX between", value1, value2, "rylx");
            return (Criteria) this;
        }

        public Criteria andRylxNotBetween(String value1, String value2) {
            addCriterion("RYLX not between", value1, value2, "rylx");
            return (Criteria) this;
        }

        public Criteria andBsqmsIsNull() {
            addCriterion("BSQMS is null");
            return (Criteria) this;
        }

        public Criteria andBsqmsIsNotNull() {
            addCriterion("BSQMS is not null");
            return (Criteria) this;
        }

        public Criteria andBsqmsEqualTo(String value) {
            addCriterion("BSQMS =", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsNotEqualTo(String value) {
            addCriterion("BSQMS <>", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsGreaterThan(String value) {
            addCriterion("BSQMS >", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsGreaterThanOrEqualTo(String value) {
            addCriterion("BSQMS >=", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsLessThan(String value) {
            addCriterion("BSQMS <", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsLessThanOrEqualTo(String value) {
            addCriterion("BSQMS <=", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsLike(String value) {
            addCriterion("BSQMS like", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsNotLike(String value) {
            addCriterion("BSQMS not like", value, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsIn(List<String> values) {
            addCriterion("BSQMS in", values, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsNotIn(List<String> values) {
            addCriterion("BSQMS not in", values, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsBetween(String value1, String value2) {
            addCriterion("BSQMS between", value1, value2, "bsqms");
            return (Criteria) this;
        }

        public Criteria andBsqmsNotBetween(String value1, String value2) {
            addCriterion("BSQMS not between", value1, value2, "bsqms");
            return (Criteria) this;
        }

        public Criteria andRybhIsNull() {
            addCriterion("RYBH is null");
            return (Criteria) this;
        }

        public Criteria andRybhIsNotNull() {
            addCriterion("RYBH is not null");
            return (Criteria) this;
        }

        public Criteria andRybhEqualTo(String value) {
            addCriterion("RYBH =", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotEqualTo(String value) {
            addCriterion("RYBH <>", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhGreaterThan(String value) {
            addCriterion("RYBH >", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhGreaterThanOrEqualTo(String value) {
            addCriterion("RYBH >=", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLessThan(String value) {
            addCriterion("RYBH <", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLessThanOrEqualTo(String value) {
            addCriterion("RYBH <=", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLike(String value) {
            addCriterion("RYBH like", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotLike(String value) {
            addCriterion("RYBH not like", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhIn(List<String> values) {
            addCriterion("RYBH in", values, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotIn(List<String> values) {
            addCriterion("RYBH not in", values, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhBetween(String value1, String value2) {
            addCriterion("RYBH between", value1, value2, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotBetween(String value1, String value2) {
            addCriterion("RYBH not between", value1, value2, "rybh");
            return (Criteria) this;
        }

        public Criteria andQdfsIsNull() {
            addCriterion("QDFS is null");
            return (Criteria) this;
        }

        public Criteria andQdfsIsNotNull() {
            addCriterion("QDFS is not null");
            return (Criteria) this;
        }

        public Criteria andQdfsEqualTo(String value) {
            addCriterion("QDFS =", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotEqualTo(String value) {
            addCriterion("QDFS <>", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsGreaterThan(String value) {
            addCriterion("QDFS >", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsGreaterThanOrEqualTo(String value) {
            addCriterion("QDFS >=", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsLessThan(String value) {
            addCriterion("QDFS <", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsLessThanOrEqualTo(String value) {
            addCriterion("QDFS <=", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsLike(String value) {
            addCriterion("QDFS like", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotLike(String value) {
            addCriterion("QDFS not like", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsIn(List<String> values) {
            addCriterion("QDFS in", values, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotIn(List<String> values) {
            addCriterion("QDFS not in", values, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsBetween(String value1, String value2) {
            addCriterion("QDFS between", value1, value2, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotBetween(String value1, String value2) {
            addCriterion("QDFS not between", value1, value2, "qdfs");
            return (Criteria) this;
        }

        public Criteria andFdjgsIsNull() {
            addCriterion("FDJGS is null");
            return (Criteria) this;
        }

        public Criteria andFdjgsIsNotNull() {
            addCriterion("FDJGS is not null");
            return (Criteria) this;
        }

        public Criteria andFdjgsEqualTo(String value) {
            addCriterion("FDJGS =", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsNotEqualTo(String value) {
            addCriterion("FDJGS <>", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsGreaterThan(String value) {
            addCriterion("FDJGS >", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsGreaterThanOrEqualTo(String value) {
            addCriterion("FDJGS >=", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsLessThan(String value) {
            addCriterion("FDJGS <", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsLessThanOrEqualTo(String value) {
            addCriterion("FDJGS <=", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsLike(String value) {
            addCriterion("FDJGS like", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsNotLike(String value) {
            addCriterion("FDJGS not like", value, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsIn(List<String> values) {
            addCriterion("FDJGS in", values, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsNotIn(List<String> values) {
            addCriterion("FDJGS not in", values, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsBetween(String value1, String value2) {
            addCriterion("FDJGS between", value1, value2, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andFdjgsNotBetween(String value1, String value2) {
            addCriterion("FDJGS not between", value1, value2, "fdjgs");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTER_DATE <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("REGISTER_DATE in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REGISTER_DATE not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISTER_DATE between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISTER_DATE not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIsNull() {
            addCriterion("CERTIFICATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIsNotNull() {
            addCriterion("CERTIFICATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE =", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE <>", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE >", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE >=", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateLessThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE <", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_DATE <=", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_DATE in", values, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_DATE not in", values, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_DATE between", value1, value2, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_DATE not between", value1, value2, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("CAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("CAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(BigDecimal value) {
            addCriterion("CAR_ID =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(BigDecimal value) {
            addCriterion("CAR_ID <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(BigDecimal value) {
            addCriterion("CAR_ID >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_ID >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(BigDecimal value) {
            addCriterion("CAR_ID <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_ID <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<BigDecimal> values) {
            addCriterion("CAR_ID in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<BigDecimal> values) {
            addCriterion("CAR_ID not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_ID between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_ID not between", value1, value2, "carId");
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

        public Criteria andCarNameIsNull() {
            addCriterion("CAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("CAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("CAR_NAME =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("CAR_NAME <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("CAR_NAME >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_NAME >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("CAR_NAME <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("CAR_NAME <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("CAR_NAME like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("CAR_NAME not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("CAR_NAME in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("CAR_NAME not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("CAR_NAME between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("CAR_NAME not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarIcoIsNull() {
            addCriterion("CAR_ICO is null");
            return (Criteria) this;
        }

        public Criteria andCarIcoIsNotNull() {
            addCriterion("CAR_ICO is not null");
            return (Criteria) this;
        }

        public Criteria andCarIcoEqualTo(String value) {
            addCriterion("CAR_ICO =", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoNotEqualTo(String value) {
            addCriterion("CAR_ICO <>", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoGreaterThan(String value) {
            addCriterion("CAR_ICO >", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_ICO >=", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoLessThan(String value) {
            addCriterion("CAR_ICO <", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoLessThanOrEqualTo(String value) {
            addCriterion("CAR_ICO <=", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoLike(String value) {
            addCriterion("CAR_ICO like", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoNotLike(String value) {
            addCriterion("CAR_ICO not like", value, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoIn(List<String> values) {
            addCriterion("CAR_ICO in", values, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoNotIn(List<String> values) {
            addCriterion("CAR_ICO not in", values, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoBetween(String value1, String value2) {
            addCriterion("CAR_ICO between", value1, value2, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarIcoNotBetween(String value1, String value2) {
            addCriterion("CAR_ICO not between", value1, value2, "carIco");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("CAR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("CAR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(BigDecimal value) {
            addCriterion("CAR_PRICE >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(BigDecimal value) {
            addCriterion("CAR_PRICE <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<BigDecimal> values) {
            addCriterion("CAR_PRICE in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<BigDecimal> values) {
            addCriterion("CAR_PRICE not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_PRICE between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_PRICE not between", value1, value2, "carPrice");
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

        public Criteria andTypeFidIsNull() {
            addCriterion("TYPE_FID is null");
            return (Criteria) this;
        }

        public Criteria andTypeFidIsNotNull() {
            addCriterion("TYPE_FID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeFidEqualTo(BigDecimal value) {
            addCriterion("TYPE_FID =", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidNotEqualTo(BigDecimal value) {
            addCriterion("TYPE_FID <>", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidGreaterThan(BigDecimal value) {
            addCriterion("TYPE_FID >", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE_FID >=", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidLessThan(BigDecimal value) {
            addCriterion("TYPE_FID <", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE_FID <=", value, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidIn(List<BigDecimal> values) {
            addCriterion("TYPE_FID in", values, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidNotIn(List<BigDecimal> values) {
            addCriterion("TYPE_FID not in", values, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE_FID between", value1, value2, "typeFid");
            return (Criteria) this;
        }

        public Criteria andTypeFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE_FID not between", value1, value2, "typeFid");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxIsNull() {
            addCriterion("PARTAKE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxIsNotNull() {
            addCriterion("PARTAKE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxEqualTo(BigDecimal value) {
            addCriterion("PARTAKE_MAX =", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxNotEqualTo(BigDecimal value) {
            addCriterion("PARTAKE_MAX <>", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxGreaterThan(BigDecimal value) {
            addCriterion("PARTAKE_MAX >", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARTAKE_MAX >=", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxLessThan(BigDecimal value) {
            addCriterion("PARTAKE_MAX <", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARTAKE_MAX <=", value, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxIn(List<BigDecimal> values) {
            addCriterion("PARTAKE_MAX in", values, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxNotIn(List<BigDecimal> values) {
            addCriterion("PARTAKE_MAX not in", values, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARTAKE_MAX between", value1, value2, "partakeMax");
            return (Criteria) this;
        }

        public Criteria andPartakeMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARTAKE_MAX not between", value1, value2, "partakeMax");
            return (Criteria) this;
        }
    }

    /**
     * T_CAR_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CAR_INFO 2017-07-14
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