package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BBIDConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public BBIDConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
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
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
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
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
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
     * This class corresponds to the database table nfjd502.dbo.BBIDConfig
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

        public Criteria andDataidIsNull() {
            addCriterion("DataID is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("DataID is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(Integer value) {
            addCriterion("DataID =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(Integer value) {
            addCriterion("DataID <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(Integer value) {
            addCriterion("DataID >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataID >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(Integer value) {
            addCriterion("DataID <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(Integer value) {
            addCriterion("DataID <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<Integer> values) {
            addCriterion("DataID in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<Integer> values) {
            addCriterion("DataID not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(Integer value1, Integer value2) {
            addCriterion("DataID between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(Integer value1, Integer value2) {
            addCriterion("DataID not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andIddescIsNull() {
            addCriterion("IDDesc is null");
            return (Criteria) this;
        }

        public Criteria andIddescIsNotNull() {
            addCriterion("IDDesc is not null");
            return (Criteria) this;
        }

        public Criteria andIddescEqualTo(String value) {
            addCriterion("IDDesc =", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescNotEqualTo(String value) {
            addCriterion("IDDesc <>", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescGreaterThan(String value) {
            addCriterion("IDDesc >", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescGreaterThanOrEqualTo(String value) {
            addCriterion("IDDesc >=", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescLessThan(String value) {
            addCriterion("IDDesc <", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescLessThanOrEqualTo(String value) {
            addCriterion("IDDesc <=", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescLike(String value) {
            addCriterion("IDDesc like", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescNotLike(String value) {
            addCriterion("IDDesc not like", value, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescIn(List<String> values) {
            addCriterion("IDDesc in", values, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescNotIn(List<String> values) {
            addCriterion("IDDesc not in", values, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescBetween(String value1, String value2) {
            addCriterion("IDDesc between", value1, value2, "iddesc");
            return (Criteria) this;
        }

        public Criteria andIddescNotBetween(String value1, String value2) {
            addCriterion("IDDesc not between", value1, value2, "iddesc");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIsNull() {
            addCriterion("RecordTime is null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIsNotNull() {
            addCriterion("RecordTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeEqualTo(Date value) {
            addCriterion("RecordTime =", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotEqualTo(Date value) {
            addCriterion("RecordTime <>", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThan(Date value) {
            addCriterion("RecordTime >", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordTime >=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThan(Date value) {
            addCriterion("RecordTime <", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThanOrEqualTo(Date value) {
            addCriterion("RecordTime <=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIn(List<Date> values) {
            addCriterion("RecordTime in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotIn(List<Date> values) {
            addCriterion("RecordTime not in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeBetween(Date value1, Date value2) {
            addCriterion("RecordTime between", value1, value2, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotBetween(Date value1, Date value2) {
            addCriterion("RecordTime not between", value1, value2, "recordtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.BBIDConfig
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
     * This class corresponds to the database table nfjd502.dbo.BBIDConfig
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