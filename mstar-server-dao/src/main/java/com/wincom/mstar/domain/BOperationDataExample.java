package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BOperationDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public BOperationDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
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
     * This method corresponds to the database table nfjd502.dbo.BOperationData
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
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
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
     * This class corresponds to the database table nfjd502.dbo.BOperationData
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

        public Criteria andOperationindexIsNull() {
            addCriterion("OperationIndex is null");
            return (Criteria) this;
        }

        public Criteria andOperationindexIsNotNull() {
            addCriterion("OperationIndex is not null");
            return (Criteria) this;
        }

        public Criteria andOperationindexEqualTo(Integer value) {
            addCriterion("OperationIndex =", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexNotEqualTo(Integer value) {
            addCriterion("OperationIndex <>", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexGreaterThan(Integer value) {
            addCriterion("OperationIndex >", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationIndex >=", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexLessThan(Integer value) {
            addCriterion("OperationIndex <", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexLessThanOrEqualTo(Integer value) {
            addCriterion("OperationIndex <=", value, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexIn(List<Integer> values) {
            addCriterion("OperationIndex in", values, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexNotIn(List<Integer> values) {
            addCriterion("OperationIndex not in", values, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexBetween(Integer value1, Integer value2) {
            addCriterion("OperationIndex between", value1, value2, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationindexNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationIndex not between", value1, value2, "operationindex");
            return (Criteria) this;
        }

        public Criteria andOperationidIsNull() {
            addCriterion("OperationID is null");
            return (Criteria) this;
        }

        public Criteria andOperationidIsNotNull() {
            addCriterion("OperationID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationidEqualTo(Integer value) {
            addCriterion("OperationID =", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidNotEqualTo(Integer value) {
            addCriterion("OperationID <>", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidGreaterThan(Integer value) {
            addCriterion("OperationID >", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationID >=", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidLessThan(Integer value) {
            addCriterion("OperationID <", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidLessThanOrEqualTo(Integer value) {
            addCriterion("OperationID <=", value, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidIn(List<Integer> values) {
            addCriterion("OperationID in", values, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidNotIn(List<Integer> values) {
            addCriterion("OperationID not in", values, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidBetween(Integer value1, Integer value2) {
            addCriterion("OperationID between", value1, value2, "operationid");
            return (Criteria) this;
        }

        public Criteria andOperationidNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationID not between", value1, value2, "operationid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andOperationnameIsNull() {
            addCriterion("OperationName is null");
            return (Criteria) this;
        }

        public Criteria andOperationnameIsNotNull() {
            addCriterion("OperationName is not null");
            return (Criteria) this;
        }

        public Criteria andOperationnameEqualTo(String value) {
            addCriterion("OperationName =", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotEqualTo(String value) {
            addCriterion("OperationName <>", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThan(String value) {
            addCriterion("OperationName >", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThanOrEqualTo(String value) {
            addCriterion("OperationName >=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThan(String value) {
            addCriterion("OperationName <", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThanOrEqualTo(String value) {
            addCriterion("OperationName <=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLike(String value) {
            addCriterion("OperationName like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotLike(String value) {
            addCriterion("OperationName not like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameIn(List<String> values) {
            addCriterion("OperationName in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotIn(List<String> values) {
            addCriterion("OperationName not in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameBetween(String value1, String value2) {
            addCriterion("OperationName between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotBetween(String value1, String value2) {
            addCriterion("OperationName not between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("OperateTime is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("OperateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterion("OperateTime =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterion("OperateTime <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterion("OperateTime >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OperateTime >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterion("OperateTime <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OperateTime <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterion("OperateTime in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterion("OperateTime not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterion("OperateTime between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OperateTime not between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeIsNull() {
            addCriterion("OperationEndTime is null");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeIsNotNull() {
            addCriterion("OperationEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeEqualTo(Date value) {
            addCriterion("OperationEndTime =", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeNotEqualTo(Date value) {
            addCriterion("OperationEndTime <>", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeGreaterThan(Date value) {
            addCriterion("OperationEndTime >", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OperationEndTime >=", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeLessThan(Date value) {
            addCriterion("OperationEndTime <", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeLessThanOrEqualTo(Date value) {
            addCriterion("OperationEndTime <=", value, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeIn(List<Date> values) {
            addCriterion("OperationEndTime in", values, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeNotIn(List<Date> values) {
            addCriterion("OperationEndTime not in", values, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeBetween(Date value1, Date value2) {
            addCriterion("OperationEndTime between", value1, value2, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationendtimeNotBetween(Date value1, Date value2) {
            addCriterion("OperationEndTime not between", value1, value2, "operationendtime");
            return (Criteria) this;
        }

        public Criteria andOperationresultIsNull() {
            addCriterion("OperationResult is null");
            return (Criteria) this;
        }

        public Criteria andOperationresultIsNotNull() {
            addCriterion("OperationResult is not null");
            return (Criteria) this;
        }

        public Criteria andOperationresultEqualTo(String value) {
            addCriterion("OperationResult =", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultNotEqualTo(String value) {
            addCriterion("OperationResult <>", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultGreaterThan(String value) {
            addCriterion("OperationResult >", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultGreaterThanOrEqualTo(String value) {
            addCriterion("OperationResult >=", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultLessThan(String value) {
            addCriterion("OperationResult <", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultLessThanOrEqualTo(String value) {
            addCriterion("OperationResult <=", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultLike(String value) {
            addCriterion("OperationResult like", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultNotLike(String value) {
            addCriterion("OperationResult not like", value, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultIn(List<String> values) {
            addCriterion("OperationResult in", values, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultNotIn(List<String> values) {
            addCriterion("OperationResult not in", values, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultBetween(String value1, String value2) {
            addCriterion("OperationResult between", value1, value2, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationresultNotBetween(String value1, String value2) {
            addCriterion("OperationResult not between", value1, value2, "operationresult");
            return (Criteria) this;
        }

        public Criteria andOperationlogidIsNull() {
            addCriterion("OperationLogID is null");
            return (Criteria) this;
        }

        public Criteria andOperationlogidIsNotNull() {
            addCriterion("OperationLogID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationlogidEqualTo(Integer value) {
            addCriterion("OperationLogID =", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidNotEqualTo(Integer value) {
            addCriterion("OperationLogID <>", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidGreaterThan(Integer value) {
            addCriterion("OperationLogID >", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationLogID >=", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidLessThan(Integer value) {
            addCriterion("OperationLogID <", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidLessThanOrEqualTo(Integer value) {
            addCriterion("OperationLogID <=", value, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidIn(List<Integer> values) {
            addCriterion("OperationLogID in", values, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidNotIn(List<Integer> values) {
            addCriterion("OperationLogID not in", values, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidBetween(Integer value1, Integer value2) {
            addCriterion("OperationLogID between", value1, value2, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andOperationlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationLogID not between", value1, value2, "operationlogid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.BOperationData
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
     * This class corresponds to the database table nfjd502.dbo.BOperationData
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