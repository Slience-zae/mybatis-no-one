package com.perfect.moudle.system.entity;

import com.perfect.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class RiskFlowInfo extends BaseEntity implements Serializable {

    private String prod_id;

    private Integer status;
}