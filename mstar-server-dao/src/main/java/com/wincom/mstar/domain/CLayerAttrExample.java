package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CLayerAttrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CLayerAttrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
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
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
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
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLayerAttr
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
     * This class corresponds to the database table nfjd502.dbo.CLayerAttr
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

        public Criteria andLayornameIsNull() {
            addCriterion("LayorName is null");
            return (Criteria) this;
        }

        public Criteria andLayornameIsNotNull() {
            addCriterion("LayorName is not null");
            return (Criteria) this;
        }

        public Criteria andLayornameEqualTo(String value) {
            addCriterion("LayorName =", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameNotEqualTo(String value) {
            addCriterion("LayorName <>", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameGreaterThan(String value) {
            addCriterion("LayorName >", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameGreaterThanOrEqualTo(String value) {
            addCriterion("LayorName >=", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameLessThan(String value) {
            addCriterion("LayorName <", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameLessThanOrEqualTo(String value) {
            addCriterion("LayorName <=", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameLike(String value) {
            addCriterion("LayorName like", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameNotLike(String value) {
            addCriterion("LayorName not like", value, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameIn(List<String> values) {
            addCriterion("LayorName in", values, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameNotIn(List<String> values) {
            addCriterion("LayorName not in", values, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameBetween(String value1, String value2) {
            addCriterion("LayorName between", value1, value2, "layorname");
            return (Criteria) this;
        }

        public Criteria andLayornameNotBetween(String value1, String value2) {
            addCriterion("LayorName not between", value1, value2, "layorname");
            return (Criteria) this;
        }

        public Criteria andCurrzoomIsNull() {
            addCriterion("CurrZoom is null");
            return (Criteria) this;
        }

        public Criteria andCurrzoomIsNotNull() {
            addCriterion("CurrZoom is not null");
            return (Criteria) this;
        }

        public Criteria andCurrzoomEqualTo(Double value) {
            addCriterion("CurrZoom =", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomNotEqualTo(Double value) {
            addCriterion("CurrZoom <>", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomGreaterThan(Double value) {
            addCriterion("CurrZoom >", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomGreaterThanOrEqualTo(Double value) {
            addCriterion("CurrZoom >=", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomLessThan(Double value) {
            addCriterion("CurrZoom <", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomLessThanOrEqualTo(Double value) {
            addCriterion("CurrZoom <=", value, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomIn(List<Double> values) {
            addCriterion("CurrZoom in", values, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomNotIn(List<Double> values) {
            addCriterion("CurrZoom not in", values, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomBetween(Double value1, Double value2) {
            addCriterion("CurrZoom between", value1, value2, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCurrzoomNotBetween(Double value1, Double value2) {
            addCriterion("CurrZoom not between", value1, value2, "currzoom");
            return (Criteria) this;
        }

        public Criteria andCenterxIsNull() {
            addCriterion("CenterX is null");
            return (Criteria) this;
        }

        public Criteria andCenterxIsNotNull() {
            addCriterion("CenterX is not null");
            return (Criteria) this;
        }

        public Criteria andCenterxEqualTo(Double value) {
            addCriterion("CenterX =", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxNotEqualTo(Double value) {
            addCriterion("CenterX <>", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxGreaterThan(Double value) {
            addCriterion("CenterX >", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxGreaterThanOrEqualTo(Double value) {
            addCriterion("CenterX >=", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxLessThan(Double value) {
            addCriterion("CenterX <", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxLessThanOrEqualTo(Double value) {
            addCriterion("CenterX <=", value, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxIn(List<Double> values) {
            addCriterion("CenterX in", values, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxNotIn(List<Double> values) {
            addCriterion("CenterX not in", values, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxBetween(Double value1, Double value2) {
            addCriterion("CenterX between", value1, value2, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenterxNotBetween(Double value1, Double value2) {
            addCriterion("CenterX not between", value1, value2, "centerx");
            return (Criteria) this;
        }

        public Criteria andCenteryIsNull() {
            addCriterion("CenterY is null");
            return (Criteria) this;
        }

        public Criteria andCenteryIsNotNull() {
            addCriterion("CenterY is not null");
            return (Criteria) this;
        }

        public Criteria andCenteryEqualTo(Double value) {
            addCriterion("CenterY =", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryNotEqualTo(Double value) {
            addCriterion("CenterY <>", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryGreaterThan(Double value) {
            addCriterion("CenterY >", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryGreaterThanOrEqualTo(Double value) {
            addCriterion("CenterY >=", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryLessThan(Double value) {
            addCriterion("CenterY <", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryLessThanOrEqualTo(Double value) {
            addCriterion("CenterY <=", value, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryIn(List<Double> values) {
            addCriterion("CenterY in", values, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryNotIn(List<Double> values) {
            addCriterion("CenterY not in", values, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryBetween(Double value1, Double value2) {
            addCriterion("CenterY between", value1, value2, "centery");
            return (Criteria) this;
        }

        public Criteria andCenteryNotBetween(Double value1, Double value2) {
            addCriterion("CenterY not between", value1, value2, "centery");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CLayerAttr
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
     * This class corresponds to the database table nfjd502.dbo.CLayerAttr
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