package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CDoorAccess;
import com.wincom.mstar.domain.CDoorAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDoorAccessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CDoorAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CDoorAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CDoorAccess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CDoorAccess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CDoorAccess> selectByExample(CDoorAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CDoorAccess record, @Param("example") CDoorAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorAccess
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CDoorAccess record, @Param("example") CDoorAccessExample example);
}