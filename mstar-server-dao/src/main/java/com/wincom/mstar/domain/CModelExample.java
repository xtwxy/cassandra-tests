package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CModelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CModelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
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
     * This method corresponds to the database table nfjd502.dbo.CModel
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
     * This method corresponds to the database table nfjd502.dbo.CModel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CModel
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
     * This class corresponds to the database table nfjd502.dbo.CModel
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

        public Criteria andModelidIsNull() {
            addCriterion("ModelID is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("ModelID is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Integer value) {
            addCriterion("ModelID =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Integer value) {
            addCriterion("ModelID <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Integer value) {
            addCriterion("ModelID >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModelID >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Integer value) {
            addCriterion("ModelID <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Integer value) {
            addCriterion("ModelID <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Integer> values) {
            addCriterion("ModelID in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Integer> values) {
            addCriterion("ModelID not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Integer value1, Integer value2) {
            addCriterion("ModelID between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Integer value1, Integer value2) {
            addCriterion("ModelID not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIsNull() {
            addCriterion("DeviceTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIsNotNull() {
            addCriterion("DeviceTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidEqualTo(Integer value) {
            addCriterion("DeviceTypeID =", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotEqualTo(Integer value) {
            addCriterion("DeviceTypeID <>", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidGreaterThan(Integer value) {
            addCriterion("DeviceTypeID >", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeviceTypeID >=", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidLessThan(Integer value) {
            addCriterion("DeviceTypeID <", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("DeviceTypeID <=", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIn(List<Integer> values) {
            addCriterion("DeviceTypeID in", values, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotIn(List<Integer> values) {
            addCriterion("DeviceTypeID not in", values, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidBetween(Integer value1, Integer value2) {
            addCriterion("DeviceTypeID between", value1, value2, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("DeviceTypeID not between", value1, value2, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("Category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("Category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andMountplaceidIsNull() {
            addCriterion("MountPlaceID is null");
            return (Criteria) this;
        }

        public Criteria andMountplaceidIsNotNull() {
            addCriterion("MountPlaceID is not null");
            return (Criteria) this;
        }

        public Criteria andMountplaceidEqualTo(Integer value) {
            addCriterion("MountPlaceID =", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidNotEqualTo(Integer value) {
            addCriterion("MountPlaceID <>", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidGreaterThan(Integer value) {
            addCriterion("MountPlaceID >", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MountPlaceID >=", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidLessThan(Integer value) {
            addCriterion("MountPlaceID <", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidLessThanOrEqualTo(Integer value) {
            addCriterion("MountPlaceID <=", value, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidIn(List<Integer> values) {
            addCriterion("MountPlaceID in", values, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidNotIn(List<Integer> values) {
            addCriterion("MountPlaceID not in", values, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidBetween(Integer value1, Integer value2) {
            addCriterion("MountPlaceID between", value1, value2, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andMountplaceidNotBetween(Integer value1, Integer value2) {
            addCriterion("MountPlaceID not between", value1, value2, "mountplaceid");
            return (Criteria) this;
        }

        public Criteria andSpanyearIsNull() {
            addCriterion("SpanYear is null");
            return (Criteria) this;
        }

        public Criteria andSpanyearIsNotNull() {
            addCriterion("SpanYear is not null");
            return (Criteria) this;
        }

        public Criteria andSpanyearEqualTo(Integer value) {
            addCriterion("SpanYear =", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearNotEqualTo(Integer value) {
            addCriterion("SpanYear <>", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearGreaterThan(Integer value) {
            addCriterion("SpanYear >", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("SpanYear >=", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearLessThan(Integer value) {
            addCriterion("SpanYear <", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearLessThanOrEqualTo(Integer value) {
            addCriterion("SpanYear <=", value, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearIn(List<Integer> values) {
            addCriterion("SpanYear in", values, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearNotIn(List<Integer> values) {
            addCriterion("SpanYear not in", values, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearBetween(Integer value1, Integer value2) {
            addCriterion("SpanYear between", value1, value2, "spanyear");
            return (Criteria) this;
        }

        public Criteria andSpanyearNotBetween(Integer value1, Integer value2) {
            addCriterion("SpanYear not between", value1, value2, "spanyear");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("Notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("Notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("Notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("Notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("Notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("Notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("Notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("Notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("Notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("Notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("Notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("Notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("Notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("Notes not between", value1, value2, "notes");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CModel
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
     * This class corresponds to the database table nfjd502.dbo.CModel
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