package com.perfect.moudle.system.dao;

import com.perfect.moudle.system.entity.RiskWarnInfo;
import com.perfect.moudle.system.entity.RiskWarnInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskWarnInfoMapper {
    int countByExample(RiskWarnInfoExample example);

    int deleteByExample(RiskWarnInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RiskWarnInfo record);

    int insertSelective(RiskWarnInfo record);

    List<RiskWarnInfo> selectByExampleWithBLOBs(RiskWarnInfoExample example);

    List<RiskWarnInfo> selectByExample(RiskWarnInfoExample example);

    RiskWarnInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RiskWarnInfo record, @Param("example") RiskWarnInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") RiskWarnInfo record, @Param("example") RiskWarnInfoExample example);

    int updateByExample(@Param("record") RiskWarnInfo record, @Param("example") RiskWarnInfoExample example);

    int updateByPrimaryKeySelective(RiskWarnInfo record);

    int updateByPrimaryKeyWithBLOBs(RiskWarnInfo record);

    int updateByPrimaryKey(RiskWarnInfo record);

    String findLastestData();
}