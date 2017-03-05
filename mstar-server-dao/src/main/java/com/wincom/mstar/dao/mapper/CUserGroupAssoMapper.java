package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CUserGroupAsso;
import com.wincom.mstar.domain.CUserGroupAssoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUserGroupAssoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CUserGroupAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CUserGroupAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CUserGroupAsso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CUserGroupAsso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CUserGroupAsso> selectByExample(CUserGroupAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CUserGroupAsso record, @Param("example") CUserGroupAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserGroupAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CUserGroupAsso record, @Param("example") CUserGroupAssoExample example);
}