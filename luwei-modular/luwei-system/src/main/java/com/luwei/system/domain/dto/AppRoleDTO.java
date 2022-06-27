package com.luwei.system.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * 角色信息表 DTO
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Data
@Accessors(chain = true)
@ApiModel("角色信息表")
public class AppRoleDTO {
    /**
     * 角色ID
     */
    @NotEmpty(message = "角色ID不能为空")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    /**
     * 角色名称
     */
    @NotEmpty(message = "角色名称不能为空")
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    /**
     * 角色权限字符串
     */
    @NotEmpty(message = "角色权限字符串不能为空")
    @ApiModelProperty(value = "角色权限字符串")
    private String roleKey;

    /**
     * 显示顺序
     */
    @NotEmpty(message = "显示顺序不能为空")
    @ApiModelProperty(value = "显示顺序")
    private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）")
    private String dataScope;

    /**
     * 菜单树选择项是否关联显示
     */
    @ApiModelProperty(value = "菜单树选择项是否关联显示")
    private Boolean menuCheckStrictly;

    /**
     * 部门树选择项是否关联显示
     */
    @ApiModelProperty(value = "部门树选择项是否关联显示")
    private Boolean deptCheckStrictly;

    /**
     * 角色状态（0正常 1停用）
     */
    @NotEmpty(message = "角色状态（0正常 1停用）不能为空")
    @ApiModelProperty(value = "角色状态（0正常 1停用）")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    private String delFlag;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

}