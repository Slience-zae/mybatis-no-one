package com.perfect.moudle.system.controller;

import com.perfect.common.utils.ResultUtil;
import com.perfect.common.vo.Result;
import com.perfect.moudle.system.entity.RiskWarnInfo;
import com.perfect.moudle.system.service.RiskWarnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/risk")
public class RiskWarnInfoController {
    @Autowired
    private RiskWarnInfoService riskWarnInfoService;
    @RequestMapping(value = "/getRiskWarnList",method = RequestMethod.GET)
    public Result getRiskWarnList(@RequestParam Map<String,String> param){
        List<RiskWarnInfo> riskWarnInfos = riskWarnInfoService.selectList(param);
        return new ResultUtil().setData(riskWarnInfos);
    }

}
