package com.luwei.auth.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "APP用户密码登录对象 DTO")
@Data
public class AppPasswordLoginBodyDTO {
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "电话号码（1账号）")
    private String phone11;
    private String uuid;
    @ApiModelProperty(value = "验证码")
    private String code;
}
