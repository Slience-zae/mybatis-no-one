package com.perfect.moudle.system.service;

import com.perfect.moudle.system.entity.RiskWarnInfo;

import java.util.List;
import java.util.Map;

public interface RiskWarnInfoService {
    /**
     * 保存/编辑预警设置实体
     * @param riskWarnInfo
     */
    void saveWarnInfo(RiskWarnInfo riskWarnInfo);

    /**
     * 删除预警设置记录
     * @param id
     * @return
     */
    boolean deleteWarnInfo(String id);

    /**
     * 条件查询预警设置列表
     */
    List<RiskWarnInfo> selectList(Map<String,String> param);
}
