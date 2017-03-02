package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.CFSUType;
import com.wincom.mstar.domain.CFSUTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CFSUTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(CFSUTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(CFSUTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(CFSUType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(CFSUType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<CFSUType> selectByExample(CFSUTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") CFSUType record, @Param("example") CFSUTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.CFSUType
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") CFSUType record, @Param("example") CFSUTypeExample example);
}