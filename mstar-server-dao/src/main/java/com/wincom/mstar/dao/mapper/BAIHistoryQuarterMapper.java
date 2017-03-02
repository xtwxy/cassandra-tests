package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BAIHistoryQuarter;
import com.wincom.mstar.domain.BAIHistoryQuarterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BAIHistoryQuarterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BAIHistoryQuarter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BAIHistoryQuarter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BAIHistoryQuarter> selectByExampleWithBLOBs(BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BAIHistoryQuarter> selectByExample(BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BAIHistoryQuarter record, @Param("example") BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") BAIHistoryQuarter record, @Param("example") BAIHistoryQuarterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryQuarter
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BAIHistoryQuarter record, @Param("example") BAIHistoryQuarterExample example);
}