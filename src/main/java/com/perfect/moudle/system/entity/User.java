package com.perfect.moudle.system.entity;

import com.perfect.base.BaseEntity;
import com.perfect.common.utils.SnowFlakeUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class User extends BaseEntity implements Serializable {
    private String name;

    private Integer sex;

    private Integer id_type = 1;

    private String id_no = "001";

    private String email;

    private String mobile;

    private Integer type = 0;

    private Integer status = 0;

    private String avatar = "001";
}