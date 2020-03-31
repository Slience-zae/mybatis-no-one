package com.perfect.moudle.system.entity;

import com.perfect.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class RiskWarnInfo extends BaseEntity implements Serializable {

    private String warn_code;

    private String rule_type;

    private String rule_name;

    private String check_type;

    private String logical_symbol;

    private String threshold;

    private String warn_result;
}