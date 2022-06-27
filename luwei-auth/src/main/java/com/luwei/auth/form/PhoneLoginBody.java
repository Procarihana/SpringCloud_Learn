package com.luwei.auth.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * "短信平台登录与第三方平台首次登录
 *
 * @author jinhuaPeng
 * @since 2022-03-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "短信平台登录与第三方平台首次登录对像 PhoneLoginBody")
public class PhoneLoginBody {
    @ApiModelProperty("手机号码")
    private String phone;
    @ApiModelProperty("短信验证码")
    private String vCode;
    @ApiModelProperty("第三方平台OpenId（用于该平台首次登录绑定手机号）")
    private String openId;
    @ApiModelProperty("第三方平台OpenId（用于该平台首次登录绑定手机号）")
    private Integer openIdType;
}
