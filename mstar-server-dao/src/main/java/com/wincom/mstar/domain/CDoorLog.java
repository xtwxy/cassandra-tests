package com.wincom.mstar.domain;

import java.util.Date;

public class CDoorLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorLog.DoorID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer doorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorLog.LogTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Date logtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorLog.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer eventtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorLog.KeyID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String keyid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorLog.DoorID
     *
     * @return the value of nfjd502.dbo.CDoorLog.DoorID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getDoorid() {
        return doorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorLog.DoorID
     *
     * @param doorid the value for nfjd502.dbo.CDoorLog.DoorID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDoorid(Integer doorid) {
        this.doorid = doorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorLog.LogTime
     *
     * @return the value of nfjd502.dbo.CDoorLog.LogTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Date getLogtime() {
        return logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorLog.LogTime
     *
     * @param logtime the value for nfjd502.dbo.CDoorLog.LogTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorLog.EventType
     *
     * @return the value of nfjd502.dbo.CDoorLog.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getEventtype() {
        return eventtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorLog.EventType
     *
     * @param eventtype the value for nfjd502.dbo.CDoorLog.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setEventtype(Integer eventtype) {
        this.eventtype = eventtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorLog.KeyID
     *
     * @return the value of nfjd502.dbo.CDoorLog.KeyID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getKeyid() {
        return keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorLog.KeyID
     *
     * @param keyid the value for nfjd502.dbo.CDoorLog.KeyID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }
}