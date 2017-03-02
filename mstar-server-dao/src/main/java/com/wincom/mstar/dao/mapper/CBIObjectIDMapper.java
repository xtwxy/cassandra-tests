package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CBIObjectID;
import com.wincom.mstar.domain.CBIObjectIDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CBIObjectIDMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CBIObjectIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CBIObjectIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CBIObjectID record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CBIObjectID record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CBIObjectID> selectByExample(CBIObjectIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CBIObjectID record, @Param("example") CBIObjectIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CBIObjectID
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CBIObjectID record, @Param("example") CBIObjectIDExample example);
}