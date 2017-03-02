package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CDoorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CDoorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
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

        public Criteria andDooridIsNull() {
            addCriterion("DoorID is null");
            return (Criteria) this;
        }

        public Criteria andDooridIsNotNull() {
            addCriterion("DoorID is not null");
            return (Criteria) this;
        }

        public Criteria andDooridEqualTo(Integer value) {
            addCriterion("DoorID =", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridNotEqualTo(Integer value) {
            addCriterion("DoorID <>", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridGreaterThan(Integer value) {
            addCriterion("DoorID >", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DoorID >=", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridLessThan(Integer value) {
            addCriterion("DoorID <", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridLessThanOrEqualTo(Integer value) {
            addCriterion("DoorID <=", value, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridIn(List<Integer> values) {
            addCriterion("DoorID in", values, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridNotIn(List<Integer> values) {
            addCriterion("DoorID not in", values, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridBetween(Integer value1, Integer value2) {
            addCriterion("DoorID between", value1, value2, "doorid");
            return (Criteria) this;
        }

        public Criteria andDooridNotBetween(Integer value1, Integer value2) {
            addCriterion("DoorID not between", value1, value2, "doorid");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNull() {
            addCriterion("DriverID is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("DriverID is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("DriverID =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("DriverID <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("DriverID >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DriverID >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("DriverID <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("DriverID <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("DriverID in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("DriverID not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("DriverID between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("DriverID not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andNmodularIsNull() {
            addCriterion("nModular is null");
            return (Criteria) this;
        }

        public Criteria andNmodularIsNotNull() {
            addCriterion("nModular is not null");
            return (Criteria) this;
        }

        public Criteria andNmodularEqualTo(Integer value) {
            addCriterion("nModular =", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularNotEqualTo(Integer value) {
            addCriterion("nModular <>", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularGreaterThan(Integer value) {
            addCriterion("nModular >", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularGreaterThanOrEqualTo(Integer value) {
            addCriterion("nModular >=", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularLessThan(Integer value) {
            addCriterion("nModular <", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularLessThanOrEqualTo(Integer value) {
            addCriterion("nModular <=", value, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularIn(List<Integer> values) {
            addCriterion("nModular in", values, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularNotIn(List<Integer> values) {
            addCriterion("nModular not in", values, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularBetween(Integer value1, Integer value2) {
            addCriterion("nModular between", value1, value2, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNmodularNotBetween(Integer value1, Integer value2) {
            addCriterion("nModular not between", value1, value2, "nmodular");
            return (Criteria) this;
        }

        public Criteria andNgroupIsNull() {
            addCriterion("nGroup is null");
            return (Criteria) this;
        }

        public Criteria andNgroupIsNotNull() {
            addCriterion("nGroup is not null");
            return (Criteria) this;
        }

        public Criteria andNgroupEqualTo(Integer value) {
            addCriterion("nGroup =", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupNotEqualTo(Integer value) {
            addCriterion("nGroup <>", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupGreaterThan(Integer value) {
            addCriterion("nGroup >", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("nGroup >=", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupLessThan(Integer value) {
            addCriterion("nGroup <", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupLessThanOrEqualTo(Integer value) {
            addCriterion("nGroup <=", value, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupIn(List<Integer> values) {
            addCriterion("nGroup in", values, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupNotIn(List<Integer> values) {
            addCriterion("nGroup not in", values, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupBetween(Integer value1, Integer value2) {
            addCriterion("nGroup between", value1, value2, "ngroup");
            return (Criteria) this;
        }

        public Criteria andNgroupNotBetween(Integer value1, Integer value2) {
            addCriterion("nGroup not between", value1, value2, "ngroup");
            return (Criteria) this;
        }

        public Criteria andDoornameIsNull() {
            addCriterion("DoorName is null");
            return (Criteria) this;
        }

        public Criteria andDoornameIsNotNull() {
            addCriterion("DoorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoornameEqualTo(String value) {
            addCriterion("DoorName =", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameNotEqualTo(String value) {
            addCriterion("DoorName <>", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameGreaterThan(String value) {
            addCriterion("DoorName >", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameGreaterThanOrEqualTo(String value) {
            addCriterion("DoorName >=", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameLessThan(String value) {
            addCriterion("DoorName <", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameLessThanOrEqualTo(String value) {
            addCriterion("DoorName <=", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameLike(String value) {
            addCriterion("DoorName like", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameNotLike(String value) {
            addCriterion("DoorName not like", value, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameIn(List<String> values) {
            addCriterion("DoorName in", values, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameNotIn(List<String> values) {
            addCriterion("DoorName not in", values, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameBetween(String value1, String value2) {
            addCriterion("DoorName between", value1, value2, "doorname");
            return (Criteria) this;
        }

        public Criteria andDoornameNotBetween(String value1, String value2) {
            addCriterion("DoorName not between", value1, value2, "doorname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 02 11:23:21 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CDoor
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
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