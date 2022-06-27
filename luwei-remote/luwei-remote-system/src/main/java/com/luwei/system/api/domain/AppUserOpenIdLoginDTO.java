package com.luwei.system.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;

@SuperBuilder
@Data
@ApiModel(value = "第三方平台登录对象DTO")
public class AppUserOpenIdLoginDTO {
    /**
     * 第三方平台用户唯一标识类型（0=微信；1=qq；2=微博；3=本机登录）
     */
    @NotEmpty
    @ApiModelProperty("第三方平台用户唯一标识类型（0=微信；1=qq；2=微博；3=本机登录）")
    private Integer openIdType;
    /**
     * 第三方平台用户唯一标识
     */
    @ApiModelProperty("第三方平台用户唯一标识类型")
    private String openId;

}
