package com.wincom.mstar.dao.mapper;

import com.wincom.mstar.domain.BDoorOperationLog;
import com.wincom.mstar.domain.BDoorOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BDoorOperationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int countByExample(BDoorOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int deleteByExample(BDoorOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insert(BDoorOperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int insertSelective(BDoorOperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    List<BDoorOperationLog> selectByExample(BDoorOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") BDoorOperationLog record, @Param("example") BDoorOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nfjd502.dbo.BDoorOperationLog
     *
     * @mbggenerated Thu Mar 02 11:23:21 CST 2017
     */
    int updateByExample(@Param("record") BDoorOperationLog record, @Param("example") BDoorOperationLogExample example);
}