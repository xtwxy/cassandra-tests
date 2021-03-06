package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CNAlarmSoundCfgExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CNAlarmSoundCfgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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
     * This class corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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

        public Criteria andDataobjidIsNull() {
            addCriterion("DataObjID is null");
            return (Criteria) this;
        }

        public Criteria andDataobjidIsNotNull() {
            addCriterion("DataObjID is not null");
            return (Criteria) this;
        }

        public Criteria andDataobjidEqualTo(Integer value) {
            addCriterion("DataObjID =", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidNotEqualTo(Integer value) {
            addCriterion("DataObjID <>", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidGreaterThan(Integer value) {
            addCriterion("DataObjID >", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataObjID >=", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidLessThan(Integer value) {
            addCriterion("DataObjID <", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidLessThanOrEqualTo(Integer value) {
            addCriterion("DataObjID <=", value, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidIn(List<Integer> values) {
            addCriterion("DataObjID in", values, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidNotIn(List<Integer> values) {
            addCriterion("DataObjID not in", values, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidBetween(Integer value1, Integer value2) {
            addCriterion("DataObjID between", value1, value2, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andDataobjidNotBetween(Integer value1, Integer value2) {
            addCriterion("DataObjID not between", value1, value2, "dataobjid");
            return (Criteria) this;
        }

        public Criteria andStatusnoIsNull() {
            addCriterion("StatusNo is null");
            return (Criteria) this;
        }

        public Criteria andStatusnoIsNotNull() {
            addCriterion("StatusNo is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnoEqualTo(Integer value) {
            addCriterion("StatusNo =", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoNotEqualTo(Integer value) {
            addCriterion("StatusNo <>", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoGreaterThan(Integer value) {
            addCriterion("StatusNo >", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("StatusNo >=", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoLessThan(Integer value) {
            addCriterion("StatusNo <", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoLessThanOrEqualTo(Integer value) {
            addCriterion("StatusNo <=", value, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoIn(List<Integer> values) {
            addCriterion("StatusNo in", values, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoNotIn(List<Integer> values) {
            addCriterion("StatusNo not in", values, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoBetween(Integer value1, Integer value2) {
            addCriterion("StatusNo between", value1, value2, "statusno");
            return (Criteria) this;
        }

        public Criteria andStatusnoNotBetween(Integer value1, Integer value2) {
            addCriterion("StatusNo not between", value1, value2, "statusno");
            return (Criteria) this;
        }

        public Criteria andSoundenableIsNull() {
            addCriterion("SoundEnable is null");
            return (Criteria) this;
        }

        public Criteria andSoundenableIsNotNull() {
            addCriterion("SoundEnable is not null");
            return (Criteria) this;
        }

        public Criteria andSoundenableEqualTo(Boolean value) {
            addCriterion("SoundEnable =", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableNotEqualTo(Boolean value) {
            addCriterion("SoundEnable <>", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableGreaterThan(Boolean value) {
            addCriterion("SoundEnable >", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SoundEnable >=", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableLessThan(Boolean value) {
            addCriterion("SoundEnable <", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableLessThanOrEqualTo(Boolean value) {
            addCriterion("SoundEnable <=", value, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableIn(List<Boolean> values) {
            addCriterion("SoundEnable in", values, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableNotIn(List<Boolean> values) {
            addCriterion("SoundEnable not in", values, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableBetween(Boolean value1, Boolean value2) {
            addCriterion("SoundEnable between", value1, value2, "soundenable");
            return (Criteria) this;
        }

        public Criteria andSoundenableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SoundEnable not between", value1, value2, "soundenable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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
     * This class corresponds to the database table nfjd502.dbo.CNAlarmSoundCfg
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