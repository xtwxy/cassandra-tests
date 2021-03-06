package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.COptimalCfg;
import com.wincom.mstar.domain.COptimalCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface COptimalCfgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(COptimalCfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(COptimalCfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<COptimalCfg> selectByExampleWithBLOBs(COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<COptimalCfg> selectByExample(COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") COptimalCfg record, @Param("example") COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") COptimalCfg record, @Param("example") COptimalCfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.COptimalCfg
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") COptimalCfg record, @Param("example") COptimalCfgExample example);
}