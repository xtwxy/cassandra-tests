package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.AHistoryDataDay;
import com.wincom.mstar.domain.AHistoryDataDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AHistoryDataDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(AHistoryDataDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(AHistoryDataDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(AHistoryDataDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(AHistoryDataDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<AHistoryDataDay> selectByExample(AHistoryDataDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") AHistoryDataDay record, @Param("example") AHistoryDataDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.AHistoryDataDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") AHistoryDataDay record, @Param("example") AHistoryDataDayExample example);
}