package com.wincom.mstar.domain;

import java.util.Date;

public class BUserLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.BUserLog.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.BUserLog.LoginTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Date logintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.BUserLog.LogoutTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Date logouttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.BUserLog.DutyLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String dutylog;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.BUserLog.UserID
     *
     * @return the value of nfjd502.dbo.BUserLog.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.BUserLog.UserID
     *
     * @param userid the value for nfjd502.dbo.BUserLog.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.BUserLog.LoginTime
     *
     * @return the value of nfjd502.dbo.BUserLog.LoginTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.BUserLog.LoginTime
     *
     * @param logintime the value for nfjd502.dbo.BUserLog.LoginTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.BUserLog.LogoutTime
     *
     * @return the value of nfjd502.dbo.BUserLog.LogoutTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Date getLogouttime() {
        return logouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.BUserLog.LogoutTime
     *
     * @param logouttime the value for nfjd502.dbo.BUserLog.LogoutTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.BUserLog.DutyLog
     *
     * @return the value of nfjd502.dbo.BUserLog.DutyLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getDutylog() {
        return dutylog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.BUserLog.DutyLog
     *
     * @param dutylog the value for nfjd502.dbo.BUserLog.DutyLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDutylog(String dutylog) {
        this.dutylog = dutylog == null ? null : dutylog.trim();
    }
}