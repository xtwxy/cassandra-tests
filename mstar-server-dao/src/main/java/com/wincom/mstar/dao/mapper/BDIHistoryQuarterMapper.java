package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BDIHistoryQuarter;
import com.wincom.mstar.domain.BDIHistoryQuarterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BDIHistoryQuarterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BDIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BDIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BDIHistoryQuarter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BDIHistoryQuarter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BDIHistoryQuarter> selectByExample(BDIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BDIHistoryQuarter record, @Param("example") BDIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BDIHistoryQuarter record, @Param("example") BDIHistoryQuarterExample example);
}