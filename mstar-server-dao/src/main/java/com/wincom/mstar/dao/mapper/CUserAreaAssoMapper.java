package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CUserAreaAsso;
import com.wincom.mstar.domain.CUserAreaAssoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUserAreaAssoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CUserAreaAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CUserAreaAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CUserAreaAsso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CUserAreaAsso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CUserAreaAsso> selectByExample(CUserAreaAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CUserAreaAsso record, @Param("example") CUserAreaAssoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CUserAreaAsso
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CUserAreaAsso record, @Param("example") CUserAreaAssoExample example);
}