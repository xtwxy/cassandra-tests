package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BEnergyMinute;
import com.wincom.mstar.domain.BEnergyMinuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BEnergyMinuteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BEnergyMinuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BEnergyMinuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BEnergyMinute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BEnergyMinute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BEnergyMinute> selectByExample(BEnergyMinuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BEnergyMinute record, @Param("example") BEnergyMinuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Energy.dbo.BEnergyMinute
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BEnergyMinute record, @Param("example") BEnergyMinuteExample example);
}