package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BAIHistoryHour;
import com.wincom.mstar.domain.BAIHistoryHourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BAIHistoryHourMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BAIHistoryHour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BAIHistoryHour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BAIHistoryHour> selectByExampleWithBLOBs(BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BAIHistoryHour> selectByExample(BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BAIHistoryHour record, @Param("example") BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") BAIHistoryHour record, @Param("example") BAIHistoryHourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BAIHistoryHour
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BAIHistoryHour record, @Param("example") BAIHistoryHourExample example);
}