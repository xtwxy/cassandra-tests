package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BBIDConfig;
import com.wincom.mstar.domain.BBIDConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BBIDConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BBIDConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BBIDConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BBIDConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BBIDConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BBIDConfig> selectByExample(BBIDConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BBIDConfig record, @Param("example") BBIDConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BBIDConfig
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BBIDConfig record, @Param("example") BBIDConfigExample example);
}