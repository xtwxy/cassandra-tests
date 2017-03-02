package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CDriverCfg;
import com.wincom.mstar.domain.CDriverCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDriverCfgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CDriverCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CDriverCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CDriverCfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CDriverCfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CDriverCfg> selectByExample(CDriverCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CDriverCfg record, @Param("example") CDriverCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CDriverCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CDriverCfg record, @Param("example") CDriverCfgExample example);
}