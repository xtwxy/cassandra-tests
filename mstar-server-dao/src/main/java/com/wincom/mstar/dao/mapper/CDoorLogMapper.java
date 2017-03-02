package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CDoorLog;
import com.wincom.mstar.domain.CDoorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDoorLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CDoorLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CDoorLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CDoorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CDoorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CDoorLog> selectByExample(CDoorLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CDoorLog record, @Param("example") CDoorLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDoorLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CDoorLog record, @Param("example") CDoorLogExample example);
}