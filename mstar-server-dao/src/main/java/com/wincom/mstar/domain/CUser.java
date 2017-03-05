package com.wincom.mstar.domain;

import java.util.Date;

public class CUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.UserName
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.UserAlias
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String useralias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Password
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.AuthenLevel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer authenlevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Creator
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.EmailBox
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String emailbox;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Tel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Deleted
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Enabled
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.Notes
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String notes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.LastUpdateTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Date lastupdatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CUser.LogErrCount
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer logerrcount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.UserID
     *
     * @return the value of nfjd502.dbo.CUser.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.UserID
     *
     * @param userid the value for nfjd502.dbo.CUser.UserID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.UserName
     *
     * @return the value of nfjd502.dbo.CUser.UserName
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.UserName
     *
     * @param username the value for nfjd502.dbo.CUser.UserName
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.UserAlias
     *
     * @return the value of nfjd502.dbo.CUser.UserAlias
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getUseralias() {
        return useralias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.UserAlias
     *
     * @param useralias the value for nfjd502.dbo.CUser.UserAlias
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setUseralias(String useralias) {
        this.useralias = useralias == null ? null : useralias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Password
     *
     * @return the value of nfjd502.dbo.CUser.Password
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Password
     *
     * @param password the value for nfjd502.dbo.CUser.Password
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.AuthenLevel
     *
     * @return the value of nfjd502.dbo.CUser.AuthenLevel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getAuthenlevel() {
        return authenlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.AuthenLevel
     *
     * @param authenlevel the value for nfjd502.dbo.CUser.AuthenLevel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setAuthenlevel(Integer authenlevel) {
        this.authenlevel = authenlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Creator
     *
     * @return the value of nfjd502.dbo.CUser.Creator
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Creator
     *
     * @param creator the value for nfjd502.dbo.CUser.Creator
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.EmailBox
     *
     * @return the value of nfjd502.dbo.CUser.EmailBox
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getEmailbox() {
        return emailbox;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.EmailBox
     *
     * @param emailbox the value for nfjd502.dbo.CUser.EmailBox
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setEmailbox(String emailbox) {
        this.emailbox = emailbox == null ? null : emailbox.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Tel
     *
     * @return the value of nfjd502.dbo.CUser.Tel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Tel
     *
     * @param tel the value for nfjd502.dbo.CUser.Tel
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Deleted
     *
     * @return the value of nfjd502.dbo.CUser.Deleted
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Deleted
     *
     * @param deleted the value for nfjd502.dbo.CUser.Deleted
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Enabled
     *
     * @return the value of nfjd502.dbo.CUser.Enabled
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Enabled
     *
     * @param enabled the value for nfjd502.dbo.CUser.Enabled
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.Notes
     *
     * @return the value of nfjd502.dbo.CUser.Notes
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.Notes
     *
     * @param notes the value for nfjd502.dbo.CUser.Notes
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.LastUpdateTime
     *
     * @return the value of nfjd502.dbo.CUser.LastUpdateTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.LastUpdateTime
     *
     * @param lastupdatetime the value for nfjd502.dbo.CUser.LastUpdateTime
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CUser.LogErrCount
     *
     * @return the value of nfjd502.dbo.CUser.LogErrCount
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getLogerrcount() {
        return logerrcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CUser.LogErrCount
     *
     * @param logerrcount the value for nfjd502.dbo.CUser.LogErrCount
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLogerrcount(Integer logerrcount) {
        this.logerrcount = logerrcount;
    }
}