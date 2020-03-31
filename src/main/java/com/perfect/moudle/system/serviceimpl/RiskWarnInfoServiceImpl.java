package com.perfect.moudle.system.serviceimpl;

import com.perfect.moudle.system.dao.RiskWarnInfoMapper;
import com.perfect.moudle.system.entity.RiskWarnInfo;
import com.perfect.moudle.system.entity.RiskWarnInfoExample;
import com.perfect.moudle.system.service.RiskWarnInfoService;
import com.sun.media.sound.RIFFInvalidDataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * @author zae
 */
@Service
public class RiskWarnInfoServiceImpl implements RiskWarnInfoService {
    @Autowired
    private RiskWarnInfoMapper riskWarnInfoMapper;

    @Override
    public void saveWarnInfo(RiskWarnInfo riskWarnInfo) {
        //检验预警名称在数据库中是否存在
        if(checkRiskName(riskWarnInfo)){
            if(riskWarnInfo.getId() == null){//添加
                String warnCode = findLastestData();
                if(StringUtils.isEmpty(warnCode)){
                    riskWarnInfo.setWarn_code("1001");
                }else{
                    riskWarnInfo.setWarn_code((Integer.parseInt(warnCode)+1)+"");
                }
                riskWarnInfoMapper.insertSelective(riskWarnInfo);
            }else{//编辑
                riskWarnInfoMapper.updateByPrimaryKey(riskWarnInfo);
            }
        }

    }

    @Override
    public boolean deleteWarnInfo(String id) {
        return false;
    }

    @Override
    public List<RiskWarnInfo> selectList(Map<String, String> param) {
        RiskWarnInfoExample riskWarnInfoExample = new RiskWarnInfoExample();
        RiskWarnInfoExample.Criteria criteria = riskWarnInfoExample.createCriteria();
        //criteria.andWarn_codeEqualTo(param.get("warnCode"));
        criteria.andRule_nameLike(param.get("ruleName"));
        return riskWarnInfoMapper.selectByExample(riskWarnInfoExample);
    }

    private boolean checkRiskName(RiskWarnInfo riskWarnInfo){
        RiskWarnInfoExample riskWarnInfoExample = new RiskWarnInfoExample();
        RiskWarnInfoExample.Criteria criteria = riskWarnInfoExample.createCriteria();
        criteria.andRule_nameEqualTo(riskWarnInfo.getRule_name());
        List<RiskWarnInfo> riskWarnInfos = riskWarnInfoMapper.selectByExample(riskWarnInfoExample);
        if(riskWarnInfos==null || riskWarnInfos.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 获取数据库中最新的一个编号
     * @author zangchuanlei
     * @return
     */
    private String findLastestData(){
        String warn_code  =  riskWarnInfoMapper.findLastestData();
        return warn_code;
    }
}
