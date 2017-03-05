package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CDriverCfgExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CDriverCfgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
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
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
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
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
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
     * This class corresponds to the database table nfjd502.dbo.CDriverCfg
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

        public Criteria andDrivernameIsNull() {
            addCriterion("DriverName is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("DriverName is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("DriverName =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("DriverName <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("DriverName >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("DriverName >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("DriverName <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("DriverName <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("DriverName like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("DriverName not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("DriverName in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("DriverName not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("DriverName between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("DriverName not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDriveraliasIsNull() {
            addCriterion("DriverAlias is null");
            return (Criteria) this;
        }

        public Criteria andDriveraliasIsNotNull() {
            addCriterion("DriverAlias is not null");
            return (Criteria) this;
        }

        public Criteria andDriveraliasEqualTo(String value) {
            addCriterion("DriverAlias =", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasNotEqualTo(String value) {
            addCriterion("DriverAlias <>", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasGreaterThan(String value) {
            addCriterion("DriverAlias >", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasGreaterThanOrEqualTo(String value) {
            addCriterion("DriverAlias >=", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasLessThan(String value) {
            addCriterion("DriverAlias <", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasLessThanOrEqualTo(String value) {
            addCriterion("DriverAlias <=", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasLike(String value) {
            addCriterion("DriverAlias like", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasNotLike(String value) {
            addCriterion("DriverAlias not like", value, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasIn(List<String> values) {
            addCriterion("DriverAlias in", values, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasNotIn(List<String> values) {
            addCriterion("DriverAlias not in", values, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasBetween(String value1, String value2) {
            addCriterion("DriverAlias between", value1, value2, "driveralias");
            return (Criteria) this;
        }

        public Criteria andDriveraliasNotBetween(String value1, String value2) {
            addCriterion("DriverAlias not between", value1, value2, "driveralias");
            return (Criteria) this;
        }

        public Criteria andFsuidIsNull() {
            addCriterion("FSUID is null");
            return (Criteria) this;
        }

        public Criteria andFsuidIsNotNull() {
            addCriterion("FSUID is not null");
            return (Criteria) this;
        }

        public Criteria andFsuidEqualTo(Integer value) {
            addCriterion("FSUID =", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidNotEqualTo(Integer value) {
            addCriterion("FSUID <>", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidGreaterThan(Integer value) {
            addCriterion("FSUID >", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSUID >=", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidLessThan(Integer value) {
            addCriterion("FSUID <", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidLessThanOrEqualTo(Integer value) {
            addCriterion("FSUID <=", value, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidIn(List<Integer> values) {
            addCriterion("FSUID in", values, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidNotIn(List<Integer> values) {
            addCriterion("FSUID not in", values, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidBetween(Integer value1, Integer value2) {
            addCriterion("FSUID between", value1, value2, "fsuid");
            return (Criteria) this;
        }

        public Criteria andFsuidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSUID not between", value1, value2, "fsuid");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIsNull() {
            addCriterion("DriverType is null");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIsNotNull() {
            addCriterion("DriverType is not null");
            return (Criteria) this;
        }

        public Criteria andDrivertypeEqualTo(Integer value) {
            addCriterion("DriverType =", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotEqualTo(Integer value) {
            addCriterion("DriverType <>", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeGreaterThan(Integer value) {
            addCriterion("DriverType >", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DriverType >=", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeLessThan(Integer value) {
            addCriterion("DriverType <", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeLessThanOrEqualTo(Integer value) {
            addCriterion("DriverType <=", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIn(List<Integer> values) {
            addCriterion("DriverType in", values, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotIn(List<Integer> values) {
            addCriterion("DriverType not in", values, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeBetween(Integer value1, Integer value2) {
            addCriterion("DriverType between", value1, value2, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DriverType not between", value1, value2, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameIsNull() {
            addCriterion("DriverDLLName is null");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameIsNotNull() {
            addCriterion("DriverDLLName is not null");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameEqualTo(String value) {
            addCriterion("DriverDLLName =", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameNotEqualTo(String value) {
            addCriterion("DriverDLLName <>", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameGreaterThan(String value) {
            addCriterion("DriverDLLName >", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameGreaterThanOrEqualTo(String value) {
            addCriterion("DriverDLLName >=", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameLessThan(String value) {
            addCriterion("DriverDLLName <", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameLessThanOrEqualTo(String value) {
            addCriterion("DriverDLLName <=", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameLike(String value) {
            addCriterion("DriverDLLName like", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameNotLike(String value) {
            addCriterion("DriverDLLName not like", value, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameIn(List<String> values) {
            addCriterion("DriverDLLName in", values, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameNotIn(List<String> values) {
            addCriterion("DriverDLLName not in", values, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameBetween(String value1, String value2) {
            addCriterion("DriverDLLName between", value1, value2, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andDriverdllnameNotBetween(String value1, String value2) {
            addCriterion("DriverDLLName not between", value1, value2, "driverdllname");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("Version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("Version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("Version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("Parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("Parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("Parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("Parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("Parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("Parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("Parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("Parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("Parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("Parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("Parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("Parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("Parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("Parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andDrivernoteIsNull() {
            addCriterion("DriverNote is null");
            return (Criteria) this;
        }

        public Criteria andDrivernoteIsNotNull() {
            addCriterion("DriverNote is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernoteEqualTo(String value) {
            addCriterion("DriverNote =", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteNotEqualTo(String value) {
            addCriterion("DriverNote <>", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteGreaterThan(String value) {
            addCriterion("DriverNote >", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteGreaterThanOrEqualTo(String value) {
            addCriterion("DriverNote >=", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteLessThan(String value) {
            addCriterion("DriverNote <", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteLessThanOrEqualTo(String value) {
            addCriterion("DriverNote <=", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteLike(String value) {
            addCriterion("DriverNote like", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteNotLike(String value) {
            addCriterion("DriverNote not like", value, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteIn(List<String> values) {
            addCriterion("DriverNote in", values, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteNotIn(List<String> values) {
            addCriterion("DriverNote not in", values, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteBetween(String value1, String value2) {
            addCriterion("DriverNote between", value1, value2, "drivernote");
            return (Criteria) this;
        }

        public Criteria andDrivernoteNotBetween(String value1, String value2) {
            addCriterion("DriverNote not between", value1, value2, "drivernote");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CDriverCfg
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
     * This class corresponds to the database table nfjd502.dbo.CDriverCfg
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