package com.wincom.mstar.domain;

import java.util.ArrayList;
import java.util.List;

public class CSIObjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public CSIObjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
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
     * This method corresponds to the database table nfjd502.dbo.CSIObject
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
     * This method corresponds to the database table nfjd502.dbo.CSIObject
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CSIObject
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
     * This class corresponds to the database table nfjd502.dbo.CSIObject
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

        public Criteria andSiobjidIsNull() {
            addCriterion("SIObjID is null");
            return (Criteria) this;
        }

        public Criteria andSiobjidIsNotNull() {
            addCriterion("SIObjID is not null");
            return (Criteria) this;
        }

        public Criteria andSiobjidEqualTo(Integer value) {
            addCriterion("SIObjID =", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidNotEqualTo(Integer value) {
            addCriterion("SIObjID <>", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidGreaterThan(Integer value) {
            addCriterion("SIObjID >", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIObjID >=", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidLessThan(Integer value) {
            addCriterion("SIObjID <", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidLessThanOrEqualTo(Integer value) {
            addCriterion("SIObjID <=", value, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidIn(List<Integer> values) {
            addCriterion("SIObjID in", values, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidNotIn(List<Integer> values) {
            addCriterion("SIObjID not in", values, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidBetween(Integer value1, Integer value2) {
            addCriterion("SIObjID between", value1, value2, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSiobjidNotBetween(Integer value1, Integer value2) {
            addCriterion("SIObjID not between", value1, value2, "siobjid");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueIsNull() {
            addCriterion("SIDefaultValue is null");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueIsNotNull() {
            addCriterion("SIDefaultValue is not null");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueEqualTo(String value) {
            addCriterion("SIDefaultValue =", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueNotEqualTo(String value) {
            addCriterion("SIDefaultValue <>", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueGreaterThan(String value) {
            addCriterion("SIDefaultValue >", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("SIDefaultValue >=", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueLessThan(String value) {
            addCriterion("SIDefaultValue <", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("SIDefaultValue <=", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueLike(String value) {
            addCriterion("SIDefaultValue like", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueNotLike(String value) {
            addCriterion("SIDefaultValue not like", value, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueIn(List<String> values) {
            addCriterion("SIDefaultValue in", values, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueNotIn(List<String> values) {
            addCriterion("SIDefaultValue not in", values, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueBetween(String value1, String value2) {
            addCriterion("SIDefaultValue between", value1, value2, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andSidefaultvalueNotBetween(String value1, String value2) {
            addCriterion("SIDefaultValue not between", value1, value2, "sidefaultvalue");
            return (Criteria) this;
        }

        public Criteria andNotifylevelIsNull() {
            addCriterion("NotifyLevel is null");
            return (Criteria) this;
        }

        public Criteria andNotifylevelIsNotNull() {
            addCriterion("NotifyLevel is not null");
            return (Criteria) this;
        }

        public Criteria andNotifylevelEqualTo(Integer value) {
            addCriterion("NotifyLevel =", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelNotEqualTo(Integer value) {
            addCriterion("NotifyLevel <>", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelGreaterThan(Integer value) {
            addCriterion("NotifyLevel >", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NotifyLevel >=", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelLessThan(Integer value) {
            addCriterion("NotifyLevel <", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelLessThanOrEqualTo(Integer value) {
            addCriterion("NotifyLevel <=", value, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelIn(List<Integer> values) {
            addCriterion("NotifyLevel in", values, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelNotIn(List<Integer> values) {
            addCriterion("NotifyLevel not in", values, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelBetween(Integer value1, Integer value2) {
            addCriterion("NotifyLevel between", value1, value2, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andNotifylevelNotBetween(Integer value1, Integer value2) {
            addCriterion("NotifyLevel not between", value1, value2, "notifylevel");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteIsNull() {
            addCriterion("UpNotifyNote is null");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteIsNotNull() {
            addCriterion("UpNotifyNote is not null");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteEqualTo(String value) {
            addCriterion("UpNotifyNote =", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteNotEqualTo(String value) {
            addCriterion("UpNotifyNote <>", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteGreaterThan(String value) {
            addCriterion("UpNotifyNote >", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteGreaterThanOrEqualTo(String value) {
            addCriterion("UpNotifyNote >=", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteLessThan(String value) {
            addCriterion("UpNotifyNote <", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteLessThanOrEqualTo(String value) {
            addCriterion("UpNotifyNote <=", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteLike(String value) {
            addCriterion("UpNotifyNote like", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteNotLike(String value) {
            addCriterion("UpNotifyNote not like", value, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteIn(List<String> values) {
            addCriterion("UpNotifyNote in", values, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteNotIn(List<String> values) {
            addCriterion("UpNotifyNote not in", values, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteBetween(String value1, String value2) {
            addCriterion("UpNotifyNote between", value1, value2, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andUpnotifynoteNotBetween(String value1, String value2) {
            addCriterion("UpNotifyNote not between", value1, value2, "upnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteIsNull() {
            addCriterion("DownNotifyNote is null");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteIsNotNull() {
            addCriterion("DownNotifyNote is not null");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteEqualTo(String value) {
            addCriterion("DownNotifyNote =", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteNotEqualTo(String value) {
            addCriterion("DownNotifyNote <>", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteGreaterThan(String value) {
            addCriterion("DownNotifyNote >", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteGreaterThanOrEqualTo(String value) {
            addCriterion("DownNotifyNote >=", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteLessThan(String value) {
            addCriterion("DownNotifyNote <", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteLessThanOrEqualTo(String value) {
            addCriterion("DownNotifyNote <=", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteLike(String value) {
            addCriterion("DownNotifyNote like", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteNotLike(String value) {
            addCriterion("DownNotifyNote not like", value, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteIn(List<String> values) {
            addCriterion("DownNotifyNote in", values, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteNotIn(List<String> values) {
            addCriterion("DownNotifyNote not in", values, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteBetween(String value1, String value2) {
            addCriterion("DownNotifyNote between", value1, value2, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andDownnotifynoteNotBetween(String value1, String value2) {
            addCriterion("DownNotifyNote not between", value1, value2, "downnotifynote");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledIsNull() {
            addCriterion("AlarmRecordEnabled is null");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledIsNotNull() {
            addCriterion("AlarmRecordEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledEqualTo(Boolean value) {
            addCriterion("AlarmRecordEnabled =", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledNotEqualTo(Boolean value) {
            addCriterion("AlarmRecordEnabled <>", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledGreaterThan(Boolean value) {
            addCriterion("AlarmRecordEnabled >", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AlarmRecordEnabled >=", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledLessThan(Boolean value) {
            addCriterion("AlarmRecordEnabled <", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("AlarmRecordEnabled <=", value, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledIn(List<Boolean> values) {
            addCriterion("AlarmRecordEnabled in", values, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledNotIn(List<Boolean> values) {
            addCriterion("AlarmRecordEnabled not in", values, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("AlarmRecordEnabled between", value1, value2, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andAlarmrecordenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AlarmRecordEnabled not between", value1, value2, "alarmrecordenabled");
            return (Criteria) this;
        }

        public Criteria andRecordmodeIsNull() {
            addCriterion("RecordMode is null");
            return (Criteria) this;
        }

        public Criteria andRecordmodeIsNotNull() {
            addCriterion("RecordMode is not null");
            return (Criteria) this;
        }

        public Criteria andRecordmodeEqualTo(Integer value) {
            addCriterion("RecordMode =", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeNotEqualTo(Integer value) {
            addCriterion("RecordMode <>", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeGreaterThan(Integer value) {
            addCriterion("RecordMode >", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecordMode >=", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeLessThan(Integer value) {
            addCriterion("RecordMode <", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeLessThanOrEqualTo(Integer value) {
            addCriterion("RecordMode <=", value, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeIn(List<Integer> values) {
            addCriterion("RecordMode in", values, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeNotIn(List<Integer> values) {
            addCriterion("RecordMode not in", values, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeBetween(Integer value1, Integer value2) {
            addCriterion("RecordMode between", value1, value2, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("RecordMode not between", value1, value2, "recordmode");
            return (Criteria) this;
        }

        public Criteria andRecordperiodIsNull() {
            addCriterion("RecordPeriod is null");
            return (Criteria) this;
        }

        public Criteria andRecordperiodIsNotNull() {
            addCriterion("RecordPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andRecordperiodEqualTo(Integer value) {
            addCriterion("RecordPeriod =", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodNotEqualTo(Integer value) {
            addCriterion("RecordPeriod <>", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodGreaterThan(Integer value) {
            addCriterion("RecordPeriod >", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecordPeriod >=", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodLessThan(Integer value) {
            addCriterion("RecordPeriod <", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodLessThanOrEqualTo(Integer value) {
            addCriterion("RecordPeriod <=", value, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodIn(List<Integer> values) {
            addCriterion("RecordPeriod in", values, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodNotIn(List<Integer> values) {
            addCriterion("RecordPeriod not in", values, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodBetween(Integer value1, Integer value2) {
            addCriterion("RecordPeriod between", value1, value2, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andRecordperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("RecordPeriod not between", value1, value2, "recordperiod");
            return (Criteria) this;
        }

        public Criteria andCmdlistIsNull() {
            addCriterion("CmdList is null");
            return (Criteria) this;
        }

        public Criteria andCmdlistIsNotNull() {
            addCriterion("CmdList is not null");
            return (Criteria) this;
        }

        public Criteria andCmdlistEqualTo(String value) {
            addCriterion("CmdList =", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistNotEqualTo(String value) {
            addCriterion("CmdList <>", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistGreaterThan(String value) {
            addCriterion("CmdList >", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistGreaterThanOrEqualTo(String value) {
            addCriterion("CmdList >=", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistLessThan(String value) {
            addCriterion("CmdList <", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistLessThanOrEqualTo(String value) {
            addCriterion("CmdList <=", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistLike(String value) {
            addCriterion("CmdList like", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistNotLike(String value) {
            addCriterion("CmdList not like", value, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistIn(List<String> values) {
            addCriterion("CmdList in", values, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistNotIn(List<String> values) {
            addCriterion("CmdList not in", values, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistBetween(String value1, String value2) {
            addCriterion("CmdList between", value1, value2, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andCmdlistNotBetween(String value1, String value2) {
            addCriterion("CmdList not between", value1, value2, "cmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistIsNull() {
            addCriterion("RecoverCmdList is null");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistIsNotNull() {
            addCriterion("RecoverCmdList is not null");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistEqualTo(String value) {
            addCriterion("RecoverCmdList =", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistNotEqualTo(String value) {
            addCriterion("RecoverCmdList <>", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistGreaterThan(String value) {
            addCriterion("RecoverCmdList >", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistGreaterThanOrEqualTo(String value) {
            addCriterion("RecoverCmdList >=", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistLessThan(String value) {
            addCriterion("RecoverCmdList <", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistLessThanOrEqualTo(String value) {
            addCriterion("RecoverCmdList <=", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistLike(String value) {
            addCriterion("RecoverCmdList like", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistNotLike(String value) {
            addCriterion("RecoverCmdList not like", value, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistIn(List<String> values) {
            addCriterion("RecoverCmdList in", values, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistNotIn(List<String> values) {
            addCriterion("RecoverCmdList not in", values, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistBetween(String value1, String value2) {
            addCriterion("RecoverCmdList between", value1, value2, "recovercmdlist");
            return (Criteria) this;
        }

        public Criteria andRecovercmdlistNotBetween(String value1, String value2) {
            addCriterion("RecoverCmdList not between", value1, value2, "recovercmdlist");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nfjd502.dbo.CSIObject
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
     * This class corresponds to the database table nfjd502.dbo.CSIObject
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