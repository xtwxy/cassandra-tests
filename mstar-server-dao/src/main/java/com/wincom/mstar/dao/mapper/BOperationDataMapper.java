package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BOperationData;
import com.wincom.mstar.domain.BOperationDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BOperationDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BOperationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BOperationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BOperationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BOperationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BOperationData> selectByExample(BOperationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BOperationData record, @Param("example") BOperationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BOperationData
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BOperationData record, @Param("example") BOperationDataExample example);
}