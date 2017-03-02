package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CDeviceProperty;
import com.wincom.mstar.domain.CDevicePropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDevicePropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CDevicePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CDevicePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CDeviceProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CDeviceProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CDeviceProperty> selectByExample(CDevicePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CDeviceProperty record, @Param("example") CDevicePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDeviceProperty
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CDeviceProperty record, @Param("example") CDevicePropertyExample example);
}