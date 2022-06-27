package com.luwei.system.api.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * 用户登录信息对象
 *
 * @author jinhuaPeng
 * @since 2022-03-28
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户登录信息对象")
@Accessors(chain = true)
public class AppUserLoginUser {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * OpenId
     */
    @ApiModelProperty(value = "OpenId")
    private String openId;

    /**
     * OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）
     */
    @ApiModelProperty(value = "OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）")
    private Integer OpenIdType;


    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    /**
     * 用户性别（0男 1女 2未知）
     */
    @ApiModelProperty(value = "用户性别（0男 1女 2未知）")
    private String sex;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 帐号状态（0正常 1停用）
     */
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    private boolean status;

    /**
     * 删除标志（0=存在;1=删除）
     */
    @ApiModelProperty(value = "删除标志（0=存在;1=删除）")
    private boolean deleted;;

    /**
     * 最后登录IP
     */
    @ApiModelProperty(value = "最后登录IP")
    private String loginIp;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime loginDate;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 用户唯一标识
     */
    @ApiModelProperty(value = "用户唯一标识")
    private String token;

    /**
     * 登录时间
     */
    @ApiModelProperty(value = "登录时间")
    private Long loginTime;

    /**
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间")
    private Long expireTime;

    /**
     * 自我介绍
     */
    @ApiModelProperty(value = "自我介绍")
    private String introduction;

    /**
     * 院校
     */
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

    /**
     * 角色列表
     */
    private Set<String> roles;

}