package com.wincom.mstar.domain;

public class CDoorEventType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorEventType.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer eventtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CDoorEventType.EventDesc
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String eventdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorEventType.EventType
     *
     * @return the value of nfjd502.dbo.CDoorEventType.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getEventtype() {
        return eventtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorEventType.EventType
     *
     * @param eventtype the value for nfjd502.dbo.CDoorEventType.EventType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setEventtype(Integer eventtype) {
        this.eventtype = eventtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CDoorEventType.EventDesc
     *
     * @return the value of nfjd502.dbo.CDoorEventType.EventDesc
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getEventdesc() {
        return eventdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CDoorEventType.EventDesc
     *
     * @param eventdesc the value for nfjd502.dbo.CDoorEventType.EventDesc
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setEventdesc(String eventdesc) {
        this.eventdesc = eventdesc == null ? null : eventdesc.trim();
    }
}