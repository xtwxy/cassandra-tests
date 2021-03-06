package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CEmployeGroup;
import com.wincom.mstar.domain.CEmployeGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CEmployeGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CEmployeGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CEmployeGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CEmployeGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CEmployeGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CEmployeGroup> selectByExample(CEmployeGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CEmployeGroup record, @Param("example") CEmployeGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CEmployeGroup
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CEmployeGroup record, @Param("example") CEmployeGroupExample example);
}