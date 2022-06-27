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
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * APP用户信息表 (AppUser) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-03-29
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user")
@ApiModel("APP用户信息表")
@Accessors(chain = true)
public class AppUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    @Excel(name = "用户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户账号
     */
    @Excel(name = "用户账号")
    @ApiModelProperty(value = "用户账号")
    private String username;

    /**
     * OpenId
     */
    @Excel(name = "OpenId")
    @ApiModelProperty(value = "openId")
    private String openId;

    /**
     * 用户邮箱
     */
    @Excel(name = "email")
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 手机号码
     */
    @Excel(name = "phone_number")
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    /**
     * 用户性别（0男 1女 2未知）
     */
    @Excel(name = "sex")
    @ApiModelProperty(value = "用户性别（0男 1女 2未知）")
    private String sex;

    /**
     * 头像地址
     */
    @Excel(name = "avatar")
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 密码
     */
    @Excel(name = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 帐号状态（0正常 1停用）
     */
    @Excel(name = "status")
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    private boolean status;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Excel(name = "删除标志")
    @ApiModelProperty(value = "删除标志（0=存在;1=删除）")
    private boolean deleted;

    /**
     * 最后登录IP
     */
    @Excel(name = "loginIp")
    @ApiModelProperty(value = "最后登录IP")
    private String loginIp;

    /**
     * 最后登录时间
     */
    @Excel(name = "loginDate")
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime loginDate;

    /**
     * 自我介绍
     */
    @Excel(name = "introduction")
    @ApiModelProperty(value = "自我介绍")
    private String introduction;

    /**
     * 院校
     */
    @Excel(name = "school")
    @ApiModelProperty(value = "院校")
    private String school;
    @ApiModelProperty(value = "主页背景图")
    private String backgroundUrl;
    @ApiModelProperty(value = "身份证id")
    private String identityId;
    @ApiModelProperty(value = "身份证名称")
    private String identityName;
    @ApiModelProperty(value = "资格证号")
    private String qualificationId;
    @ApiModelProperty(value = "身份审核状态（0=未审核；1=通过；2=不通过）")
    private Integer auditStatus;
    @ApiModelProperty(value = "审核意见")
    private Integer auditOpinion;
    @ApiModelProperty(value = "审核申请时间")
    private LocalDateTime auditTime;

}