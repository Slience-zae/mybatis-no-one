package com.perfect.moudle.system.dao;

import com.perfect.moudle.system.entity.RiskWarnDetail;
import com.perfect.moudle.system.entity.RiskWarnDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskWarnDetailMapper {
    int countByExample(RiskWarnDetailExample example);

    int deleteByExample(RiskWarnDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(RiskWarnDetail record);

    int insertSelective(RiskWarnDetail record);

    List<RiskWarnDetail> selectByExample(RiskWarnDetailExample example);

    RiskWarnDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RiskWarnDetail record, @Param("example") RiskWarnDetailExample example);

    int updateByExample(@Param("record") RiskWarnDetail record, @Param("example") RiskWarnDetailExample example);

    int updateByPrimaryKeySelective(RiskWarnDetail record);

    int updateByPrimaryKey(RiskWarnDetail record);
}