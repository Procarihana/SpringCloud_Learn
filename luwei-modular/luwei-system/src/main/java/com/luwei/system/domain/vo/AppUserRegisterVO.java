package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "App用户快速注册对象 Vo")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AppUserRegisterVO {
    @ApiModelProperty("手机号码")
    @NotEmpty
    private String phoneNumber;

    @ApiModelProperty("验证码")
    @NotEmpty
    private String vCode;

    @NotEmpty
    @ApiModelProperty("密码")
    private String password;

}
