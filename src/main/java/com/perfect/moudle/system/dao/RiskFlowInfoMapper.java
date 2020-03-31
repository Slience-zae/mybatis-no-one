package com.perfect.moudle.system.dao;

import com.perfect.moudle.system.entity.RiskFlowInfo;
import com.perfect.moudle.system.entity.RiskFlowInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskFlowInfoMapper {
    int countByExample(RiskFlowInfoExample example);

    int deleteByExample(RiskFlowInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RiskFlowInfo record);

    int insertSelective(RiskFlowInfo record);

    List<RiskFlowInfo> selectByExampleWithBLOBs(RiskFlowInfoExample example);

    List<RiskFlowInfo> selectByExample(RiskFlowInfoExample example);

    RiskFlowInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RiskFlowInfo record, @Param("example") RiskFlowInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") RiskFlowInfo record, @Param("example") RiskFlowInfoExample example);

    int updateByExample(@Param("record") RiskFlowInfo record, @Param("example") RiskFlowInfoExample example);

    int updateByPrimaryKeySelective(RiskFlowInfo record);

    int updateByPrimaryKeyWithBLOBs(RiskFlowInfo record);

    int updateByPrimaryKey(RiskFlowInfo record);
}