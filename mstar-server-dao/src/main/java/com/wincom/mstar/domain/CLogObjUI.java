package com.wincom.mstar.domain;

public class CLogObjUI {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CLogObjUI.LogObjID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private Integer logobjid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CLogObjUI.UIWindow
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private byte[] uiwindow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nfjd502.dbo.CLogObjUI.WndInputIDList
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    private String wndinputidlist;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CLogObjUI.LogObjID
     *
     * @return the value of nfjd502.dbo.CLogObjUI.LogObjID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public Integer getLogobjid() {
        return logobjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CLogObjUI.LogObjID
     *
     * @param logobjid the value for nfjd502.dbo.CLogObjUI.LogObjID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setLogobjid(Integer logobjid) {
        this.logobjid = logobjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CLogObjUI.UIWindow
     *
     * @return the value of nfjd502.dbo.CLogObjUI.UIWindow
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public byte[] getUiwindow() {
        return uiwindow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CLogObjUI.UIWindow
     *
     * @param uiwindow the value for nfjd502.dbo.CLogObjUI.UIWindow
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setUiwindow(byte[] uiwindow) {
        this.uiwindow = uiwindow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nfjd502.dbo.CLogObjUI.WndInputIDList
     *
     * @return the value of nfjd502.dbo.CLogObjUI.WndInputIDList
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public String getWndinputidlist() {
        return wndinputidlist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nfjd502.dbo.CLogObjUI.WndInputIDList
     *
     * @param wndinputidlist the value for nfjd502.dbo.CLogObjUI.WndInputIDList
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    public void setWndinputidlist(String wndinputidlist) {
        this.wndinputidlist = wndinputidlist == null ? null : wndinputidlist.trim();
    }
}