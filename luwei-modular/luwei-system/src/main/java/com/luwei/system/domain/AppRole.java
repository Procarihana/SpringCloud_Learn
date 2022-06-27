package com.luwei.system.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 角色信息表 (AppRole) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_role")
@ApiModel("角色信息表")
public class AppRole extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 角色ID
     */
    @Excel(name = "角色ID")
    @TableId(value = "role_id", type = IdType.AUTO)
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    /**
     * 角色名称
     */
    @Excel(name = "roleName")
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    /**
     * 角色权限字符串
     */
    @Excel(name = "roleKey")
    @ApiModelProperty(value = "角色权限字符串")
    private String roleKey;

    /**
     * 显示顺序
     */
    @Excel(name = "roleSort")
    @ApiModelProperty(value = "显示顺序")
    private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    @Excel(name = "dataScope")
    @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）")
    private String dataScope;

    /**
     * 菜单树选择项是否关联显示
     */
    @Excel(name = "menuCheckStrictly")
    @ApiModelProperty(value = "菜单树选择项是否关联显示")
    private Boolean menuCheckStrictly;

    /**
     * 部门树选择项是否关联显示
     */
    @Excel(name = "deptCheckStrictly")
    @ApiModelProperty(value = "部门树选择项是否关联显示")
    private Boolean deptCheckStrictly;

    /**
     * 角色状态（0正常 1停用）
     */
    @Excel(name = "status")
    @ApiModelProperty(value = "角色状态（0正常 1停用）")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @Excel(name = "delFlag")
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    private String delFlag;

}