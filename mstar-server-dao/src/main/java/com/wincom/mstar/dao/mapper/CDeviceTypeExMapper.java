package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CDeviceTypeEx;
import com.wincom.mstar.domain.CDeviceTypeExExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDeviceTypeExMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CDeviceTypeExExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CDeviceTypeExExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CDeviceTypeEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CDeviceTypeEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CDeviceTypeEx> selectByExample(CDeviceTypeExExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CDeviceTypeEx record, @Param("example") CDeviceTypeExExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceTypeEx
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CDeviceTypeEx record, @Param("example") CDeviceTypeExExample example);
}