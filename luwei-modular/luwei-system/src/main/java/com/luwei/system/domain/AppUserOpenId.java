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

import java.time.LocalDateTime;

/**
 * 用户与openId关系表  (AppUserOpenId) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user_open_id")
@ApiModel("用户与openId关系表 ")
public class AppUserOpenId extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * app用户openid关系id
     */
    @TableId(value = "app_user_open_id", type = IdType.AUTO)
    @Excel(name = "app用户openid关系id")
    @ApiModelProperty(value = "app用户openid关系id")
    private Long appUserOpenId;

    /**
     * 用户ID
     */

    @Excel(name = "用户ID")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * OpenId
     */

    @Excel(name = "OpenId")
    @ApiModelProperty(value = "OpenId")
    private String openId;

    /**
     * OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）
     */

    @Excel(name = "OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）")
    @ApiModelProperty(value = "OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）")
    private Integer openIdType;

    /**
     * 创建时间
     */

    @Excel(name = "创建时间")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */

    @Excel(name = "更新时间")
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    /**
     * 备注
     */

    @Excel(name = "备注")
    @ApiModelProperty(value = "备注")
    private String remark;

}