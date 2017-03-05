package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BEnergyDay;
import com.wincom.mstar.domain.BEnergyDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BEnergyDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BEnergyDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BEnergyDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BEnergyDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BEnergyDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BEnergyDay> selectByExample(BEnergyDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BEnergyDay record, @Param("example") BEnergyDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyDay
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BEnergyDay record, @Param("example") BEnergyDayExample example);
}