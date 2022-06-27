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
 * app用户类型关联表 (AppUserType) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-03-31
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user_type")
@ApiModel("app用户类型关联表")
public class AppUserType extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * app用户类型关联id
     */
    @Excel(name = "app用户类型关联id")
    @TableId(value = "app_user_type_id", type = IdType.AUTO)
    @ApiModelProperty(value = "app用户类型关联id")
    private Long appUserTypeId;

    /**
     * 类型id
     */
    @Excel(name = "typeId")
    @ApiModelProperty(value = "类型id")
    private Long typeId;

    /**
     * app用户id
     */
    @Excel(name = "appUserId")
    @ApiModelProperty(value = "app用户id")
    private Long appUserId;

    @ApiModelProperty(value = "删除")
    private Boolean deleted;

}