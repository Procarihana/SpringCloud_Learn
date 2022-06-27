package com.luwei.system.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * app用户角色关联表 DTO
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Data
@Accessors(chain = true)
@ApiModel("app用户角色关联表")
public class AppUserRoleDTO {
    /**
     * app用户ID
     */
    @NotEmpty(message = "app用户ID不能为空")
    @ApiModelProperty(value = "app用户ID")
    private Long appUserId;

    /**
     * app角色ID
     */
    @NotEmpty(message = "app角色ID不能为空")
    @ApiModelProperty(value = "app角色ID")
    private Long appRoleId;

}