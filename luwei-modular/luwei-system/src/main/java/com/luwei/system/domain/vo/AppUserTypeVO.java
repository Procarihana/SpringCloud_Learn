package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * APP用户类型 VO
 *
 * @author jinhuaPeng
 * @since 2022-03-31
 */
@Data
@Accessors(chain = true)
@ApiModel("APP用户类型")
public class AppUserTypeVO {
    /**
     * app用户类型关联id
     */
    @NotEmpty(message = "app用户类型关联id不能为空")
    @ApiModelProperty(value = "app用户类型关联id")
    private Long appUserTypeId;

    /**
     * 类型id
     */
    @ApiModelProperty(value = "类型id")
    private Long typeId;

    /**
     * app用户id
     */
    @ApiModelProperty(value = "app用户id")
    private Long appUserId;
}