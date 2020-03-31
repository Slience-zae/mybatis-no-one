package com.perfect.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.perfect.common.utils.IdWorker;
import com.perfect.common.utils.SnowFlakeUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id = IdWorker.getId();

    private Integer del_flag = 0;

    private String create_by = "zae";

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time = new Date();

    private String update_by = "zae";

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time = new Date();
}
