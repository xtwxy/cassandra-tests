package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BAIHistoryHourExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public BAIHistoryHourExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
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
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
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
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
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
     * This class corresponds to the database table nfjd502.dbo.BAIHistoryHour
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

        public Criteria andCurrentvalueIsNull() {
            addCriterion("CurrentValue is null");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueIsNotNull() {
            addCriterion("CurrentValue is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueEqualTo(Double value) {
            addCriterion("CurrentValue =", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueNotEqualTo(Double value) {
            addCriterion("CurrentValue <>", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueGreaterThan(Double value) {
            addCriterion("CurrentValue >", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("CurrentValue >=", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueLessThan(Double value) {
            addCriterion("CurrentValue <", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueLessThanOrEqualTo(Double value) {
            addCriterion("CurrentValue <=", value, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueIn(List<Double> values) {
            addCriterion("CurrentValue in", values, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueNotIn(List<Double> values) {
            addCriterion("CurrentValue not in", values, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueBetween(Double value1, Double value2) {
            addCriterion("CurrentValue between", value1, value2, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andCurrentvalueNotBetween(Double value1, Double value2) {
            addCriterion("CurrentValue not between", value1, value2, "currentvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueIsNull() {
            addCriterion("MaxValue is null");
            return (Criteria) this;
        }

        public Criteria andMaxvalueIsNotNull() {
            addCriterion("MaxValue is not null");
            return (Criteria) this;
        }

        public Criteria andMaxvalueEqualTo(Double value) {
            addCriterion("MaxValue =", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueNotEqualTo(Double value) {
            addCriterion("MaxValue <>", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueGreaterThan(Double value) {
            addCriterion("MaxValue >", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("MaxValue >=", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueLessThan(Double value) {
            addCriterion("MaxValue <", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueLessThanOrEqualTo(Double value) {
            addCriterion("MaxValue <=", value, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueIn(List<Double> values) {
            addCriterion("MaxValue in", values, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueNotIn(List<Double> values) {
            addCriterion("MaxValue not in", values, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueBetween(Double value1, Double value2) {
            addCriterion("MaxValue between", value1, value2, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxvalueNotBetween(Double value1, Double value2) {
            addCriterion("MaxValue not between", value1, value2, "maxvalue");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeIsNull() {
            addCriterion("MaxOccuredTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeIsNotNull() {
            addCriterion("MaxOccuredTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeEqualTo(Date value) {
            addCriterion("MaxOccuredTime =", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeNotEqualTo(Date value) {
            addCriterion("MaxOccuredTime <>", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeGreaterThan(Date value) {
            addCriterion("MaxOccuredTime >", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MaxOccuredTime >=", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeLessThan(Date value) {
            addCriterion("MaxOccuredTime <", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeLessThanOrEqualTo(Date value) {
            addCriterion("MaxOccuredTime <=", value, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeIn(List<Date> values) {
            addCriterion("MaxOccuredTime in", values, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeNotIn(List<Date> values) {
            addCriterion("MaxOccuredTime not in", values, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeBetween(Date value1, Date value2) {
            addCriterion("MaxOccuredTime between", value1, value2, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMaxoccuredtimeNotBetween(Date value1, Date value2) {
            addCriterion("MaxOccuredTime not between", value1, value2, "maxoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinvalueIsNull() {
            addCriterion("MinValue is null");
            return (Criteria) this;
        }

        public Criteria andMinvalueIsNotNull() {
            addCriterion("MinValue is not null");
            return (Criteria) this;
        }

        public Criteria andMinvalueEqualTo(Double value) {
            addCriterion("MinValue =", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueNotEqualTo(Double value) {
            addCriterion("MinValue <>", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueGreaterThan(Double value) {
            addCriterion("MinValue >", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("MinValue >=", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueLessThan(Double value) {
            addCriterion("MinValue <", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueLessThanOrEqualTo(Double value) {
            addCriterion("MinValue <=", value, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueIn(List<Double> values) {
            addCriterion("MinValue in", values, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueNotIn(List<Double> values) {
            addCriterion("MinValue not in", values, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueBetween(Double value1, Double value2) {
            addCriterion("MinValue between", value1, value2, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinvalueNotBetween(Double value1, Double value2) {
            addCriterion("MinValue not between", value1, value2, "minvalue");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeIsNull() {
            addCriterion("MinOccuredTime is null");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeIsNotNull() {
            addCriterion("MinOccuredTime is not null");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeEqualTo(Date value) {
            addCriterion("MinOccuredTime =", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeNotEqualTo(Date value) {
            addCriterion("MinOccuredTime <>", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeGreaterThan(Date value) {
            addCriterion("MinOccuredTime >", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MinOccuredTime >=", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeLessThan(Date value) {
            addCriterion("MinOccuredTime <", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeLessThanOrEqualTo(Date value) {
            addCriterion("MinOccuredTime <=", value, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeIn(List<Date> values) {
            addCriterion("MinOccuredTime in", values, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeNotIn(List<Date> values) {
            addCriterion("MinOccuredTime not in", values, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeBetween(Date value1, Date value2) {
            addCriterion("MinOccuredTime between", value1, value2, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andMinoccuredtimeNotBetween(Date value1, Date value2) {
            addCriterion("MinOccuredTime not between", value1, value2, "minoccuredtime");
            return (Criteria) this;
        }

        public Criteria andAveragevalueIsNull() {
            addCriterion("AverageValue is null");
            return (Criteria) this;
        }

        public Criteria andAveragevalueIsNotNull() {
            addCriterion("AverageValue is not null");
            return (Criteria) this;
        }

        public Criteria andAveragevalueEqualTo(Double value) {
            addCriterion("AverageValue =", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueNotEqualTo(Double value) {
            addCriterion("AverageValue <>", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueGreaterThan(Double value) {
            addCriterion("AverageValue >", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueGreaterThanOrEqualTo(Double value) {
            addCriterion("AverageValue >=", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueLessThan(Double value) {
            addCriterion("AverageValue <", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueLessThanOrEqualTo(Double value) {
            addCriterion("AverageValue <=", value, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueIn(List<Double> values) {
            addCriterion("AverageValue in", values, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueNotIn(List<Double> values) {
            addCriterion("AverageValue not in", values, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueBetween(Double value1, Double value2) {
            addCriterion("AverageValue between", value1, value2, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andAveragevalueNotBetween(Double value1, Double value2) {
            addCriterion("AverageValue not between", value1, value2, "averagevalue");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeIsNull() {
            addCriterion("UnavailableTime is null");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeIsNotNull() {
            addCriterion("UnavailableTime is not null");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeEqualTo(Double value) {
            addCriterion("UnavailableTime =", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeNotEqualTo(Double value) {
            addCriterion("UnavailableTime <>", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeGreaterThan(Double value) {
            addCriterion("UnavailableTime >", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeGreaterThanOrEqualTo(Double value) {
            addCriterion("UnavailableTime >=", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeLessThan(Double value) {
            addCriterion("UnavailableTime <", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeLessThanOrEqualTo(Double value) {
            addCriterion("UnavailableTime <=", value, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeIn(List<Double> values) {
            addCriterion("UnavailableTime in", values, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeNotIn(List<Double> values) {
            addCriterion("UnavailableTime not in", values, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeBetween(Double value1, Double value2) {
            addCriterion("UnavailableTime between", value1, value2, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andUnavailabletimeNotBetween(Double value1, Double value2) {
            addCriterion("UnavailableTime not between", value1, value2, "unavailabletime");
            return (Criteria) this;
        }

        public Criteria andEventcountIsNull() {
            addCriterion("EventCount is null");
            return (Criteria) this;
        }

        public Criteria andEventcountIsNotNull() {
            addCriterion("EventCount is not null");
            return (Criteria) this;
        }

        public Criteria andEventcountEqualTo(Integer value) {
            addCriterion("EventCount =", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountNotEqualTo(Integer value) {
            addCriterion("EventCount <>", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountGreaterThan(Integer value) {
            addCriterion("EventCount >", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("EventCount >=", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountLessThan(Integer value) {
            addCriterion("EventCount <", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountLessThanOrEqualTo(Integer value) {
            addCriterion("EventCount <=", value, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountIn(List<Integer> values) {
            addCriterion("EventCount in", values, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountNotIn(List<Integer> values) {
            addCriterion("EventCount not in", values, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountBetween(Integer value1, Integer value2) {
            addCriterion("EventCount between", value1, value2, "eventcount");
            return (Criteria) this;
        }

        public Criteria andEventcountNotBetween(Integer value1, Integer value2) {
            addCriterion("EventCount not between", value1, value2, "eventcount");
            return (Criteria) this;
        }

        public Criteria andYearnoIsNull() {
            addCriterion("YearNo is null");
            return (Criteria) this;
        }

        public Criteria andYearnoIsNotNull() {
            addCriterion("YearNo is not null");
            return (Criteria) this;
        }

        public Criteria andYearnoEqualTo(Integer value) {
            addCriterion("YearNo =", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoNotEqualTo(Integer value) {
            addCriterion("YearNo <>", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoGreaterThan(Integer value) {
            addCriterion("YearNo >", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("YearNo >=", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoLessThan(Integer value) {
            addCriterion("YearNo <", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoLessThanOrEqualTo(Integer value) {
            addCriterion("YearNo <=", value, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoIn(List<Integer> values) {
            addCriterion("YearNo in", values, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoNotIn(List<Integer> values) {
            addCriterion("YearNo not in", values, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoBetween(Integer value1, Integer value2) {
            addCriterion("YearNo between", value1, value2, "yearno");
            return (Criteria) this;
        }

        public Criteria andYearnoNotBetween(Integer value1, Integer value2) {
            addCriterion("YearNo not between", value1, value2, "yearno");
            return (Criteria) this;
        }

        public Criteria andMonthnoIsNull() {
            addCriterion("MonthNo is null");
            return (Criteria) this;
        }

        public Criteria andMonthnoIsNotNull() {
            addCriterion("MonthNo is not null");
            return (Criteria) this;
        }

        public Criteria andMonthnoEqualTo(Integer value) {
            addCriterion("MonthNo =", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoNotEqualTo(Integer value) {
            addCriterion("MonthNo <>", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoGreaterThan(Integer value) {
            addCriterion("MonthNo >", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MonthNo >=", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoLessThan(Integer value) {
            addCriterion("MonthNo <", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoLessThanOrEqualTo(Integer value) {
            addCriterion("MonthNo <=", value, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoIn(List<Integer> values) {
            addCriterion("MonthNo in", values, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoNotIn(List<Integer> values) {
            addCriterion("MonthNo not in", values, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoBetween(Integer value1, Integer value2) {
            addCriterion("MonthNo between", value1, value2, "monthno");
            return (Criteria) this;
        }

        public Criteria andMonthnoNotBetween(Integer value1, Integer value2) {
            addCriterion("MonthNo not between", value1, value2, "monthno");
            return (Criteria) this;
        }

        public Criteria andDaynoIsNull() {
            addCriterion("DayNo is null");
            return (Criteria) this;
        }

        public Criteria andDaynoIsNotNull() {
            addCriterion("DayNo is not null");
            return (Criteria) this;
        }

        public Criteria andDaynoEqualTo(Integer value) {
            addCriterion("DayNo =", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoNotEqualTo(Integer value) {
            addCriterion("DayNo <>", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoGreaterThan(Integer value) {
            addCriterion("DayNo >", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoGreaterThanOrEqualTo(Integer value) {
            addCriterion("DayNo >=", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoLessThan(Integer value) {
            addCriterion("DayNo <", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoLessThanOrEqualTo(Integer value) {
            addCriterion("DayNo <=", value, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoIn(List<Integer> values) {
            addCriterion("DayNo in", values, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoNotIn(List<Integer> values) {
            addCriterion("DayNo not in", values, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoBetween(Integer value1, Integer value2) {
            addCriterion("DayNo between", value1, value2, "dayno");
            return (Criteria) this;
        }

        public Criteria andDaynoNotBetween(Integer value1, Integer value2) {
            addCriterion("DayNo not between", value1, value2, "dayno");
            return (Criteria) this;
        }

        public Criteria andHournoIsNull() {
            addCriterion("HourNo is null");
            return (Criteria) this;
        }

        public Criteria andHournoIsNotNull() {
            addCriterion("HourNo is not null");
            return (Criteria) this;
        }

        public Criteria andHournoEqualTo(Integer value) {
            addCriterion("HourNo =", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoNotEqualTo(Integer value) {
            addCriterion("HourNo <>", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoGreaterThan(Integer value) {
            addCriterion("HourNo >", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoGreaterThanOrEqualTo(Integer value) {
            addCriterion("HourNo >=", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoLessThan(Integer value) {
            addCriterion("HourNo <", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoLessThanOrEqualTo(Integer value) {
            addCriterion("HourNo <=", value, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoIn(List<Integer> values) {
            addCriterion("HourNo in", values, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoNotIn(List<Integer> values) {
            addCriterion("HourNo not in", values, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoBetween(Integer value1, Integer value2) {
            addCriterion("HourNo between", value1, value2, "hourno");
            return (Criteria) this;
        }

        public Criteria andHournoNotBetween(Integer value1, Integer value2) {
            addCriterion("HourNo not between", value1, value2, "hourno");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.BAIHistoryHour
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
     * This class corresponds to the database table nfjd502.dbo.BAIHistoryHour
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