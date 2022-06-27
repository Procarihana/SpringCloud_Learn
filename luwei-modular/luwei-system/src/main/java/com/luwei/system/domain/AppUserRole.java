package com.luwei.system.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import com.luwei.common.core.annotation.Excel;
import com.luwei.common.datasource.base.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * app用户角色关联表 (AppUserRole) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user_role")
@ApiModel("app用户角色关联表")
public class AppUserRole extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * app用户ID
     */
    @Excel(name = "app用户ID")
    @ApiModelProperty(value = "app用户ID")
    private Long appUserId;

    /**
     * app角色ID
     */
    @Excel(name = "app角色ID")
    @ApiModelProperty(value = "app角色ID")
    private Long appRoleId;

}