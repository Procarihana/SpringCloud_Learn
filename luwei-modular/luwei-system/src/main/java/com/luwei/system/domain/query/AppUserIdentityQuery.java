package com.luwei.system.domain.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * APP用户身份验证查询
 *
 * @author JinhuaPeng
 */
@Data
@SuperBuilder
@ApiModel(value = "APP用户身份验证查询")
@AllArgsConstructor
@NoArgsConstructor
public class AppUserIdentityQuery {
    @ApiModelProperty(value = "用户身份证名称")
    private String identityName;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "申请认证身份")
    private Long userRoleId;
    @ApiModelProperty(value = "审核状态")
    private Integer auditStatus;
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "身份验证id")
    private Long appUserIdentityId;
}
