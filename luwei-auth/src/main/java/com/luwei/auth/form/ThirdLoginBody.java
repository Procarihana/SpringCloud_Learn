package com.luwei.auth.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * 第三方平台登录对
 *
 * @author jinhuaPeng
 * @since 2022-03-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "第三方平台登录对象 ThirdLoginBody")
public class ThirdLoginBody {
    /**
     * 第三方平台用户唯一标识类型（0=微信；1=qq；2=微博）
     */
    @NotEmpty
    @ApiModelProperty("第三方平台用户唯一标识类型（0=微信；1=qq；2=微博；3=本机登录）")
    private Integer openIdType;
    /**
     * 第三方平台用户唯一标识
     */
    @ApiModelProperty("第三方平台用户唯一标识类型")
    private String openId;

    /**
     * 第三方平台access_token
     */
    @NotEmpty
    @ApiModelProperty("第三方平台access_token")
    private String accessToken;

    @ApiModelProperty("一键登录电话号码")
    private String phone;
}
