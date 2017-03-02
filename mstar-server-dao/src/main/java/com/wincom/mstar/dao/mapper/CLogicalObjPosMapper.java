package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CLogicalObjPos;
import com.wincom.mstar.domain.CLogicalObjPosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CLogicalObjPosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CLogicalObjPosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CLogicalObjPosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CLogicalObjPos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CLogicalObjPos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CLogicalObjPos> selectByExample(CLogicalObjPosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CLogicalObjPos record, @Param("example") CLogicalObjPosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CLogicalObjPos
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CLogicalObjPos record, @Param("example") CLogicalObjPosExample example);
}