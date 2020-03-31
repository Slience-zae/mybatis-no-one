package com.perfect.moudle.system.entity;

import com.perfect.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class RiskWarnDetail extends BaseEntity implements Serializable {

    private String prod_id;

    private String corp_unno;

    private String warn_no;

    private Date warn_date;

    private String warn_event;

    private Integer warn_result;

    private Integer warn_status;

    private String remark;

   }